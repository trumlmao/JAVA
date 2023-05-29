package model;

import java.sql.Date;

public class Model_NhanVien {
	private String MaNhanVien;
	private String TenNhanVien;
	private String GioiTinh;
	private Date NgaySinh;
	private double SoDienThoai;
	private String DiaChi;
	private Date NgayBatDauLam;
	private String GhiChu;
	
	
	public Model_NhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, Date NgaySinh, double SoDienThoai,
			String DiaChi, Date NgayBatDauLam, String GhiChu) {
		
		this.MaNhanVien = MaNhanVien;
		this.TenNhanVien = TenNhanVien;
		this.GioiTinh = GioiTinh;
		this.NgaySinh = NgaySinh;
		this.SoDienThoai = SoDienThoai;
		this.DiaChi = DiaChi;
		this.NgayBatDauLam = NgayBatDauLam;
		this.GhiChu = GhiChu;
	}


	public Model_NhanVien() {
		
	}


	public String getMaNhanVien() {
		return MaNhanVien;
	}


	public void setMaNhanVien(String maNhanVien) {
		MaNhanVien = maNhanVien;
	}


	public String getTenNhanVien() {
		return TenNhanVien;
	}


	public void setTenNhanVien(String tenNhanVien) {
		TenNhanVien = tenNhanVien;
	}


	public String getGioiTinh() {
		return GioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}


	public Date getNgaySinh() {
		return NgaySinh;
	}


	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}


	public double getSoDienThoai() {
		return SoDienThoai;
	}


	public void setSoDienThoai(double soDienThoai) {
		SoDienThoai = soDienThoai;
	}


	public String getDiaChi() {
		return DiaChi;
	}


	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}


	

	public String getGhiChu() {
		return GhiChu;
	}


	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}


	@Override
	public String toString() {
		return "Model_NhanVien [MaNhanVien=" + MaNhanVien + ", TenNhanVien=" + TenNhanVien + ", GioiTinh=" + GioiTinh
				+ ", NgaySinh=" + NgaySinh + ", SoDienThoai=" + SoDienThoai + ", DiaChi=" + DiaChi + ", NgayBatDauLam="
				+ NgayBatDauLam + ", GhiChu=" + GhiChu + "]";
	}
	
	
	
}
