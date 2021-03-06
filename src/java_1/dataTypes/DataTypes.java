package java_1.dataTypes;

import java.util.Arrays;

class DataTypes {

//		boolean number = 2021;
//		byte yearOfBirth = 1977;
//		Array nums = [3,4,5,6,7,8,10,12];
//		Object movieName = "Meet The Parents";
//		double male = 'm';
//		triple triplet = 3L;
//		float female = 'f';
//		short decimalVal = .0000000000001f;
//		long halfByte = 0101;


	public static void main(String[] args) {
		//the class fields defined in this DataTypes class have mistakes with either the data type, or the syntax.  Fix the data types so the main method correctly displays the value of all of the variables
		//For the methods below in this DataTypes class, determine the appropriate datatypes for the inputs and the outputs
		System.out.println(yearsToMonths(4) + " months is 4 years");
		System.out.println(monthsToHours(4) + " hours is 4 months");
		System.out.println(daysToSeconds(4) + " seconds is 4 days");
		System.out.println(centuriesToSeconds(4) + " seconds is 4 centuries");
		System.out.println(dollarsToBitcoin(4) + " bitcoins is 4 dollars");
		System.out.println("Shelly is 4 and drives " + canDrive(4) );
		System.out.println("Shelly can drive when she is 16 " + canDrive(16) );
		System.out.println(Arrays.toString(getDataTypes(4, false, 7)));

	}

	static int yearsToMonths(Object years) {
		//	convert years to months using appropriate data types for the inputs and the outputs, 2 years => 24 months
		return (int) years * 12;
	}

	static int monthsToHours(Object months) {
		//	convert months to hours using appropriate data types for the inputs and the outputs, 8 months => 17520 hours
	 return (int) months * 31 * 24;
	}
	static int daysToSeconds(Object days) {
		//	convert days to seconds using appropriate data types for the inputs and the outputs, 2 days => 172800 seconds
	return (int) days * 24 * 60 * 60;
	}

	static long centuriesToSeconds(Object centuries) {
		//	convert centuries to seconds using appropriate data types for the inputs and the outputs, 1 century => 3.1556952 x 10^9 seconds
	return (long) (int) centuries * 100 * 356 * 24 * 60 * 60;
	}

	static double dollarsToBitcoin(Object dollars) {
		//	convert (usd) dollars $ to bitcoin using appropriate data types for the inputs and the outputs, As of 1/2021, 1 bitcoin ~=> $50000.00
		return (double) (int) dollars / 47377;
	}

	static boolean canDrive(Object age) {
		//determine if the age passed in is ready to drive, return a value indicating whether or not the age passed in is ready to drive.
		return (int) age >= 16;
	}

	static String[] getDataTypes(int num1, boolean bool1, long long1) {
//		Use Java to get the data type of the three input variables; and return a string representation of the data types of the three variables as an array.  Do NOT hard code the answers here.  Make sure to use Java to programmatically get the data types.
		return new String[]{((Object)num1).getClass().getSimpleName(),((Object)bool1).getClass().getSimpleName(),((Object)long1).getClass().getSimpleName()};
	}

}