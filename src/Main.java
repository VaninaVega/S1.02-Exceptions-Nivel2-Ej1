
public class Main {
    public static void main(String[] args) {

        byte age = Input.readByte("Enter your age");
        System.out.println("Your age is " + age);

        int number = Input.readInt("Enter the year you were born");
        System.out.println("Year is " + number);

        float height = Input.readFloat("Enter your height in meters");
        System.out.println("Your height is " + height);

        double pi = Input.readDouble("Enter the pi number (with 4 decimals)");
        System.out.printf("Pi number is %.4f\n", pi);

        char initial = Input.readChar("Enter the initial of your name");
        System.out.println("Name's initial is " + initial);

        String username = Input.readString("Enter a Username");
        System.out.println("Your Username is " + username);

        boolean answer = Input.readYesNo("Do you like ice-cream");
        System.out.println("Your answer is " + answer);
    }
}