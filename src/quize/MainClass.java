package quize;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		TestClass t = new TestClass();
		
		Scanner input = new Scanner(System.in);
		
		int num; // 메뉴선택 
		String name, id, pw, birth, email; 
		
		while(true) {
			
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 비밀번호 찾기");
			System.out.println("4. 비밀번호 변경");
			System.out.println("5. 글 작성");
			System.out.println("6. 글 목록 확인");
			System.out.println("7. 로그아웃");
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
