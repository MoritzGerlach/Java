

public class Graden {
	public int rechnen(int n){
		if(n==1){
			return n;
		}
		else{
			return rechnen(n-1)*n;
		}
	}
}
