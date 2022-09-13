package MediavalArena;
import java.util.Scanner;

public class HyperRandomArena {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);//llamar al scanner o lector
	
	int Eleccion;
	String Res;
	
	//llamar al mago - Datos generales de mago
	Mago Witch = new Mago(); 
	//ESTADISTICAS DEL MAGO
	String Mago_Stats;
	Mago_Stats = "Puntos de vida: "  + Witch.VidaM() + " - Puntos de Escudo: " + Witch.EscudoM() + " - Ataque Normal: " + Witch.Rayo_Magico() + " - Habilidad Especial: " + Witch.Rayo_Celestial();
	
	
	
	System.out.println("Bienvenido a la Arena de Combate");
	System.out.println("¿Que personaje Deseas Elegir para ir a batalla?");
	System.out.println("Mago = 1");
	Eleccion = sc.nextInt();
	switch (Eleccion) { 
	// EN CASO DE ESCOGER AL MAGO
	case 1:
		System.out.println("Haz elegido al Mago. ¿quieres ver sus estadisticas?"
				+ " Presiona S para confirmar o N para denegar");
		Res = sc.next();
		if(Res == "S") {
			System.out.println(Mago_Stats);
		
			}
		break;
	//EN CASO DE ESCOGER AL BARBARO
	case 2:	
			
		}
		
		
		
		
	
	}
	
	
			
			
	
	

}
