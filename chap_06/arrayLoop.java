package chap_06;

public class arrayLoop {
	public static void main(String[] args) {
		//�迭�� ��ȸ
		String[] coffees = {"�Ƹ޸�ī��","ī���ī","ī���","����������"};
		
//		//for �ݺ��� ��ȸ
//		for (int i = 0; i<4;i++) {
//			System.out.println(coffees[i] +"�ϳ�");
//		}
//		System.out.println("�ּ���");
		
		// �迭�� ���̸� �̿��� ��ȸ
//		for (int i = 0; i<coffees.length ;i++) {
//			System.out.println(coffees[i] +"�ϳ�");
//		}
//		System.out.println("�ּ���");
		
		// enhanced for (for-each) �ݺ���
		//list ��ȸ�Ҷ� ����
		//���� ���� ����
		//coffees�� ���� coffee �ȿ� ���� �ϳ��� ����
		for (String coffee : coffees) {
			System.out.println(coffee + "�ϳ�");
		}
	}
}
