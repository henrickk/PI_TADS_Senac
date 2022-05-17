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
        listaNomes.add("Leonardo");
        listaNomes.add("Julio");
        listaNomes.add("Henrick");
        listaNomes.add("Felipe");
        listaNomes.add("Gustavo");

        Collections.shuffle(listaNomes);

        int maximo=listaNomes.size();

        Random random=new Random();

        int numRandom= random.nextInt(maximo);

        String nomeMonstro=listaNomes.get(numRandom);

        return nomeMonstro;

    }

    //TODO mudar e adicionar sobrenomes

    static String sorteadorSobrenomes(){

        ArrayList<String>listaSobrenomes=new ArrayList<String>();
        listaSobrenomes.add("Fujimura");
        listaSobrenomes.add("Honda");
        listaSobrenomes.add("Adrian");
        listaSobrenomes.add("Brenner");
        listaSobrenomes.add("Gonzales");

        Collections.shuffle(listaSobrenomes);

        int maximo=listaSobrenomes.size();

        Random random=new Random();

        int numRandom= random.nextInt(maximo);

        String sobrenomeMonstro=listaSobrenomes.get(numRandom);

        return sobrenomeMonstro;

    }

    //TODO adicionar mais característas e implementar sistema de puxar mais de uma

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

        coloredOutput("Nome: ", GREEN);
        System.out.println(nomeMonstro + " " + sobrenomeMonstro);
        coloredOutput("\n" + "Características: ", GREEN);
        System.out.println(caracteristicasMonstro);


    }

}
