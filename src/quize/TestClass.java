package quize;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {

	Scanner input = new Scanner(System.in);
	
	ArrayList arrnum = new ArrayList();	// �Խñ� ��ȣ
	ArrayList arr1 = new ArrayList(); // ����
	ArrayList arr2 = new ArrayList(); // ����
	
	public int num,check; 
			// check : �α��� ����
	public String name,id,pw,birth,email,title,content;
	public String lid, lpw, fid, femail, cid, cpw;
			// l : �α���   f : ã��   c : ���� 
	
	public void create() {
		
		System.out.println("�̸� �Է�");
		name = input.next();
		System.out.println("������� �Է�");
		birth = input.next();
		System.out.println("���̵� �Է�");
		id = input.next();
		System.out.println("��й�ȣ �Է�");
		pw = input.next();
		System.out.println("�̸��� �Է�");
		email = input.next();
	
		System.out.println("ȸ������ �Ϸ�");
	}
	
	public void login() {
		
		System.out.println("���̵� �Է��ϼ���");
		lid = input.next(); 
		System.out.println("��й�ȣ�� �Է��ϼ���");
		lpw = input.next();
		
		if(lpw.equals(pw)) {
			System.out.println("�α��� ����");
			check = 1; 
			// 1�� ���� ������ �α��� ����
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	
	}
	
	public void findPw() {
		System.out.println("���̵� �Է��ϼ���");
		fid = input.next();
		System.out.println("�̸����� �Է��ϼ���");
		femail = input.next();
		
		if(fid.equals(id) && femail.equals(email)) {
			System.out.println("��й�ȣ�� Ȯ���ϼ���");
			System.out.println(pw);
		}else {
			System.out.println("���̵�� �̸����� ��ġ���� �ʽ��ϴ�.");
		}
		
	}
	
	public void changePw() {
		System.out.println("���̵� �Է��ϼ���");
		cid = input.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		cpw = input.next();
		
		if(cid.equals(id) && cpw.equals(pw)) {
			System.out.println("��й�ȣ�� �����մϴ�.\n���ο� ��й�ȣ�� �Է����ּ���");
			pw = input.next();
			System.out.println("��й�ȣ�� ����ƽ��ϴ�.");
		}else {
			System.out.println("���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	}
	
	public void write() {
		
		if(check == 1) {
			
			num = num + 1; // �Խñ� ��ȣ
			arrnum.add(num);
			
			System.out.println("�� �ۼ��� �����մϴ�.");
			System.out.println("������ �Է����ּ���");
			title = input.next();
			System.out.println("������ �Է����ּ���");
			content = input.next();
		
			arr1.add(title);
			arr2.add(content);
			
			
		}else {
			System.out.println("�α��� ���� ���ּ���");
		}
		
	}
	
	public void writeCheck() {
		
		if(check == 1) {
			System.out.println("====== �� ��� ======");
			System.out.println("��ȣ\t����\t����");
			
			for(int i=0; i < arrnum.size(); i++) {
				System.out.println(arrnum.get(i) + "\t" + arr1.get(i) + "\t" + arr2.get(i));
			}
		
		}else{
			System.out.println("�ۼ��� ���� �����ϴ�.");
		}
	}
	
	public void logout() {
		
		if(check != 1) {
			System.out.println("�α����� ���ּ���");
		}
		
		System.out.println("�α׾ƿ��մϴ�.");
		System.exit(1);
		
	}
}
