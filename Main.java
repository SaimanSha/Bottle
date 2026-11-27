import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void simulateBottle(int ID) throws FileNotFoundException {
        File file = new File("bottles.txt");
        Scanner scan = new Scanner(file);
        for (int i = 1; i < ID; i++) { scan.nextLine(); }
        String str = scan.nextLine();
        System.out.println("Info: " + str);
        System.out.println(Bottle.simulateList(str));
        scan.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        /* 
            Bottle water = new Bottle(1000.0);
            water.updateAmount(400.0);
            water.updateAmount(100.0);
            water.updateAmount(300.0);
            Bottle shampoo = new Bottle(40.0);
            shampoo.updateAmount(30.0);
            shampoo.updateAmount(1.0);
        */

        File file = new File("bottles.txt");
        Scanner scan = new Scanner(file);
        double count = 0.0;
        while(scan.hasNextLine()) {
            String str = scan.nextLine();
            double fill = Bottle.simulateList(str);
            count += fill;
            System.out.print(fill + " ");
        }
        System.out.println();
        System.out.println(count);
        scan.close();
    }
}
