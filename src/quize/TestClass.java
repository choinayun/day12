package quize;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass {

	Scanner input = new Scanner(System.in);
	
	HashMap map = new HashMap();
	
	public int num;
	public String name,id,pw,spw,birth,email; 
	
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
		
		map.put(id, pw);
		
		System.out.println("ȸ������ �Ϸ�");
	}
	
	public void login() {
		System.out.println("���̵� �Է��ϼ���");
		id = input.next(); 
		System.out.println("��й�ȣ�� �Է��ϼ���");
		spw = input.next();
		
		if(map.get(id) != spw) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}else {
			System.out.println("�α��� ����");
		}
	
	}
	
	public void findPw() {
		
	}
	
	public void changePw() {
		
	}
	
	public void write() {
		
	}
	
	public void writeCheck() {
		
	}
	
	public void logout() {
		
	}
}
