package quize;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass {

	Scanner input = new Scanner(System.in);
	
	HashMap map = new HashMap();
	
	public int num;
	public String name,id,pw,spw,birth,email; 
	
	public void create() {
		
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("생년월일 입력");
		birth = input.next();
		System.out.println("아이디 입력");
		id = input.next();
		System.out.println("비밀번호 입력");
		pw = input.next();
		System.out.println("이메일 입력");
		email = input.next();
		
		map.put(id, pw);
		
		System.out.println("회원가입 완료");
	}
	
	public void login() {
		System.out.println("아이디를 입력하세요");
		id = input.next(); 
		System.out.println("비밀번호를 입력하세요");
		spw = input.next();
		
		if(map.get(id) != spw) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}else {
			System.out.println("로그인 성공");
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
