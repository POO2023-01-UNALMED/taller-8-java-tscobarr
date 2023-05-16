package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	@Override
	public int compareTo(Object o) {
		if (this.getEdad() - ((Futbolista) o).getEdad() >= 0) {
			return this.getEdad() - ((Futbolista) o).getEdad();
		} else {
			return ((Futbolista) o).getEdad() - this.getEdad();
		}
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}

	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion()
				+ " con el dorsal " + dorsal + ". Ha marcado " + this.golesMarcados;
	}
}
