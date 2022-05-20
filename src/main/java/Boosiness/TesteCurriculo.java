package Boosiness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TesteCurriculo {

    //TODO mudar e adicionar nomes

    static String sorteadorNomes() {

        ArrayList<String> listaNomes = new ArrayList<>();
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

        return listaNomes.get(0);

    }

    //TODO mudar e adicionar sobrenomes

    static String sorteadorSobrenomes() {

        ArrayList<String> listaSobrenomes = new ArrayList<>();
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

        return listaSobrenomes.get(0);

    }

    // sorteador de idades

    static int sorteadorIdade() {
        int max = 450, min = 18;

        Random num = new Random();

        return num.nextInt(max - min) + min;

    }

    //TODO adicionar mais objetivos

    static String sorteadorObjetivos() {
        ArrayList<String> listaObjetivos = new ArrayList<>();
        listaObjetivos.add("Aprimorar meus conhecimentos de susto e assustar o máximo de pessoas que eu pudar para ajudar no crescimento da empresa.");
        listaObjetivos.add("Focar no meu crescimento pessoal e fazer de tudo para me tornar o chefe.");
        listaObjetivos.add("Assustar todas as pessoas existente para crescer a empresa e aumentar meus conhecimento e habilidades.");
        listaObjetivos.add("Adquirir novas habilidades e aprimorar as que já tenho.");
        listaObjetivos.add("Aplicar tudo que aprendi na universidade sustos assustadores.");
        listaObjetivos.add("Crescer, me aprimorar e focar na evolução da empresa.");

        Collections.shuffle(listaObjetivos);

        return listaObjetivos.get(0);
    }

    //TODO adicionar mais característas

    static String sorteadorCaracteristicas() {

        String caracteristicasMonstro = " ";

        ArrayList<String> listaCaracteristicas = new ArrayList<>();
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

        int quantidade = aleatorio.nextInt(maximo) + 1;

        switch (quantidade) {
            case 1:
                caracteristicasMonstro = listaCaracteristicas.get(0);
                break;
            case 2:
                caracteristicasMonstro = listaCaracteristicas.get(0) + ",\n" +
                        listaCaracteristicas.get(1);
                break;
            case 3:
                caracteristicasMonstro = listaCaracteristicas.get(0) + ",\n" +
                        listaCaracteristicas.get(1) + ",\n" +
                        listaCaracteristicas.get(2);
                break;
            case 4:
                caracteristicasMonstro = listaCaracteristicas.get(0) + ",\n" +
                        listaCaracteristicas.get(1) + ",\n" +
                        listaCaracteristicas.get(2) + ",\n" +
                        listaCaracteristicas.get(3);
                break;
            case 5:
                caracteristicasMonstro = listaCaracteristicas.get(0) + ",\n" +
                        listaCaracteristicas.get(1) + ",\n" +
                        listaCaracteristicas.get(2) + ",\n" +
                        listaCaracteristicas.get(3) + ",\n" +
                        listaCaracteristicas.get(4);
                break;
            case 6:
                caracteristicasMonstro = listaCaracteristicas.get(0) + ",\n" +
                        listaCaracteristicas.get(1) + ",\n" +
                        listaCaracteristicas.get(2) + ",\n" +
                        listaCaracteristicas.get(3) + ",\n" +
                        listaCaracteristicas.get(4) + ",\n" +
                        listaCaracteristicas.get(5);

                break;
        }

        return caracteristicasMonstro;
    }

    //TODO adicionar mais universidades

    static String sorteadorUniversidades() {
        ArrayList<String> listaFormacao = new ArrayList<>();
        listaFormacao.add("Universidade Sustos");
        listaFormacao.add("Universidade Monstros");
        listaFormacao.add("Centro Universitário Void & Darkness");
        listaFormacao.add("Faculdade Estatual Sullyvan e Mike");
        listaFormacao.add("Universidade Sustos e Pulos");
        listaFormacao.add("Centro de formação Escuridão Escura");

        Collections.shuffle(listaFormacao);

        return listaFormacao.get(0);
    }

    //TODO adicionar mais cursos

    static String sorteadorCurso() {
        ArrayList<String> listaCurso = new ArrayList<>();
        listaCurso.add("Administração");
        listaCurso.add("Ciências do susto");
        listaCurso.add("Análise e Desenvolvimento de Sistemas");
        listaCurso.add("Filosofia do Susto");
        listaCurso.add("Direito");
        listaCurso.add("Ciências Contábeis");
        listaCurso.add("Marketing");
        listaCurso.add("Engenharia do medo");
        listaCurso.add("Biologia");
        listaCurso.add("Gestão de Recursos Monstros");

        Collections.shuffle(listaCurso);

        return listaCurso.get(0);
    }

    // sorteador de nível de formação

    static String nivelFormacao() {
        ArrayList<String> cursando = new ArrayList<>();
        cursando.add("Cursando 1º Semestre");
        cursando.add("Cursando 2º Semestre");
        cursando.add("Cursando 3º Semestre");
        cursando.add("Cursando 4º Semestre");
        cursando.add("Cursando 5º Semestre");
        cursando.add("Cursando 6º Semestre");
        cursando.add("Concluído");
        cursando.add("Interrompido");
        cursando.add("Incompleto");

        Collections.shuffle(cursando);
        return cursando.get(0);
    }

    public static void main(String[] args) {

        ConsoleColors.printColoredOutput("NOME: ", ConsoleColors.GREEN);
        System.out.println(sorteadorNomes() + " " + sorteadorSobrenomes());

        ConsoleColors.printColoredOutput("\n" + "IDADE: ", ConsoleColors.GREEN);
        System.out.println(sorteadorIdade() + " anos");

        ConsoleColors.printColoredOutput("\n" + "OBJETIVO: ", ConsoleColors.GREEN);
        System.out.println(sorteadorObjetivos());

        ConsoleColors.printColoredOutput("\n" + "CARACTERÍSTICAS: ", ConsoleColors.GREEN);
        System.out.println(sorteadorCaracteristicas());

        ConsoleColors.printColoredOutput("\n" + "FORMAÇÃO ACADÊMICA: ", ConsoleColors.GREEN);
        System.out.println(sorteadorUniversidades());
        System.out.println(sorteadorCurso() + " - " + nivelFormacao());

    }

}
