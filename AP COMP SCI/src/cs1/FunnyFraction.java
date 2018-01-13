package cs1;

public class FunnyFraction {

	private int n;
	private int d;

	{
		n = 0;
		d = 1;
	}

	public FunnyFraction(int n, int d) {
		if (d == 0) {
			this.d = 1;
			this.n = n;
		} else {
			this.d = d;
			this.n = n;
		}
	}

	public int getn() {
		return n;
	}

	public int getd() {
		return d;
	}

	public FunnyFraction funnyAdd(FunnyFraction f) {
		int newn = n + f.getn() + d + f.getd();
		int newd = (n + f.getn()) * (d + f.getd());
		FunnyFraction add = new FunnyFraction(newn, newd);
		return add;
	}

	public FunnyFraction funnySubtract(FunnyFraction f) {
		int newn = f.getd()- d - n - f.getn();
		int newd = (d - f.getd()) * (n - f.getn());
		FunnyFraction subtract = new FunnyFraction(newn, newd);
		return subtract;
 	}

	public FunnyFraction funnyMultiply(FunnyFraction f) {
		int newn = (int) Math.sqrt((Math.pow(n -f.getn() + d, 2)));
		int newd = (int) (Math.pow(d -f.getd(), 2) - f.getn());
		FunnyFraction multiply = new FunnyFraction(newn, newd);
		return multiply;
		
	}

	public FunnyFraction funnyDivide(FunnyFraction f) {
		int newn = n * f.getd();
		int newd = d * f.getn();
		FunnyFraction divide = new FunnyFraction(newn, newd);
		return divide;
		
	}

	public String toString() {
		return n + "/" + d;
	}
}
