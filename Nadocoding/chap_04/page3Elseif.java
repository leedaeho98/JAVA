package chap_04;
public class page3Elseif {
	public static void main(String[] args) {
	// ���ǹ� Elseif
	//�Ѷ�� ���̵尡 ������ +1
	//���� �ֽ��� ������ +1
	//���̽� �Ƹ޸�ī�밡 ������ +1
	
	boolean hallabongAde = true;
	boolean mangoJuice = true;
	boolean iceAmricano = true;
	
//	//else if �� ������ ��� ����
//	if(!hallabongAde) { //�����̸� ���x �Ʒ��ִ� else if�� ��
//		System.out.println("�Ѷ�� ���̵� +1");
//		
//	}else if (!mangoJuice) { //���̸� ��� ������ �����̸� �Ʒ� else if�� �������� �� 
//		System.out.println("�����꽺 +1");
//		
//	}else if (!iceAmricano) {
//		System.out.println("���̽� �Ƹ޸�ī�� +1");
//		
//	}else { //�� ��� ������ false�� else�� ���
//		System.out.println("�ٸ� ī��� ���ϴ�");
//	}
//	
//	
	//else�� ��� ��밡��
	if(!hallabongAde) { //�����̸� ���x �Ʒ��ִ� else if�� ��
		System.out.println("�Ѷ�� ���̵� +1");
		
	}else if (!mangoJuice) { //���̸� ��� ������ �����̸� �Ʒ� else if�� �������� �� 
		System.out.println("�����꽺 +1");
		
	}else if (iceAmricano) {
		System.out.println("���̽� �Ƹ޸�ī�� +1");
	}
}
}
