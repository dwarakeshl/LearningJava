package PromoCode;

public class PromoCode {
	double price;
	double billAmount;
	String promoCode;
	public void calculateBillAmount() {
	if (promoCode=="Promo5") {
		billAmount = (price*0.50)*0.95;
    	 System.out.println(billAmount);
	}
    	 else if (promoCode=="Promo10") {
    		 billAmount = (price*0.50)*0.90;
    		 System.out.println(billAmount);
    		 }
    	 else if (promoCode=="Promo15") {
    		 billAmount = (price*0.50)*0.85;
    		 System.out.println(billAmount);
    	 }
    	 else if (promoCode=="Promo20") {
    		 billAmount = (price*0.50)*0.80;
    		 System.out.println(billAmount);
    	 }
     else {
    	 billAmount = price*0.50;
    	 System.out.println(billAmount);
     }
}
}
