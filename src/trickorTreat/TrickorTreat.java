package trickorTreat;

public class TrickorTreat {
	int noOfChocolates;
	void trickOrTreat() {
		do {
			System.out.println("Trick or Treat");
			noOfChocolates++;
			System.out.println("Go to next House");
			System.out.println("Total Chocolates Collected = "+noOfChocolates);
		}while (noOfChocolates<10);
	}
}
