package chap_03;

public class page2���ڿ� {
public static void main(String[] args) {
	String s = "I like Java and Python and C.";
	
	// ���ڿ� ��ȯ
	System.out.println(s.replace("and",","));
	//s.replace("������","�ٲܰ�") and�� ","�� ��ȯ
	
	System.out.println(s.substring(7));
	// �ε��� ���� 7���� ���� (���� ������ ����)
	
	System.out.println(s.substring(s.indexOf("Java")));
	// �� ����� ����
	
	System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
	//���� ��ġ���� �� ��ġ "����"
	//" Java "�� �����ϴ� ��ġ���� "."�� �����ϴ� ��ġ �ٷ� �ձ���
	
	// ���� ����
	s = "      I love Java.           "; //���ͳݿ��� ������ �������� ��κ� �̷�
	System.out.println(s);
	System.out.println(s.trim()); //�� �� ���� ����
	
	//���ڿ� ����
	String s1 = "Java";
	String s2 = "Python";
	
	System.out.println(s1 + s2);
	
	System.out.println(s1 + "," + s2); //���̿� �޸�
	System.out.println(s1.concat(", ").concat(s2));
	//���ڿ� ���չ�
			
}
}
