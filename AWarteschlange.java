class AWarteschlange extends Warteschlange {
	private Taxi[] taxistand;
	
	public void neueSchlange(){
		taxistand=new Taxi[6];
		anzahlTaxi=0;
	}
	public Taxi vorneAbfahren(){
		Taxi erstesTaxi=null;
		if (anzahlTaxi==0) {
			System.out.println("Fehler: Kein Taxi in der Schlange\n");
		}
		else {
			erstesTaxi=taxistand[0];
			for (int i=1;i< anzahlTaxi ; i++ ) {
				taxistand[i-1]=taxistand[i];
			}
			taxistand[anzahlTaxi-1]=null;
			anzahlTaxi= anzahlTaxi -1;
		}
		return erstesTaxi;
	}
	public void hintenAnstellen(Taxi t){
		if (anzahlTaxi==6) {
			System.out.println("Fehler: Kein Platz mehr frei\n");
		}
		else {
			taxistand[anzahlTaxi]=t;
			anzahlTaxi = anzahlTaxi +1;
		}
	}

	public void ausgabe(){
		System.out.println("TaxiNr\t|Taxifaher\t|Taxi Kennzeichen");
		for(int i = 0; i <= 45; i++){
			System.out.print('-');
		}
		System.out.println("");
		for(int i = 0; i < anzahlTaxi; i++){
			System.out.println(i+1 + "\t|\t"+ taxistand[i].getName()+"\t|\t"+ taxistand[i].getKennzeichen());
		}
		System.out.println("\n");
	}

	public void anzahlGeben(){
		System.out.println(anzahlTaxi);
	}

	public void istLeer(){
		if(anzahlTaxi==0){
			System.out.println("Ja. Wahrteschlange ist leer\n");
		}
		else {
			System.out.println("Nein. Wahrteschlange ist nicht leer\n");
		}
	}
}