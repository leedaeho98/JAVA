package chap_03;

public class page6���� {
public static void main(String[] args) {
	String s = "Hi Everyday Good Morning";
	String d = "                 Hi             ";
	
		System.out.println(s.length()); // ���ڿ��� ����
		System.out.println(d.length()); // ���ڿ��� ����
		
		System.out.println(s.substring(0,11)); // ("������,�� ��������")
		System.out.println(s.substring(0,(s.indexOf("G")+4)));//�ε��� ��ȣ 0���� G�� �ε��� ��ȣ +4
		
		System.out.println(s.toUpperCase()); //�빮�ڷ� ��ȯ
		System.out.println(s.toLowerCase()); //�ҹ��ڷ� ��ȯ
		
		System.out.println(d.trim()); // �¿���� ����
		
		System.out.println(s.contains("day")); //�� �ȿ� day�� ������ true
		System.out.println(d.contains("party")); // ������ false
		
		System.out.println(s.startsWith("Hi")); //ù ������ "��" �����ϸ� true
		System.out.println(s.endsWith("pass")); //������ ������ "��" ����ġ�ϸ� false
		
		String max = s == d || 10 < 5 ? "�Ȱ��ƿ�" : "�޶��"; //���׿�����
		System.out.println(max);
		
}
}
