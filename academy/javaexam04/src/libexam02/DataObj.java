package libexam02;

import java.util.Objects;

public class DataObj {
	// 필드
	public int aaa = 123;
	public int bbb = 1200;
	public int ccc = 300;
	@Override
	public int hashCode() {
		return Objects.hash(aaa, bbb, ccc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataObj other = (DataObj) obj;
		return aaa == other.aaa && bbb == other.bbb;
	}

}
