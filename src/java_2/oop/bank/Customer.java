package java_2.oop.bank;

public class Customer {
		/*
			Properties :
				firstName;
				lastName;
				ssn;
				dob;
				wallet; $ in the wallet
		*/

    String firstName, lastName, dob;
    double wallet;
    int ssn;

    public Customer(String firstName, String lastname, String dob, int ssn, double wallet) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.dob = dob;
        this.ssn = ssn;
        this.wallet = wallet;

    }
        @Override
        public String toString() {
            return "Customer{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", dob='" + dob + '\'' +
                    ", ssn=" + ssn +
                    ", wallet=" + wallet +
                    '}';
    }
}

