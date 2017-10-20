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
		
		
		TimeSlotGregorien test4 = new TimeSlotGregorien("POO");
		test4.setDebut(9, 00);
		test4.setFin(12, 00);
		TimeSlotGregorien test5 = new TimeSlotGregorien("math");
		test5.setDebut(13,00);
		test5.setFin(14,00);
		TimeSlotGregorien test6 = new TimeSlotGregorien("te");
		test6.setDebut(10,00);
		test6.setFin(11,00);
		Boolean d = test4.overslaps(test5);
		Boolean e = test4.overslaps(test6);
		Boolean f = test5.overslaps(test6);
		System.out.println(d + " " + e + " " + f);
	}
}
