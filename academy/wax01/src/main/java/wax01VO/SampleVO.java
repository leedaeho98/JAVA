package wax01VO;

public class SampleVO {
	private String aa;
	private String bb;
	private String cc;
	
	public SampleVO() {
	}

	public SampleVO(String aa, String bb, String cc) {
		this.aa = aa;
		this.bb = bb;
		this.cc = cc;
	}

	public String getAa() {
		System.out.println("===================");
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public String getBb() {
		return bb;
	}

	public void setBb(String bb) {
		this.bb = bb;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}
	
	
	
	
	
	
	
	
}
