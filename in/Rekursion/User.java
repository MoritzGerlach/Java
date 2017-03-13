

public class User {
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		Bakterien b=new Bakterien();
		Palindrom p=new Palindrom();
		Graden g= new Graden();
		System.out.print(f.fib(1)+"[LE]\n");
		System.out.print((float)f.spirallaegeGeben(1)+"[LE]\n");
		System.out.println((int)b.bakuVer(5));
		System.out.println(g.rechnen(3));

		System.out.println(p.pruefen("ABbA"));
	}


}
