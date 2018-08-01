package br.com.soc.persistencia.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import br.com.soc.persistencia.entidade.Consulta;

public class ConsultaDao extends Conexao{
	
	public void insert(Consulta cns) throws Exception {

		String sql = "INSERT INTO CONSULTA(?,?,?,?,?)";

		try{	
			open();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, cns.getIdConsulta());
			stmt.setInt(2, cns.getIdPaciente());
			stmt.setInt(3, cns.getIdMedico());
			stmt.setDate(4,(Date) cns.getDataConsulta());
			stmt.setString(5, cns.getDiagnostico());
			stmt.execute();
			stmt.close();
		} finally{
			close();	
		}
	}

	public void delete(Consulta cns) throws Exception {

		String sql = "DELETE FROM CONSULTA WHERE ID_CONSULTA = ?";

		try{
			open();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, cns.getIdConsulta());
			stmt.execute();
			stmt.close();
		} finally {
			close();
		}
	}

	public void update(Consulta cns) throws Exception {

		String sql = "UPDATE CONSULTA SET ID_MEDICO = ?, DT_CONSULTA = ?, DS_DIAGNOSTICO = ? WHERE ID_CONSULTA = ?";

		try{
			open();
			stmt = con.prepareStatement(sql);
			cns.setIdMedico(rs.getInt("ID_MEDICO"));
			cns.setDataConsulta(rs.getDate("DT_CONSULTA"));
			cns.setDiagnostico(rs.getString("DS_DIAGNOSTICO"));
			stmt.execute();
			stmt.close();
		} finally {
			close();
		}
	}

	public Consulta findConsultaById(int cod) throws Exception {

		String sql = "SELECT * FROM CONSULTA ID_CONSULTA = ?";
		Consulta cns = null;

		try{
			open();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();	
			if (rs.next()) {
				cns = new Consulta();
				cns.setIdConsulta(rs.getInt("ID_CONSULTA"));
				cns.setIdPaciente(rs.getInt("ID_PACIENTE"));
				cns.setIdMedico(rs.getInt("ID_MEDICO"));
				cns.setDataConsulta(rs.getDate("DT_CONSULTA"));
				cns.setDiagnostico(rs.getString("DS_DIAGNOSTICO"));
			}
		} finally{
			close();
		}

		return cns;
	}

	public List<Consulta> findAll() throws Exception {

		String sql = "SELECT * FROM CONSULTA";
		Consulta cns = null;

		try {
			open();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			List<Consulta> lista = new ArrayList<Consulta>();

			while (rs.next()) {
				cns = new Consulta();
				cns.setIdConsulta(rs.getInt("ID_CONSULTA"));
				cns.setIdPaciente(rs.getInt("ID_PACIENTE"));
				cns.setIdMedico(rs.getInt("ID_MEDICO"));
				cns.setDataConsulta(rs.getDate("DT_CONSULTA"));
				cns.setDiagnostico(rs.getString("DS_DIAGNOSTICO"));
				lista.add(cns);
			}
			return lista;
		} finally {
			close();
		}
	}
}