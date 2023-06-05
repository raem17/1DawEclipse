


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
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/musica20", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	public boolean existeCancion(String cancion) {
		boolean existe = false;
		
		String sql = "SELECT * FROM `cancion` WHERE cancion.titulo = '" + cancion + "';" ;
		try {
			Statement miStatement = conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next()) {
				existe = true;
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en existeCancion: " + e);
		}
		
		return existe;
	}
	
	public ArrayList<String> devolverNombresDiscosXCancion(String cancion) {
		ArrayList<String> nombresDiscos = new ArrayList<String>();
		
		String sql = "SELECT DISTINCT disco.nombre AS 'disco' FROM disco INNER JOIN (esta INNER JOIN cancion ON cancion.cod = esta.can) "
				+ "ON disco.cod = esta.cod\r\n"
				+ "WHERE cancion.titulo = '" + cancion + "';" ;
		try {
			Statement miStatement = conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next()) {
				nombresDiscos.add(rs.getString("disco"));
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverNombresDiscosXCancion: " + e);
		}
		
		return nombresDiscos;
	}
	
	public ArrayList<Companya> devolverCompanyasConDiscos() {
		ArrayList<Companya> companyas = new ArrayList<Companya>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		String sql = "SELECT * FROM companyia, disco WHERE disco.cod_comp = companyia.cod\r\n"
				+ "ORDER BY disco.fecha;" ;
		try {
			Statement miStatement = conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next()) {
				if (!Main.existeNumero(numeros, rs.getInt("cod"))) {
					numeros.add(rs.getInt("cod"));
					
					Companya nuevaCompa = new Companya(rs.getInt("cod"), rs.getString("nombre"), rs.getString("dir"), rs.getString("fax").trim(), rs.getString("tfno").trim());
					companyas.add(nuevaCompa);
				}
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverCompanyasConDiscos: " + e);
		}
		
		return companyas;
	}
	
	public String devolverNombreArtistaGruposMax() {
		String nombreArtista = "";
		int gruposMax = 0;
		
		String sql = "SELECT artista.nombre, COUNT(*) AS 'num_grupos' FROM artista INNER JOIN pertenece ON artista.dni = pertenece.dni\r\n"
				+ "GROUP BY artista.dni;" ;
		try {
			Statement miStatement = conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next()) {
				if (rs.getInt("num_grupos") > gruposMax) {
					nombreArtista = rs.getString("nombre");
				}
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverNombreArtistaGruposMax: " + e);
		}
		
		return nombreArtista;
	}
	
	public ArrayList<String> devolverNombresGruposXArtista(String artista) {
		ArrayList<String> nombresGrupos = new ArrayList<String>();
		
		String sql = "SELECT grupo.nombre AS 'grupo' FROM grupo INNER JOIN (pertenece INNER JOIN artista ON artista.dni = pertenece.dni) ON grupo.cod = pertenece.cod\r\n"
				+ "WHERE artista.nombre = '" + artista + "';" ;
		try {
			Statement miStatement = conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next()) {
				nombresGrupos.add(rs.getString("grupo"));
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverNombreGruposXArtista: " + e);
		}
		
		return nombresGrupos;
	}
	
	// Ejer 4
	public ArrayList<Disco> devolver4DiscosCancionesMax () {
		ArrayList<Disco> datosDiscos = new ArrayList<Disco>();
		
		String sql = "SELECT disco.cod, disco.nombre, disco.fecha, disco.cod_comp, disco.cod_gru, COUNT(*) AS 'Num_canciones'\r\n"
				+ "FROM disco INNER JOIN (esta INNER JOIN cancion ON cancion.cod = esta.can) ON disco.cod = esta.cod\r\n"
				+ "GROUP BY disco.cod\r\n"
				+ "ORDER BY COUNT(*) DESC LIMIT 4;" ;
		try {
			Statement miStatement = conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next()) {
				Disco disco = new Disco(rs.getInt("cod"), rs.getString("nombre"), rs.getString("fecha"), rs.getInt("cod_comp"), rs.getInt("cod_gru"));
				datosDiscos.add(disco);
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolver4DiscosCancionesMax: " + e);
		}
		
		return datosDiscos;
	}
	
	public String devolverNombreGrupoXCod (int codGru) {
		String nombreGrupo = "";
		
		String sql = "SELECT grupo.nombre FROM grupo WHERE grupo.cod = " + codGru + ";" ;
		try {
			Statement miStatement = conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next()) {
				nombreGrupo = rs.getString("nombre");
			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverNombreGrupoXCod: " + e);
		}
		
		return nombreGrupo;
	}
	
	public ArrayList<CompanyaAlt> devolverCompanyasAlts () {
		ArrayList<CompanyaAlt> datosCompanyasAlts = new ArrayList<CompanyaAlt>();
		
		String sql = "SELECT disco.nombre, disco.cod_gru, companyia.nombre \r\n"
				+ "FROM companyia, disco\r\n"
				+ "WHERE disco.cod_comp = companyia.cod\r\n"
				+ "ORDER BY disco.nombre" ;
		try {
			Statement miStatement = conexion.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			
			while(rs.next()) {
				if (!Main.existeCompanyaAlt(datosCompanyasAlts, rs.getString(3))) {
					Disco nuevoDisco = new Disco(0, rs.getString(1), null, 0, rs.getInt(2));
					ArrayList<Disco> discos = new ArrayList<Disco>();
					discos.add(nuevoDisco);
					
					CompanyaAlt nuevaCompa = new CompanyaAlt(rs.getString(3), discos);
					datosCompanyasAlts.add(nuevaCompa);
					
				} else {
					for (int i = 0; i < datosCompanyasAlts.size(); i++) {
						if (datosCompanyasAlts.get(i).getNombre_companya().equalsIgnoreCase(rs.getString(3))) {
							Disco nuevoDisco = new Disco(0, rs.getString(1), null, 0, rs.getInt(2));
							datosCompanyasAlts.get(i).getDiscos().add(nuevoDisco);
						}
					}
				}

			}
			
			miStatement.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error en devolverCompanyasAlts: " + e);
		}
		
		return datosCompanyasAlts;
	}

		
}
