package licenseEligibility;

//Main class to run the program
public class LicenseMain {
	public static void main(String[] args) {
		LicenseAuthority license = new LicenseAuthority();
		license.age = 18;
		license.licenseLevel = "NO";
		license.checkLicense();

	}
}