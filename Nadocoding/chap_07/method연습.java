package chap_07;

public class method���� {
	
//	�޼ҵ� ����
	public static void Option() {
	int i; 
	for (i = 0 ; i<= 10 ; i++ ) {
		System.out.println("�ݰ����ϴ� ���� ���� ������" + i + "�� �Դϴ�");
	}
}
	//�޼ҵ� ����
	public static void Yolo(int number) {
	int sum = number * number;
	System.out.println(number + "�� ���� " + sum + "�Դϴ�");
	}
		
	
	public static void main(String[] args) {
		Option(); //�޼ҵ� ���ǵ� ���� �������� ȣ���ؼ� ���� ���
		Yolo(5); //�޼ҵ� ���ȣ �ȿ� ���ǵ� ������ ���� ���ο��� �������ش�
		
		
	
		
	}

}
