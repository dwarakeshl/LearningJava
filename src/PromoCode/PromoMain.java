package PromoCode;

public class PromoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PromoCode promo = new PromoCode();
		promo.price = 100;
				promo.promo = "Promo5";
		if (promo.promo=="Promo5") {
			promo.billAmount = (promo.price*0.50)*0.95;
	    	 System.out.println(promo.billAmount);
		}
	    	 else if (promo.promo=="Promo10") {
	    		 promo.billAmount = (promo.price*0.50)*0.90;
	    		 System.out.println(promo.billAmount);
	    		 }
	    	 else if (promo.promo=="Promo15") {
	    		 promo.billAmount = (promo.price*0.50)*0.85;
	    		 System.out.println(promo.billAmount);
	    	 }
	     else {
	    	 promo.billAmount = promo.price*0.50;
	    	 System.out.println(promo.billAmount);
	     }
	}

}
