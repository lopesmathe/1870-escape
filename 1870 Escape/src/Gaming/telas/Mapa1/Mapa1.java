package Gaming.telas.Mapa1;

import Gaming.utill;

public class Mapa1 {
    public static void cap1() {
        System.out.println("tem 4 primeiras ruas qual rua voce vai querer ir");
        int escolha = utill.escolha();
        switch (escolha) {
            case 1:
                System.out.println(
                        "voce vira a rua e se depara com duas casas oque fazer | bater na casa 1, bater na casa 2 | dar meia volta");
                        escolha = utill.escolha();
                        if (escolha == 1) {
                            System.out.println("voce bate na porta da casa e niguem atende oque fazer agr");
                            System.err.println("bater mais forte/dar meia volta");
                            escolha = utill.escolha();
                            if (escolha == 1) {
                                System.out.println("a porta se abre e nela aparece um velho com uma espingarda e ele fala com um tom de raiva");
                                System.out.println("oque voce quer seu negro imundo");
                            }
                            else
                            Mapa1.cap1();
                        }
                        if (escolha == 2) {
                            
                        } else {
                            Mapa1.cap1();
                        }
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

            default:
                break;
        }
    }
}
