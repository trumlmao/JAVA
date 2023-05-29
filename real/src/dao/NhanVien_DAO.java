package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import db.db;
import model.Model_NhanVien;

public class NhanVien_DAO implements Daointerface<Model_NhanVien>{

	@Override
	public int insert(Model_NhanVien bs)  {
		ArrayList<Model_NhanVien> NhanVien = new ArrayList<Model_NhanVien>();
		int kq = 0;
		try {
			Connection conn = db.getConnection();
			String sql = "INSERT INTO NhanVien(MaNhanVien,TenNhanVien,GioiTinh,SoDienThoai,DiaChi,NamSinh,GhiChu) VALUES(?,?,?,?,?,?,?)";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, bs.getMaNhanVien());
			stm.setString(2, bs.getTenNhanVien());
			stm.setString(3, bs.getGioiTinh());
			stm.setString(4, bs.getNamSinh());
			stm.setString(5,bs.getSoDienThoai());
			stm.setString(6, bs.getDiaChi());
			stm.setString(7, bs.getGhiChu());
			kq = stm.executeUpdate();
			Model_NhanVien nhanVien = new Model_NhanVien(bs.getMaNhanVien(),bs.getTenNhanVien(),bs.getGioiTinh(),
					bs.getNamSinh(),bs.getSoDienThoai(),bs.getDiaChi(),bs.getGhiChu());
			NhanVien.add(nhanVien);
			conn.close();
		}catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Model_NhanVien bs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Model_NhanVien bs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector<Model_NhanVien> selectALL() {
		// TODO Auto-generated method stub
		return null;
	}

}
