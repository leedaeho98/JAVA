package exam01;

public class MainReadExam {
	public static void main(String[] args) {
//		Class<FileReadInter> classObj = null;
		
		FileReadInter fileRead = new FileInputStreamRead();
		String readText = fileRead.readText("testExam.txt");
		System.out.println(readText);
		
//		try {
//			classObj = (Class<FileReadInter>) Class.forName(args[0]);
//			consolePrint(new FileInputStreamRead() , args[1],args[2]);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//	private static void consolePrint(FileReadInter fileRead , String  fileName, String prnInfo) {
//		String readText = fileRead.readText("testExam.txt");
//		System.out.println(readText);
	}
	
}
