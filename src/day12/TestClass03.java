package day12;

public class TestClass03 {
	
	private String name;
	private int age;
	// alt + shift + s

	// set, get 직접 만들어보기 
	// this. 사용하는게 헷갈리면 
	// 위에 변수 선언한 것을 가르키는게 this. 라고 생각하면 된다
	
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 나이 연산 
	public void setting() {
		this.age = this.age - 1;
	}
	
	

}
