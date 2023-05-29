package model;

public class Model_Phong {
	private String MaPhong;
	private String MaLoaiPhong;
	private String MaTang;
	private int GiuongDon;
	private int GiuongDoi;
	private String TinhTrang;
	private String GhiChu ;
	
	
	public Model_Phong(String MaPhong, String MaLoaiPhong, String MaTang, int GiuongDon, int GiuongDoi,
			String TinhTrang, String GhiChu) {
		
		this.MaPhong = MaPhong;
		this.MaLoaiPhong = MaLoaiPhong;
		this.MaTang = MaTang;
		this.GiuongDon = GiuongDon;
		this.GiuongDoi = GiuongDoi;
		this.TinhTrang = TinhTrang;
		this.GhiChu = GhiChu;
	}


	public Model_Phong() {
		
	}


	public String getMaPhong() {
		return MaPhong;
	}


	public void setMaPhong(String MaPhong) {
		this.MaPhong = MaPhong;
	}


	public String getMaLoaiPhong() {
		return MaLoaiPhong;
	}


	public void setMaLoaiPhong(String MaLoaiPhong) {
		this.MaLoaiPhong = MaLoaiPhong;
	}


	public String getMaTang() {
		return MaTang;
	}


	public void setMaTang(String MaTang) {
		this.MaTang = MaTang;
	}


	public int getGiuongDon() {
		return GiuongDon;
	}


	public void setGiuongDon(int GiuongDon) {
		this.GiuongDon = GiuongDon;
	}


	public int getGiuongDoi() {
		return GiuongDoi;
	}


	public void setGiuongDoi(int GiuongDoi) {
		this.GiuongDoi = GiuongDoi;
	}


	public String getTinhTrang() {
		return TinhTrang;
	}


	public void setTinhTrang(String TinhTrang) {
		this.TinhTrang = TinhTrang;
	}


	public String getGhiChu() {
		return GhiChu;
	}


	public void setGhiChu(String GhiChu) {
		this.GhiChu = GhiChu;
	}


	@Override
	public String toString() {
		return "Model_Phong [MaPhong=" + MaPhong + ", MaLoaiPhong=" + MaLoaiPhong + ", MaTang=" + MaTang
				+ ", GiuongDon=" + GiuongDon + ", GiuongDoi=" + GiuongDoi + ", TinhTrang=" + TinhTrang + ", GhiChu="
				+ GhiChu + "]";
	}
	
	

}
