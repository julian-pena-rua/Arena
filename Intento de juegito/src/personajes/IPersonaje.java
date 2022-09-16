package personajes;

/*
 * @Descripcion: Esta es una interfaz, al utilizarla (implementarla) en una clase se obtiene acceso a esto métodos genéricos
 * */
public interface IPersonaje { 
	
	public String Nombre();
	
	public int Nivel();
	public int Experiencia();
	
	public String Clase();
	public String Profesion();
		
	public int Vida();
	public int Escudo();
	public int PoderMagico();
	
	public String Saludo();
	public String MensajeBatalla();
	public String Despedida();
	public String MensajeAlMorir();
	
	public int Ataque();
	public int Defensa();
	
	public int Fuerza();			
	public int Destreza();		
	public int Inteligencia();	
	public int Sabiduria();		
	public int Carisma();  		
	public int Suerte();			
	public int Aagilidad();		
	
	public int AtaqueNormal();
	public int AtaqueEspecial();	
	
	// Imagen personajes, son 10 partes.
	public String FotoPerfilParte1();
	public String FotoPerfilParte2();
	public String FotoPerfilParte3();
	public String FotoPerfilParte4();
	public String FotoPerfilParte5();
	public String FotoPerfilParte6();
	public String FotoPerfilParte7();
	public String FotoPerfilParte8();
	public String FotoPerfilParte9();
	public String FotoPerfilParte10();

}
