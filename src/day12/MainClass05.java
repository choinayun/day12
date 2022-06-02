package day12;

// 생성자
// 클래스의 이름과 동일한 메소드
// 반환 타입은 없다
// 값을 초기화하는 용도로 사용한다
// 객체 생성시 호출되는 메소드이다
// 생성자도 메소드이기 때문에 오버로딩이 가능하다 

class AAA {
	// public이 없는 클래스 
	// 외부에서 접근불가 
	// 쓸 일은 없지만 이렇게 만들 순 있다
	
	private String version;
	
	public AAA() {
		System.out.println("생성자 실행");
		// 반환 타입이 있으면 메소드 
		// 없으면 생성자
	}
	
	public AAA(String v) {
		System.out.println( v + " : version 생성자");
		this.version = v;
	}
}

public class MainClass05 {

	public static void main(String[] args) {
		
		AAA a = new AAA("10");
		// 초기에 설정할 값이 있다면 생성자에 넣어주기
		AAA b = new AAA();
				
	}
}
