package chap_03;

public class page5���� {
public static void main(String[] args) {
	String p = "���� ����Ŵϴ� ��� ������ ��ȣ�� \'���� ���ְڴ�\'��� ���Ͽ��� ";
		System.out.println(p.length()); //���ڿ��� ���̸� �˼��ִ�
		System.out.println(p.substring(20,29));
		// �ε��������� 20���� ������ 29 ��������!
		System.out.println(p.substring(20,(p.lastIndexOf("��"))));
		// �ε��� ������ 20(�ε�����ȣ) ������ �ε��� "��"���� ��������
		
		System.out.println(p.substring(20,(p.indexOf("��") +22)));
		// �ε��� ������ 20(�ε�����ȣ) ù �ε��� "��"���� +22 �̵� �� ��������
		
		System.out.println(p.substring(20,(p.lastIndexOf("��") -6)));
		// �ε��� ������ 20(�ε�����ȣ) ������ �ε��� "��"���� �������� -6
	String j="I love Han-hea-min";	
	p="Void Man Last Year";
		System.out.println(p);
		System.out.println(p.toUpperCase()); //���� �빮�ڷ� ��ȯ
		System.out.println(p.toLowerCase()); //���� �ҹ��ڷ� ��ȯ
		
		System.out.println(j +"," + p); //���ڿ� ��ü
		
		System.out.println(p.indexOf("a")); //���� ��ġ���� �տ������� 0���� ����
		System.out.println(p.substring(1,5)); // substring(������ , �� ��������)
		
		System.out.println(p.replace("Man","Woman")); //replace("������" , "�����Ұ�")
		
	String l = "            pass of master              ";
		System.out.println(l.trim()); //�¿� ���� ����
		
		System.out.println(l.contains("pass")); // �� �ȿ� pass�� ���ԵǸ� true
		
		
		System.out.println(l.startsWith(" ")); //�� ù ������ "��" ������ true
		System.out.println(l.endsWith("master")); //�� ������ ������ "��" Ʋ���� false
		
	}
}