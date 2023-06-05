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
			System.out.println("Error en listadoArtistas: " + e);
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
			System.out.println("Error en listadoCanciones: " + e);
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
			System.out.println("Error en listadoDiscos: " + e);
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
			System.out.println("Error en listadoGrupos: " + e);
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
			System.out.println("Alta exitosa.");

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
			System.out.println("Alta exitosa.");
			
			miStatement.close();
		} catch (Exception e) {
			System.out.println("Error en altaCancion: " + e);
		}
	}
}