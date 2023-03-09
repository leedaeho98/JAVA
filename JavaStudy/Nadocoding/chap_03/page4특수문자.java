package chap_03;

public class page4특수문자 {
public static void main(String[] args) {
	//특수문자 , 이스케이프 문자 (Escape Sequence)
	//\n \t \\ \" \'
	System.out.println("자바가");
	System.out.println("너무");
	System.err.println("재밌어요");
	
	// \n은 줄바꿈
	System.out.println("자바가\n너무 \n재밌어요!\n"); // \n은 줄바꿈
	
	//해물파전 	9000원
	//감자전 		8000원
	//부추전 		8000원
	
	// \t는 탭 표시
	System.out.println("해물파전\t\t9000원");
	System.out.println("김치전\t\t8000원");
	System.out.println("부추전\t\t8000원\n");
	
	// \\ 역슬래시 = 폴더경로나 파일경로 표현할때 역슬래시 2번!!
	System.out.println("C:\\Program Files\\Java\n");
	
	// \" \'
	System.out.println("고양이가 \"냐옹\" 이라 했어요");
	System.out.println("단비가 \'뭘봐\'라고 했어요");
	
	
}
}
