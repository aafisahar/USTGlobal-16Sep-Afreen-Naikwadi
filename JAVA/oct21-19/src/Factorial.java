
public class Factorial {
  static int fact(int n) {
    	if(n>0)
    	{
    		return n*fact(n-1);
    	}
    	else {
    		return 1;
    	}
    }
    
    public static void main(String[] args) {
		int f = fact(4);
		System.out.println(f);
	}
}
