package chap_02;

public class page5���� {
	public static void main(String[] args) {
		//���� ������
//		(���) = (����) ? (���� ��� �����) : (������ ��� �����)
		int x = 5;
		int y = 5;
		int max = (x > y) ? x : y; //�����(max) = ����(x>y) ? x(���ϰ�� �����) : y(������ ��� �����)
		System.out.println(max); //���� ��� ������� ���
		
		int min = (x < y) ? x : y;
		System.out.println(min); //������ ��� ������� ���
		
		boolean b = (x == y) ? true : false; //�����̹Ƿ� false
		System.out.println(b);
		
		boolean c = (x != y) ? true : false;
		System.out.println(c);
		
		String d = (x != y ) ? "�޶��" : "�Ȱ��ƿ�";
		System.out.println(d);
		
		
	}
}
