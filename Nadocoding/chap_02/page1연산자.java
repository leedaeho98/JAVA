package chap_02;

public class page1������ {
	    public static void main(String[] args) {
	        //��� ������

	        //�Ϲ� ����
	        System.out.println(4 + 2); //6
	        System.out.println(4 - 2); //2
	        System.out.println(4 * 2); //8
	        System.out.println(4 / 2); //���� ���ϴ� �� 2
	        System.out.println(5 / 2); //��Ʈ���̹Ƿ� 2�� ���
	        System.out.println(2 / 4); //�������̹Ƿ� 0 ���
	        System.out.println(4 % 2); //������ ������ 2
	        System.out.println(5 % 2);
	        
	        //�켱 ���� ����
	        System.out.println(2 + 2 * 2); //6
	        System.out.println((2 + 2 )* 2); //8
	        System.out.println(2 + (2 * 2)); //6
	        
	        //������ �̿��� ����
	        int a =20;
	        int b =10;
	        int c;
	        
	        c = a + b;
	        System.out.println(c); //30
	        
	        c = a - b;
	        System.out.println(c); //10
	        
	        c = a * b;
	        System.out.println(c); //200
	        
	        c = a / b;
	        System.out.println(c); //�� 2
	        
	        c = a % b;
	        System.out.println(c); //������ 0
	        
	        //���� ���� ++,--
	        int val;
	        val = 10;
	        System.out.println(val);
	        System.out.println(++val); //���� �� ���
	        System.out.println(val);
	       
	        val = 10;
	        System.out.println(val); //��� �� ���� ���� ��¹��� �����Ȱ� ����
	        System.err.println(val++);
	        System.out.println(val++);
	        System.out.println(val);
	        
	        val=10;
	        System.out.println(val);
	        System.out.println(--val); //���� �� ���
	        System.out.println(val);
	        
	        System.out.println("-----------");
	        val=10;
	        System.out.println(val);
	        System.out.println(val--);
	        System.out.println(val);
	        
	        //���� ����ȣ ǥ
	        int waiting = 0;
	        System.out.println("��� �ο� :"+ waiting++); //��� �ο� 0
	        System.out.println("��� �ο� :"+ waiting++); //��� �ο� 1
	        System.out.println("��� �ο� :"+ waiting++); //��� �ο� 2
	        System.out.println("�� ����ο� : " +waiting); //�� ����ο� 3
	    }
	}


