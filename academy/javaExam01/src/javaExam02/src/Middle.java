package javaExam02.src;

// Big의 값을 상속받는다
public class Middle extends Big { // 부모 Big클래스 , 자식 Middle
//
//
//	public void setMoney(int meony) {
//		this.money = money;
	
	@Override // 받은 내용을 그대로 사용하는데 내용이 바뀜
	public void setMoney(int money) {this.money = super.money + money; }
	}

