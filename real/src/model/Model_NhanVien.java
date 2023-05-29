package model;



	import java.sql.Date;

	public class Model_NhanVien {
		private String MaNhanVien;
		private String TenNhanVien;
		private String GioiTinh;
		private String NamSinh;
		private String SoDienThoai;
		private String DiaChi;
		
		private String GhiChu;
		
		
		public Model_NhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, String NamSinh, String SoDienThoai,
				String DiaChi, String GhiChu) {
			
			this.MaNhanVien = MaNhanVien;
			this.TenNhanVien = TenNhanVien;
			this.GioiTinh = GioiTinh;
			this.NamSinh = NamSinh;
			this.SoDienThoai = SoDienThoai;
			this.DiaChi = DiaChi;
			
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


		public String getNamSinh() {
			return NamSinh;
		}


		public void setNam(String namSinh) {
			NamSinh = namSinh;
		}


		public String getSoDienThoai() {
			return SoDienThoai;
		}


		public void setSoDienThoai(String soDienThoai) {
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
					+ ", NgaySinh=" + NamSinh + ", SoDienThoai=" + SoDienThoai + ", DiaChi=" + DiaChi + ", NgayBatDauLam="
					 + ", GhiChu=" + GhiChu + "]";
		}
		
		
		
	}



