package chap_05;

public class page1Break {
	public static void main(String[] args) {
	//break��
	//ġŲ ������ ���� 20������ �Ǹ� (1�δ� 1������ ���� ����)
	
	//For��
	int max = 20; //ġŲ ���
		
	for(int i = 1 ; i<= 50 ; i++) {
		System.out.println(i + "�� �մ� �ֹ��Ͻ� ġŲ ���Խ��ϴ�");
		if (i == max) {
			System.out.println("���� ��ᰡ �����Ǿ����ϴ�");
			break; //�ݺ����� Ż��
		}
	}
	System.out.println("���� ��縦 �����ϰڽ��ϴ�");
	
	System.out.println("-----------------");
	
	int i = 1; //�մ� ����ȣ
	while (i<=50) {
		System.out.println( i +"�� �մ� �ֹ��Ͻ� ġŲ ���Խ��ϴ�");
		//1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 14 ,15 ,16, 17, 18 ,19 
			if (i == max) {
				System.out.println("���� ��ᰡ �����Ǿ����ϴ�");
				break;
			}
			i++; //
			
			
	}
	System.out.println("��簡 �����Ǿ����ϴ�");
	}
}