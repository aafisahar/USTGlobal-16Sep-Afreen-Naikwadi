
public class TestF {
    public static void main(String[] args) {
		AndroidOS a = new AndroidOS();
		a.homeScreen();
		System.out.println("**********************");
		Sony s = new Sony();
		s.homeScreen();
		System.out.println("**********************");
		MI m = new MI();
		m.homeScreen();
		System.out.println("**********************");
		OnePlus o = new OnePlus();
		o.homeScreen();
	}
}
