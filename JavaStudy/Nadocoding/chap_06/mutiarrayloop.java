package chap_06;

public class mutiarrayloop {
	public static void main(String[] args) {
		
//		//3 * 5 크기의 2차원 배열
////		String[][] seatS = new String[][]{
////		{"A1","A2","A3","A4","A5"},
////		{"B1","B2","B3","B4","B5"},
////		{"C1","C2","C3","C4","C5"}
////		};
//		int i , j;
////		for (i = 0 ; i<= 2 ; i++) { //세로기준
////			for (j = 0 ; j <=4 ; j++) { //가로기준
////				System.out.print(seatS[i][j] + " "); 
////			}
////			System.out.println("\n");
////		}
//////		//첫 줄에는 3칸, 둘쨰 줄에는 4칸 , 셋째 줄에는 5칸
//		String[][] movie = {
//			{"A1","A2","A3"},
//			{"B1","B2","B3","B4"},
//			{"C1","C2","C3","C4","C5"}
//		};
//		for (i = 0 ; i<movie.length ; i++) {
//			for (j = 0 ; j< movie[i].length ; j++) {
//				System.out.print(movie[i][j] + " ");
//			}
//			System.out.println();
			
//		}
		System.out.println("-------------------");
		String[][] seats3 = new String[10][15];
		String[] eng = {"A","B","C","D","E","F","G","H","I","J"}; //세로크기
		for (int i = 0 ; i<seats3.length;i++  ) {
			for (int j = 0; j < seats3[i].length ; j++) {;
				seats3[i][j] = eng[i] + (j+1);
			}
		}
		System.out.println("-------------------");
		
		seats3[7][8] = "__"; //배열을 공백으로
		seats3[7][9] = "__";
			for (int i = 0 ; i<seats3.length;i++  ) {
				for (int j = 0; j < seats3[i].length ; j++) {
			System.out.print(seats3[i][j] + " ");
			}
			System.out.println();
		}

		
	}
}
