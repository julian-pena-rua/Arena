package habilidades;

public class especial extends habilidad{
	
	// Mago
	public int Arcana() {
		if (this.inteligencia >= 10) {
			return 100000;
		}
		return 0;
	}
	
	public int RayoCelestial() {
		if (this.inteligencia >= 10) {
			return 1000;
		}
		return 0;
	}
	
	public int RayoMagico() {
		if (this.inteligencia >= 10) {
			return 3000;
		}
		return 0;
	}
	
	// Barbaro
	public int AtaqueVeloz() {
		if (this.fuerza >= 10) {
			return 890;
		}
		return 0;
	}
	public int Tanque() {
		if (this.fuerza >= 10) {
			return 30000;
		}
		return 0;
	}
	public int Taclear() {
		if (this.fuerza >= 10) {
			return 690;
		}
		return 0;
	}
	

	
}

