import java.util.Scanner;

public interface Calculation {
    public abstract void makeCalculation();
}

class Addition implements Calculation {
    @Override
    public void makeCalculation() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Number 1 : ");
            String userNum1 = scan.nextLine();
            System.out.print("Number 2 : ");
            String userNum2 = scan.nextLine();

            if (!userNum1.contains(".") && !userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                int result = add(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && !userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                double result = add(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (!userNum1.contains(".") && userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = add(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = add(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Please Enter correct character!");
            makeCalculation();
        }
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, int num2) {
        return num1 + num2;
    }

    public double add(int num1, double num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }
}

class Substraction implements Calculation {
    @Override
    public void makeCalculation() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Number 1 : ");
            String userNum1 = scan.nextLine();
            System.out.print("Number 2 : ");
            String userNum2 = scan.nextLine();

            if (!userNum1.contains(".") && !userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                int result = substract(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && !userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                double result = substract(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (!userNum1.contains(".") && userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = substract(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = substract(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Please Enter correct character!");
            makeCalculation();
        }
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public double substract(double num1, int num2) {
        return num1 - num2;
    }

    public double substract(int num1, double num2) {
        return num1 - num2;
    }

    public double substract(double num1, double num2) {
        return num1 - num2;
    }

}

class Multiplication implements Calculation {
    @Override
    public void makeCalculation() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Number 1 : ");
            String userNum1 = scan.nextLine();
            System.out.print("Number 2 : ");
            String userNum2 = scan.nextLine();

            if (!userNum1.contains(".") && !userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                int result = multiply(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && !userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                double result = multiply(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (!userNum1.contains(".") && userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = multiply(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = multiply(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Please Enter correct character!");
            makeCalculation();
        }
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double multiply(double num1, int num2) {
        return num1 * num2;
    }

    public double multiply(int num1, double num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
}

class Division implements Calculation {
    @Override
    public void makeCalculation() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Number 1 : ");
            String userNum1 = scan.nextLine();
            System.out.print("Number 2 : ");
            String userNum2 = scan.nextLine();

            if (!userNum1.contains(".") && !userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                int result = divide(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && !userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                double result = divide(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (!userNum1.contains(".") && userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = divide(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = divide(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Please Enter correct character!");
            makeCalculation();
        }
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public double divide(double num1, int num2) {
        return num1 / num2;
    }

    public double divide(int num1, double num2) {
        return num1 / num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

}

class Modulus implements Calculation{
    @Override
    public void makeCalculation() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Number 1 : ");
            String userNum1 = scan.nextLine();
            System.out.print("Number 2 : ");
            String userNum2 = scan.nextLine();

            if (!userNum1.contains(".") && !userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                int result = modulus(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && !userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                int userNum2InInteger = Integer.parseInt(userNum2);
                double result = modulus(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (!userNum1.contains(".") && userNum2.contains(".")) {
                int userNumInInteger = Integer.parseInt(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = modulus(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            } else if (userNum1.contains(".") && userNum2.contains(".")) {
                double userNumInInteger = Double.parseDouble(userNum1);
                double userNum2InInteger = Double.parseDouble(userNum2);
                double result = modulus(userNumInInteger, userNum2InInteger);
                System.out.println("Answer : " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Please Enter correct character!");
            makeCalculation();
        }
    }

    public int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public double modulus(double num1, int num2) {
        return num1 % num2;
    }

    public double modulus(int num1, double num2) {
        return num1 % num2;
    }

    public double modulus(double num1, double num2) {
        return num1 % num2;
    } 

}
