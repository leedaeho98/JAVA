package exam;

public class for_for {
	public static void main(String[] args) {
		int i , j;
		for (i = 1 ; i <= 4 ; i++) {
			for(j = 5 ; 1 <= j ; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
