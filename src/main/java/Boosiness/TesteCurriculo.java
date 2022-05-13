package Boosiness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

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



            ArrayList<String> listaCaracteristicas = new ArrayList<String>();
            listaCaracteristicas.add("Assustador");
            listaCaracteristicas.add("Grande");
            listaCaracteristicas.add("Inteligente");
            listaCaracteristicas.add("Tímido");
            listaCaracteristicas.add("Estressado");
            listaCaracteristicas.add("Assustado");
            listaCaracteristicas.add("Fofo");

            Collections.shuffle(listaCaracteristicas);

            int maximo = listaCaracteristicas.size();

            Random aleatorio = new Random();

            int numRandom = aleatorio.nextInt(maximo);

          String  caracteristicasMonstro = listaCaracteristicas.get(numRandom);

        return caracteristicasMonstro;
    }

    public static void main(String[] args) {

        String nomeMonstro=sorteadorNomes();
        String sobrenomeMonstro=sorteadorSobrenomes();
        String caracteristicasMonstro=sorteadorCaracteristicas();

        System.out.println("Nome: " + nomeMonstro + " " + sobrenomeMonstro);
        System.out.println("Características: " + caracteristicasMonstro);
    }

}
