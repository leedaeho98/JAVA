package javaExam02.src;

public class UseExam {
	public static void main(String[] args) {
		Big obj = new Big(); // 같은 타입으로 객체 생성
		printInfo(obj);
		obj = new Middle();
		obj.setMoney(5000);
		printInfo(obj);
		obj = new Small();
		obj.setMoney(13000);
		printInfo(obj);
	}
	
	public static void  printInfo(Big obj) {
		System.out.println(obj.money);
	}
	
}
