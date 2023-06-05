import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
			System.out.println("Error en bajaJugador: " + e);
		}
	}
	
	public boolean existeEstadistica (int codigoJuga, String temporada) {
		boolean existe = false;
		String sql = "SELECT * FROM estadisticas WHERE estadisticas.jugador = " + codigoJuga + " AND estadisticas.temporada = '" + temporada + "'";
		
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
			System.out.println("Error en existeEstadistica: " + e);
		}
		
		return existe;
	}
	
	public void altaEstadistica (Estadistica nuevaEstadi) {
		String sql = "INSERT INTO estadisticas VALUES "
				+ "('" + nuevaEstadi.getTemporada() + "', " + nuevaEstadi.getJugador() + ", " + nuevaEstadi.getPuntos_por_partido() + ", " +nuevaEstadi.getAsistencias_por_partido()
				+ ", " + nuevaEstadi.getTapones_por_partido() + ", " + nuevaEstadi.getRebotes_por_partido() + ")";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (SQLException e) {
			System.out.println("Error en altaEstadistica: " + e);
		}
	}
	
	public void bajaEstadistica (int codJuga, String tempo) {
		String sql = "DELETE FROM estadisticas WHERE estadisticas.jugador = " + codJuga + " AND estadisticas.temporada = '" + tempo + "'";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (SQLException e) {
			System.out.println("Error en bajaEstadistica: " + e);
		}
	}
	
	public void generarArchivoJugasMas30ppp () {
		String ruta = "Jugones.txt";
		File archivo = new File(ruta);
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		String sql = "SELECT jugadores.Nombre, jugadores.Nombre_equipo, equipos.Ciudad, estadisticas.temporada, estadisticas.Puntos_por_partido "
				+ "FROM estadisticas, jugadores, equipos "
				+ "WHERE estadisticas.jugador = jugadores.codigo "
				+ "AND jugadores.Nombre_equipo = equipos.Nombre "
				+ "AND estadisticas.Puntos_por_partido > 30";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			//System.out.println(sql);

			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
				while (rs.next()) {
					bw.write(rs.getString("Nombre") + " - " + rs.getString("Nombre_equipo") + " de " + rs.getString("Ciudad") + " - Temporada: " + rs.getString("Temporada") +
							" - " + rs.getString("puntos_por_partido") + " ppp.");
					
					if (!rs.isLast()) {
						bw.newLine();
					}
				}
				bw.close();
				System.out.println("Archivo generado.");
				
			} catch (IOException e) {
				System.out.println(e);
			}
			
			miStatement.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error en jugas30: " + e);
		}
	}
	
	public String devolverCiudadXEquipo (String nombreEquipo) {
		String ciudad = "";
		
		String sql = "SELECT equipos.Ciudad FROM equipos WHERE equipos.Nombre = '" + nombreEquipo + "'";
		try {
			Statement miStatemanet = conexion.createStatement();
			ResultSet rs = miStatemanet.executeQuery(sql);
			
			while (rs.next()) {
				ciudad = rs.getString("ciudad");
			}
			
			miStatemanet.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error en devolverCiudadXEquipo: " + e);
		}
		
		return ciudad;
	}
	
	public ArrayList<String> devolverListadoPartidos2Equipos (String nombreEquipo1, String nombreEquipo2) {
		ArrayList<String> listadoPartidos = new ArrayList<String>();
		String sql = "SELECT * FROM partidos WHERE (equipo_local = '" + nombreEquipo1 + "' AND equipo_visitante = '" + nombreEquipo2 + "')"
				+ " OR (equipo_local = '" + nombreEquipo2 + "' AND equipo_visitante = '" + nombreEquipo1 + "')";
				
		try {
			Statement miStatemanet = conexion.createStatement();
			ResultSet rs = miStatemanet.executeQuery(sql);
			
			while (rs.next()) {
				listadoPartidos.add("Temporada: " + rs.getString("temporada") + ". " + devolverCiudadXEquipo(rs.getString("equipo_local")) + 
						" " + rs.getString("equipo_local") + " " + rs.getInt("puntos_local") + ":" + rs.getInt("puntos_visitante") + " " + 
						devolverCiudadXEquipo(rs.getString("equipo_visitante")) + " " + rs.getString("equipo_visitante") + ".");
			}
			
			miStatemanet.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error en devolverListadoPartidos2Equipos: " + e);
		}
		
		return listadoPartidos;
	}
	
	public ArrayList<Equipo> devolverEquiposOrdXDivision() {
		ArrayList<Equipo> datosEquipos = new ArrayList<Equipo>();
		String sql = "SELECT * FROM equipos order by division";
		
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
			System.out.println("Error en devolverEquiposOrdXDivision: " + e);
		}
		
		return datosEquipos;
	}
	
	public ArrayList<String> devolverPartidosEquipoGanador (String nombreEquipo) {
		ArrayList<String> listadoPartidos = new ArrayList<String>();
		String sql = "SELECT * FROM partidos "
				+ "WHERE (partidos.equipo_local = '" + nombreEquipo + "' AND partidos.puntos_local > partidos.puntos_visitante) "
				+ "OR (partidos.equipo_visitante = '" + nombreEquipo + "' AND partidos.puntos_visitante > partidos.puntos_local)";
				
		try {
			Statement miStatemanet = conexion.createStatement();
			ResultSet rs = miStatemanet.executeQuery(sql);
			
			while (rs.next()) {
				listadoPartidos.add("Código: " + rs.getInt("codigo") + ". Equipo local: " +  rs.getString("equipo_local") + ". Equipo visitante: " + 
						rs.getString("equipo_visitante") + ". Puntos local: " + rs.getInt("puntos_local") + ". Puntos visitante: " + 
						rs.getInt("puntos_visitante") + ". Temporada: " + rs.getString("temporada"));
			}
			
			miStatemanet.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error en devolverPartidosEquipoGanador: " + e);
		}
		
		return listadoPartidos;
	}
	
	
	public ArrayList<Jugador> devolverJugadoresUsuario (String procedencia, String conferencia, String division, String ciudad) {
		ArrayList<Jugador> datosJugas = new ArrayList<Jugador>();
		String sql = "SELECT * FROM jugadores, equipos "
				+ "WHERE jugadores.Nombre_equipo = equipos.Nombre "
				+ "AND jugadores.Procedencia = '" + procedencia + "' "
				+ "AND equipos.Conferencia = '" + conferencia + "' "
				+ "AND equipos.Division = '" + division + "' "
				+ "AND equipos.Ciudad != '" + ciudad + "'";
		
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
			System.out.println("Error en devolverJugadoresUsuario: " + e);
		}
		
		return datosJugas;
	}

}














