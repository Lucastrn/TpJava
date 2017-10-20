package tpPackage;

public class exec {
	public static void main(String[] args) {
		TimeSlot test1 = new TimeSlot(9,12,"poo");
		TimeSlot test2 = new TimeSlot(13,14,"math");
		TimeSlot test3 = new TimeSlot(10,11,"te");
		Boolean a = test1.overslaps(test2);
		Boolean b = test1.overslaps(test3);
		Boolean c = test2.overslaps(test3);
		System.out.println(a + " " + b + " " + c);
	}
}
