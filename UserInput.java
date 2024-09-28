import java.util.Scanner;

public class UserInput {
    
    public void userChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to calculate Y for yes/N for no");
        String userChoice = scan.nextLine();
        if (userChoice.equalsIgnoreCase("y")) {
            System.out.println("Choose + , - , x , / , % ");
            Calculation operations = CalculationFactory.getCalculationMethod(scan.nextLine());
            operations.makeCalculation();
        }else if (userChoice.equalsIgnoreCase("n")) {
            System.exit(0);
        } else{
            System.out.println("Please Enter Y or N");
            userChoice();
        }
    }
}
