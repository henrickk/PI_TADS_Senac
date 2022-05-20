package Boosiness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import static utils.ConsoleColors.*;

public class TesteCurriculo {

    //TODO mudar e adicionar nomes

    static String sorteadorNomes(){

        ArrayList<String>listaNomes=new ArrayList<String>();
        listaNomes.add("Gorgo");
        listaNomes.add("Liant-me");
        listaNomes.add("Raiiniolam");
        listaNomes.add("Sas-anca");
        listaNomes.add("Pas'phe");
        listaNomes.add("Shaxshaxba");
        listaNomes.add("Bimaphan");
        listaNomes.add("Neus-le");
        listaNomes.add("Si-ri");
        listaNomes.add("Ball-dreal");
        listaNomes.add("Vros'te");
        listaNomes.add("Nurdrasbel");
        listaNomes.add("Phebaronee");
        listaNomes.add("Ethin");
        listaNomes.add("Thimlarin");
        listaNomes.add("Mur'le");
        listaNomes.add("Flautrigre");
        listaNomes.add("Gu-ga");
        listaNomes.add("Siaslisgan");
        listaNomes.add("Chimesiasbe");

        Collections.shuffle(listaNomes);

        String nomeMonstro=listaNomes.get(0);

        return nomeMonstro;

    }

    //TODO mudar e adicionar sobrenomes

    static String sorteadorSobrenomes(){

        ArrayList<String>listaSobrenomes=new ArrayList<String>();
        listaSobrenomes.add("Deueray");
        listaSobrenomes.add("Phasbemo");
        listaSobrenomes.add("Abafor");
        listaSobrenomes.add("Lasbra'te");
        listaSobrenomes.add("Be-nex");
        listaSobrenomes.add("Partoish");
        listaSobrenomes.add("Je'cell");
        listaSobrenomes.add("Nebusro");
        listaSobrenomes.add("Cas-bra");
        listaSobrenomes.add("Teday");
        listaSobrenomes.add("Ha'lus");
        listaSobrenomes.add("Haag-mur");
        listaSobrenomes.add("Moprubad");
        listaSobrenomes.add("Ormar");
        listaSobrenomes.add("Riaxthusra");
        listaSobrenomes.add("Nevausma");
        listaSobrenomes.add("Tan'o");
        listaSobrenomes.add("A'neus");
        listaSobrenomes.add("Bau'fur");
        listaSobrenomes.add("An-ga");
        listaSobrenomes.add("Sulcuīx");
        listaSobrenomes.add("Duquetga");
        listaSobrenomes.add("Koshay");
        listaSobrenomes.add("Tulbael");
        listaSobrenomes.add("Silro");
        listaSobrenomes.add("Anvortif");
        listaSobrenomes.add("Jadzitl");
        listaSobrenomes.add("Marabia");
        listaSobrenomes.add("Curane");
        listaSobrenomes.add("Libai");

        Collections.shuffle(listaSobrenomes);

        String sobrenomeMonstro=listaSobrenomes.get(0);

        return sobrenomeMonstro;

    }

    //TODO adicionar mais característas

    static String sorteadorCaracteristicas(){

        String  caracteristicasMonstro=" ";

            ArrayList<String> listaCaracteristicas = new ArrayList<String>();
            listaCaracteristicas.add("Assustador");
            listaCaracteristicas.add("Grande");
            listaCaracteristicas.add("Inteligente");
            listaCaracteristicas.add("Tímido");
            listaCaracteristicas.add("Estressado");
            listaCaracteristicas.add("Assustado");
            listaCaracteristicas.add("Fofo");

            Collections.shuffle(listaCaracteristicas);

            int maximo = 6;

            Random aleatorio = new Random();

            int quantidade = aleatorio.nextInt(maximo) +1;

            switch (quantidade){
                case 1:
                    caracteristicasMonstro=listaCaracteristicas.get(0);
                    break;
                case 2:
                    caracteristicasMonstro=listaCaracteristicas.get(0) + ",\n" +
                    listaCaracteristicas.get(1);
                    break;
                case 3:
                    caracteristicasMonstro=listaCaracteristicas.get(0) + ",\n" +
                    listaCaracteristicas.get(1) + ",\n" +
                    listaCaracteristicas.get(2);
                    break;
                case 4:
                    caracteristicasMonstro=listaCaracteristicas.get(0) + ",\n" +
                    listaCaracteristicas.get(1) + ",\n" +
                    listaCaracteristicas.get(2) + ",\n" +
                    listaCaracteristicas.get(3);
                    break;
                case 5:
                    caracteristicasMonstro=listaCaracteristicas.get(0) + ",\n" +
                    listaCaracteristicas.get(1) + ",\n" +
                    listaCaracteristicas.get(2) + ",\n" +
                    listaCaracteristicas.get(3) + ",\n" +
                    listaCaracteristicas.get(4);
                    break;
                case 6:
                    caracteristicasMonstro=listaCaracteristicas.get(0) + ",\n" +
                    listaCaracteristicas.get(1) + ",\n" +
                    listaCaracteristicas.get(2) + ",\n" +
                    listaCaracteristicas.get(3) + ",\n" +
                    listaCaracteristicas.get(4) + ",\n" +
                    listaCaracteristicas.get(5);

                    break;
            }

        return caracteristicasMonstro;
    }

    public static void main(String[] args) {

        String nomeMonstro=sorteadorNomes();
        String sobrenomeMonstro=sorteadorSobrenomes();
        String caracteristicasMonstro=sorteadorCaracteristicas();

        coloredOutput("NOME: ", GREEN);
        System.out.println(nomeMonstro + " " + sobrenomeMonstro);
        coloredOutput("\n" + "CARACTERÍSTICAS: ", GREEN);
        System.out.println(caracteristicasMonstro);


    }

}
