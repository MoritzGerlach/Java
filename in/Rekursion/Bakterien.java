

public class Bakterien {
	public double bakuVer(int h){
		double anzahl=300;
		if(h==0){
			return anzahl;
		}
		else{
			return (bakuVer(h-1)*1.2);			
		}
	}
}
