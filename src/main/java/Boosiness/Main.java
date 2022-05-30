package Boosiness;

//Bibliotecas gerais
import java.util.*;
import java.util.Scanner;

public class Main {

    /*
    ============================================================================
              ___   _                           _
             | __| | |  _  _  __ __  ___     _ | |  ___   __ _   ___
             | _|  | | | || | \ \ / / _ \   | || | / _ \ / _` | / _ \
             |_|   |_|  \_,_| /_\_\ \___/    \__/  \___/ \__, | \___/
                                                         |___/
    ============================================================================
     */


    public static void main(String[] args) {

        //TODO validar se este eh o melhor lugar para este cara ficar
        printStringWithIntervalsPerChar(
                "██████  ███████ ███    ███       ██    ██ ██ ███    ██ ██████   ██████\n" +
                        "██   ██ ██      ████  ████       ██    ██ ██ ████   ██ ██   ██ ██    ██\n" +
                        "██████  █████   ██ ████ ██ █████ ██    ██ ██ ██ ██  ██ ██   ██ ██    ██\n" +
                        "██   ██ ██      ██  ██  ██        ██  ██  ██ ██  ██ ██ ██   ██ ██    ██\n" +
                        "██████  ███████ ██      ██         ████   ██ ██   ████ ██████   ██████", 20);
        printStringWithIntervalsPerChar(
                "\n\n\t\t\t\t\t\t █████   ██████\n" +
                        "\t\t\t\t\t\t██   ██ ██    ██\n" +
                        "\t\t\t\t\t\t███████ ██    ██\n" +
                        "\t\t\t\t\t\t██   ██ ██    ██\n" +
                        "\t\t\t\t\t\t██   ██  ██████", 20);
        printColoredOutput(
                "\n\n██████   ██████   ██████  ███████ ██ ███    ██ ███████ ███████ ███████ \n" +
                        "██   ██ ██    ██ ██    ██ ██      ██ ████   ██ ██      ██      ██      \n" +
                        "██████  ██    ██ ██    ██ ███████ ██ ██ ██  ██ █████   ███████ ███████ \n" +
                        "██   ██ ██    ██ ██    ██      ██ ██ ██  ██ ██ ██           ██      ██ \n" +
                        "██████   ██████   ██████  ███████ ██ ██   ████ ███████ ███████ ███████ \n", RED_BOLD_BRIGHT);

        Scanner entrada = new Scanner(System.in);
        pressEnterToContinue();

        int escolha = menuSelecao();

        if (escolha == 4) {
            System.out.println("bye");
        } else if (escolha == 2) {

            pressEnterToContinue();

            printStringWithIntervalsPerChar("\nAno: 4078" +
                    "\nCidade: Lugar Nenhum" +
                    "\nEstado: São Void" +
                    "\nPaís: Terra de Ningúem" +
                    "\n\n\tNo Mundo atual, os monstros são os seres com a classe mais baixa da sociedade, mas o que\n" +
                    "acontece quando alguns deles começam um negócio? Bom... Isto aconteceu!\n" +
                    "\tAgora esses monstros dominam as maiores empresas do mundo, sempre dando um jeito de ganhar dinheiro\n" +
                    "com diversas novas formas de negócios, desde estabelecimento, de magias empacotadas e transmutações\n" +
                    "instantâneas, a que mais faz sucesso por ser uma energia renovável, a Biofobia, também conhecida\n" +
                    "mundialmente como Phobia Energy!\n" +
                    "\tEssa energia é produzida através do susto genuíno das humanos ou monstros, mas uma coisa\n" +
                    "é certa: as crianças são aquelas que mais exalam essa energia!\n" +
                    "\n\tA maior fabricante de Biofobia de Terra de Niguém teve que demitir sua antiga gerente da parte de\n" +
                    "contratações, Martha, por conta de uma excesso de raiva, que acabou fazendo com que a empresa\n" +
                    "perdesse diversos patrocinadores.\n" +
                    "\tMeses depois, um demônio do R.M. (Recursos Monstros), por ordens do dono da empresa, contrata um\n" +
                    "novo estagiário para ocupar o antigo lugar de Martha.", 35);

            pressEnterToContinue();

            printColoredOutput("\n\n\n Você chega na empresa e logo é parado por uma secretária.\n",RED_BOLD_BRIGHT);

            pressEnterToContinue();

            caixaDialogoAutomatico("Secretária", "Ei! Pare aí! O que veio fazer aqui?! Quem é você?!");
            printColoredOutput("\nInforme seu nome:\n",RED_BOLD_BRIGHT);
            String nomeJogador = entrada.next();

            caixaDialogoAutomatico("Secretária", "Tá, mas... \"" + nomeJogador + "\" de quê? Você não tem sobrenome não??");

            printColoredOutput("Informe seu sobrenome:\n",RED_BOLD_BRIGHT);
            String sobrenomeJogador = entrada.next();

            String fullNameJogador = nomeJogador + " " + sobrenomeJogador;

            caixaDialogoAutomatico("Secretária", "Oh! Mil perdões " + fullNameJogador+"\nVenha comigo ^^\nVou te levar até um sala para fazer alguns testes antes de te aprovar na empresa!");

            printColoredOutput("Você acompanha a secretária até a sala.\n",RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            caixaDialogoAutomatico("Secretária", "Tenho aqui 3 currículos de teste para sabermos se você dá conta\nResponda esses 3 para que eu possa te avaliar.");

            if(curriculosTutorial()<=3){
                System.out.println("Apurando resultados: ");
                printStringWithIntervalsPerCharWithColor("████████████████████████████████████████████████████████████████████", RED_BOLD_BRIGHT);

                caixaDialogoAutomatico("Secretária", "Infelizmente não podemos te aceitar na empresa...\n" +
                        "Espero que entenda...");

                printStringWithIntervalsPerChar("Você Não foi aprovado na empresa\n\n");
                printStringWithIntervalsPerChar(" ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ██ \n" +
                        "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ██ \n" +
                        "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ██ \n" +
                        "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██    \n" +
                        " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ██",100);

            }else {

                System.out.println("Apurando resultados: ");
                printStringWithIntervalsPerCharWithColor("████████████████████████████████████████████████████████████████████", RED_BOLD_BRIGHT);

                caixaDialogoAutomatico("Secretária", "Parece que você pegou o jeito já! ^^\nAgora é com você!\nVou te levar até sua sala.");
                simulacaoCarregamento();

                caixaDialogoAutomatico("Secretária","Essa aqui é sua sala. Está um pouco bagunçada por conta da última pessoa que esteve nela...");

                printColoredOutput("\nVocê olha ao redor e vê muitas teias de aranhas e que os armários estão todos empoeirados.\n",RED_BOLD_BRIGHT);

                pressEnterToContinue();

                printColoredOutput("\nAlguém se aproxima...\n",RED_BOLD_BRIGHT);

                pressEnterToContinue();

                caixaDialogoAutomatico("????", "Você deve ser o novo contratado! Prazer, sou o Karbu Miosa, gerente daqui!");

                printColoredOutput("\nKarbu decide te contar sobre a empresa\n",RED_BOLD_BRIGHT);

                caixaDialogoAutomatico("Karbu Miosa", "Como é seu primeiro dia, não pegaremos leve com você ^^\n" +
                        "Você é sangue novo, então vai aguentar bastante!\n" +
                        "Te vejo na pausa do almoço, isso se você sobreviver até lá!");

                printColoredOutput("\nKarbu vira de costas e sai andando rindo alto de forma maléfica\n",RED_BOLD_BRIGHT);

                pressEnterToContinue();

                caixaDialogoAutomatico("Secretária", "Bom, preciso voltar pro meu posto. Boa sorte!");
                printColoredOutput("\nA secretária se despede e volta para seu posto",RED_BOLD_BRIGHT);


            }

        }
    }

    /*
    ============================================================================
                                 _
                              _ | |  ___   __ _   ___
                             | || | / _ \ / _` | / _ \
                              \__/  \___/ \__, | \___/
                                          |___/
     ============================================================================
     */

    static int curriculosTutorial() {
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        ArrayList<String> curriculos = new ArrayList<String>();

        curriculos.add("============================================================================================\n" +
                "\n" +
                "                           Curriculum Vitae\n" +
                "\n" +
                "NOME:\nAlberto Nobrega" +
                "\n" +
                "\n" +
                "IDADE: \n176 anos" +
                "\n" +
                "\n" +
                "OBJETIVO:\nAprimorar meus conhecimentos de susto e assustar o máximo de pessoas que eu pudar para ajudar no crescimento da empresa." +
                "\n" +
                "\n" +
                "CARACTERÍSTICAS:\n- Assustador,\n- Dentes afiados,\n- Grande." +
                "\n" +
                "\n" +
                "FORMAÇÃO ACADÊMICA:\nCentro Universitário Void & Darkness\nCiências do susto - Concluído" +
                "\n" +
                "\n" +
                "============================================================================================");

        curriculos.add("============================================================================================\n" +
                "\n" +
                "                           Curriculum Vitae\n" +
                "\n" +
                "NOME:\nFillp xar-lart" +
                "\n" +
                "\n" +
                "IDADE: \n385 anos" +
                "\n" +
                "\n" +
                "OBJETIVO:\nAdquirir novas habilidades e aprimorar as que já tenho." +
                "\n" +
                "\n" +
                "CARACTERÍSTICAS:\n- Inteligente,\n- Carismático,\n- Quadrúpede,\n- Escamoso,\n- Timido." +
                "\n" +
                "\n" +
                "FORMAÇÃO ACADÊMICA:\nUniversidade Sustos e Pulos\nEngenharia do medo - Cursando 3º Semestre" +
                "\n" +
                "\n" +
                "============================================================================================");

        curriculos.add("============================================================================================\n" +
                "\n" +
                "                           Curriculum Vitae\n" +
                "\n" +
                "NOME:\nVexar Tarkov" +
                "\n" +
                "\n" +
                "IDADE: \n231 anos" +
                "\n" +
                "\n" +
                "OBJETIVO:\nAprimorar meus conhecimentos de susto e assustar o máximo de pessoas que eu pudar para ajudar no crescimento da empresa." +
                "\n" +
                "\n" +
                "CARACTERÍSTICAS:\n- Baixo,\n- Medroso." +
                "\n" +
                "\n" +
                "FORMAÇÃO ACADÊMICA:\nUniversidade Sustos\nMarketing - Incompleto" +
                "\n" +
                "\n" +
                "============================================================================================");

        for (int i = 0; i < 3; i++) {

            System.out.println(curriculos.get(i));

            char aceitarCurriculo = ' ';
            boolean sair = false;

            do {
                System.out.println("Deseja aprovar esse currículo? (S/N)");
                aceitarCurriculo = entrada.next().charAt(0);
                switch (aceitarCurriculo) {
                    case 's':
                    case 'S':
                        sair = true;
                        if (i == 0) {
                            pontos = pontos + 2;
                        } else if (i == 1) {
                            pontos++;
                        } else if (i == 2) {
                            pontos = pontos - 2;
                        }

                        break;

                    case 'n':
                    case 'N':
                        sair = true;
                        if (i == 0) {
                            pontos = pontos - 2;
                        } else if (i == 1) {
                            pontos--;
                        } else if (i == 2) {
                            pontos = pontos + 2;
                        }

                        break;
                    default:
                        System.out.println("Opção inválida");

                }
            } while (!sair);

            switch (i) {
                case 0:
                    caixaDialogoAutomatico("Secretária", "Hmm... Escolha interessante...");
                    break;
                case 1:
                    caixaDialogoAutomatico("Secretária", "Acho que eu faria a mesma escolha ^^");
                    break;
                case 2:
                    caixaDialogoAutomatico("Secretária", "Não sei se essa foi a melhor escolha, mas você que decide.");
                    break;

            }

        }

        return pontos;
    }

    static void pressEnterToContinue(){
        Scanner entrada= new Scanner(System.in);
        printColoredOutput("\nPressione ENTER para continuar\n",RED_BOLD_BRIGHT);
        entrada.nextLine();
    }

    static int menuSelecao() {
        boolean sair = false;
        int opcaoEscolhida;

        do {
            System.out.println("Digite o número de 1 a 4 para escolher uma das opções:");
            printColoredOutput("1) ", RED_BOLD_BRIGHT);
            System.out.println("Instruções");
            printColoredOutput("2) ", RED_BOLD_BRIGHT);
            System.out.println("Jogar");
            printColoredOutput("3) ", RED_BOLD_BRIGHT);
            System.out.println("Creditos");
            printColoredOutput("4) ", RED_BOLD_BRIGHT);
            System.out.println("Sair\n");

            printColoredOutput("Digite: ", WHITE_BOLD);
            Scanner entrada = new Scanner(System.in);
            opcaoEscolhida = entrada.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("\n=================================================\n" +
                            "Instruções:\n" +
                            "Avalie currículos e avance as semanas pra ser promovido.\n" +
                            "=================================================\n");

                    break;
                case 2:
                    System.out.println("\n=================================================\n" +
                            "Carregando: ");
                    printStringWithIntervalsPerCharWithColor("████████████████████████████████████████████████████████████████████", RED_BOLD_BRIGHT);

                    sair = true;
                    break;
                case 3:
                    System.out.println("\n=================================================\n" +
                            "Créditos: \n" +
                            "Jogo criador por: \n\n" +
                            "Felipe Brenner\n" +
                            "Gustavo Gonzalez\n" +
                            "Henrick Adrian\n" +
                            "Julio Honda\n" +
                            "Leonardo Fujimura\n" +
                            "=================================================\n");

                    break;
                case 4:
                    System.out.println("\n=================================================\n" +
                            "Sair\n" +
                            "okay....\n" +
                            "=================================================\n");

                    sair = true;
                    break;
                default:
                    printColoredOutput("Opção inválida", RED_BOLD_BRIGHT);
            }
        } while (!sair);

        return opcaoEscolhida;
    }

