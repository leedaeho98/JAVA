package coding_1;

import org.opentutorials.iot.Elevator; // import (�ҷ��´�) ���������Ͷ�� Ŭ������ �ҷ��´�
import org.opentutorials.iot.Security; // import (�ҷ��´�) ��ť��Ƽ Ŭ������
import org.opentutorials.iot.Lighting;
public class OkJavagoing {

	public static void main(String[] args) {
		
		// ���� �ϰ��� �ϴ����� ������ �����Ѵ�
		String id = "JAVA APT 507";
		
		// 1 . Elevator call 
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); //1������ ���������͸� ������
		//Elevator�� org.opentutorials.iot.Elevator��
		// Elevator(������Ÿ��),myElevator(����)
		
//		 2 . Security off (��й�ȣ(����))
		Security mySecurity = new Security(id);
		mySecurity.off(); //.�� ������ �Ұ�ȣ�� �ִ°� �޼ҵ��
		 
		
		// 3 . Light on
		Lighting hallLamp = new Lighting( id + "/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(  id +"/ floor Lamp");
		floorLamp.on();	
	}

}
