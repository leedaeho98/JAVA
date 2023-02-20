package coding_1;

import org.opentutorials.iot.Elevator; // import (불러온다) 엘리베이터라는 클래스를 불러온다
import org.opentutorials.iot.Security; // import (불러온다) 시큐리티 클래스를
import org.opentutorials.iot.Lighting;
public class OkJavagoing {

	public static void main(String[] args) {
		
		// 내가 하고자 하는일이 순서를 생각한다
		String id = "JAVA APT 507";
		
		// 1 . Elevator call 
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); //1층으로 엘레베이터를 보내라
		//Elevator은 org.opentutorials.iot.Elevator다
		// Elevator(데이터타입),myElevator(변수)
		
//		 2 . Security off (비밀번호(보안))
		Security mySecurity = new Security(id);
		mySecurity.off(); //.을 쳤을때 소괄호가 있는건 메소드다
		 
		
		// 3 . Light on
		Lighting hallLamp = new Lighting( id + "/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(  id +"/ floor Lamp");
		floorLamp.on();	
	}

}
