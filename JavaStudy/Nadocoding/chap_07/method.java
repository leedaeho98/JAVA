package chap_07;

public class method {
	// �޼ҵ� = �Լ�
	//�޼ҵ� ���� = �޼ҵ��� �̸� �պκ��� �Ϲ������� ���縦 ����
	public static void sayHello() {
		System.out.println("�ȳ��ϼ���? �޼ҵ��Դϴ�");
	}	
	public static void main(String[] args) {
		//�޼ҵ� ȣ��
		System.out.println("�޼ҵ� ȣ�� ��");
		sayHello(); //���� ���ǵ� ������ ���ο��� ȣ���� ���ؼ� ��µȴ�
		sayHello(); //���� ���ǵ� ������ ���ο��� ȣ���� ���ؼ� ��µȴ�
		sayHello(); //���� ���ǵ� ������ ���ο��� ȣ���� ���ؼ� ��µȴ�
		System.out.println("�޼ҵ� ȣ�� ��");
	}

}

