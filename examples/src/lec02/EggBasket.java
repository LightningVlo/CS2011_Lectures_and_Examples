package lec02;//Example that shows how to use variables and display output.

public class EggBasket {
    public static void main(String[] args) {
        //Declare your variables.
    	int numberOfBaskets, eggsPerBasket, totalEggs;

    	//Initialize the variables.
        eggsPerBasket = 6;
        numberOfBaskets = 10;

        //Compute the total number of eggs.
        totalEggs = numberOfBaskets * eggsPerBasket;

        //Display the output.
        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets then,");
        System.out.println("the total number of eggs is " +  totalEggs);
    }
}
