package quize;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		TestClass t = new TestClass();
		
		Scanner input = new Scanner(System.in);
		
		int num; // �޴����� 
		String name, id, pw, birth, email; 
		
		while(true) {
			
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ��й�ȣ ã��");
			System.out.println("4. ��й�ȣ ����");
			System.out.println("5. �� �ۼ�");
			System.out.println("6. �� ��� Ȯ��");
			System.out.println("7. �α׾ƿ�");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
		
			case 1 : 
				
				t.create();
				break;
				
			case 2 : 
				t.login();
				break;
			}
				
		}
		
		
	}
}
