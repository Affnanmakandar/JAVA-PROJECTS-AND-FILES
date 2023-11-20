package affnan;
enum month{
JAN("1"),FEB("2"),MAR("3"),APR("4"),MAY("5"),JUN("6"),JULY("7"),AUG("8"),SEP("9"),OCT("10"),NOV("11"),DEC("12");
	private String value;
month(String value){
 this.value=value;
}
 public String  weak() {
	return value;
}
}



	

public class Enum1 {
	public static void main(String[] args) {
		month obj=month.JAN;
//		System.out.println(obj.name());
//		System.out.println(obj.weak()); 
		for(month mac:month.values()) {
			System.out.println(mac.weak());
			System.out.println(mac.name());
		}
		
		
		

	}

}

	

