
public class Usuario {
	private String alias;
	private String apellidos;
	private String nombre;
	private String direccion;
	private String poblacion;
	private String telefono;
	private String movil;
	private String email;
	private String observaciones;
	private String sexo;
	private String fechaNac;
	private String estado_civil;
	private String hijos;
	private String desempleado;
	private String profesion;
	private String nivel_academico;
	private String lengua_usual;
	private String ingresos_mensuales;
	private String ahorros;
	private String peso;
	private String altura;
	private String cabello;
	private String ojos;
	private String fumador;
	private String salud;
	private String aficion1;
	private String aficion2;
	private String caracteristica1;
	private String caracteristica2;
	private String valora1;
	private String valora2;
	private String fobias;
	private String sexualidad;
	private String disponible;
	
	public Usuario() {
		super();
	}

	public Usuario(String alias, String apellidos, String nombre, String direccion, String poblacion, String telefono,
			String movil, String email, String observaciones, String sexo, String fechaNac, String estado_civil,
			String hijos, String desempleado, String profesion, String nivel_academico, String lengua_usual,
			String ingresos_mensuales, String ahorros, String peso, String altura, String cabello, String ojos,
			String fumador, String salud, String aficion1, String aficion2, String caracteristica1,
			String caracteristica2, String valora1, String valora2, String fobias, String sexualidad,
			String disponible) {
		super();
		this.alias = alias;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.movil = movil;
		this.email = email;
		this.observaciones = observaciones;
		this.sexo = sexo;
		this.fechaNac = fechaNac;
		this.estado_civil = estado_civil;
		this.hijos = hijos;
		this.desempleado = desempleado;
		this.profesion = profesion;
		this.nivel_academico = nivel_academico;
		this.lengua_usual = lengua_usual;
		this.ingresos_mensuales = ingresos_mensuales;
		this.ahorros = ahorros;
		this.peso = peso;
		this.altura = altura;
		this.cabello = cabello;
		this.ojos = ojos;
		this.fumador = fumador;
		this.salud = salud;
		this.aficion1 = aficion1;
		this.aficion2 = aficion2;
		this.caracteristica1 = caracteristica1;
		this.caracteristica2 = caracteristica2;
		this.valora1 = valora1;
		this.valora2 = valora2;
		this.fobias = fobias;
		this.sexualidad = sexualidad;
		this.disponible = disponible;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getHijos() {
		return hijos;
	}

	public void setHijos(String hijos) {
		this.hijos = hijos;
	}

	public String getDesempleado() {
		return desempleado;
	}

	public void setDesempleado(String desempleado) {
		this.desempleado = desempleado;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getNivel_academico() {
		return nivel_academico;
	}

	public void setNivel_academico(String nivel_academico) {
		this.nivel_academico = nivel_academico;
	}

	public String getLengua_usual() {
		return lengua_usual;
	}

	public void setLengua_usual(String lengua_usual) {
		this.lengua_usual = lengua_usual;
	}

	public String getIngresos_mensuales() {
		return ingresos_mensuales;
	}

	public void setIngresos_mensuales(String ingresos_mensuales) {
		this.ingresos_mensuales = ingresos_mensuales;
	}

	public String getAhorros() {
		return ahorros;
	}

	public void setAhorros(String ahorros) {
		this.ahorros = ahorros;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getCabello() {
		return cabello;
	}

	public void setCabello(String cabello) {
		this.cabello = cabello;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public String getFumador() {
		return fumador;
	}

	public void setFumador(String fumador) {
		this.fumador = fumador;
	}

	public String getSalud() {
		return salud;
	}

	public void setSalud(String salud) {
		this.salud = salud;
	}

	public String getAficion1() {
		return aficion1;
	}

	public void setAficion1(String aficion1) {
		this.aficion1 = aficion1;
	}

	public String getAficion2() {
		return aficion2;
	}

	public void setAficion2(String aficion2) {
		this.aficion2 = aficion2;
	}

	public String getCaracteristica1() {
		return caracteristica1;
	}

	public void setCaracteristica1(String caracteristica1) {
		this.caracteristica1 = caracteristica1;
	}

	public String getCaracteristica2() {
		return caracteristica2;
	}

	public void setCaracteristica2(String caracteristica2) {
		this.caracteristica2 = caracteristica2;
	}

	public String getValora1() {
		return valora1;
	}

	public void setValora1(String valora1) {
		this.valora1 = valora1;
	}

	public String getValora2() {
		return valora2;
	}

	public void setValora2(String valora2) {
		this.valora2 = valora2;
	}

	public String getFobias() {
		return fobias;
	}

	public void setFobias(String fobias) {
		this.fobias = fobias;
	}

	public String getSexualidad() {
		return sexualidad;
	}

	public void setSexualidad(String sexualidad) {
		this.sexualidad = sexualidad;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	
	// Metodos
	
	public void mostrarDatos() {
		System.out.println("Alias: " + this.alias + " Apellidos: " + this.apellidos+ " Nombre: " + this.nombre+ " Dirección: " + this.direccion
				+ " Población: " + this.poblacion + " Teléfono: " + this.telefono + " Móvil: " + this.movil + " Email: " + this.email
				+ " Observaciones: " + this.observaciones+ " Sexo: " + this.sexo+ " Fecha de nacimiento: " + this.fechaNac+ " Estado Civil: " + this.estado_civil
				+ " Hijos: " + this.hijos + " Desempleado: " + this.desempleado + " Profesión: " + this.profesion + " Nivel académico: " + this.nivel_academico
				+ " Lengua usual: " + this.lengua_usual + " Ingresos mensuales: " + this.ingresos_mensuales + " €" + " Ahorros: " + this.ahorros + "€" + " Peso en kg: " + this.peso
				+ " Altura (en metros): " + this.altura + " Cabello: " + this.cabello+ " Ojos: " + this.ojos + " Fumador: " + this.fumador
				+ " Salud: " + this.salud + " Afición 1: " + this.aficion1 + " Afición 2: " + this.aficion2 + " Característica 1: " + this.caracteristica1
				+ " Característica 2: " + this.caracteristica2+ " Valoración 1: " + this.valora1+ " Valoración 2: " + this.valora2+ " Fobias: " + this.fobias
				+ " Sexualidad: " + this.sexualidad + " Disponible: " + this.disponible);
	}
}
