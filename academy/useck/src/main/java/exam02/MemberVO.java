package exam02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor

public class MemberVO {
	private String memId;
	private String memPwd;
	private String memName;
	private String email;
	
}


