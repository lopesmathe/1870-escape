package Gaming;

import java.util.Scanner;
import Gaming.telas.*;;

public class utill {
    public static void teclaToContinue(){
        System.out.println("aperta qualquer tecla para continuar");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }

    public static int escolha(){
        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();
        scan.nextLine();
        return escolha;
    }
}
