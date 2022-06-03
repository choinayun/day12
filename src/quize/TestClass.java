package quize;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {

	Scanner input = new Scanner(System.in);
	
	ArrayList arrnum = new ArrayList();	// 게시글 번호
	ArrayList arr1 = new ArrayList(); // 제목
	ArrayList arr2 = new ArrayList(); // 내용
	
	public int num,check; 
			// check : 로그인 성공
	public String name,id,pw,birth,email,title,content;
	public String lid, lpw, fid, femail, cid, cpw;
			// l : 로그인   f : 찾기   c : 변경 
	
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
	
		System.out.println("회원가입 완료");
	}
	
	public void login() {
		
		System.out.println("아이디를 입력하세요");
		lid = input.next(); 
		System.out.println("비밀번호를 입력하세요");
		lpw = input.next();
		
		if(lpw.equals(pw)) {
			System.out.println("로그인 성공");
			check = 1; 
			// 1의 값을 가지면 로그인 성공
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	
	}
	
	public void findPw() {
		System.out.println("아이디를 입력하세요");
		fid = input.next();
		System.out.println("이메일을 입력하세요");
		femail = input.next();
		
		if(fid.equals(id) && femail.equals(email)) {
			System.out.println("비밀번호를 확인하세요");
			System.out.println(pw);
		}else {
			System.out.println("아이디와 이메일이 일치하지 않습니다.");
		}
		
	}
	
	public void changePw() {
		System.out.println("아이디를 입력하세요");
		cid = input.next();
		System.out.println("비밀번호를 입력하세요");
		cpw = input.next();
		
		if(cid.equals(id) && cpw.equals(pw)) {
			System.out.println("비밀번호를 변경합니다.\n새로운 비밀번호를 입력해주세요");
			pw = input.next();
			System.out.println("비밀번호가 변경됐습니다.");
		}else {
			System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
		}
	}
	
	public void write() {
		
		if(check == 1) {
			
			num = num + 1; // 게시글 번호
			arrnum.add(num);
			
			System.out.println("글 작성이 가능합니다.");
			System.out.println("제목을 입력해주세요");
			title = input.next();
			System.out.println("내용을 입력해주세요");
			content = input.next();
		
			arr1.add(title);
			arr2.add(content);
			
			
		}else {
			System.out.println("로그인 먼저 해주세요");
		}
		
	}
	
	public void writeCheck() {
		
		if(check == 1) {
			System.out.println("====== 글 목록 ======");
			System.out.println("번호\t제목\t내용");
			
			for(int i=0; i < arrnum.size(); i++) {
				System.out.println(arrnum.get(i) + "\t" + arr1.get(i) + "\t" + arr2.get(i));
			}
		
		}else{
			System.out.println("작성한 글이 없습니다.");
		}
	}
	
	public void logout() {
		
		if(check != 1) {
			System.out.println("로그인을 해주세요");
		}
		
		System.out.println("로그아웃합니다.");
		System.exit(1);
		
	}
}
