package chap_06;

public class __quiz5 {
	public static void main(String[] args) {
		int[] size = new int[10]; 
		for (int i = 0 ; i < size.length ; i++) {
			size[i] += 250 + (5*i); // 
			System.out.println("사이즈 "+ size[i] + " (재고있음)" );
		}
	}
}
