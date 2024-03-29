package grade;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Command {
    public static void main(String[] args) {
        
        try {
            String name, grade, input;
            int score;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a grade: ");
            input = sc.nextLine();
            sc.close();

            FileReader infile = new FileReader("D:/java/Grade.txt");
            sc = new Scanner(infile); // Aggregation or Composite
            
            while (sc.hasNext()) {
                name = sc.next();
                grade = sc.next();
                score = sc.nextInt();
                if (grade.equals(input)) {
                    System.out.println(name + "\t" + score);
                }
            }
            sc.close();

        } catch (IOException e) {
            System.err.println("An error occurred.");
        }
        
    }

}
