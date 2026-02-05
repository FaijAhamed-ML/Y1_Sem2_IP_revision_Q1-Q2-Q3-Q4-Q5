public class Y1_Sem2_IP_revision_Q3 {
    
}
class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return true; 
        } else {
            return false; 
        }
    }
}
class Demo {
    public static void main(String[] args) {

        EvenOddNumber checker = new EvenOddNumber();

        int num1 = 10;
        int num2 = 7;

        boolean result1 = checker.findEvenOrOdd(num1);
        if (result1 == true) {
            System.out.println(num1 + " is an Even number.");
        } else {
            System.out.println(num1 + " is an Odd number.");
        }
        if (checker.findEvenOrOdd(num2)) {
            System.out.println(num2 + " is an Even number.");
        } else {
            System.out.println(num2 + " is an Odd number.");
        }
    }
}