    static void caixaDialogoAutomatico(String nomeFalante, String fala){
        String topCaixaDialogo = "---------------------------------------------------------------------------------------------------\n";
        String bottomCaixaDialogo = "___________________________________________________________________________________________________\n";
        System.out.println("\n\n" + nomeFalante + ":\n" + topCaixaDialogo);
        printStringWithIntervalsPerChar("" + fala + "\n",100);
        System.out.println(bottomCaixaDialogo);
    }

    static void simulacaoCarregamento(){
        System.out.println("Carregando: ");
        printStringWithIntervalsPerCharWithColor("████████████████████████████████████████████████████████████████████", RED_BOLD_BRIGHT);
    }
    /*
    ============================================================================
                   ___                      _               _
                  / __|  _  _   _ _   _ _  (_)  __   _  _  | |  ___
                 | (__  | || | | '_| | '_| | | / _| | || | | | / _ \
                  \___|  \_,_| |_|   |_|   |_| \__|  \_,_| |_| \___/
     ============================================================================
     */

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
            "Assustador", "Grande", "Inteligente", "Timido",
            "Estressado", "Assustado", "Fofo", "Medroso", "Carismático", "Aventureiro", "Peludo", "Escamoso", "Feio",
                 "Estiloso", "Bonito", "Alto", "Baixo", "Quadrúpede", "Bípede", "Dentes afiados"
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

