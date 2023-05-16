package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;

	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	@Override
	public int compareTo(Object o) {
		if (this.golesRecibidos - ((Portero) o).golesRecibidos >= 0) {
			return this.golesRecibidos - ((Portero) o).golesRecibidos;
		} else {
			return ((Portero) o).golesRecibidos - this.golesRecibidos;
		}
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion()
				+ " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}

}
