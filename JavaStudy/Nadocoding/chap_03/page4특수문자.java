package chap_03;

public class page4Ư������ {
public static void main(String[] args) {
	//Ư������ , �̽������� ���� (Escape Sequence)
	//\n \t \\ \" \'
	System.out.println("�ڹٰ�");
	System.out.println("�ʹ�");
	System.err.println("��վ��");
	
	// \n�� �ٹٲ�
	System.out.println("�ڹٰ�\n�ʹ� \n��վ��!\n"); // \n�� �ٹٲ�
	
	//�ع����� 	9000��
	//������ 		8000��
	//������ 		8000��
	
	// \t�� �� ǥ��
	System.out.println("�ع�����\t\t9000��");
	System.out.println("��ġ��\t\t8000��");
	System.out.println("������\t\t8000��\n");
	
	// \\ �������� = ������γ� ���ϰ�� ǥ���Ҷ� �������� 2��!!
	System.out.println("C:\\Program Files\\Java\n");
	
	// \" \'
	System.out.println("����̰� \"�Ŀ�\" �̶� �߾��");
	System.out.println("�ܺ� \'����\'��� �߾��");
	
	
}
}
