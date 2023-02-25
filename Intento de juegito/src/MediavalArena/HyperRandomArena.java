package MediavalArena;
import java.io.Console;
import java.util.Scanner;

import personajes.Barbaro;
import personajes.Hechicero;
import personajes.IPersonaje;

public class HyperRandomArena {
	
	public void PantallaBienvenida() {
		String linea = new String(new char[65]).replace('\0', '_');
		System.out.println(linea);
		System.out.println("                                  ,;L.                            \r\n"
						 + "                j.               f#i EW:        ,ft               \r\n"
						 + "             .. EW,            .E#t  E##;       t#E            .. \r\n"
						 + "            ;W, E##j          i#W,   E###t      t#E           ;W, \r\n"
						 + "           j##, E###D.       L#D.    E#fE#f     t#E          j##, \r\n"
						 + "          G###, E#jG#W;    :K#Wfff;  E#t D#G    t#E         G###, \r\n"
						 + "        :E####, E#t t##f   i##WLLLLt E#t  f#E.  t#E       :E####, \r\n"
						 + "       ;W#DG##, E#t  :K#E:  .E#L     E#t   t#K: t#E      ;W#DG##, \r\n"
						 + "      j###DW##, E#KDDDD###i   f#E:   E#t    ;#W,t#E     j###DW##, \r\n"
						 + "     G##i,,G##, E#f,t#Wi,,,    ,WW;  E#t     :K#D#E    G##i,,G##, \r\n"
						 + "   :K#K:   L##, E#t  ;#W:       .D#; E#t      .E##E  :K#K:   L##, \r\n"
						 + "  ;##D.    L##, DWi   ,KK:        tt ..         G#E ;##D.    L##, \r\n"
						 + "  ,,,      .,,                                   fE ,,,      .,,  \r\n"
						 + "                 Mateo Padilla - DishaWTF labs        ,      v0.1      "	);
		System.out.println(linea);
	}
	
	Console consol;
	Scanner sc;

	int Eleccion;
	char Res;
	String Stats;

	public void precargar() {
		sc = new Scanner(System.in);//llamar al scanner o lector
		Eleccion = 0;
		Res = ' ';
		Stats = "";

	}
	public void cargarMenu() {
		String linea = new String(new char[65]).replace('\0', '█');
		System.out.println(linea);
		System.out.println(" Bienvenido a la Arena de Combate ");
		System.out.println("¿Que personaje Deseas Elegir para ir a batalla?");
		System.out.println(linea);
		
		System.out.println("Mago = 1");
		System.out.println("Barbaro = 2");
		
		System.out.print("Seleccion: ");
		Eleccion = sc.nextInt();
		
		cargarPersonaje(Eleccion);

	}
	public void cargarPersonaje(int eleccion) {

		System.out.flush();

		switch (Eleccion) { 
		// EN CASO DE ESCOGER AL MAGO
		case 1:
			//Crea al mago - Datos predefinidos de mago
			Hechicero Witch = new Hechicero(); 

			System.out.println("Haz elegido al Mago. "
					+ "\n¿quieres ver sus estadisticas primero?"
					+ "\nPresiona S para confirmar o N para denegar");
			
			System.out.print("Seleccion: ");
			Res = sc.next().charAt(0); // convierte la respuesta a una lista de letras y selecciona sólo la primera.

			if(Res == 'S' || Res == 's' ) {
				MostrarDatosPersonaje(Witch);
				
				mensaje_confirmacion mensaje = new mensaje_confirmacion();
				
				if(mensaje.confirmacion = true) {
					System.out.println("Has confirmado el personaje mago.");
					System.out.println("Cargando pantalla siguiente.");
				}else {
					System.out.println("Cargando menú de nuevo.");
				}
			}
			
			break;
			//EN CASO DE ESCOGER AL BARBARO
		case 2:
			Barbaro barbaro = new Barbaro(); 	

			System.out.println("Haz elegido al Barbaro. "
					+ "\n¿quieres ver sus estadisticas?"
					+ "\nPresiona S para confirmar o N para denegar");
			
			System.out.print("Seleccion: ");
			Res = sc.next().charAt(0); // convierte la respuesta a una lista de letras y selecciona sólo la primera.

			if(Res == 'S' || Res == 's' ) {
				MostrarDatosPersonaje(barbaro);
			}
			break;

		default:

			break;

		}

	}


	void MostrarDatosPersonaje(IPersonaje personaje) {

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
