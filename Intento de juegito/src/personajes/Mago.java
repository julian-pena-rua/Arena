package personajes;

public class Mago {
	private int VidaM;
	private int EscudoM;
	private int Rayo_Magico;
	private int Rayo_Celestial;
	private String NombreMago;
	
	public Mago () {
		VidaM = 100000;
		EscudoM = 500;
	Rayo_Magico = 1000;
	Rayo_Celestial = 3000;
	}
public String VidaM(){
		return "100000 de vida";}
public String EscudoM() {
		return "500 de escudo";}
public String Rayo_Magico() {
	return "El Rayo Magico ocasiona 1000 de Daño a tu rival.";}
public String Rayo_Celestial() {
	return "El Rayo Celestial ocasiona 3000 de daño a tu rival";}

}
