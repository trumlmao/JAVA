package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import db.db;
import model.Model_Phong;
public class Phong_DAO implements Daointerface<Model_Phong> {

	@Override
	public int insert(Model_Phong bs) {
		ArrayList<Model_Phong> phong = new ArrayList<Model_Phong>();
		int kq = 0 ;
		try {
			Connection conn = db.getConnection();
			String sql = "INSERT INTO Phong(MaPhong,MaLoaiPhong,MaTang,GiuongDon,GiuongDoi,TinhTrang,GhiChu) VALUES(?,?,?,?,?,?,?)";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, bs.getMaPhong());
			stm.setString(2, bs.getMaLoaiPhong());
			stm.setString(3, bs.getMaTang());
			stm.setLong(4, bs.getGiuongDon());
			stm.setLong(5, bs.getGiuongDoi());
			stm.setString(6, bs.getTinhTrang());
			stm.setString(7, bs.getGhiChu());
			kq = stm.executeUpdate();
			Model_Phong Phong = new Model_Phong(bs.getMaPhong(),bs.getMaLoaiPhong(),bs.getMaTang()
					,bs.getGiuongDon(),bs.getGiuongDoi(),bs.getTinhTrang(),bs.getGhiChu());
			phong.add(Phong);
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return kq;
	}

	@Override
	public int update(Model_Phong bs) {
		int kq = 0;
		try {
			Connection conn = db.getConnection();
			
			String sql = "Update Phong "+" SET "
					+ "MaPhong "+" = " +"'"+ bs.getMaPhong()+"'"
					+"MaLoaiPhong "+" = " +"'"+ bs.getMaLoaiPhong()+"'"
					+"MaTang "+" = " +"'"+ bs.getMaTang()+"'"
					+"GiuongDon "+" = " +"'"+ bs.getGiuongDon()+"'"
					+"GiuongDoi "+" = " +"'"+ bs.getGiuongDoi()+"'"
					+"Tinhtrang "+" = " +"'"+ bs.getTinhTrang()+"'"
					+"GhiChu "+" = " +"'"+ bs.getGhiChu();
			Statement stm = conn.createStatement();
			
			kq = stm.executeUpdate(sql);
			conn.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return kq;
	}

	@Override
	public int delete(Model_Phong bs) {
		int kq = 0;
		try {
			Connection conn = db.getConnection();
			
			String sql = "DELETE FROM Phong WHERE MaPhong = '"+ bs.getMaPhong()+"'";
			Statement stm = conn.createStatement();
			kq = stm.executeUpdate(sql);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return kq;
	}

	@Override
	public Vector<Model_Phong> selectALL() {
		Vector<Model_Phong> phong = new Vector<Model_Phong>();
		Connection conn;
		try {
			conn = db.getConnection();
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * PROM Phong");
			
				while(rs.next()) {
					String maPhong=rs.getString(1);
					String maloaiPhong = rs.getString(2);
					String maTang = rs.getString(3);
					int giuongDon = rs.getInt(4);
					int giuongDoi = rs.getInt(5);
					String tinhTrang = rs.getString(6);
					String ghiChu = rs.getString(7);
					
					Model_Phong Phong = new Model_Phong(maPhong,maloaiPhong,maTang,giuongDon,giuongDoi,tinhTrang,ghiChu);
					phong.add(Phong);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return null;
	}

}
