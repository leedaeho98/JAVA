package chap_06;

public class ASCII {
	public static void main(String[] args) {
		//�ƽ�Ű �ڵ� (ANSI) : �̱� ǥ���ڵ�
		char c = 'A'; //���ĺ� �빮��(A)�� 65���� ���� , �ҹ��ڴ�(a) 97���� ���� , ���ڴ�(0) 48���� ����
		System.out.println(c);
		System.out.println((int)c); //���������� ����ȯ �ƽ�Ű�ڵ� 10 ������ 65��
		
		c = 'B';
		System.out.println(c);
		System.out.println((int)c); //���������� ����ȯ �ƽ�Ű�ڵ� 10������ 66
		
		c++;
		
		System.out.println(c);
		System.out.println((int)c); //���������� ����ȯ �ƽ�Ű�ڵ� 10������ 66
	
		
		System.out.println("-------------------");
		String[][] seats3 = new String[10][15];
		char ch = 'A';
		for (int i = 0 ; i<seats3.length;i++  ) {
			for (int j = 0; j < seats3[i].length ; j++) {;
				seats3[i][j] = String.valueOf(ch) + (j+1);
				//�������� ch�� ���ڿ��� ��ȯ
			}
			ch++;
		}
		System.out.println("-------------------");
		
		seats3[7][8] = "__"; //�迭�� ��������
		seats3[7][9] = "__";
			for (int i = 0 ; i<seats3.length;i++  ) {
				for (int j = 0; j < seats3[i].length ; j++) {
			System.out.print(seats3[i][j] + " ");
			}
			System.out.println();
		}

	}
}
