package Gaming.telas;

import Gaming.utill;
import Gaming.telas.Mapa1.Mapa1;

public class Prologo {
    public static void run(){
        System.out.println("Em uma casa havia um homem chamado Edgar, um homem de 20 anos que vivia de trabalho para sustentar sua familia, ele vivia de corte de cana de açucar.");
        System.err.println("ele vivia na costa do Brasil na epoca de 1870 ate que o inveno chega para ele, poren naquele ano havia uma frente fria enorme cobrindo toda o Brasil, sem ter um sustento o Edgar parte a caminho da cidade mais proxima para poder trabalhar");
        utill.teclaToContinue();
        System.out.println("voce entra pela porta da cidade, entao voce decide ver o primeiro bairro");
        System.out.println("quer uma breve descriçao de como é o lugar ? 1 = sim / 2 = nao");
        int detalhes = utill.escolha();
        if (detalhes == 1) {
            System.out.println(
                    "o lugar fede muito, poren ainda existe algumas lojas por perto, eu so tenho que ter cuidado com algumas pessoas");
        }
        Mapa1.cap1();
    }
}
