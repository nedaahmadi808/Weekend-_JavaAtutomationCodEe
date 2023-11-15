
public class ProgramToDetermineLeapYear {

	public static void main(String[] args) {
         int year=2023;
         
		if(year%4 == 0 && year%100 !=0) {
			System.out.println("year is a leap");
		}else {
			System.out.println("year is npt leap");
		}
	}

}
