package chap_03;

public class page1���ڿ� {
public static void main(String[] args) {
	String s = "I like Java and Python and C.";
	
	//���ڿ��� ����
	System.out.println(s.length()); //length ���ڿ��� ����
	
	//��ҹ��� ��ȯ
	System.out.println(s.toUpperCase()); //�빮�ڷ�
	System.out.println(s.toLowerCase()); //�ҹ��ڷ�
	
	//���� ����
	System.out.println(s.contains("Java")); //�� �ȿ� ���ԵǸ� True
	System.out.println(s.contains("C#"));	//���Ե��� �ʴ´ٸ� false
	
	System.out.println(s.indexOf("Java")); //���� ��ġ����(�տ������� 0����)
	System.out.println(s.indexOf("C#")); //���Ե��� �ʴ´ٸ� -1 ���
	//���� �ε����� 0���� ����(���鵵 ����)
	
	System.out.println(s.indexOf("and")); //���� ���� ������ ���� �켱������ ���
	System.out.println(s.lastIndexOf("and")); //���� ���� �ִ� ��� ���������� ��ġ�ϴ� ���� ���
	
	System.out.println(s.startsWith("I like")); //�� ���ڿ��� �����ϸ� True
	System.out.println(s.startsWith("You like")); //�� ���ڿ��� �������� ������ false;\
	
	System.out.println(s.endsWith(".")); //�� ���ڿ��� ������ true / �ƴϸ� false
}
}
