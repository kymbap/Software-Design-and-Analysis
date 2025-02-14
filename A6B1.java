import java.util.ArrayList;
import java.util.Scanner;

public class A6B1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish): ");

        while (true){
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")){
                break;
            }

            try {
                int number = Integer.parseInt(input);
                list.add(number);
            } catch (NumberFormatException e){
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        scanner.close();

        System.out.println(list);
    }
}
