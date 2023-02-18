import java.util.Scanner;
public class ModulStudent {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your modul :");
        int modul = sc.nextInt();
        if(modul == 2)
        System.out.println("Student is taking computer Science");
        else 
        System.out.println("Student is taking Biology subject");
    }
}
