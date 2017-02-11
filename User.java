class User{
	static Taxi taxiA;
	static Taxi taxiB;
	static Taxi taxiC;
	static Taxi taxiD;
	static Taxi taxiE;
	static Taxi taxiF;
	static Taxi taxiG;
	static Taxi taxiH;
	static Taxi taxiI;
	static Taxi taxiJ;
	private static void taxiserzeugen(){
		taxiA =new Taxi("B-BB 001", "Britta");
		taxiB =new Taxi("B-BB 002", "Hans");
		taxiC =new Taxi("B-BB 003", "Peter");
		taxiD =new Taxi("B-BB 004", "Willi");
		taxiE =new Taxi("B-BB 005", "Hubert");
		taxiF =new Taxi("B-BB 006", "Paula");
		taxiG =new Taxi("B-BB 007", "Eva");
		taxiH =new Taxi("B-BB 008", "Otto");
		taxiI =new Taxi("B-BB 009", "Iris");
		taxiJ =new Taxi("B-BB 010", "Norbert");
	}
	public static void testlauf(){
		Warteschlange warten = new AWarteschlange();
		taxiserzeugen();
		warten.neueSchlange();
		warten.hintenAnstellen(taxiA);
		warten.hintenAnstellen(taxiB);
		warten.ausgabe();
		for (int i=0;i<5 ;i++ ) {
			warten.vorneAbfahren();
		}
		warten.hintenAnstellen(taxiC);
		warten.hintenAnstellen(taxiD);
		warten.hintenAnstellen(taxiE);
		warten.hintenAnstellen(taxiF);
		warten.ausgabe();
		warten.vorneAbfahren();
		warten.ausgabe();
		warten.hintenAnstellen(taxiG);
		warten.hintenAnstellen(taxiH);
		warten.hintenAnstellen(taxiI);
		warten.hintenAnstellen(taxiJ);
		warten.ausgabe();

	}
	public static void main(String[] args) {
		 taxiserzeugen();
		 testlauf();
	}
}