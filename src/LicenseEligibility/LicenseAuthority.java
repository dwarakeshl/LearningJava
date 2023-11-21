package licenseEligibility;

public class LicenseAuthority {
	int age;
	String licenseLevel;

	public void checkLicense() {
		if (age >= 16 && age <= 80) {
			System.out.println("Eligible for a driving license.");
			if (licenseLevel == "G1") {
				System.out.println("You are eligible for G2");
			} else if (licenseLevel == "G2") {
				System.out.println("You are eligible for G");
			} else if (licenseLevel == "NO") {
				System.out.println("You are eligible for G1");
			} else if (licenseLevel == "G") {
				System.out.println("You already have G License");
			}
		} else {
			System.out.println("Not Eligible for a driving license");
		}
	}
}
