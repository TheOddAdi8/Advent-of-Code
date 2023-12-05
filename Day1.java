import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int adder = 0;
        int max = 0;

        try {
            File theFile = new File("ElfCalories.txt");
            Scanner scanBot = new Scanner(theFile);
            while (scanBot.hasNextLine()) {
                String data = scanBot.nextLine();

                if (!data.equals("")) {
                    adder += Integer.parseInt(data);
                }
                else if (data.equals("")) {
                    if (adder > max) {
                        max = adder;
                    }
                    adder = 0;
                }
            }
            scanBot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Oops");
            e.printStackTrace();
        }

        System.out.println(max);
    }
}