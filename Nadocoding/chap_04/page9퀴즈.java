package chap_04;

import java.util.Iterator;

public class page9���� {
	public static void main(String[] args) {
//		int i,j;
//			for(i = 2;i<=9;i++) { //2 9�� �ݺ� 3 9�� �ݺ�
//				for(j=1;j<=9;j++) {
//					System.out.println(i+ " * " + j + " = " +i * j);
//				}
//				System.out.println();
//			}
//		for (int i = 2; i<=9 ; i++) {
//			System.out.println(i + " * 1  =" +i );
//			
//		}
//	}
//
//        *****
//        S****
//        SS***
//        SSS**
//        SSSS*
	int i , j , k;
	for ( i = 1 ; i <=5 ; i++) { //5���� ���� ������ش�
		for(j = 1 ; j<=i-1 ; j++) {
			System.out.print(" ");
		}
		for( k = 5 ; i<=k ; k--) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
	}
}