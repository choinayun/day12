package day12;

import java.util.Scanner;

public class MainClass04 {

	public static void main(String[] args) {
		
		int k,e,m;
		// �� �� �� �� ��� ���ϱ�
		// �� setter getter ����, �����ϴ� �޼ҵ� ���� 
		
		TestClass04 t = new TestClass04();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� ����");
		k = input.nextInt();
		System.out.println("���� ����");
		e = input.nextInt();
		System.out.println("���� ����");
		m = input.nextInt();
		
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.setSum();
		t.setAvg();
		
		System.out.println("���� : " + t.getKor());
		System.out.println("���� : " + t.getEng());
		System.out.println("���� : " + t.getMath());
		System.out.println("�� : " + t.getSum());
		System.out.println("��� : " + t.getAvg());
		
	}
}
