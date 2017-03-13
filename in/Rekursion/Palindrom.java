

public class Palindrom {
	public boolean pruefen(String s){
		return prufen(s.toUpperCase().toCharArray(),0,s.toCharArray().length-1);
	}
	private boolean prufen(char[] c, int anfang, int ende){
		if(anfang>= ende){
			return true;
		}
		else{
			return c[anfang]==c[ende] && prufen(c,anfang+1,ende-1);
		}
	}
}
