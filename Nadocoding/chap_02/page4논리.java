package chap_02;

public class page4�� {
public static void main(String[] args) {
	//�� ������
	boolean ��ġ� = true;
	boolean ������� = true;
	boolean �������� = true;
	
	System.out.println(��ġ� || ������� || ��������); // ||(or:�Ǵ�)�ϳ��� true���� true
	System.out.println(��ġ� && ������� && ��������); // &&(and:�׸���)��� ���� true���� true
	
	System.out.println((5 > 3) && (5 < 3)); //5�� 3���� ũ�� 3�� 5���� ũ�� false(&&)
	System.out.println((5 > 3) && (3 > 1)); //5�� 3���� ũ�� 3�� 1���� ũ�� true(&&�� ��� ���� true��  true)

	System.out.println((5 > 3) || (5 < 3)); // 5�� 3���� ũ�� 3�� 5���� ũ�� true(||: �ϳ��� ���� true���� true)
	System.out.println((5 > 3) || (3 < 1)); //true
	System.out.println((5 < 3) || (3 < 1)); //�ϳ��� true�� ��� false

//	System.out.println(1 < 3 < 5); //���ӵ� �񱳴� X
	
	System.out.println(!true); //false (true�� �ݴ�)
	System.out.println(!false); //true (false�� �ݴ�)
	System.out.println(!(5 == 5)); //�����ϱ� false
	System.out.println(!(5 == 3)); //���� �����ϱ� true
}
}
