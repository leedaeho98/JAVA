package libexam04;
import java.util.*;

public class RandomExam {
	public static void main(String[] args) {
		Random rnd = new Random(100000); // 
		for (int i = 0; i < 100 ; i = i + 1) {
			System.out.println(rnd.nextInt(100000)+0); // +10은 시작값 10~30 사이에 나온다
		
		}
	}
}
