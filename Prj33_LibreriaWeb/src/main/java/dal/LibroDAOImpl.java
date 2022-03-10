package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Libro;

public class LibroDAOImpl implements LibroDAO {

	private Connessione miaConn;
	private Connection conn;

	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;

	public LibroDAOImpl() {
		this.miaConn = new Connessione();
		this.conn = this.miaConn.getConn();
	}

	@Override
	public List<Libro> getAll() {

		List<Libro> libri = new ArrayList<>();

		try {
			this.st = this.conn.createStatement();
			this.rs = this.st.executeQuery(ALL);

			while (rs.next()) {
				String titolo = rs.getString("titolo");
				int id = rs.getInt("id");
				int pagine = rs.getInt("pagine");
				int editoreId = rs.getInt("editore_id");
				double prezzo = rs.getDouble("prezzo"); // posso passare nome o numero colonna

				Libro l = new Libro(id, editoreId, titolo, prezzo, pagine);
				libri.add(l);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libri;
	}

	@Override
	public Libro getLibroById(int id) {
		return null;
	}

	@Override
	public void addLibro(Libro l) {

		try {
			this.ps = this.conn.prepareStatement(INSERT);
			this.ps.setString(1, l.getTitolo());
			this.ps.setDouble(2, l.getPrezzo());
			this.ps.setInt(3, l.getPagine());
			this.ps.setInt(4, l.getEditoreId());
			this.ps.execute();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
