package chap_04;

public class page5for�� {
	public static void main(String[] args) {
		//�ݺ��� for
		//���� ����
		System.out.println("�������.�����Դϴ�");
		//�� �ٸ� �մ��� ������?
		System.out.println("�������.�����Դϴ�");
		System.out.println("�������.�����Դϴ�");
		System.out.println("�������.�����Դϴ�");
		System.out.println("�������.�����Դϴ�");
		
		System.out.println("ȯ���մϴ�. �����Դϴ�");
		//���࿡ �λ� ���� �ٲ��?
		System.out.println("ȯ���մϴ�. �����Դϴ�");
		System.out.println("ȯ���մϴ�. �����Դϴ�");
		System.out.println("ȯ���մϴ�. �����Դϴ�");
		
		
		//�����̸��� �ٲ��?
		//���� -> �ڳ�
		System.out.println("ȯ���մϴ�. �ڳ��Դϴ�");
		System.out.println("ȯ���մϴ�. �ڳ��Դϴ�");
		System.out.println("ȯ���մϴ�. �ڳ��Դϴ�");
		
		
		System.out.println("------------");
		//�ݺ��� ��� for
		//for (����;����;����){����}
		int i;
//		for (i=0; i<10 ; i++) {
//			System.out.println("ȯ���մϴ� �����Դϴ� "+i);
		
		//¦���� ���
		
		for(i=0;i<=10; i+=2) { //i+=2 ���������� ¦���� ���
			System.out.print(i);
		}
		
		System.out.println("");
//			
		//Ȧ���� ���
		for(i=1;i<=10;i+=2) { 
			System.out.print(i);
		}
			//���� => ���� �� => ��� => ���� => ���Ǻ� => ���		}
			
		System.out.println("");
		
		// �Ųٷ� ����
		for (i=5;1<=i;i--) {
				System.out.print(i);
			}
			
		System.out.println("");
		
		//1���� 10������ ������ ��
		int sum=0;
		for (i=1;i<=10;i++) {
			sum += i;
			System.out.println("������� �� ���� "+ sum +"�Դϴ�.");
		}
		System.out.println("1���� 10������ ��� ���� "+ sum + "�Դϴ�" );
	
	}
}