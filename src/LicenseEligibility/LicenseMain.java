package LicenseEligibility;

//Main class to run the program
public class LicenseMain {
 public static void main(String[] args) {
	 LicenseAuthority license = new LicenseAuthority();
     license.age = 18;
     license.licenseLevel = "G";
     if (license.age>=16&&license.age<=80) {
    	 System.out.println("Eligible for a driving license.");
    	 if (license.licenseLevel=="G1") {
    		 System.out.println("You are eligible for G2");
    		 }
    		 else if (license.licenseLevel=="G2") {
    			 System.out.println("You are eligible for G");	
    		 }
    		 else if (license.licenseLevel=="NO") {
    			 System.out.println("You are eligible for G1");
    		 } 
    		 else if (license.licenseLevel=="G"){
    			 System.out.println("You already have G License");
    		 }
     }
     else {
    	 System.out.println("Not Eligible for a driving license");
     }
 }
}