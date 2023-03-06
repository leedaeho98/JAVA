package interface01;

public class Test {

	public static void main(String[] args) {
		String textData = "나의 살던 고향은 꽃피는 산골";
//		textData = textData + "영구없다.";
//		1 위의 문자열은 몇개의 단어로 구성되어 있는지를 출력하는 프로그램을 작성하시오
		String[] words = textData.split(" ");
		System.out.println(words.length);
		
//  	2 각각의 홀수번째 단어를 출력하는 프로그램 작성
		int ii = 0;
		for(String word : words) {
			ii++;
			if( ii % 2 == 1) {
				System.out.println(word);
			}
		}
		System.out.println("====================================");
		for (int i = 0; i < words.length ; i+=2) { // 홀수번째
			System.out.println(words[i]);
		}
		
//		3 문자열에서 임의의 문자열("고향")이 들어있는지 판단하는 프로그램을 작성하시오.
		int pos = textData.indexOf("산골");
		if (pos>-1) {
			System.out.println("단어가 있습니다." + (pos+1) + "번째에 있습니다.");
		}else {
			System.out.println("단어가 없습니다.");
		}
		
	}

}
