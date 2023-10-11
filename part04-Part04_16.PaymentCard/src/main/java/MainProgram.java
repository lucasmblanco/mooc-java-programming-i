
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulCard = new PaymentCard(20.0);
        PaymentCard mattCard = new PaymentCard(30.0);
        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println("Paul: " + paulCard.toString());
        System.out.println("Matt: " + mattCard.toString());
        paulCard.addMoney(20.0);
        mattCard.eatHeartily();
        System.out.println("Paul: " + paulCard.toString());
        System.out.println("Matt: " + mattCard.toString());
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50.0);
        System.out.println("Paul: " + paulCard.toString());
        System.out.println("Matt: " + mattCard.toString());
    }
}
