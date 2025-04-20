package java3;

public class Condition {
    static int number = 100;

    public void compare (int rand) {
        if (rand > number) {
            System.out.println("The random number is greater than 100");
        } else if (rand < number) {
            System.out.println("The random number is less than 100");
        } else {
            System.out.println("The random number is equal to 100");
        }
    }

    public static void main(String[] args) {
        Condition condition = new Condition();
        int rand = (int) (Math.random() * 200);
        System.out.println("Random number: " + rand);
        condition.compare(rand);
    }
}
