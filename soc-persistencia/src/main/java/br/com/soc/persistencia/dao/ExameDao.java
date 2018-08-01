package br.com.soc.persistencia.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import br.com.soc.persistencia.entidade.Exame;

public class ExameDao extends Conexao {

	public void insert(Exame exm) throws Exception {

		String sql = "INSERT INTO EXAME VALUES(?,?,?,?)";

		try{	
			open();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, exm.getIdConsulta());
			stmt.setString(2, exm.getTipoExame());
			stmt.setDate(3, (Date) exm.getDataExame());
			stmt.setString(4, exm.getResultado());
			stmt.execute();
			stmt.close();
		} finally{
			close();	
		}
	}

	public void delete(Exame exm) throws Exception {

		String sql = "DELETE FROM EXAME where ID_CONSULTA = ?";

		try{
			open();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, exm.getIdConsulta());
			stmt.execute();
			stmt.close();
		} finally {
			close();
		}
	}

	public void update(Exame exm) throws Exception {

		String sql = "UPDATE EXAME SET DS_TIPO_EXAME = ?, DT_EXAME = ?, DS_RESULTADO = ? WHERE ID_CONSULTA = ?";

		try{
			open();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, exm.getTipoExame());
			stmt.setDate(2, (Date) exm.getDataExame());
			stmt.setString(3, exm.getResultado());
			stmt.execute();
			stmt.close();
		} finally {
			close();
		}
	}

	public Exame findExameById(int cod) throws Exception {

		String sql = "SELECT * FROM EXAME WHERE ID_CONSULTA = ?";
		Exame exm = null;

		try{
			open();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, cod);
			rs = stmt.executeQuery();	
			if (rs.next()) {
				exm = new Exame();
				exm.setIdConsulta(rs.getInt("ID_CONSULTA"));
				exm.setTipoExame(rs.getString("DS_TIPO_EXAME"));
				exm.setDataExame(rs.getDate("DT_EXAME"));
				exm.setResultado(rs.getString("DS_RESULTADO"));
			}
		} finally{
			close();
		}

		return exm;
	}

	public List<Exame> findAll() throws Exception {

		String sql = "SELECT * FROM EXAME";
		Exame exm = null;

		try {
			open();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			List<Exame> lista = new ArrayList<Exame>();

			while (rs.next()) {
				exm = new Exame();
				exm.setIdConsulta(rs.getInt("ID_CONSULTA"));
				exm.setTipoExame(rs.getString("DS_TIPO_EXAME"));
				exm.setDataExame(rs.getDate("DT_EXAME"));
				exm.setResultado(rs.getString("DS_RESULTADO"));
				lista.add(exm);
			}
			return lista;
		} finally {
			close();
		}
	}
}