        System.out.println("============================================================================================");

        System.out.println("\n                  Curriculum Vitae\n\n");

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
        System.out.println("============================================================================================");
    }

    static void aceitarCurrículo(){
        Scanner entrada=new Scanner(System.in);
        char aceitarCurriculo=' ';
        boolean sair=false;

        do {
            System.out.println("Deseja aprovar esse currículo? (S/N)");
            aceitarCurriculo = entrada.next().charAt(0);
            switch (aceitarCurriculo){
                case's':
                case'S':
                    sair=true;
                    break;

                case 'n':
                case'N':
                    sair=true;
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }while (!sair);

    }

    /*
    ============================================================================
                              ___         _          _
                             | _ \  _ _  (_)  _ _   | |_
                             |  _/ | '_| | | | ' \  |  _|
                             |_|   |_|   |_| |_||_|  \__|
     ============================================================================
     */

    public static void printColoredOutput(String text, String fontColor, String backgroundColor) {
        System.out.println(backgroundColor + fontColor + text + RESET);
    }
    public static void printColoredOutput(String text, String fontColor) {
        System.out.print(fontColor + text + RESET);
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
        for (int i = 0; i < string.length(); i++) {

            System.out.print(string.charAt(i));
            try {
                Thread.sleep(intervaloMiliSegundos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static void printStringWithIntervalsPerCharWithColor(String string, String fontColor){
        for (int i = 0; i < string.length(); i++) {

            printColoredOutput(String.valueOf(string.charAt(i)), fontColor);
            try {
                Thread.sleep(35);
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