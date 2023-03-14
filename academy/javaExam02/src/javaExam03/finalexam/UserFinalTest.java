package javaExam03.finalexam;

public final class UserFinalTest { //  final클래스 => 상속을 할 수 없는 클래스
		public static void main(String[] args) {
//			System.out.println(FinalExam02.pi);
			
			FinalExam02 obj1 = new FinalExam02();
			System.out.println(obj1.k);
			
			FinalExam02 obj2 = new FinalExam02(5000);
			System.out.println(obj2.k);
			
			System.out.println("===================");

			UseSampleData data = new UseSampleData();
//			data.obj = new SampleData() // 
			data.obj.fd1 = 5000;
			System.out.println(data.obj.fd1);
			
		}
	}

