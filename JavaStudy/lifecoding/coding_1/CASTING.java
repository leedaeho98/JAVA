package coding_1;

public class CASTING {
	public static void main(String[] args) {
		
		// ĳ���� = �ڹٿ����� ������ ������ Ÿ���� �����ϰ� ����
		//�ڹٸ� ����ϴ� ���� � ������ �� �� , ������ ����ִ� ��
		//�ٸ� ������ Ÿ������ �������ؾ��� ��찡 ����µ� �׶��� Ű���尡 ĳ����
		// ��� ���� ������ �������� ĳ���� �ϰ� ������ �˸� �˻��� ���ؼ� �˼��ִ�
		
		double a = 1.1; // �Ǽ���
		double b = 1; //�ս��� ���� ������ �ڵ����� ĳ����
		double b2 = (double)1; 
		
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1; //0.1 �ս��� �Ͼ�� ������ ĳ���� x
		int e = (int) 1.1; //double���� integer����ȯ (������)
		System.out.println(e);
		
		// 1(������) to String(���ڿ�) ����ȯ
		String f = Integer.toString(1);
		System.out.println(f.getClass()); 
		// ������ 1�� ���ڿ� 1�� ����ȯ ��Ŵ
		// getClass()�� ������ ������ Ÿ���� ����� �˷���
		
	}
}
