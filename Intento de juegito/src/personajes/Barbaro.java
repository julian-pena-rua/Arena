package personajes;

import habilidades.especial;

public class Barbaro extends Personaje implements IPersonaje{
	
	public Barbaro() {
		this.nombre = "Gutts";
		this.clase = "Barbaro";
		this.profesion = "Berserker";
		
		this.nivel = 1056;
		
		this.ataque = 999;
		this.defensa = 100;
		
		this.fuerza = 999;
		this.destreza = 999;
		this.carisma = 999;
		
		this.experiencia = 105423520;
	}
	
	public Barbaro(int fuerza, int destreza, int carisma) {
		this.fuerza = fuerza;
		this.destreza = destreza;
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
		return "Nadie puede vencerme cuando hago mi habilidad especial";
	}

	@Override
	public String MensajeBatalla() {
		return "¡A BATALLAR!";
	}

	@Override
	public String Despedida() {
		return "No quiero irme aún...";
	}

	@Override
	public int Vida() {
		return 200000;
	}

	@Override
	public int Escudo() {
		return 5000;
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
