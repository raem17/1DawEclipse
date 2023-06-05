package FIFA;

public class Carta {
	private String nombre;
	private int cod_jugador;
	private int rat;
	private String pos;
	private int precio;
	private int pac;
	private int sho;
	private int pas;
	private int dri;
	private int def;
	private int phy;
	private int pierna_mala;
	private int filigranas;
	
	public Carta() {
		super();
	}

	public Carta(String nombre, int cod_jugador, int rat, String pos, int precio, int pac, int sho, int pas, int dri,
			int def, int phy, int pierna_mala, int filigranas) {
		super();
		this.nombre = nombre;
		this.cod_jugador = cod_jugador;
		
		if (rat >= 0 && rat <= 100) {
			this.rat = rat;
		} else {
			System.out.println("Valor no válido");
		}
		
		this.pos = pos;
		this.precio = precio;
		
		if (pac >= 0 && pac <= 100) {
			this.pac = pac;
		} else {
			System.out.println("Valor no válido");
		}
		
		if (sho >= 0 && sho <= 100) {
			this.sho = sho;
		} else {
			System.out.println("Valor no válido");
		}
		
		if (pas >= 0 && pas <= 100) {
			this.pas = pas;
		} else {
			System.out.println("Valor no válido");
		}
		
		if (dri >= 0 && dri <= 100) {
			this.dri = dri;
		} else {
			System.out.println("Valor no válido");
		}	
	
		if (def >= 0 && def <= 100) {
			this.def = def;
		} else {
			System.out.println("Valor no válido");
		}
		
		if (phy >= 0 && phy <= 100) {
			this.phy = phy;
		} else {
			System.out.println("Valor no válido");
		}

		if (pierna_mala >= 0 && pierna_mala <= 5) {
			this.pierna_mala = pierna_mala;
		} else {
			System.out.println("Valor no válido");
		}
		
		if (filigranas >= 0 && filigranas <= 5) {
			this.filigranas = filigranas;
		} else {
			System.out.println("Valor no válido");
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCod_jugador() {
		return cod_jugador;
	}

	public void setCod_jugador(int cod_jugador) {
		this.cod_jugador = cod_jugador;
	}

	public int getRat() {
		return rat;
	}

	public void setRat(int rat) {
		if (rat >= 0 && rat <= 100) {
			this.rat = rat;
		} else {
			System.out.println("Valor no válido");
		}
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPac() {
		return pac;
	}

	public void setPac(int pac) {
		if (pac >= 0 && pac <= 100) {
			this.pac = pac;
		} else {
			System.out.println("Valor no válido");
		}
	}

	public int getSho() {
		return sho;
	}

	public void setSho(int sho) {
		if (sho >= 0 && sho <= 100) {
			this.sho = sho;
		} else {
			System.out.println("Valor no válido");
		}
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		if (pas >= 0 && pas <= 100) {
			this.pas = pas;
		} else {
			System.out.println("Valor no válido");
		}
	}

	public int getDri() {
		return dri;
	}

	public void setDri(int dri) {
		if (dri >= 0 && dri <= 100) {
			this.dri = dri;
		} else {
			System.out.println("Valor no válido");
		}
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		if (def >= 0 && def <= 100) {
			this.def = def;
		} else {
			System.out.println("Valor no válido");
		}
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		if (phy >= 0 && phy <= 100) {
			this.phy = phy;
		} else {
			System.out.println("Valor no válido");
		}
	}

	public int getPierna_mala() {
		return pierna_mala;
	}

	public void setPierna_mala(int pierna_mala) {
		if (pierna_mala >= 0 && pierna_mala <= 5) {
			this.pierna_mala = pierna_mala;
		} else {
			System.out.println("Valor no válido");
		}
	}

	public int getFiligranas() {
		return filigranas;
	}

	public void setFiligranas(int filigranas) {
		if (filigranas >= 0 && filigranas <= 5) {
			this.filigranas = filigranas;
		} else {
			System.out.println("Valor no válido");
		}
	}

	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", cod_jugador=" + cod_jugador + ", rat=" + rat + ", pos=" + pos
				+ ", precio=" + precio + ", pac=" + pac + ", sho=" + sho + ", pas=" + pas + ", dri=" + dri + ", def="
				+ def + ", phy=" + phy + ", pierna_mala=" + pierna_mala + ", filigranas=" + filigranas + "]";
	}

}
