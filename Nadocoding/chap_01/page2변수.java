package chap_01;

public class page2���� {
	    public static void main(String[] args) {
	        String name="�����ڵ�";
	        int time=15;
	        double score = 90.5;
	        char grade = 'A';
	        name="�̴�ȣ";
	        grade = 'B'; //���� ������Ʈ �Ҽ��ִ�
	        boolean pass = true;
	        pass=false;        

	            System.out.println(name +", ����� ���۵˴ϴ�. "+ time + "�ÿ� �湮 �����Դϴ�");
	            //name + ���ڿ� + time + �湮�����̴ٰ� �������Ŵ�
	            System.out.println(name +", ����� �Ϸ�Ǿ����ϴ�");
	            System.out.println(name+"���� ��� ������ "+ score +"���Դϴ�.");
	            System.out.println("������ "+ grade +"�Դϴ�");
	            System.out.println("�׷��� ���� �����ڰ� �Ǿ����� "+pass+"");
	            
	            double g=3.14123456789;
	            float f =3.14123456789f; //float�� ������ �Ǽ� �� �ڿ� f�� �־���Ѵ�
	            System.out.println(g+"�Դϴ�"); //���� ������ �Ҽ� ����� �ϸ� double
	            System.out.println(f+"�Դϴ�");  //���� �Ҽ����� ���ҰŸ� float
	            
	            long i = 1000000000000l; //long�� ������ ���� �� �ڿ� l�� �ٿ����Ѵ�
	            i=1000_000_000_000l;
	            System.out.println(i);

	            //int(������),long(������(int���� �� ���� ����))
	            //float(�Ǽ���),double(�Ǽ���(float���� ���� ����))
	            //char(����(1����)),String(���ڿ�(��������))
	            //boolean(true,false)

	            //����Ϸ��� �����Ϳ� �´� ������ �ڷ����� ����ؾ��Ѵ�
	            //int���� ������ �ִ� �ּ��� ���� -21�� +21���̴�
	    }
	}


