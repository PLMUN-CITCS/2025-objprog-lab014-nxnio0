public class MethodReturnTypes {
    public static void main(String[] args) {
        displayWelcomeMessage();
        int value1 = 20;
        int value2 = 30;
        double result = caluclateAverage(value1, value2);
        System.out.print("The average is: " + result);
    }
    public static void displayWelcomeMessage(){
        System.out.println("Welcome to our program!");
    }
    public static double caluclateAverage(int num1, int num2){
        double average = (num1 + num2) / 2;
        return average;
    }



}
