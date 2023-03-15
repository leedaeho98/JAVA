package java_23_03_12;

public class Object_Tv {
	// TV의 속성(필드)
	boolean power = false; // 전원상태(on/off)
	String color; // 색상
	int channel = 0; // 채널
	
	void power() {
	power = !power;
	}
	void channelUp() {
	channel++;
	}
	void channelDown() {
	channel--;
	}
	}



