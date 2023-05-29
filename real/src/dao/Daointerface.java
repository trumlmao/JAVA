package dao;

import java.sql.SQLException;
import java.util.Vector;

public interface Daointerface<T> {
public int insert (T bs) throws ClassNotFoundException, SQLException ;
	
	public int update (T bs);
	
	public int delete (T bs);
	
	public Vector<T> selectALL();

}
