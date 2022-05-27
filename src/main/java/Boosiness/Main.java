package Boosiness;

//Bibliotecas gerais
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //TODO validar se este eh o melhor lugar para este cara ficar
        printStringWithIntervalsPerChar(
                "██████  ███████ ███    ███       ██    ██ ██ ███    ██ ██████   ██████\n" +
                        "██   ██ ██      ████  ████       ██    ██ ██ ████   ██ ██   ██ ██    ██\n" +
                        "██████  █████   ██ ████ ██ █████ ██    ██ ██ ██ ██  ██ ██   ██ ██    ██\n" +
                        "██   ██ ██      ██  ██  ██        ██  ██  ██ ██  ██ ██ ██   ██ ██    ██\n" +
                        "██████  ███████ ██      ██         ████   ██ ██   ████ ██████   ██████");
        printStringWithIntervalsPerChar(
                "\n\n\t\t\t\t\t\t █████   ██████\n" +
                        "\t\t\t\t\t\t██   ██ ██    ██\n" +
                        "\t\t\t\t\t\t███████ ██    ██\n" +
                        "\t\t\t\t\t\t██   ██ ██    ██\n" +
                        "\t\t\t\t\t\t██   ██  ██████");
        printColoredOutput(
                "\n\n██████   ██████   ██████  ███████ ██ ███    ██ ███████ ███████ ███████ \n" +
                        "██   ██ ██    ██ ██    ██ ██      ██ ████   ██ ██      ██      ██      \n" +
                        "██████  ██    ██ ██    ██ ███████ ██ ██ ██  ██ █████   ███████ ███████ \n" +
                        "██   ██ ██    ██ ██    ██      ██ ██ ██  ██ ██ ██           ██      ██ \n" +
                        "██████   ██████   ██████  ███████ ██ ██   ████ ███████ ███████ ███████", RED);

        Scanner entrada = new Scanner(System.in);
        System.out.println("\nPressione ENTER para continuar");
        entrada.nextLine();

        int escolha = menuSelecao();

        if (escolha == 4) {
            System.out.println("bye");
        } else if (escolha == 2) {

            System.out.println("\nPressione ENTER para continuar");
            entrada.nextLine();

            printStringWithIntervalsPerChar("\nAno: 4078" +
                    "\nCidade: Lugar Nenhum" +
                    "\nEstado: São Void" +
                    "\nPaís: Terra de Ningúem" +
                    "\n\n\tNo Mundo atual, os monstros são os seres com a classe mais baixa da sociedade, mas o que\n" +
                    "acontece quando alguns deles começam um negócio? Isto aconteceu! Agora esses monstros dominam as\n" +
                    "maiores empresas do mundo, sempre dando um jeito de ganhar dinheiro com diversas novas formas de\n" +
                    "negócios, desde estabelecimento, de magias empacotadas e transmutações instantâneas, a que mais\n" +
                    "faz sucesso por ser uma energia renovável, a Biofobia, também conhecida mundialmente como\n" +
                    "Phobia Energy!\n" +
                    "\tEssa energia é produzida através do susto genuíno das humanos ou monstros, mas uma coisa\n" +
                    "é certa: as crianças são aquelas que mais exalam essa energia!\n" +
                    "\n\tA maior fabricante de Biofobia de Terra de Niguém teve que demitir sua antiga gerente da parte de\n" +
                    "contratações, Martha, por conta de uma excesso de raiva, que acabou fazendo com que a empresa\n" +
                    "perdesse diversos patrocinadores.\n" +
                    "\tMeses depois, um demônio do R.M. (Recursos Monstros), por ordens do dono da empresa, contrata um\n" +
                    "novo estagiário para ocupar o antigo lugar de Martha.", 1);

            printStringWithIntervalsPerChar("\n\n\n Você chega na empresa e logo é parado por uma secretária.\n\n");

            caixaDialogoAutomatico("Secretária", "Ei! Pare aí! O que veio fazer aqui?! Quem é você?!");
            printStringWithIntervalsPerChar("Informe seu nome:");
            String nomeJogador=entrada.next();

            caixaDialogoAutomatico("Secretária", "Tá, mas... " + nomeJogador + " de quê? Você não tem sobrenome não??");

            printStringWithIntervalsPerChar("Informe seu sobrenome:");
            String sobrenomeJogador=entrada.next();

            caixaDialogoAutomatico("Secretária", "Oh! Mil perdões! Eu não sabia que era o novo funcionário daqui...");






        }


    }



    public static void printColoredOutput(String text, String fontColor, String backgroundColor) {
        System.out.println(backgroundColor + fontColor + text + RESET);
    }
    public static void printColoredOutput(String text, String fontColor) {
        System.out.println(fontColor + text + RESET);
    }

    static void caixaDialogoAutomatico(String nomeFalante, String fala){
        String topCaixaDialogo = "---------------------------------------------------------------------------------------------------\n";
        String bottomCaixaDialogo = "___________________________________________________________________________________________________\n";
        System.out.println(nomeFalante + ":\n" + topCaixaDialogo);
        printStringWithIntervalsPerChar("\t" + fala + "\n",100);
        System.out.println(bottomCaixaDialogo);
    }

    //TODO mudar e adicionar nomes
    static String sorteadorNomes() {

        ArrayList<String> listaNomes = new ArrayList<>(Arrays.asList(
            "Gorgo", "Liant-me", "Raiiniolam", "Sas-anca", "Pas'phe",
                "Shaxshaxba", "Bimaphan", "Neus-le", "Si-ri", "Ball-dreal",
                "Vros'te", "Nurdrasbel", "Phebaronee", "Ethin", "Thimlarin",
                "Mur'le", "Flautrigre", "Gu-ga", "Siaslisgan", "Chimesiasbe"
        ));

        Collections.shuffle(listaNomes);
        return listaNomes.get(0);
    }

    //TODO mudar e adicionar sobrenomes
    static String sorteadorSobrenomes() {

        ArrayList<String> listaSobrenomes = new ArrayList<>(Arrays.asList(
                "Deueray",  "Phasbemo", "Abafor",   "Lasbra'te", "Be-nex",
                "Partoish", "Je'cell",  "Nebusro",  "Cas-bra",   "Teday",
                "Ha'lus",   "Haag-mur", "Moprubad", "Ormar",     "Riaxthusra",
                "Nevausma", "Tan'o",    "A'neus",   "Bau'fur",   "An-ga",
                "Sulcuīx", "Duquetga", "Koshay", "Tulbael", "Silro",
                "Anvortif", "Jadzitl", "Marabia", "Curane", "Libai"
        ));

        Collections.shuffle(listaSobrenomes);
        return listaSobrenomes.get(0);
    }

    static int sorteadorIdade() {
        int max = 450, min = 18;
        Random num = new Random();
        return num.nextInt(max - min) + min;
    }

    //TODO adicionar mais objetivos
    static String sorteadorObjetivos() {
        ArrayList<String> listaObjetivos = new ArrayList<>(Arrays.asList(
            "Aprimorar meus conhecimentos de susto e assustar o máximo de pessoas que eu pudar para ajudar no crescimento da empresa.",
            "Focar no meu crescimento pessoal e fazer de tudo para me tornar o chefe.",
            "Assustar todas as pessoas existente para crescer a empresa e aumentar meus conhecimento e habilidades.",
            "Adquirir novas habilidades e aprimorar as que já tenho.",
            "Aplicar tudo que aprendi na universidade sustos assustadores.",
            "Crescer, me aprimorar e focar na evolução da empresa."
        ));

        Collections.shuffle(listaObjetivos);
        return listaObjetivos.get(0);
    }

    //TODO adicionar mais característas
    static String sorteadorCaracteristicas() {
        ArrayList<String> listaCaracteristicas = new ArrayList<>(Arrays.asList(
            "Assustador", "Grande",    "Inteligente", "Timido",
            "Estressado", "Assustado", "Fofo"
        ));
        Collections.shuffle(listaCaracteristicas);

        int quantidadeMaximaCaracteristicas = 6;
        Random aleatorio = new Random();
        int quantidadeCaracteristicas = aleatorio.nextInt(quantidadeMaximaCaracteristicas) + 1;

        String caracteristicasMonstro = " ";
        for(int i = 0; i <= quantidadeCaracteristicas; i++) {
            caracteristicasMonstro = caracteristicasMonstro + "-" + listaCaracteristicas.get(i) + ",\n";
        }

        return caracteristicasMonstro;
    }

    //TODO adicionar mais universidades
    static String sorteadorUniversidades() {
        ArrayList<String> listaFormacao = new ArrayList<>(Arrays.asList(
            "Universidade Sustos",                "Universidade Monstros",       "Centro Universitário Void & Darkness",
            "Faculdade Estatual Sullyvan e Mike", "Universidade Sustos e Pulos", "Centro de formação Escuridão Escura"
        ));

        Collections.shuffle(listaFormacao);
        return listaFormacao.get(0);
    }

    //TODO adicionar mais cursos
    static String sorteadorCurso() {
        ArrayList<String> listaCurso = new ArrayList<>(Arrays.asList(
                "Administração", "Ciências do susto", "Análise e Desenvolvimento de Sistemas", "Filosofia do Susto", "Direito",
                "Ciências Contábeis", "Marketing", "Engenharia do medo", "Biologia", "Gestão de Recursos Monstros"
        ));

        Collections.shuffle(listaCurso);
        return listaCurso.get(0);
    }

    static String sorteadorNivelFormacao() {
        ArrayList<String> cursando = new ArrayList<>(Arrays.asList(
                "Cursando 1º Semestre", "Cursando 2º Semestre", "Cursando 3º Semestre",
                "Cursando 4º Semestre", "Cursando 5º Semestre", "Cursando 6º Semestre",
                "Concluído",            "Interrompido",         "Incompleto"
        ));

        Collections.shuffle(cursando);
        return cursando.get(0);
    }

    static void geradorDeCurrículo() {
        printColoredOutput("NOME: ", GREEN);
        System.out.println(sorteadorNomes() + " " + sorteadorSobrenomes());

        printColoredOutput("\n" + "IDADE: ", GREEN);
        System.out.println(sorteadorIdade() + " anos");

        printColoredOutput("\n" + "OBJETIVO: ", GREEN);
        System.out.println(sorteadorObjetivos());

        printColoredOutput("\n" + "CARACTERÍSTICAS: ", GREEN);
        System.out.println(sorteadorCaracteristicas());

        printColoredOutput("\n" + "FORMAÇÃO ACADÊMICA: ", GREEN);
        System.out.println(sorteadorUniversidades());
        System.out.println(sorteadorCurso() + " - " + sorteadorNivelFormacao());
    }

    static int menuSelecao() {
        int menu;
        boolean sair = false;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite o número de 1 a 4 para escolher uma das opções: ");

            System.out.println("1) Instruções");

            System.out.println("2) Jogar");

            System.out.println("3) Créditos");

            System.out.println("4) Sair");

            System.out.print("Digite: ");

            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("=================================================");
                    System.out.println("Instruções:\n ");

                    System.out.println("Avalie currículos e avance as semanas pra ser promovido.");

                    System.out.println("=================================================");

                    break;
                case 2:



                    System.out.println("=================================================");
                    System.out.print("Carregando jogo: ");
                    printStringWithIntervalsPerChar("██████████████████████████████████████████████████████████████████");
                    System.out.println("\n Conclúido!\n");
                    sair = true;

                    break;
                case 3:
                    System.out.println("=================================================");
                    System.out.println("Créditos:");

                    System.out.println("Jogo criador por: \n\n" +
                            "Felipe Brenner\n" +
                            "Gustavo Gonzalez\n" +
                            "Henrick Adrian\n" +
                            "Julio Honda\n" +
                            "Leonardo Fujimura\n");
                    System.out.println("=================================================");
                    break;
                case 4:
                    System.out.println("=================================================");
                    System.out.println("Sair");
                    System.out.println("okay....");
                    System.out.println("=================================================");
                    sair = true;

                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (!sair);

        return menu;

    }

    static void printStringWithIntervalsPerChar(String string){
        // dahora, mt bom
        for (int i = 0; i < string.length(); i++) {

            System.out.print(string.charAt(i));
            try {
                Thread.sleep(35);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static void printStringWithIntervalsPerChar(String string, int intervaloMiliSegundos){
        // dahora, mt bom
        for (int i = 0; i < string.length(); i++) {

            System.out.print(string.charAt(i));
            try {
                Thread.sleep(intervaloMiliSegundos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
}