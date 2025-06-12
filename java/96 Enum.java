package code;
enum Day{
	MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
public class Test {
	public static void main(String[] args) {
		System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THRUSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);
        for (Day day : Day.values()) {
            System.out.print(day+" ");
        }
	}
}