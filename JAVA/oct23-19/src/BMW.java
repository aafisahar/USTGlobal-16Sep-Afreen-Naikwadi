
public class BMW implements AutoMobile,AutoMobileWithAbs {

	@Override
	public int gear() {
		System.out.println("gear() method of BMW");
		return 10;
	}

	@Override
	public void gps() {
		System.out.println("gps() method of BMW");
		
	}

	@Override
	public void abs() {
        System.out.println("abs() of BMW");		
	}

}
