package personajes;

public class HechiceroSombras extends Hechicero{
	
	public HechiceroSombras() {
		this.nombre = "Alice Kyteler";
		this.clase = "Hechicera Sombras";
		this.profesion = "Clarividente y adivina";
		
		this.nivel = 501;
		
		this.ataque = 569;
		this.defensa = 199;
	
		
		this.inteligencia = 999;
		this.sabiduria = 999;
		this.carisma = -999;
		
		this.experiencia = 426720;
	}

	public HechiceroSombras(int inteligencia, int sabiduria, int carisma) {
		this.inteligencia = inteligencia;
		this.sabiduria = sabiduria;
		this.carisma = carisma;
	}
	
	@Override
	public int Vida() {
		return 100000;
	}

	@Override
	public int Escudo() {
		return 500;
	}

	@Override
	public String Saludo() {
		return "Tu futuro está escrito";
	}

	@Override
	public String MensajeBatalla() {
		return "¡CONOZCO EL RESULTADO DE ESTA BATALLA!";
	}

	@Override
	public String Despedida() {
		return "Lo sabía, no debí enfrentarte...";
	}

	@Override
	public int AtaqueEspecial() {
		return RayoCelestial();
	}

	@Override
	public int AtaqueNormal() {
		return RayoMagico();
	}

	@Override
	public String Nombre() {
		return this.nombre;
	}

	@Override
	public int Nivel() {
		return this.nivel;
	}

	@Override
	public int Experiencia() {
		return this.experiencia;
	}

	@Override
	public String Clase() {
		return this.clase;
	}

	@Override
	public String Profesion() {
		return this.profesion;
	}
	@Override
	public String FotoPerfilParte1() {
		return  "      |   /|  .--o";
		        
	}

	@Override
	public String FotoPerfilParte2() {
		return "      |   ||_/";
	}

	@Override
	public String FotoPerfilParte3() {
		return "      | .*\\\\   **.";
	}

	@Override
	public String FotoPerfilParte4() {
		return "      |/   \\\\     *\\";
	}

	@Override
	public String FotoPerfilParte5() {
		return "      ||      O    |";
	}

	@Override
	public String FotoPerfilParte6() {
		return "      |;           /";
	}

	@Override
	public String FotoPerfilParte7() {
		return "      | \\\\  *-,___.*";
	}

	@Override
	public String FotoPerfilParte8() {
		return "     _|  \\\\     \\\\";
	}

	@Override
	public String FotoPerfilParte9() {
		return "  .-*     ;     \\\\";
	}

	@Override
	public String FotoPerfilParte10() {
		return ".*        |      ;;";
	}

	@Override
	public int PoderMagico() {
		return 0;
	}

	@Override
	public String MensajeAlMorir() {
		return null;
	}

	@Override
	public int Ataque() {
		return this.ataque;
	}

	@Override
	public int Defensa() {
		return this.defensa;
	}

	@Override
	public int Fuerza() {
		return this.fuerza;
	}

	@Override
	public int Destreza() {
		return this.destreza;
	}

	@Override
	public int Inteligencia() {
		return this.inteligencia;
	}

	@Override
	public int Sabiduria() {
		return this.sabiduria;
	}

	@Override
	public int Carisma() {
		return this.carisma;
	}

	@Override
	public int Suerte() {
		return this.suerte;
	}

	@Override
	public int Aagilidad() {
		return this.agilidad;
	}
}