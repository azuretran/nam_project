package Pcontrols;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import PUtils.ConnectionManager;

import Pmodels.*;
public class QLnhansuControl {
	Connection conn = ConnectionManager.getConnection();
	public List<QLnhansu> findAll() {
		List<QLnhansu> lst = new ArrayList<>();
		QLnhansu lsach;
		try {
			Statement stm = conn.createStatement();
			String sql = "SELECT * FROM NHANVIEN";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				lsach = new QLnhansu(rs.getString("MANV"), rs.getString("HOTENNV"),rs.getDate("NGAYSINH"),
						rs.getString("VITRIHIENTAI"),rs.getString("MAPB"),
						rs.getString("THANNHAN"),rs.getString("MAKN"),
						rs.getString("MADUAN")
						);
				lst.add(lsach);
			}
			return lst;
		} catch (SQLException e) {
			return null;
		}

	}
}
