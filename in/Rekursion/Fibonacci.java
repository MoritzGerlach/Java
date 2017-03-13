
public class Fibonacci {
	public int fib(int n){
		if(n==0||n==1){
			return n;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
	}
	
	public double spirallaegeGeben(int voll){
		int n =voll*4;
		double ergebnis = 0;
		for(int i=n; i>=1||i>=0;i--){
			ergebnis= ergebnis+ (fib(i)*(Math.PI*90)/180);
		}
		return ergebnis;
		
	}
}
