package dto;

	import java.util.Objects;

	public class Member {
		// 클래스 필드
		// 접근 제한자
		// public 접근 제한자: 단어 뜻 그대로 외부 클래스가 자유롭게 사용할 수 있도록 합니다.
		// protected 접근 제한자: 같은 패키지 또는 자식 클래스에서 사용할 수 있도록 합니다.
		// private 접근 제한자: 단어 뜻 그대로 개인적인 것이라 외부에서 사용될 수 없도록 합니다.
		private String mem_id;
		private String mem_pwd;
		private String mem_name;
		private String mem_phone;
		private String mem_addr;
		
		// 기본 생성자
		public Member() {
		}

		// 사용자 정의 전체 필드 생성자
		public Member(String mem_id, String mem_pwd, String mem_name, String mem_phone, String mem_addr) {
			super();
			this.mem_id = mem_id;
			this.mem_pwd = mem_pwd;
			this.mem_name = mem_name;
			this.mem_phone = mem_phone;
			this.mem_addr = mem_addr;
		}

		public String getMem_id() {
			return mem_id;
		}

		public void setMem_id(String mem_id) {
			this.mem_id = mem_id;
		}

		public String getMem_pwd() {
			return mem_pwd;
		}

		public void setMem_pwd(String mem_pwd) {
			this.mem_pwd = mem_pwd;
		}

		public String getMem_name() {
			return mem_name;
		}

		public void setMem_name(String mem_name) {
			this.mem_name = mem_name;
		}

		public String getMem_phone() {
			return mem_phone;
		}

		public void setMem_phone(String mem_phone) {
			this.mem_phone = mem_phone;
		}

		public String getMem_addr() {
			return mem_addr;
		}

		public void setMem_addr(String mem_addr) {
			this.mem_addr = mem_addr;
		}

		@Override
		public int hashCode() {
			return Objects.hash(mem_addr, mem_id, mem_name, mem_phone, mem_pwd);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Member other = (Member) obj;
			return Objects.equals(mem_addr, other.mem_addr) && Objects.equals(mem_id, other.mem_id)
					&& Objects.equals(mem_name, other.mem_name) && Objects.equals(mem_phone, other.mem_phone)
					&& Objects.equals(mem_pwd, other.mem_pwd);
		}

		@Override
		public String toString() {
			return "DTO [mem_id=" + mem_id + ", mem_pwd=" + mem_pwd + ", mem_name=" + mem_name + ", mem_phone=" + mem_phone
					+ ", mem_addr=" + mem_addr + "]";
		}
		
		
		
		
		
		
		
		//
		
		
		
	}

