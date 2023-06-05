import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {
	private Connection conexion;

	public BDController() {
		super();
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/nba", "root", "");
		} catch (SQLException e) {
			System.out.println("Error en constructor BDController: " + e);
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	public ArrayList<Equipo> devolverEquipos() {
		ArrayList<Equipo> datosEquipos = new ArrayList<Equipo>();
		String sql = "SELECT * FROM equipos";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next() == true) {
				Equipo nuevoEquipo = new Equipo(rs.getString("nombre"), rs.getString("ciudad"), rs.getString("conferencia"), rs.getString("division"));
				datosEquipos.add(nuevoEquipo);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en devolverEquipos: " + e);
		}
		
		return datosEquipos;
	}
	
	public ArrayList<Jugador> devolverJugadores() {
		ArrayList<Jugador> datosJugas = new ArrayList<Jugador>();
		String sql = "SELECT * FROM jugadores";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next() == true) {
				Jugador nuevoJuga = new Jugador(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("procedencia"), 
						rs.getString("altura"), rs.getInt("peso"), rs.getString("posicion"), rs.getString("nombre_equipo"));
				
				datosJugas.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en devolverJugadores: " + e);
		}
		
		return datosJugas;
	}
	
	public boolean existeJugador (int codigo) {
		boolean existe = false;
		String sql = "SELECT * FROM jugadores WHERE jugadores.codigo = " + codigo;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next() == true) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en existeJugador: " + e);
		}
		
		return existe;
	}
	
	public boolean existeEquipo (String nombre) {
		boolean existe = false;
		String sql = "SELECT * FROM equipos WHERE equipos.nombre = '" + nombre + "'";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next() == true) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en existeEquipo: " + e);
		}
		
		return existe;
	}
	
	public void altaJugador (Jugador nuevoJuga) {
		String sql = "INSERT INTO jugadores (codigo, nombre, procedencia, altura, peso, posicion, nombre_equipo) "
				+ "VALUES "
				+ "(" + nuevoJuga.getCodigo() + ", '" + nuevoJuga.getNombre() + "', '" + nuevoJuga.getProcedencia() + "', '" + nuevoJuga.getAltura()
				+ "', " + nuevoJuga.getPeso() + ", '" + nuevoJuga.getPosicion() + "', '" + nuevoJuga.getNombre_equipo() + "')";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en altaJugador: " + e);
		}
	}
	
	public void bajaJugador (int codigo) {
		String sql = "DELETE FROM jugadores WHERE jugadores.codigo = " + codigo;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en bajaJugador: " + e);
		}
	}
	

}