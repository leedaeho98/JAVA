package chap_01;

public class page5����ȯ {
	    public static void main(String[] args) {
	        // ����ȯ TypeCasting
	        // ���������� �Ǽ�������
	        // �Ǽ������� ����������

	        // int to float, double
	        // int score = 93 + (int)98.8; //98.8 �տ� int������ ����ȯ ��Ų��
	        // System.out.println(score);

	        int score =93;
	        System.out.println(score); //93
	        System.out.println((double) score); //���� �տ� double�� ������ �Ǽ��� ����ȯ�Ѵ�(93.0)
	        System.out.println((float) score); //����ȯ

	        //float,double to int
	        float score_f = 93.3F;
	        double score_d = 93.3;
	        score_d=98.8;
	        System.out.println((int) score_f); //int������ ����ȯ
	        System.out.println((int) score_d); //98

	        //���� + �Ǽ� ����
	        score = 93 + (int)98.8; //�� �տ� �ڷ����� ������ �ȴ�
	        System.out.println(score); //191

	        //�Ǽ� + ���� ����
	        score_d=(double) 93+98.8; //������� �Ǽ����� ���� 93�� �ڵ����� ����ȯ �ȴ�
	        System.out.println(score_d);

	        //������ ����ȯ�� ������ ����ֱ�
	        double converedScoreDouble = score; //score=191 -> 191.0 (�ڵ�����ȯ)
	        // int -> long -> float -> double (�ڵ�����ȯ)

	        int convertedScoreInt = (int)score_d;  //ū ������ �ִ� �����͸� ���� ������ ������ ������ �ؼ� �������°Ŵ� �׷��Ƿ� ����ȯ!!!
	        // double -> float -> long -> int (��������ȯ)

	        //���ڸ� ���ڿ���
	        String s1 = String.valueOf(93); //Ŭ����(��Ʈ��)�� �������ִ� valueOf ����� ����� 93������ ���ڿ��� �ٲ۴�
	        s1 = Integer.toString(93); //���� ���� ����̴�
	        System.out.println(s1); //���ڿ��̴�

	        String s2 = String.valueOf(99.9);
	        s2 = Double.toString(98.8);
	        System.out.println(s2);

	        // ���ڿ��� ���ڷ�
	        int i = Integer.parseInt("95");
	        System.out.println(i);

	        double d = Double.parseDouble("98.8");
	        System.out.println(d);

	        //�����Ͱ� �ùٸ��� ���־���Ѵ�
//	        int error = Integer.parseInt("�ڹ�");
//	        System.out.println(error);
	        


	    }
	}

