import java.util.Random;


public class randomGenerator{
    public static void main(String[] args)
    {

        output("Generate 10 random integers between 0 and 6");

        Random rnd = new Random();

        for (int i = 1; i <= 6; ++i)
        {
            int randomInt = 1 + rnd.nextInt(7);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}