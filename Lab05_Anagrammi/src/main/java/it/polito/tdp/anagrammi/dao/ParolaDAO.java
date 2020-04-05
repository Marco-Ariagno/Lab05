package it.polito.tdp.anagrammi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.model.Parola;

public class ParolaDAO {
	
	public Parola anagrammiOK(Parola anagramma){
		String sql = "SELECT * FROM parola WHERE nome = ?";

		int indice=0;
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, anagramma.toString());
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				indice++;
			}

			conn.close();

		} catch (SQLException e) {
			throw new RuntimeException();
		}

		if(indice==0) {
			anagramma.setCorretta(false);
		}else {
			anagramma.setCorretta(true);
		}
		
		return anagramma;

	}

}
