package chap_07;

public class returnfS {
	//ȣ�� ��ȭ��ȣ (��ȯ)
	public static String getPhoneNumber() {
	String phonNumber = "02-1234-5678";
	return phonNumber;
	}
	//ȣ�� �ּ� ���� �������� ��ȯ
	public static String getaddress() {
	return "����� ���";
	}
	//ȣ�� ��Ƽ��Ƽ
	public static String getActivities() {
	return "�׳� , ¤���� , T�ͽ������� ";
	}
	
	public static void main(String[] args) {
		
	//��ȯ ��
	String contactNumber = getPhoneNumber();
	System.out.println("ȣ�� ��ȭ��ȣ : "+contactNumber);
	
	String Address=getaddress(); //�� �Լ��� ���� �������� ��ȯ�ؼ� 	�� ������ �ְ� ���
	System.out.println("������ �ּҴ� : " + Address);

	System.out.println("ȣ�� ��Ƽ��Ƽ : " + getActivities());
	}
}
