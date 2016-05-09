package model_Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//��ƶ����ݿ��¼����ķ��������в�ѯSQL�����Ϊ�������β�
	public int updateSQL(String sql) {
		int n = -1;
		try {
			con = DbConnection.getDBconnection();
			pstmt = con.prepareStatement(sql);
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			DbConnection.closeDB(con, pstmt, rs);
			e.printStackTrace();
		}
		return n;
	}
	
	public ResultSet QuerySQL(String sql) {
		try {
			con = DbConnection.getDBconnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			return rs;
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
