package day12;

public class TestClass02 {

	private String str;
	private int num;
	private String name;
	// private : 외부접근제한, 내부에서만 접근가능 
	
	public void setStr() {
		
	}
	
	public void setNum() {
		
	}
	
	public void setName() {
		
	}
	// 위에 세가지 메소드가 set 의 모습 
	
	public void getStr() {
		
	}
	
	public void setting(String s) {
		str = s; 
		// 메소드를 통해서 값을 초기화 
	}
	
	public String getter() {
		return str;
	}
}
