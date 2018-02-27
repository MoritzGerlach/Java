public class Liste {
	private Knoten erster;
	public Liste() {
		erster=null;
	}
	
	
	public String einfügenKnoten(Knoten k){
		if(erster==null){
			erster=k;
			return "Eingefügt";
		}
		
