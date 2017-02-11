class Taxi {
	private String kennzeichen;
	private String fahrername;

	public String getName(){
		return (fahrername);
	}
	public String getKennzeichen(){
		return (kennzeichen);
	}
	
	Taxi(String kennzeichen, String name){
		this.kennzeichen=kennzeichen;
		this.fahrername=name;
	}
}