package day12;

// ������
// Ŭ������ �̸��� ������ �޼ҵ�
// ��ȯ Ÿ���� ����
// ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�
// ��ü ������ ȣ��Ǵ� �޼ҵ��̴�
// �����ڵ� �޼ҵ��̱� ������ �����ε��� �����ϴ� 

class AAA {
	// public�� ���� Ŭ���� 
	// �ܺο��� ���ٺҰ� 
	// �� ���� ������ �̷��� ���� �� �ִ�
	
	private String version;
	
	public AAA() {
		System.out.println("������ ����");
		// ��ȯ Ÿ���� ������ �޼ҵ� 
		// ������ ������
	}
	
	public AAA(String v) {
		System.out.println( v + " : version ������");
		this.version = v;
	}
}

public class MainClass05 {

	public static void main(String[] args) {
		
		AAA a = new AAA("10");
		// �ʱ⿡ ������ ���� �ִٸ� �����ڿ� �־��ֱ�
		AAA b = new AAA();
				
	}
}
