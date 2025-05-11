package chapter20.memo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

// DAO: Data Access Object, 데이터베이스에 접근해서 데이터 처리 담당
public class MemoDAO {
	// 전체 목록 조회, 상세 메모 조회, 메모 등록, 수정, 삭제
	// 실제 개발에서는 try catch문 사용
	public List<MemoVO> selectMemos(String searchWord) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// DriverManager에 DB 드라이브를 등록하는 메소드를 사용할 수도 있음
//		DriverManager.registerDriver(new OracleDriver());
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "LSJ00";
		String password = "java";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ");
		builder.append("    a.no, ");
		builder.append("    a.title, ");
		builder.append("    a.content, ");
		builder.append("    b.mem_name writer, ");
		builder.append("    a.register_date, ");
		builder.append("    a.modify_date ");
		builder.append("FROM ");
		builder.append("    memo a ");
		builder.append("    INNER JOIN member b ON a.writer = b.mem_id ");
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);
		List<MemoVO> list = new ArrayList<>();
		while (resultSet.next()) {
			int no = resultSet.getInt("no");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			String writer = resultSet.getString("writer");
			Timestamp registerDate = resultSet.getTimestamp("register_date");
			Timestamp modifyDate = resultSet.getTimestamp("modify_date");
			list.add(new MemoVO(no, title, content, writer, registerDate,modifyDate));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
	public MemoVO selectMemo(int searchNo) {
		return null;
	}
	public int insertMemo(MemoVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "LSJ00";
		String password = "java";
		vo.getTitle();
		Connection connection = DriverManager.getConnection(url, user, password);
		
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO memo ( ");
		builder.append("    no, ");
		builder.append("    title, ");
		builder.append("    content, ");
		builder.append("    writer ");
		builder.append(") VALUES ( ");
		builder.append("    seq_memo.NEXTVAL, ");
		builder.append("    ?, ");
		builder.append("    ?, ");
		builder.append("    ? ");
		builder.append(") ");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle()); // setString이면 자동으로 작은 따옴표('')가 붙는다.
		statement.setString(2, vo.getContent()); // setInt면 작은 따옴표가 붙지 않는다.
		statement.setString(3, vo.getWriter());
		int count = statement.executeUpdate(); // 실행한 로그 수
		statement.close();
		connection.close();
		return count;
	}
	public int updateMemo(MemoVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "LSJ00";
		String password = "java";
		Connection connection = DriverManager.getConnection(url, user, password);
		StringBuilder builder = new StringBuilder();
		builder.append("UPDATE memo ");
		builder.append("    SET ");
		builder.append("        title = ?, ");
		builder.append("        content = ?, ");
		builder.append("        writer = ?, ");
		builder.append("        modify_date = SYSDATE ");
		builder.append("WHERE ");
		builder.append("    no = ? ");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle()); 
		statement.setString(2, vo.getContent());
		statement.setString(3, vo.getWriter());
		statement.setInt(4, vo.getNo());
		int count = statement.executeUpdate(); // 실행한 로그 수
		statement.close();
		connection.close();
		return count;
	}
	public int deleteMemo(int deleteNo) {
		return 0;
	}
}
