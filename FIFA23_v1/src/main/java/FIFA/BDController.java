package FIFA;

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
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/fifa23", "root", "");
		} catch (SQLException e) {
			System.out.println("Error en Constructor BDController: " + e);
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	public Equipo dameEquipo (int codEquipo) {
		Equipo nuevoEquipo = new Equipo();
		String sql = "SELECT * FROM `equipos` WHERE equipos.cod_equipo = " + codEquipo;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				nuevoEquipo = new Equipo(rs.getInt("cod_equipo"), rs.getString("nombre"), rs.getInt("cod_liga"));
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameEquipo: " + e);
		}
		
		return nuevoEquipo;
	}
	
	public boolean existeEquipo (int codEquipo) {
		boolean existe = false;
		String sql = "SELECT * FROM `equipos` WHERE equipos.cod_equipo = " + codEquipo;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en existeEquipo: " + e);
		}
		
		return existe;
	}
	
	public ArrayList<Equipo> todosEquipos() {
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		String sql = "SELECT * FROM `equipos`";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Equipo nuevoEquipo = new Equipo(rs.getInt("cod_equipo"), rs.getString("nombre"), rs.getInt("cod_liga"));
				equipos.add(nuevoEquipo);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en todosEquipos: " + e);
		}
		
		return equipos;
	}
	
	public ArrayList<Equipo> devolverEquiposXCod_liga(int codLiga) {
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		String sql = "SELECT * FROM `equipos` WHERE equipos.cod_liga = " + codLiga;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Equipo nuevoEquipo = new Equipo(rs.getInt("cod_equipo"), rs.getString("nombre"), rs.getInt("cod_liga"));
				equipos.add(nuevoEquipo);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverEquiposXCod_liga: " + e);
		}
		
		return equipos;
	}
	
	public Jugador dameJugador (int codJugador) {
		Jugador nuevoJuga = new Jugador();
		String sql = "SELECT * FROM `jugadores` WHERE jugadores.cod_jugador = " + codJugador;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameJugador: " + e);
		}
		
		return nuevoJuga;
	}
	
	public boolean existeJugador (int codJugador) {
		boolean existe = false;
		String sql = "SELECT * FROM `jugadores` WHERE jugadores.cod_jugador = " + codJugador;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en existeJugador: " + e);
		}
		
		return existe;
	}
	
	public ArrayList<Jugador> todosJugadores() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT * FROM `jugadores`";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en todosJugadores: " + e);
		}
		
		return jugadores;
	}
	
	public Liga dameLiga (int codLiga) {
		Liga nuevaLiga = new Liga();
		String sql = "SELECT * FROM `ligas` WHERE ligas.cod_liga = " + codLiga;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				nuevaLiga = new Liga(rs.getInt("cod_liga"), rs.getString("nombre"), rs.getString("pais"));
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameLiga: " + e);
		}
		
		return nuevaLiga;
	}
	
	public boolean existeLiga (int codLiga) {
		boolean existe = false;
		String sql = "SELECT * FROM `ligas` WHERE ligas.cod_liga = " + codLiga;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en existeLiga: " + e);
		}
		
		return existe;
	}
	
	public ArrayList<Liga> todasLigas() {
		ArrayList<Liga> ligas = new ArrayList<Liga>();
		String sql = "SELECT * FROM `ligas`";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Liga nuevaLiga = new Liga(rs.getInt("cod_liga"), rs.getString("nombre"), rs.getString("pais"));
				ligas.add(nuevaLiga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en todasLigas: " + e);
		}
		
		return ligas;
	}
	
	public Carta dameCarta (String nombre, int codJugador) {
		Carta nuevacarta = new Carta();
		String sql = "SELECT * FROM `cartas` WHERE cartas.nombre = '" + nombre + "'"
				+ "AND cartas.cod_jugador = " + codJugador;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				nuevacarta = new Carta(rs.getString("nombre"), rs.getInt("cod_jugador"), rs.getInt("rat"), rs.getString("pos"), 
						rs.getInt("precio"), rs.getInt("pac"), rs.getInt("sho"), rs.getInt("pas"), 
						rs.getInt("dri"), rs.getInt("def"), rs.getInt("phy"), rs.getInt("pierna_mala"), 
						rs.getInt("filigranas"));
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameCarta: " + e);
		}
		
		return nuevacarta;
	}
	
	public boolean existeCarta (String nombre, int codJugador) {
		boolean existe = false;
		String sql = "SELECT * FROM `cartas` WHERE cartas.nombre = '" + nombre + "'"
				+ "AND cartas.cod_jugador = " + codJugador;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en existeCarta: " + e);
		}
		
		return existe;
	}
	
	public ArrayList<Carta> todasCartas() {
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		String sql = "SELECT * FROM `cartas`";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Carta nuevaCarta = new Carta(rs.getString("nombre"), rs.getInt("cod_jugador"), rs.getInt("rat"), rs.getString("pos"), 
						rs.getInt("precio"), rs.getInt("pac"), rs.getInt("sho"), rs.getInt("pas"), 
						rs.getInt("dri"), rs.getInt("def"), rs.getInt("phy"), rs.getInt("pierna_mala"), 
						rs.getInt("filigranas"));
				
				cartas.add(nuevaCarta);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en todasCartas: " + e);
		}
		
		return cartas;
	}
	
	public ArrayList<Carta> devolverCartasXNombreYCodJuga(String nombre, int codJuga) {
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		String sql = "SELECT * FROM `cartas` WHERE cartas.cod_jugador = " + codJuga + " ORDER BY cartas.rat;\r\n";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Carta nuevaCarta = new Carta(rs.getString("nombre"), rs.getInt("cod_jugador"), rs.getInt("rat"), rs.getString("pos"), 
						rs.getInt("precio"), rs.getInt("pac"), rs.getInt("sho"), rs.getInt("pas"), 
						rs.getInt("dri"), rs.getInt("def"), rs.getInt("phy"), rs.getInt("pierna_mala"), 
						rs.getInt("filigranas"));
				
				cartas.add(nuevaCarta);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverCartasXNombreYCodJuga: " + e);
		}
		
		return cartas;
	}
	
	public int dameCodLigaXCodEquipo (int codEquipo) {
		int codLiga = 0;
		String sql = "SELECT * FROM `equipos` WHERE equipos.cod_equipo = " + codEquipo;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				codLiga = rs.getInt("cod_liga");
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameCodLigaXCodEquipo: " + e);
		}
		
		return codLiga;
	}
	
	public ArrayList<Equipo> devolverEquiposXCodLiga (int codLiga) {
		ArrayList<Equipo> equipos = new ArrayList<>();
		String sql = "SELECT * FROM `equipos` WHERE equipos.cod_liga = " + codLiga;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Equipo nuevoEquipo = new Equipo(rs.getInt("cod_equipo"), rs.getString("nombre"), rs.getInt("cod_liga"));
				equipos.add(nuevoEquipo);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverEquiposXCodLiga: " + e);
		}
		
		return equipos;
	}
	
	public ArrayList<Jugador> devolverJugadoresXCodEquipo (int codEquipo) {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT * FROM `jugadores` where jugadores.cod_equipo = " + codEquipo;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverJugadoresXCodEquipo: " + e);
		}
		
		return jugadores;
	}
	
	public String devolverNombrePaisXCodLiga (int codLiga) {
		String pais = "";
		String sql = "SELECT ligas.pais FROM ligas WHERE ligas.cod_liga = " + codLiga;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				pais = rs.getString("pais");
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverNombrePaisXCodLiga: " + e);
		}
		
		return pais;
	}
	
	public String devolverNombreEquipoXCod (int codEquipo) {
		String nombreEquipo = "";
		String sql = "SELECT equipos.nombre FROM equipos where equipos.cod_equipo = " + codEquipo;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				nombreEquipo = rs.getString("nombre");
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverNombreEquipoXCod: " + e);
		}
		
		return nombreEquipo;
	}
	
	public Liga devolverLigaXCodJuga (int codJuga) {
		Liga liga = new Liga();
		String sql = "SELECT ligas.cod_liga, ligas.nombre, ligas.pais FROM ligas INNER JOIN (equipos INNER JOIN jugadores ON equipos.cod_equipo = "
				+ "jugadores.cod_equipo) ON ligas.cod_liga = equipos.cod_liga WHERE jugadores.cod_jugador = " + codJuga;
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				liga = new Liga(rs.getInt("cod_liga"), rs.getString("nombre"), rs.getString("pais"));
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverLigaXCodJuga: " + e);
		}
		
		return liga;
	}
	
	public void bajaJugador (int codJuga) {
		String sql = "DELETE FROM `jugadores` WHERE `jugadores`.`cod_jugador` = " + codJuga;
		
		try {
			Statement miStatement = conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			
			miStatement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en bajaJugador: " + e);
		}
	} 
	
	public void bajaEquipo (int codEquipo) {
		String sql = "DELETE FROM `equipos` WHERE `equipos`.`cod_equipo` = " + codEquipo;
		
		try {
			Statement miStatement = conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			
			miStatement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en bajaEquipo: " + e);
		}
	} 
	
	public void bajaLiga (int codLiga) {
		String sql = "DELETE FROM `ligas` WHERE `ligas`.`cod_liga` = " + codLiga;
		
		try {
			Statement miStatement = conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			
			miStatement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en bajaLiga: " + e);
		}
	} 
	
	public int devolverCodJugaLibre() {
		int codJugaLibre = 0;
		String sql = "SELECT MAX(jugadores.cod_jugador) AS 'codJuga' FROM jugadores;";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				codJugaLibre = rs.getInt("codJuga") + 1;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverCodJugaLibre: " + e);
		}
		
		return codJugaLibre;
	}
	
	public int devolverCodLigaLibre() {
		int codLigaLibre = 0;
		String sql = "SELECT MAX(ligas.cod_liga) AS 'codLiga' FROM ligas;";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				codLigaLibre = rs.getInt("codLiga") + 1;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverCodLigaLibre: " + e);
		}
		
		return codLigaLibre;
	}
	
	public int devolverCodEquipoLibre() {
		int codEquipoLibre = 0;
		String sql = "SELECT MAX(equipos.cod_equipo) AS 'codEquipo' FROM equipos;";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				codEquipoLibre = rs.getInt("codEquipo") + 1;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverCodEquipoLibre: " + e);
		}
		
		return codEquipoLibre;
	}
	
	public void altaJugador (String nombreJuga, String piernaJuga, int codEquipo, String paisJuga, int alturaJuga) {
		int codJugaLibre = devolverCodJugaLibre();
		
		String sql = "INSERT INTO `jugadores` (`cod_jugador`, `nombre`, `cod_equipo`, `pierna`, `altura`, `pais`) "
				+ "VALUES ("+ codJugaLibre +", '"+ nombreJuga +"', "+ codEquipo +", '"+ piernaJuga +"', "+ alturaJuga +", '"+ paisJuga +"');";
		
		try {
			Statement miStatement = conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en altaJugador: " + e);
		}
	}
	
	public void altaLiga (String nombre, String pais) {
		int codLiga = devolverCodLigaLibre();
		
		String sql = "INSERT INTO `ligas` (`cod_liga`, `nombre`, `pais`) VALUES ("+ codLiga +", '"+ nombre +"', '"+ pais +"');";
		
		try {
			Statement miStatement = conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en altaLiga: " + e);
		}
	}
	
	public void altaEquipo (String nombre, int codLiga) {
		int codEquipo = devolverCodEquipoLibre();
		
		String sql = "INSERT INTO `equipos` (`cod_equipo`, `nombre`, `cod_liga`) VALUES ("+ codEquipo +", '"+ nombre +"', "+ codLiga +");";
		
		try {
			Statement miStatement = conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en altaEquipo: " + e);
		}
	}
	
	public void modificarJuga(int codJuga, String nombre, String pierna, int codEquipo, String pais, int altura) {
		String sql = "UPDATE `jugadores` SET `nombre`='"+ nombre +"',`cod_equipo`= "+ codEquipo +",`pierna`='"+ pierna +"',"
				+ "`altura`= "+ altura +",`pais`='"+ pais +"' WHERE jugadores.cod_jugador = "+ codJuga;
		
		try {
			Statement miStatement = conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en modificarJuga: " + e);
		}
	}
	
	public void modificarEquipo(int codEquipo, String nombre, int codLiga) {
		String sql = "UPDATE `equipos` SET `nombre`='"+ nombre +"',`cod_liga`="+ codLiga +" WHERE equipos.cod_equipo = " + codEquipo;
		
		try {
			Statement miStatement = conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en modificarEquipo: " + e);
		}
	}
	
	public void modificarLiga(int codLiga, String nombre, String pais) {
		String sql = "UPDATE `ligas` SET `nombre`='"+ nombre +"',`pais`='"+ pais +"' WHERE ligas.cod_liga = " + codLiga;
		
		try {
			Statement miStatement = conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
			
		} catch (SQLException e) {
			System.out.println("Error en modificarLiga: " + e);
		}
	}
	
	public ArrayList<Jugador> damePorteros() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT jugadores.cod_jugador, jugadores.nombre, jugadores.cod_equipo, jugadores.pierna, jugadores.altura, jugadores.pais\r\n"
				+ "FROM jugadores INNER JOIN cartas ON jugadores.cod_jugador = cartas.cod_jugador WHERE cartas.nombre = 'simple'\r\n"
				+ "AND cartas.pos = 'gk';";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en damePorteros: " + e);
		}
		
		return jugadores;
	}
	
	public ArrayList<Jugador> dameDefensasCentrales() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT jugadores.cod_jugador, jugadores.nombre, jugadores.cod_equipo, jugadores.pierna, jugadores.altura, jugadores.pais\r\n"
				+ "FROM jugadores INNER JOIN cartas ON jugadores.cod_jugador = cartas.cod_jugador WHERE cartas.nombre = 'simple'\r\n"
				+ "AND (cartas.pos = 'df' OR cartas.pos = 'cb');";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameDefensasCentrales: " + e);
		}
		
		return jugadores;
	}
	
	public ArrayList<Jugador> dameLateralesDerechos() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT jugadores.cod_jugador, jugadores.nombre, jugadores.cod_equipo, jugadores.pierna, jugadores.altura, jugadores.pais\r\n"
				+ "FROM jugadores INNER JOIN cartas ON jugadores.cod_jugador = cartas.cod_jugador WHERE cartas.nombre = 'simple'\r\n"
				+ "AND cartas.pos = 'rb';";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameLateralesDerechos: " + e);
		}
		
		return jugadores;
	}
	
	public ArrayList<Jugador> dameLateralesIzquierdos() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT jugadores.cod_jugador, jugadores.nombre, jugadores.cod_equipo, jugadores.pierna, jugadores.altura, jugadores.pais\r\n"
				+ "FROM jugadores INNER JOIN cartas ON jugadores.cod_jugador = cartas.cod_jugador WHERE cartas.nombre = 'simple'\r\n"
				+ "AND cartas.pos = 'lb';";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameLateralesIzquierdos: " + e);
		}
		
		return jugadores;
	}
	
	public ArrayList<Jugador> dameDelanteros() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT jugadores.cod_jugador, jugadores.nombre, jugadores.cod_equipo, jugadores.pierna, jugadores.altura, jugadores.pais\r\n"
				+ "FROM jugadores INNER JOIN cartas ON jugadores.cod_jugador = cartas.cod_jugador WHERE cartas.nombre = 'simple'\r\n"
				+ "AND (cartas.pos = 'st' OR cartas.pos = 'cf');";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameDelanteros: " + e);
		}
		
		return jugadores;
	}
	
	public ArrayList<Jugador> dameCentrocampistas() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT jugadores.cod_jugador, jugadores.nombre, jugadores.cod_equipo, jugadores.pierna, jugadores.altura, jugadores.pais\r\n"
				+ "FROM jugadores INNER JOIN cartas ON jugadores.cod_jugador = cartas.cod_jugador WHERE cartas.nombre = 'simple'\r\n"
				+ "AND (cartas.pos = 'cm' OR cartas.pos = 'cam' OR cartas.pos = 'cdm');";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameCentrocampistas: " + e);
		}
		
		return jugadores;
	}
	
	public ArrayList<Jugador> dameExtremosIzqdos() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT jugadores.cod_jugador, jugadores.nombre, jugadores.cod_equipo, jugadores.pierna, jugadores.altura, jugadores.pais\r\n"
				+ "FROM jugadores INNER JOIN cartas ON jugadores.cod_jugador = cartas.cod_jugador WHERE cartas.nombre = 'simple'\r\n"
				+ "AND (cartas.pos = 'lm' OR cartas.pos = 'lw');";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameExtremosIzqdos: " + e);
		}
		
		return jugadores;
	}
	
	public ArrayList<Jugador> dameExtremosDrchos() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT jugadores.cod_jugador, jugadores.nombre, jugadores.cod_equipo, jugadores.pierna, jugadores.altura, jugadores.pais\r\n"
				+ "FROM jugadores INNER JOIN cartas ON jugadores.cod_jugador = cartas.cod_jugador WHERE cartas.nombre = 'simple'\r\n"
				+ "AND (cartas.pos = 'rm' OR cartas.pos = 'rw');";
		
		try {
			Statement miStatement = conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				Jugador nuevoJuga = new Jugador(rs.getInt("cod_jugador"), rs.getString("nombre"), rs.getInt("cod_equipo"), 
						rs.getString("pierna"), rs.getInt("altura"), rs.getString("pais"));
				
				jugadores.add(nuevoJuga);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en dameExtremosDrchos: " + e);
		}
		
		return jugadores;
	}
	
}
