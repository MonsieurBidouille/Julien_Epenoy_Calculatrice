import Calculator.CalculationmkII;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);
            PrintWriter rfile = new PrintWriter("testr.txt");
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                System.out.println(data);
                System.out.println(CalculationmkII.calculation(data));
                rfile.println(CalculationmkII.calculation(data));
            }
            myReader.close();
            rfile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}