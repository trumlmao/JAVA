package model;

public class model_khach_hang {
	private String name,sdt,cccd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public model_khach_hang() {
		
	}

	public model_khach_hang(String name, String sdt, String cccd) {
		this.name = name;
		this.sdt = sdt;
		this.cccd = cccd;
	}
	
	
	
	
	
	
	
	
	
}
