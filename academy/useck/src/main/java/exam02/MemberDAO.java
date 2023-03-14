package exam02;

import java.util.List;

public interface MemberDAO {

	void add(MemberVO data1);

	void del(String string);

	void update(MemberVO data2);

	MemberVO get(String memId);
	
	List<MemberVO> getAll();




	

}
