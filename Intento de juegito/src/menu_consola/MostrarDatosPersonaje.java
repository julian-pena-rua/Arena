package menu_consola;

import personajes.IPersonaje;

public class MostrarDatosPersonaje {
	public MostrarDatosPersonaje(IPersonaje personaje) {

		//String fmt = "%1$1s | %2$7s \n"; // % [flag] [tamaño] [.precision] character-conversion ||  https://kodejava.org/how-do-i-align-string-print-out-in-left-right-center-alignment/
		String fmt2col = "|%-40s | %-43s | \n";
		String fmt3col = "|%-20s | %-20s | %-40s |\n";
		String fmt5col = "|%-20s | %-10s | %-14s | %-20s | %-10s |\n";
		String linea = new String(new char[89]).replace('\0', '-');

		System.out.println(linea);
		System.out.printf(fmt3col, personaje.Nombre(), personaje.Clase(), personaje.Profesion());
		System.out.println(linea);
		System.out.printf(fmt5col, personaje.FotoPerfilParte1(), "Nivel", personaje.Nivel(),"","");
		System.out.printf(fmt5col, personaje.FotoPerfilParte2(), "", "","","");
		System.out.printf(fmt5col, personaje.FotoPerfilParte3(), "", "","Experiencia actual", personaje.Experiencia());
		System.out.printf(fmt5col, personaje.FotoPerfilParte4(), "", "","Proximo nivel",705423520); // TODO: Establecer sistema niveles, una clase nivel y poner validaciones según experiencia del personaje
		System.out.printf(fmt5col, personaje.FotoPerfilParte5(), "", "","","");
		System.out.printf(fmt5col, personaje.FotoPerfilParte6(), "HP", (1231+"/"+personaje.Vida()),"",""); // TODO: Establecer sistema para hp, mp y experiencia actual, 
		System.out.printf(fmt5col, personaje.FotoPerfilParte7(), "MP", (345+"/"+personaje.Escudo()),"","");
		System.out.printf(fmt5col, personaje.FotoPerfilParte8(), "", "","","");
		System.out.printf(fmt5col, personaje.FotoPerfilParte9(), "", "","","");
		System.out.printf(fmt5col, personaje.FotoPerfilParte10(), "", "","","");
		System.out.println(linea);
		System.out.printf(fmt2col, "----------------", "----------------");
		System.out.printf(fmt2col, "Estado", "Valor");
		System.out.printf(fmt2col, "----------------", "----------------");
		System.out.printf(fmt2col, "Vida", personaje.Vida());
		System.out.printf(fmt2col, "Escudo", personaje.Escudo());
		System.out.println(linea);
		System.out.printf(fmt2col, "Habilidad", "Nivel");
		System.out.printf(fmt2col, "----------------", "----------------");
		System.out.printf(fmt2col, "Ataque Normal", personaje.AtaqueNormal());
		System.out.printf(fmt2col, "Defensa",  personaje.Defensa());
		System.out.printf(fmt2col, "Ataque Especial",  personaje.AtaqueEspecial());
		System.out.printf(fmt2col, "Agilidad",  personaje.Aagilidad());
		System.out.printf(fmt2col, "Carisma",  personaje.Carisma());
		System.out.printf(fmt2col, "Destreza",  personaje.Destreza());
		System.out.printf(fmt2col, "Fuerza",  personaje.Fuerza());
		System.out.printf(fmt2col, "Inteligencia",  personaje.Inteligencia());
		System.out.printf(fmt2col, "Sabiduria",  personaje.Sabiduria());
		System.out.printf(fmt2col, "Suerte",  personaje.Suerte());
		System.out.println(linea);

	}

}
