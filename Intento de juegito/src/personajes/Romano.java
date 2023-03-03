package personajes;

public class Romano extends Personaje implements IPersonaje{

	
	public Romano() {
		this.nombre = "Magnus Alexander";
		this.clase = "Romano";
		this.profesion = "Legionario Romano";
		this.nivel = 99;
		
		this.ataque = 1000;
		this.defensa = 299;

		
		this.destreza = 999;
		this.fuerza = 999;
		this.carisma = -999;
		
		this.experiencia = 426720;
	}

	public Romano(int destreza, int fuerza, int carisma) {
		this.destreza= destreza;
		this.fuerza= fuerza;
		this.carisma = carisma;
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
	public String Saludo() {
		return "Soy el más grande, el más importante, el máximo";
	}

	@Override
	public String MensajeBatalla() {
		return "¡Este lugar primero y después seguiremos con los demás!";
	}

	@Override
	public String Despedida() {
		return "Volveré con mis tropas...";
	}

	@Override
	public int Vida() {
		return 200000;
	}

	@Override
	public int Escudo() {
		return 500;
	}

	@Override
	public int AtaqueEspecial() {
		return this.Taclear();
	}
	
	@Override
	public int AtaqueNormal() {
		return 1000;
	}

	@Override
	public String FotoPerfilParte1() {
		return "      _..._      ";
	}

	@Override
	public String FotoPerfilParte2() {
		return "    .*     *.    ";
	}

	@Override
	public String FotoPerfilParte3() {
		return "   /*-.---.-*\\  ";
	}

	@Override
	public String FotoPerfilParte4() {
		return "   |/`     `\\|  ";
	}

	@Override
	public String FotoPerfilParte5() {
		return "  ( \\  0 0  / ) ";
	}

	@Override
	public String FotoPerfilParte6() {
		return "   |/   V   \\|  ";
	}

	@Override
	public String FotoPerfilParte7() {
		return "    \\ *-:-* /   ";
	}

	@Override
	public String FotoPerfilParte8() {
		return "   .*`-----*`.   ";
	}

	@Override
	public String FotoPerfilParte9() {
		return  " /`           `\\";
	}

	@Override
	public String FotoPerfilParte10() {
		return "/`             `\\";
	}

	@Override
	public int PoderMagico() {
		return 600;
	}

	@Override
	public String MensajeAlMorir() {
		return "Divide y reinarás jajajajaja....";
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
