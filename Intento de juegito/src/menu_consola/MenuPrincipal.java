package menu_consola;
import java.io.Console;
import java.util.Scanner;

import personajes.Barbaro;
import personajes.Hechicero;
import personajes.IPersonaje;

public class MenuPrincipal {
	
	public void PantallaBienvenida() throws InterruptedException {
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
		System.out.print("Every\tword\tin\tthis\tsentence\tis\tseparated\tby\ta\ttab.");
		System.out.print("\033[H\033[2J"); // escribe sobre la linea anterior 
		System.out.print("\033[34m]"); // cambia color azul 
		
		System.out.flush();
		System.out.print("\033[%dm %3d\033[m");
		
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
		//String linea = new String(new char[65]).replace('\0', '█');
		String linea = new String(new char[65]).replace('\0', '�');
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
				
				MostrarDatosPersonaje mostrar = new MostrarDatosPersonaje(Witch);
				
				mensaje_confirmacion mensaje = new mensaje_confirmacion();
				
				if(mensaje.confirmacion) {
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
				MostrarDatosPersonaje mostrar = new MostrarDatosPersonaje(barbaro);
			}
			break;

		default:

			break;

		}

	}




}
