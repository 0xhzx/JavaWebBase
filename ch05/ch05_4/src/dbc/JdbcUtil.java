package dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	private static Properties pr = new Properties();

	private JdbcUtil() {
	}

	// ��Ƹù�����ľ�̬��ʼ�����еĴ��룬�ô�����װ����ʱִ�У���ִֻ��һ��
	static {
		try {
			pr.load(JdbcUtil.class.getClassLoader().getResourceAsStream(
					"db.properties"));
			driver = pr.getProperty("driver");
			url = pr.getProperty("url");
			user = pr.getProperty("user");
			password = pr.getProperty("password");
			Class.forName(driver);
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	// ��ƻ�����Ӷ���ķ���getConnection()
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	// ����ͷŽ�������������ӵķ���free()
	public static void free(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {

				}
			}
		}
	}
}
