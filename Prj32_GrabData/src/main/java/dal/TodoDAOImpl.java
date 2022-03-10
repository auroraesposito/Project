package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.Todo;

public class TodoDAOImpl implements TodoDAO {

	private Connessione miaConn;
	private Connection conn;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;

	public TodoDAOImpl() {
		miaConn = new Connessione();
		conn = miaConn.getConn();
	}

	@Override
	public List<Todo> getAll() {
		List<Todo> todos = new ArrayList<Todo>();

		// 1.ho bisogno di mettere la query nella busta statement
		try {
			this.st = this.conn.createStatement();
			// 2. metto la query nella busta e salvo i risultati in un contenitore resultset
			this.rs = this.st.executeQuery(FIND_ALL);
			// 3. scorro il resultset e creo un todo per ogni record e metto il todo in un
			// contenitore da ritornare
			while (rs.next()) {
				Todo t = new Todo();
				t.setId(rs.getInt("id"));
				t.setUserId(rs.getInt("user_id"));
				t.setTitle(rs.getString("title"));
				t.setStatus(rs.getString("status"));

				LocalDateTime localDateTime = rs.getTimestamp("due_on").toLocalDateTime();
				t.setDueOn(localDateTime);
				
				todos.add(t);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return todos;
	}

	@Override
	public void addTodo(Todo t) {
		try {
			this.ps = this.conn.prepareStatement(INSERT);
			this.ps.setInt(1, t.getUserId());
			this.ps.setString(2, t.getTitle());
			
			//java.sql.Date sqlDate = java.sql.Date.valueOf(t.getDueOn().toLocalDate());
			
			java.sql.Date sqlDate = new java.sql.Date(utilData.getTime());
			
			System.out.println(sqlDate);
			this.ps.setDate(3, sqlDate);
			
			this.ps.setString(4, t.getStatus());
			
			if(this.ps.execute()) {
				System.out.println("record inserito");
			} else {
				System.out.println("record non inserito");
			};
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
