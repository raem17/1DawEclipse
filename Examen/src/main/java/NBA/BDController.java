package NBA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {
	
	private Connection conexion;

	 public BDController() {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/NBA", "root" , "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el constructor de BDController" + e.getMessage());
		}
	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}	
	
	//
	
	public ArrayList<Jugador> dameJugasArgentos() {
		ArrayList<Jugador> argentos = new ArrayList<Jugador>();
		
		String sql = "SELECT * FROM `jugadores` WHERE jugadores.Procedencia = 'Argentina';";
		try {
			Statement statement = conexion.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				Jugador juga = new Jugador(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("procedencia"), rs.getString("altura"), 
						rs.getInt("peso"), rs.getString("posicion"), rs.getString("nombre_equipo"));
				
				argentos.add(juga);
			}
			
			statement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameJugasArgentos: " + e);
		}
		
		return argentos;
	}
	
	public Equipo dameEquipoXJuga (int codJuga) {
		Equipo equipo = new Equipo();
		
		String sql = "SELECT equipos.Nombre, equipos.Ciudad, equipos.Conferencia, equipos.Division FROM equipos "
				+ "INNER JOIN jugadores ON jugadores.Nombre_equipo = equipos.Nombre AND jugadores.codigo = " + codJuga;
		try {
			Statement statement = conexion.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				equipo = new Equipo(rs.getString("nombre"), rs.getString("ciudad"), rs.getString("conferencia"), rs.getString("division"));
			}
			
			statement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameEquipoXJuga: " + e);
		}
		
		return equipo;
	}
	
	public ArrayList<Jugador> dameTodosJugas() {
		ArrayList<Jugador> jugas = new ArrayList<Jugador>();
		
		String sql = "SELECT * FROM `jugadores`;";
		try {
			Statement statement = conexion.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				Jugador juga = new Jugador(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("procedencia"), rs.getString("altura"), 
						rs.getInt("peso"), rs.getString("posicion"), rs.getString("nombre_equipo"));
				
				jugas.add(juga);
			}
			
			statement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameTodosJugas: " + e);
		}
		
		return jugas;
	}
	
	public boolean existeJuga (int codJuga) {
		boolean existe = false;
		
		String sql = "SELECT * FROM `jugadores` where jugadores.codigo = " + codJuga;
		try {
			Statement statement = conexion.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				existe = true;
				break;
			}
			
			statement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en existeJuga: " + e);
		}
		
		return existe;
	}
	
	public void bajaJuga (int codJuga) {
		String sql = "DELETE FROM `jugadores` WHERE `jugadores`.`codigo` = " + codJuga;
		try {
			Statement statement = conexion.createStatement();
			
			statement.executeUpdate(sql);
			
			statement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en bajaJuga: " + e);
		}
		
	}
	
	public boolean existeEquipo (String nombre) {
		boolean existe = false;
		
		String sql = "SELECT * FROM `equipos` where equipos.nombre = '" + nombre + "'";
		try {
			Statement statement = conexion.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				existe = true;
				break;
			}
			
			statement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en existeEquipo: " + e);
		}
		
		return existe;
	}
	
	public boolean altaEquipo (String nombre, String ciudad, String conferencia, String division) {
		boolean existe = false;
		
		String sql = "INSERT INTO equipos VALUES ('" + nombre + "', '" + ciudad + "', '" + conferencia + "', '" + division + "');";
		try {
			Statement statement = conexion.createStatement();
			
			statement.executeUpdate(sql);
			
			statement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en altaEquipo: " + e);
		}
		
		return existe;
	}
	
	public ArrayList<Equipo> dameTodosEquipos() {
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		
		String sql = "SELECT * FROM `equipos`;";
		try {
			Statement statement = conexion.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				Equipo equipo = new Equipo(rs.getString("nombre"), rs.getString("ciudad"), rs.getString("conferencia"), 
						rs.getString("division"));
				
				equipos.add(equipo);
			}
			
			statement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameTodosEquipos: " + e);
		}
		
		return equipos;
	}
	
	public Equipo dameEquipo(String nombre) {
		Equipo equipo = new Equipo();
		
		String sql = "SELECT * FROM `equipos` where equipos.nombre = '" + nombre + "'";
		try {
			Statement statement = conexion.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				equipo = new Equipo(rs.getString("nombre"), rs.getString("ciudad"), rs.getString("conferencia"), 
						rs.getString("division"));
			}
			
			statement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameEquipo: " + e);
		}
		
		return equipo;
	}
	
	public void modificarEquipo (String nombre, String ciudad, String conferencia, String division) {
		String sql = "UPDATE `equipos` SET `Ciudad`='"+ ciudad +"',"
				+ "`Conferencia`='"+ conferencia +"',`Division`='"+ division +"' WHERE equipos.nombre = '" + nombre + "'";
		try {
			Statement statement = conexion.createStatement();
			
			statement.executeUpdate(sql);
			
			statement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en modificarEquipo: " + e);
		}
		
	}
	
}













