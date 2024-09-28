public class CalculationFactory {
    public static Calculation getCalculationMethod(String userChoice) {
        Calculation operations= null;
        switch (userChoice) {
            case "+":
                operations = new Addition();
                return operations;
            case "-":
                operations = new Substraction();
                return operations;
            case "x":
                operations = new Multiplication();
                return operations;
            case "/":
                operations = new Division();
                return operations;
            case "%":
                operations = new Modulus();
                return operations;
            default:
                System.out.println("Thank you so much");
                break;
        }
        return operations;
    }
}
