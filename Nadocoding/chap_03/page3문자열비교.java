package chap_03;

public class page3���ڿ��� {
public static void main(String[] args) {
	//���ڿ� ��
	String s1 = "Java";
	String s2 = "Python";
	
	System.out.println(s1.equals("Java")); //�����Ƿ� true
	
	//��ҹ��� ���� ���� ���ڿ� ������ ������ ���� üũ
	System.out.println(s2.equalsIgnoreCase("python"));
	
	//���ڿ� �� ��ȭ
	s1 = "1234"; //���� ���� �޸����� ��й�ȣ ����
	s2 = "1234";
	System.out.println(s1.equals(s2)); //true (���� ��)
	System.out.println(s1 == s2); //true (����)
	
	//�ڹٿ��� ���ڿ� �񱳴� equals�� ���
	//�ڹٿ��� ���ڿ� �� ��ȣ�� x
	
	s1 = new String("1234"); //���� �ٸ� �޸𸮰����� ����(���� ���� x)
	s2 = new String("1234"); //���� �ٸ� �޸𸮰����� ����(���� ���� x)
	System.out.println(s1.equals(s2));
	System.out.println(s1 == s2); 
	//���� �ٸ� �޸𸮰����� �־ false
	
}
}
