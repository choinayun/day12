package day12;

public class TestClass03 {
	
	private String name;
	private int age;
	// alt + shift + s

	// set, get ���� ������ 
	// this. ����ϴ°� �򰥸��� 
	// ���� ���� ������ ���� ����Ű�°� this. ��� �����ϸ� �ȴ�
	
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
	
	// ���� ���� 
	public void setting() {
		this.age = this.age - 1;
	}
	
	

}
