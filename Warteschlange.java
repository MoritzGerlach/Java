public abstract class Warteschlange {
	protected int anzahlTaxi;

	public abstract void neueSchlange();
	public abstract Taxi vorneAbfahren();
	public abstract void hintenAnstellen(Taxi t);
	public abstract void ausgabe();	
	public abstract void anzahlGeben();
	public abstract void istLeer();	
}