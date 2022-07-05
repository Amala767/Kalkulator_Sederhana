import java.util.Scanner;

/**
 *
 * @author
 */
public class kalkulator2 {
    public static void main(String[]args){
        
    Scanner input = new Scanner(System.in);
    boolean run = true;
    
    while(run){
     run = false;
     
    int angka1, angka2;
    char operator;

    System.out.println("Masukkan angka dan operator (gunakan spasi):");
    
    
    //memasukkan angka ke 1
    angka1 = input.nextInt();

    
    //memasukkan operator
    operator = input.next().charAt(0);

    //memasukkan angka ke 2
    angka2 = input.nextInt();

    switch (operator)
    {
        case '+':
        {; 
            System.out.println(angka1 + angka2);
            break;
        }
        case '-':
        {
            System.out.println(angka1 - angka2);
            break;
        }
        case '*':
        {
            System.out.println(angka1 * angka2);
            break;
        }
        case '/':
        {
            System.out.println(angka1 / angka2);
            break;
        }
        default:
        {
            System.out.println("operator salah");
            run = true;
        }
    }
    }
    
    }
    
}