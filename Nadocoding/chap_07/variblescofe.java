package chap_07;

public class variblescofe {
	//���������� �������� 
	//������ ����� �߰�ȣ �������� ��밡�� (��������)
	
	public static void methodA(int number) {
		System.out.println(number);
	}
	
	public static void methodB() {
		int result = 1; //�������� (1���� �޼ҵ忡���� ���� �ִ� ����)
	}
	public static void main(String[] args) {
		int number = 3; //��������
		methodA(3);
		
		for (int i = 0 ; i < 5 ; i++) {
//			System.out.println(i);
		}
//		System.out.println(i); //�ݺ����� ����� i�� ����
		
//		{
			int j = 0;
			System.out.println(number);
			
		}
	}

