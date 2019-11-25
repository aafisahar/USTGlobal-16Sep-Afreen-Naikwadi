
public class TestD {
    public static void main(String[] args) {
		BTM b = new BTM();
		b.swipe();
		b.swipe();
		b.swipe();
		b.swipe();
       int count = b.getCount();
       int totalCount = b.getTotalCount();
       
       System.out.println("Count is = "+count);
       System.out.println("Total Count is = "+totalCount);
	}
}
