package day12;

public class MainClass02 {

	public static void main(String[] args) {
		
		TestClass02 t = new TestClass02();
		// t.str = "안녕하세요";
		// setter 값을 설정
		// getter 값을 얻어오는
		
		t.setting("홍길동");
		
		String s = t.getter();
		System.out.println(s);
		
		
	}
}
