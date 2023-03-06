package libexam01;

import java.io.File;
import java.util.List;

public class DirFileList  {
	public static String[] dirFileRead(){
		File file = new File("./imgfilelist");
		return file.list();
		// imgfilelist안에 있는걸 배열로 묶고 문자열로 반환한다
	}
}
