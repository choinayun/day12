package day12;

public class MainClass02 {

	public static void main(String[] args) {
		
		TestClass02 t = new TestClass02();
		// t.str = "�ȳ��ϼ���";
		// setter ���� ����
		// getter ���� ������
		
		t.setting("ȫ�浿");
		
		String s = t.getter();
		System.out.println(s);
		
		
	}
}
