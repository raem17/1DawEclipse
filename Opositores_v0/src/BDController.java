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
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/opositores", "root", "");
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
	
	public ArrayList<Opositor> dameOpositores() {
		ArrayList<Opositor> opositores = new ArrayList<Opositor>();
		String sql = "SELECT * FROM OPOSITOR";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			while(rs.next()==true) {
				Opositor opo = new Opositor(rs.getString("nombre"), rs.getString("dni"), rs.getString("telefono"), rs.getString("ciudad"));
				opositores.add(opo);
			}
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return opositores;
	}
	
	// Ejer 1
	public ArrayList<String> dameNombres() {
		ArrayList<String> nombres = new ArrayList<String>();
		String sql = "SELECT * FROM OPOSITOR";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			while(rs.next() == true) {
				nombres.add(rs.getString("nombre"));
			}
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			
		}
		
		return nombres;
	}
	
	// Ejer 2
	public String dameNombresXComas() {
		String nombres = "";
		String sql = "SELECT * FROM OPOSITOR";
		
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			while(rs.next() == true) {
				nombres = nombres + rs.getString("nombre") + ", ";
			}
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			
		}
		
		return nombres;
	}
	
	// Ejer 3
	public void generarArchivoDnis() {
		String ruta = "dnisOpos.txt";
		File archivo = new File(ruta);
		
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 2ª parte
		String sql = "SELECT * FROM OPOSITOR";
		try {
			Statement miStatement = this.conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs = miStatement.executeQuery(sql);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
			
			while(rs.next() == true) {
				bw.write(rs.getString("dni"));
				
				if (!rs.isLast()) {
					bw.newLine();
				}
			}
			
			bw.close();
			miStatement.close();
			rs.close();
		} catch (Exception e) {
			
		}
		
		System.out.println("Archivos generados.");
	}

}

















