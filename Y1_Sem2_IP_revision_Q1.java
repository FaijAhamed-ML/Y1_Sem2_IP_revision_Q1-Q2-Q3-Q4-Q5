public class Y1_Sem2_IP_revision_Q1 {
    public static void main(String[] args) {

        int miles;
        int yards;
        double kilometers;

        miles = 26;
        yards = 385;

        kilometers = (miles + (yards / 1760.0)) * 1.609;

        System.out.println("The distance in kilometers is: " + kilometers);
    }
}