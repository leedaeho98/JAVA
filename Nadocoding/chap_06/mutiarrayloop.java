package chap_06;

public class mutiarrayloop {
	public static void main(String[] args) {
		
//		//3 * 5 ũ���� 2���� �迭
////		String[][] seatS = new String[][]{
////		{"A1","A2","A3","A4","A5"},
////		{"B1","B2","B3","B4","B5"},
////		{"C1","C2","C3","C4","C5"}
////		};
//		int i , j;
////		for (i = 0 ; i<= 2 ; i++) { //���α���
////			for (j = 0 ; j <=4 ; j++) { //���α���
////				System.out.print(seatS[i][j] + " "); 
////			}
////			System.out.println("\n");
////		}
//////		//ù �ٿ��� 3ĭ, �Ѥ� �ٿ��� 4ĭ , ��° �ٿ��� 5ĭ
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
		String[] eng = {"A","B","C","D","E","F","G","H","I","J"}; //����ũ��
		for (int i = 0 ; i<seats3.length;i++  ) {
			for (int j = 0; j < seats3[i].length ; j++) {;
				seats3[i][j] = eng[i] + (j+1);
			}
		}
		System.out.println("-------------------");
		
		seats3[7][8] = "__"; //�迭�� ��������
		seats3[7][9] = "__";
			for (int i = 0 ; i<seats3.length;i++  ) {
				for (int j = 0; j < seats3[i].length ; j++) {
			System.out.print(seats3[i][j] + " ");
			}
			System.out.println();
		}

		
	}
}
