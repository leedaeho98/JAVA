package chap_04;

public class page6while�� {
	public static void main(String[] args) {
	//�ݺ��� while
	// �����忡�� ������ �ϴ� ���
	int distance = 25; //��ü�Ÿ� 25m
	int move = 0; // ���� �̵� �Ÿ� 0m
	
	while (move < distance) { //���� �̵� �Ÿ��� ��ü �Ÿ����� �۴ٴ� ������ ���� ���� �ݺ� ����
		System.out.println("�����⸦ ��� �մϴ�");
		System.out.println("���� �̵� �Ÿ� :" + move);
		move += 3; //3���� �̵�
	}
		System.out.println("�����Ͽ����ϴ�");
		
	//���� ����
	move = 0;	
	while (move < distance) { //���� �̵� �Ÿ��� ��ü �Ÿ����� �۴ٴ� ������ ���� ���� �ݺ� ����
		System.out.println("�����⸦ ��� �մϴ�");
		System.out.println("���� �̵� �Ÿ� :" + move);
		}
	
	}
}
