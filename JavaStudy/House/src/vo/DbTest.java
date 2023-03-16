package vo;

import java.util.Objects;

public class DbTest {
	// DB 컬럼명과 동일하게 적용
	// private => 정보은닉을 위한거로 클래스 외부 접근 불가
	//			=> 같은 클래스 안에서만 사용가능
	private String mem_id;
	private String mem_pwd;
	private String mem_name;
	private int mem_age;
	private String buy_item;
	private String item_count;
	public DbTest() {

	}
	public DbTest(String mem_id, String mem_pwd, String mem_name, int mem_age, String buy_item, String item_count) {
		super();
		this.mem_id = mem_id;
		this.mem_pwd = mem_pwd;
		this.mem_name = mem_name;
		this.mem_age = mem_age;
		this.buy_item = buy_item;
		this.item_count = item_count;
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
	public int getMem_age() {
		return mem_age;
	}
	public void setMem_age(int mem_age) {
		this.mem_age = mem_age;
	}
	public String getBuy_item() {
		return buy_item;
	}
	public void setBuy_item(String buy_item) {
		this.buy_item = buy_item;
	}
	public String getItem_count() {
		return item_count;
	}
	public void setItem_count(String item_count) {
		this.item_count = item_count;
	}
	@Override
	public int hashCode() {
		return Objects.hash(buy_item, item_count, mem_age, mem_id, mem_name, mem_pwd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DbTest other = (DbTest) obj;
		return Objects.equals(buy_item, other.buy_item) && Objects.equals(item_count, other.item_count)
				&& mem_age == other.mem_age && Objects.equals(mem_id, other.mem_id)
				&& Objects.equals(mem_name, other.mem_name) && Objects.equals(mem_pwd, other.mem_pwd);
	}
	@Override
	public String toString() {
		return "DbTest [mem_id=" + mem_id + ", mem_pwd=" + mem_pwd + ", mem_name=" + mem_name + ", mem_age=" + mem_age
				+ ", buy_item=" + buy_item + ", item_count=" + item_count + "]";
	}
	
	
	
	
}

