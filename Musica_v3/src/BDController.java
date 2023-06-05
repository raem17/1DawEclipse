import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;

public class BDController {
	private Connection conexion;

	public BDController() {
		super();
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/musica20", "root", "");
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
	
	public ArrayList<String> devolverListadoArtistas() {
		ArrayList<String> datosArtistas = new ArrayList<String>();
		String sql = "SELECT * FROM artista";

		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			while(rs.next()==true) {
				datosArtistas.add("DNI: " + rs.getString("dni") + ". Nombre: " + rs.getString("nombre") + "\n");
			}
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverListadoArtistas: " + e);
		}
		
		return datosArtistas;
	}
	
	public ArrayList<String> devolverListadoCanciones() {
		ArrayList<String> datosCanciones = new ArrayList<String>();
		String sql = "SELECT * FROM cancion";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			while(rs.next()==true) {
				datosCanciones.add("Código: " + rs.getString("cod") + ". Título: " + rs.getString("titulo") + ". Duración: "+ rs.getString("duracion") + "\n");
			}
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverListadoCanciones: " + e);
		}
		
		return datosCanciones;
	}
	
	public ArrayList<String> devolverListadoDiscos() {
		ArrayList<String> datosDiscos = new ArrayList<String>();
		String sql = "SELECT * FROM disco";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			while(rs.next()==true) {
				datosDiscos.add("Código: " + rs.getString("cod") + ". Nombre: " + rs.getString("nombre") + ". Fecha: "+ rs.getString("fecha") + 
						". Código de compañia: " + rs.getString("cod_comp") + ". Código de grupo: " + rs.getString("cod_gru") + "\n");
			}
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverListadoDiscos: " + e);
		}
		
		return datosDiscos;
	}
	
	public ArrayList<String> devolverListadoGrupos() {
		ArrayList<String> datosGrupos = new ArrayList<String>();
		String sql = "SELECT * FROM grupo";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			while(rs.next()==true) {
				datosGrupos.add("Código: " + rs.getString("cod") + ". Nombre: " + rs.getString("nombre") + ". Fecha: "+ rs.getString("fecha") + 
						". País: " + rs.getString("pais") + "\n");
			}
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverListadoGrupos: " + e);
		}
		
		return datosGrupos;
	}
	
	public void eliminarCancion(String tituloCancion) {
		String sql = "DELETE FROM cancion WHERE titulo LIKE '" + tituloCancion + "' ";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			miStatement.executeUpdate(sql);
			miStatement.close();
			
			System.out.println("Canción eliminada.");

		} catch (Exception e) {
			System.out.println("Error en eliminarCancion: " + e);
		}
	}
	
	public boolean existeCancion (String tituloCancion) {
		String sql = "SELECT * FROM cancion WHERE titulo LIKE '" + tituloCancion + "'";
		boolean existe = false;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeCancion: " + e);
		}
		
		return existe;
	}
	
	public boolean existeArtista (String nombreArtista) {
		String sql = "SELECT * FROM artista WHERE nombre LIKE '" + nombreArtista + "'";
		boolean existe = false;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeArtista: " + e);
		}
		
		return existe;
	}
	
	public void eliminarArtista (String nombreArtista) {
		String sql = "DELETE FROM artista WHERE nombre LIKE '" + nombreArtista + "' ";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			miStatement.executeUpdate(sql);
			miStatement.close();
			
			System.out.println("Artista eliminado.");

		} catch (Exception e) {
			System.out.println("Error en eliminarArtista: " + e);
		}
	}
	
	public void altaArtista (String nombreArtista, String dniArtista) {
		String sql = "INSERT INTO artista (dni, nombre) VALUES ('" + dniArtista + "', '" + nombreArtista + "');";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (Exception e) {
			System.out.println("Error en altaArtista: " + e);
		}
	}
	
	public void altaCancion (int cod, String titulo, double duracion) {
		String sql = "INSERT INTO cancion (cod, titulo, duracion) VALUES (" + cod + ", '" + titulo + "', " + duracion + ");";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (Exception e) {
			System.out.println("Error en altaCancion: " + e);
		}
	}
	
	public ArrayList<String> devolverListadoArtistasXLetra(char letra) {
		ArrayList<String> datosArtistas = new ArrayList<String>();
		String sql = "SELECT * FROM artista";

		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				if (rs.getString("nombre").charAt(0) == letra) {
					datosArtistas.add("DNI: " + rs.getString("dni") + ". Nombre: " + rs.getString("nombre") + "\n");
				}
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverListadoArtistasXLetra: " + e);
		}
		
		return datosArtistas;
	}
	
	public void altaGrupo (int cod, String nombre, String fecha, String pais) {
		String sql = "INSERT INTO grupo (cod, nombre, fecha, pais) VALUES (" + cod + ", '" + nombre + "', '" + fecha + "', '" + pais + "');";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (Exception e) {
			System.out.println("Error en altaGrupo: " + e);
		}
	}
	
	public boolean existeGrupo (int codigoGrupo) {
		String sql = "SELECT * FROM grupo WHERE cod LIKE " + codigoGrupo;
		boolean existe = false;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeGrupo: " + e);
		}
		
		return existe;
	}
	
	public boolean existeDNIArtista (String dni) {
		String sql = "SELECT * FROM artista WHERE dni LIKE '" + dni + "'";
		boolean existe = false;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeDNIArtista: " + e);
		}
		
		return existe;
	}
	
	public boolean existeRegistroEn_T_Pertenece (String dni, int cod) {
		String sql = "SELECT * FROM pertenece WHERE dni LIKE '" + dni + "' AND cod LIKE " + cod + ";";
		boolean existe = false;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeRegistroEn_T_Pertenece: " + e);
		}
		
		return existe;
	}
	
	public void insertarArtistaEnGrupo (String dniArtista, int codigoGrupo, String funcion) {
		String sql = "INSERT INTO pertenece (dni, cod, funcion) VALUES ('" + dniArtista + "', " + codigoGrupo + ", '" + funcion + "');";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (Exception e) {
			System.out.println("Error en insertarArtistaEnGrupo: " + e);
		}
	}
	
	public int devolverCodCancion (String tituloCancion) {
		String sql = "SELECT * FROM cancion WHERE titulo LIKE '" + tituloCancion + "'";
		int cod = 0;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				cod = rs.getInt("cod");
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverCodCancion: " + e);
		}
		
		return cod;
	}
	
	public int devolverCodDisco (String nombreDisco) {
		String sql = "SELECT * FROM disco WHERE nombre LIKE '" + nombreDisco + "'";
		int cod = 0;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				cod = rs.getInt("cod");
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverCodDisco: " + e);
		}
		
		return cod;
	}
	
	public boolean existeDisco (String nombreDisco) {
		String sql = "SELECT * FROM disco WHERE nombre LIKE '" + nombreDisco + "';";
		boolean existe = false;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeDisco: " + e);
		}
		
		return existe;
	}
	
	public void insertarCancionEnDisco (int codCancion, int codDisco) {
		String sql = "INSERT INTO esta (can, cod) VALUES (" + codCancion + ", " + codCancion + ");";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (Exception e) {
			System.out.println("Error en insertarCancionEnDisco: " + e);
		}
	}
	
	public boolean existeRegistroEn_T_Esta (int codCancion, int codDisco) {
		String sql = "SELECT * FROM esta WHERE can LIKE " + codCancion + " AND cod LIKE " + codDisco;
		boolean existe = false;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeRegistroEn_T_Esta: " + e);
		}
		
		return existe;
	}
	
	public String devolverDniArtista (String nombre) {
		String sql = "SELECT * FROM artista WHERE nombre LIKE '" + nombre + "'";
		String dni = "";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				dni = rs.getString("dni");
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverDniArtista: " + e);
		}
		
		return dni;
	}
	
	public int devolverCodGrupo (String nombre) {
		String sql = "SELECT * FROM grupo WHERE nombre LIKE '" + nombre + "'";
		int cod = 0;
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				cod = rs.getInt("cod");
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverCodGrupo: " + e);
		}
		
		return cod;
	}
	
	public void eliminarArtistaDeGrupo (String dni) {
		String sql = "DELETE FROM pertenece WHERE dni LIKE '" + dni + "'";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			miStatement.executeUpdate(sql);
			miStatement.close();
		} catch (Exception e) {
			System.out.println("Error en eliminarArtistaDeGrupo: " + e);
		}
	}
	
	public double devolverDuracionCancionMax () {
		double duracionMax = 0.0;
		
		String sql = "SELECT MAX(duracion) AS duracionMax FROM cancion";
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				duracionMax = rs.getDouble("duracionMax");
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverDuracionCancionMax: " + e);
		}
		
		return duracionMax;
	}
	
	public String devolverTituloDuracionMax () {
		String titulo = "";
		int duracionMax = (int)devolverDuracionCancionMax();
		
		String sql = "SELECT * FROM cancion WHERE duracion LIKE " + duracionMax;
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				titulo = rs.getString("titulo");
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverTituloDuracionMax: " + e);
		}
		
		return titulo;
	}
	
	public ArrayList<String> devolverListadoCancionesDuracionMenorX (int duracion) {
		ArrayList<String> datosCanciones = new ArrayList<String>();
		
		String sql = "SELECT * FROM cancion WHERE duracion < " + duracion;
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				datosCanciones.add("Código: " + rs.getString("cod") + ". Título: " + rs.getString("titulo") + ". Duración: "+ rs.getString("duracion") + "\n");
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverListadoCancionesDuracionMenorX: " + e);
		}
		
		return datosCanciones;
	}
	
	public ArrayList<String> devolverListadoCancionesXDisco (int codDisco) {
		ArrayList<String> datosCanciones = new ArrayList<String>();
		
		String sql = "SELECT * FROM cancion, esta WHERE esta.can = cancion.cod AND esta.cod = " + codDisco;
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				datosCanciones.add("Código: " + rs.getString("cod") + ". Título: " + rs.getString("titulo") + ". Duración: "+ rs.getString("duracion") + "\n");
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverListadoCancionesXDisco: " + e);
		}
		
		return datosCanciones;
	}
	
	public String devolverNombreGrupoXCod (int codGrupo) {
		String nombreGrupo = "";
		
		String sql = "SELECT * FROM grupo WHERE cod LIKE " + codGrupo;
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next() == true) {
				nombreGrupo = rs.getString("nombre");
			}
			
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en devolverNombreGrupoXCod: " + e);
		}
		
		return nombreGrupo;
	}
	
	public void generarArchivoCancionesGrupo(String ruta, int codGrupo) {
		File archivo = new File(ruta);
		
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				System.out.println("Error en generarArchivoCancionesGrupo: " + e);
			}
		}
		
		// 2ª parte
		String sql = "SELECT cancion.titulo FROM cancion "
				+ "JOIN disco, "
				+ "esta WHERE esta.can = cancion.cod "
				+ "AND esta.cod = disco.cod "
				+ "AND disco.cod_gru = " + codGrupo;
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			
			while(rs.next() == true) {
				bw.write(rs.getString("titulo"));
				
				if (!rs.isLast()) {
					bw.newLine();
				}
			}
			
			bw.close();
			miStatement.close();
			rs.close();
			
			System.out.println("Archivos generados.");
		} catch (Exception e) {
			System.out.println("Error en generarArchivoCancionesGrupo: " + e);
		}
	}
	
}












