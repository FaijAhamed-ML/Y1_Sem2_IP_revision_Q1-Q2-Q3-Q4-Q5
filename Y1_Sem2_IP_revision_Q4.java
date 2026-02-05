public class Y1_Sem2_IP_revision_Q4 {
public static void main(String[] args) {
        
        System.out.println("Using while loop");
        
        int row = 1;
        while (row <= 5) { 
            int col = 1;
            while (col <= 5) { 
                System.out.print("* "); 
                col++;
            }
            System.out.println(); 
            row++;
        }

        System.out.println();

        System.out.println("Using for loop");

        for (int i = 1; i <= 5; i++) {

            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
   
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
    }
}
}
