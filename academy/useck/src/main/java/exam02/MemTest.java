package exam02;

import java.util.List;

public class MemTest {

	public static void main(String[] args) {
		MemberVO data1 = new MemberVO("abcd","efgh","이대호","leedaeho@naver.com");
		MemberVO data2 = new MemberVO("ijkl","nmop","호랑이","tiger@naver.com");
		MemberVO data3 = new MemberVO("qrst","uwxy","토끼","rabbit@naver.com");
	
				MemberDAO dao = new MemberDAOImpl();
				dao.add(data1);
				dao.add(data2);
				dao.add(data3);
//				dao.del("yyyy");
//				data2.setMemPwd("hong1472"); data2.setEmail("hong1472@qwert.com");
//				dao.update(data2);
				MemberVO resultVO = dao.get("park");
				System.out.println(resultVO);
				List<MemberVO> list = dao.getAll();
				for( MemberVO vo : list) {
					System.out.println( vo );
		}
		
	}

}
