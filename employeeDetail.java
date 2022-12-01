package day3;

public class employeeDetail {
	String employeeName= "Divyabharath";
	long employeeIdNum= 76564486763L;
	short employeeAge= 25;
	char employeeFirstLetter= 'D';
	float salary= 250000F;
	boolean isgood= true;
	public static void main(String[] args) {
		employeeDetail employee= new employeeDetail();
		System.out.println(employee.employeeName);
		System.out.println(employee.employeeIdNum);
		System.out.println(employee.employeeAge);
		System.out.println(employee.employeeFirstLetter);
		System.out.println(employee.salary);
		System.out.println(employee.isgood);
		

}
}