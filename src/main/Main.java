package src.main;

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

    public static String execMode = "dev";

    public static void main(String[] args) {

        //TODO validar se este eh o melhor lugar para este cara ficar
        printStringWithIntervalsPerChar(
                "██████  ███████ ███    ███       ██    ██ ██ ███    ██ ██████   ██████\n" +
                        "██   ██ ██      ████  ████       ██    ██ ██ ████   ██ ██   ██ ██    ██\n" +
                        "██████  █████   ██ ████ ██ █████ ██    ██ ██ ██ ██  ██ ██   ██ ██    ██\n" +
                        "██   ██ ██      ██  ██  ██        ██  ██  ██ ██  ██ ██ ██   ██ ██    ██\n" +
                        "██████  ███████ ██      ██         ████   ██ ██   ████ ██████   ██████", 5);
        printStringWithIntervalsPerChar(
                "\n\n\t\t\t\t\t\t █████   ██████\n" +
                        "\t\t\t\t\t\t██   ██ ██    ██\n" +
                        "\t\t\t\t\t\t███████ ██    ██\n" +
                        "\t\t\t\t\t\t██   ██ ██    ██\n" +
                        "\t\t\t\t\t\t██   ██  ██████", 5);
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

            printColoredOutput("\nVocê chega na empresa e logo é parado por uma secretária.\n", RED_BOLD_BRIGHT);

            pressEnterToContinue();

            caixaDialogoAutomatico("Secretária", "Ei! Pare aí! O que veio fazer aqui?! Quem é você?!");
            printColoredOutput("\nInforme seu nome:\n", RED_BOLD_BRIGHT);
            String nomeJogador = entrada.next();

            caixaDialogoAutomatico("Secretária", "Tá, mas... \"" + nomeJogador + "\" de quê? Você não tem sobrenome não??");

            printColoredOutput("Informe seu sobrenome:\n", RED_BOLD_BRIGHT);
            String sobrenomeJogador = entrada.next();

            String fullNameJogador = nomeJogador + " " + sobrenomeJogador;

            caixaDialogoAutomatico("Secretária", "Oh! Mil perdões " + fullNameJogador + "\nVenha comigo ^^\nVou te levar até uma sala para fazer alguns testes antes de te aprovar na empresa!");

            printColoredOutput("Você acompanha a secretária até a sala.\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            caixaDialogoAutomatico("Secretária", "Tenho aqui 3 currículos de teste para sabermos se você dá conta\nResponda esses 3 para que eu possa te avaliar.");

            if (curriculosTutorial() <= 2) {
                System.out.println("Apurando resultados: ");
                printStringWithIntervalsPerCharWithColor("████████████████████████████████████████████████████████████████████", RED_BOLD_BRIGHT);

                caixaDialogoAutomatico("Secretária", "Infelizmente não podemos te aceitar na empresa...\n" +
                        "Espero que entenda...");

                printStringWithIntervalsPerChar("Você Não foi aprovado na empresa\n\n");
                printStringWithIntervalsPerChar(" ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ██ \n" +
                        "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ██ \n" +
                        "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ██ \n" +
                        "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██    \n" +
                        " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ██", 100);
                return;
            }

            System.out.println("Apurando resultados: ");
            printStringWithIntervalsPerCharWithColor("████████████████████████████████████████████████████████████████████", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Secretária", "Parece que você pegou o jeito já! ^^\nAgora é com você!\nVou te levar até sua sala.");
            simulacaoCarregamento();

            caixaDialogoAutomatico("Secretária", "Essa aqui é sua sala. Está um pouco bagunçada por conta da última pessoa que esteve nela...");

            printColoredOutput("\nVocê olha ao redor e vê muitas teias de aranhas e que os armários estão todos empoeirados.\n", RED_BOLD_BRIGHT);

            pressEnterToContinue();

            printColoredOutput("\nAlguém se aproxima...\n", RED_BOLD_BRIGHT);

            pressEnterToContinue();

            caixaDialogoAutomatico("????", "Você deve ser o novo contratado! Prazer, sou o Karbu Miosa, gerente daqui!");

            printColoredOutput("\nKarbu decide te contar sobre a empresa\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", "Como é seu primeiro dia, não pegaremos leve com você ^^\n" +
                    "Você é sangue novo, então vai aguentar bastante!\n" +
                    "Te vejo na pausa do almoço, isso se você sobreviver até lá!");

            printColoredOutput("\nKarbu vira de costas e sai andando rindo alto de forma maléfica\n", RED_BOLD_BRIGHT);

            pressEnterToContinue();

            caixaDialogoAutomatico("Secretária", "Bom, preciso voltar pro meu posto. Boa sorte!");
            printColoredOutput("\nA secretária se despede e volta para seu posto\n", RED_BOLD_BRIGHT);

            printColoredOutput("Você senta na sua cadeira e começa a trabalhar\n\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            /*
            ============================================================================
                          ___                                        _
                         / __|  ___   _ __    __ _   _ _    __ _    / |
                         \__ \ / -_) | '  \  / _` | | ' \  / _` |   | |
                         |___/ \___| |_|_|_| \__,_| |_||_| \__,_|   |_|
             ============================================================================
             */

            printColoredOutput("\n\nSemana 1 - 10:45 A.M.", RED_BOLD_BRIGHT);

            for (int i = 0; i <=1; i++) {

                System.out.printf("\n===================================================================================\n" +
                        "Objetivo semanal: %d/5\n", i);

                geradorDeCurrículo();
                aceitarCurrículo();
            }

            printStringWithIntervalsPerCharWithColor("\nDia 01 - 12:00 P.M. - Pausa Almoço\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            caixaDialogoAutomatico("Karbu Miosa", "Olha só ele! Parece que alguém ainda está vivo!\nEai? Foi tranquilo?");

            caixaDialogoAutomatico("????", "Ah! Então ele que é o novato? Prazer, sou o Roka Hardra, tô aqui há mais de 100 anos");

            printColoredOutput("Você olha para Roka e percebe que os olhos estão profundos e sem cor\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Roka Hardra", "Está tudo bem? Você está me encarando...");

            printColoredOutput("Você vira seu rosto rapidamente e volta a comer sua coxinha\n\n", RED_BOLD_BRIGHT);

            printColoredOutput("Termina o horário de almoço e você volta à sua sala\n", RED_BOLD_BRIGHT);

            for (int i = 2; i <=4; i++) {
                System.out.printf("\n===================================================================================\n" +
                        "Objetivo semanal: %d/5\n", i);
                geradorDeCurrículo();
                aceitarCurrículo();
            }

            //Desafio Semanal

            printColoredOutput("\nChega dia 05 e termina uma semana.\n\nKarbu Miosa entra na sua sala\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", "Eai, novato! Como foi essa semana? Eu esqueci de te contar uma coisa...\n" +
                    "Nessa empresa, todo último dia da semana nós fazemos um desafio para testar seu conhecimento.\n" +
                    "Se prepare para o seu desafio semanal!");

            printColoredOutput("Você se levanta, respira fundo e fala que está preparado!\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            printColoredOutput("\nDesafio Semanal!\n", RED_BOLD_BRIGHT);

            int quantidadeTentativas = 1;
            boolean acertou = false;
            do {
                System.out.println("\nEsta técnica serve para representar genericamente um processo, um conjunto de atividades\n" +
                        "ou parte de um conjunto maior. Por regra geral, o(a) _____________ deve ser construído(a)\n" +
                        "de cima para baixo e da direita para a esquerda, no sentido do formulário, embora essa disposição\n" +
                        "não seja rígida e sirva a princípio apenas para dar ordem à representação gráfica.\n\n" +
                        "Assinale a alternativa que completa corretamente a lacuna anterior.\n");

                System.out.println("______________________________\n");// 30
                System.out.println("a) fluxograma");
                System.out.println("b) organograma");
                System.out.println("c) planilha radial");
                System.out.println("d) diagrama de Ishikawa");

                System.out.println("------------------------------\n");
                System.out.println("Escolha a alternativa digitando entre A e D:\n ");
                System.out.println("------------------------------\n");

                String resposta = entrada.next();
                System.out.println("\n------------------------------\n");// 30

                switch (resposta) {
                    case "a":
                    case "A":
                        System.out.println("Resposta Correta!");
                        acertou = true;
                        break;

                    case "b":
                    case "B":
                    case "c":
                    case "C":
                    case "d":
                    case "D":
                        System.out.println("Resposta Incorreta!!\nTentativa:" + quantidadeTentativas + "/3\n");
                        quantidadeTentativas++;
                        break;

                    default:
                        System.out.println("Resposta inválida!\nTentativa: " + quantidadeTentativas + "/3\n");
                        System.out.println("______________________________\n");
                        quantidadeTentativas++;
                }

            } while (!acertou && quantidadeTentativas <= 3);

            if (!acertou) {
                caixaDialogoAutomatico("Karbu Miosa", "Infelizmente não podemos te manter na empresa...\n" +
                        "Espero que entenda...");

                printStringWithIntervalsPerChar("Você não se provou apto a continuar\n\n");
                printStringWithIntervalsPerChar(" ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ██ \n" +
                        "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ██ \n" +
                        "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ██ \n" +
                        "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██    \n" +
                        " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ██", 100);
                return;
            }

            caixaDialogoAutomatico("Karbu Miosa", "Parabéns, você passou, está liberado!");

            printColoredOutput("Você se levanta, pega suas coisas e vai em direção à saída, mas é parado.\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Secretária",  fullNameJogador + "! Vem aqui!\nEsse é seu crachá. Ficou pronto agora mesmo.\nNunca esqueça ou perca esse crachá!");

            printColoredOutput("Você vai embora pra casa super cansado, toma banho, janta, deita na cama e dorme.\n\n", RED_BOLD_BRIGHT);

            printColoredOutput("Você passa seu final de semana jogando \"League Of Monsters\" e bebendo um energético chamado \"Humans\"",RED_BOLD_BRIGHT);

            printStringWithIntervalsPerCharWithColor("Semana 1 - Dia 07 - Finalizada!\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            /*
            ============================================================================
                          ___
                         / __|  ___   _ __    __ _   _ _    __ _    |_  )
                         \__ \ / -_) | '  \  / _` | | ' \  / _` |    / /
                         |___/ \___| |_|_|_| \__,_| |_||_| \__,_|   /___|
             ============================================================================
             */

            printStringWithIntervalsPerCharWithColor("\n\nSemana 2 - Dia 08 - 8:00 A.M. \n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Secretária", "Olha só! Você voltou! Bom Dia!");

            printColoredOutput("Você dá bom dia um pouco envergonhado e com voz de sono por ter jogado o final de semana todo\n" +
                    "ao invés de dormir.\n" +
                    "Ao chegar em sua sala você percebe que deram uma boa limpada nela e que agora está tudo brilhando\n" +
                    "Você se senta na cadeira, pega toda a papelada e começa o trabalho.", RED_BOLD_BRIGHT);

            for (int i = 0; i <= 1; i++) {
                System.out.printf("\n===================================================================================\n" +
                        "Objetivo semanal: %d/5\n", i);
                geradorDeCurrículo();
                aceitarCurrículo();
            }

            printColoredOutput(" Semana 2 - dia 10 - 8:00 P.M. - Final do turno\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", "Eai, novato, tá tranquilo? Se tiver qualquer " +
                    "dúvida, lembre-se de se virar sozinho!\nAh! Outra coisa, fiquei sabendo que alguns monstros podem ser promovidos, " +
                    "então fica esperto!\nSe você participar da entrevista e for mal, pode ser demitido!\n" +
                    "As entrevistas começam na última semana desse mês. Boa sorte!");

            for (int i = 2; i <= 4; i++) {
                System.out.printf("\n===================================================================================\n" +
                        "Objetivo semanal: %d/5\n", i);
                geradorDeCurrículo();
                aceitarCurrículo();
            }

            //desafio semanal

            printColoredOutput("\nDia 12 - Sexta-feira - Último dia da semana.\n\nKarbu Miosa entra na sua sala\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", "Eai, novato! Como foi essa semana? Tá preparado para o desafio?");

            printColoredOutput("Você se levanta, encara Karbu e diz \"Pode mandar!\"\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            printColoredOutput("\nDesafio Semanal!\n", RED_BOLD_BRIGHT);

            quantidadeTentativas = 1;
            acertou = false;
            do {
                System.out.println("\nA estrutura de uma organização é a disposição ou arranjo dos órgãos ou cargos da empresa.\n" +
                        "Ela pode ser formal ou informal. A figura que tradicionalmente representa a estrutura formal das organizações é o:\n");

                System.out.println("______________________________\n");// 30
                System.out.println("a) Fluxograma");
                System.out.println("b) Planejamento estratégico");
                System.out.println("c) Plano de cargos");
                System.out.println("d) Organograma");

                System.out.println("------------------------------\n");
                System.out.println("Escolha a alternativa digitando entre A e D:\n ");
                System.out.println("------------------------------\n");

                String resposta = entrada.next();
                System.out.println("\n------------------------------\n");// 30

                switch (resposta) {
                    case "d":
                    case "D":
                        System.out.println("Resposta Correta!");
                        acertou = true;
                        break;

                    case "b":
                    case "B":
                    case "c":
                    case "C":
                    case "a":
                    case "A":
                        System.out.println("Resposta Incorreta!!\nTentativa:" + quantidadeTentativas + "/3\n");
                        quantidadeTentativas++;
                        break;

                    default:
                        System.out.println("Resposta inválida!\nTentativa: " + quantidadeTentativas + "/3\n");
                        System.out.println("______________________________\n");
                        quantidadeTentativas++;
                }

            } while (!acertou && quantidadeTentativas <= 3);

            if (!acertou) {
                caixaDialogoAutomatico("Karbu Miosa", "Infelizmente não podemos te manter na empresa...\n" +
                        "Espero que entenda...");

                printStringWithIntervalsPerChar("Você não se provou apto a continuar\n\n");
                printStringWithIntervalsPerChar(" ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ██ \n" +
                        "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ██ \n" +
                        "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ██ \n" +
                        "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██    \n" +
                        " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ██", 100);
                return;
            }

            caixaDialogoAutomatico("Karbu Miosa", "Você passou! está liberado!");

            printColoredOutput("Você pega suas coisas e vai direto pra casa.\n", RED_BOLD_BRIGHT);

            printColoredOutput("Você passa o final de semana estudando e jogando\n",RED_BOLD_BRIGHT);

            printStringWithIntervalsPerCharWithColor("Dia 14 - Semana 2 - Finalizada!\n\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            /*
            ============================================================================
                          ___                                        ____
                         / __|  ___   _ __    __ _   _ _    __ _    |__ /
                         \__ \ / -_) | '  \  / _` | | ' \  / _` |    |_ \
                         |___/ \___| |_|_|_| \__,_| |_||_| \__,_|   |___/
             ============================================================================
             */

            printStringWithIntervalsPerCharWithColor("\n\nDia 15 - Semana 3 - 8:00 A.M. \n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Secretária", "Bom dia! Preparado para o trabalho de hoje?");

            printColoredOutput("Você sorri envergonhado e vai até sua sala.\n" +
                    "Ao entrar, você vê Karbu Miosa acompanhado de outra pessoa te esperando.\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", "Eai, novato não tão novato assim!\n" +
                    "Esse aqui é Raku Avaror, chefe da empresa. Ele que fará as entrevistas no final do mês.");

            caixaDialogoAutomatico("Raku Avaror", "Olá, " + fullNameJogador + ", é um prazer finalmente te conhecer!\n" +
                    "Soube que está tendo um excelente desempenho no seu trabalho. É a primeira vez que alguém trabalha tão bem\n" +
                    "sem perder a alma e as esperanças.");

            caixaDialogoAutomatico("Karbu Miosa", "Chefe, acho que o senhor falou demais...\n" +
                    "Mas isso que disse não deixa de ser verdade.\n" +
                    "Enfim, novato, viemos aqui só dar um \"oi\" mesmo. Tenha um montruoso resto de semana!");

            caixaDialogoAutomatico("Raku Avaror", "Até logo, " + fullNameJogador + ", te vejo na entrevista!");

            for (int i = 0; i <= 4; i++) {
                System.out.printf("\n===================================================================================\n" +
                        "Objetivo semanal: %d/5\n", i);
                geradorDeCurrículo();
                aceitarCurrículo();
            }

            //desafio semanal

            printColoredOutput("\nDia 19 - Sexta-feira - Último dia da semana.\n\nKarbu Miosa entra na sua sala\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", "Já sabe, né? Então bora!");

            simulacaoCarregamento();

            printColoredOutput("\nDesafio Semanal!\n", RED_BOLD_BRIGHT);

            quantidadeTentativas = 1;
            acertou = false;
            do {
                System.out.println("\nEnquanto a Administração Científica se caracterizava pela ênfase na tarefa realizada\n" +
                        "pelo operário/colaborador, a Teoria Clássica tinha por característica");

                System.out.println("______________________________\n");// 30
                System.out.println("a) a necessidade que as organizações sentiram de ordem e de exatidão e das reivindicações\n" +
                        "\tdos trabalhadores por um tratamento justo e imparcial. ");
                System.out.println("b) a preocupação psicológica e sociológica quanto à influência massificante da civilização\n" +
                        "\tindustrial sobre o ser humano. ");
                System.out.println("c) a ênfase na estrutura que a organização deveria possuir para ser eficiente.");
                System.out.println("d) o enfoque nos resultados e objetivos alcançados (fins) por meio do controle de todos\n" +
                        "\tos aspectos de produção.");

                System.out.println("------------------------------\n");
                System.out.println("Escolha a alternativa digitando entre A e D:\n ");
                System.out.println("------------------------------\n");

                String resposta = entrada.next();
                System.out.println("\n------------------------------\n");// 30

                switch (resposta) {
                    case "c":
                    case "C":
                        System.out.println("Resposta Correta!");
                        acertou = true;
                        break;

                    case "b":
                    case "B":
                    case "d":
                    case "D":
                    case "a":
                    case "A":
                        System.out.println("Resposta Incorreta!!\nTentativa:" + quantidadeTentativas + "/3\n");
                        quantidadeTentativas++;
                        break;

                    default:
                        System.out.println("Resposta inválida!\nTentativa: " + quantidadeTentativas + "/3\n");
                        System.out.println("______________________________\n");
                        quantidadeTentativas++;
                }

            } while (!acertou && quantidadeTentativas <= 3);

            if (!acertou) {
                caixaDialogoAutomatico("Karbu Miosa", "Infelizmente não podemos te manter na empresa...\n" +
                        "Espero que entenda...");

                printStringWithIntervalsPerChar("Você não se provou apto a continuar\n\n");
                printStringWithIntervalsPerChar(" ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ██ \n" +
                        "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ██ \n" +
                        "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ██ \n" +
                        "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██    \n" +
                        " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ██", 100);
                return;
            }

            caixaDialogoAutomatico("Karbu Miosa", "Parabéns! Pode ir pra casa!");

            printColoredOutput("Ao passar pela recepção você é parado pela secretária\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Secretária", "Eu fiquei sabendo que o chefe foi até sua sala. Está tudo bem?\n" +
                    "Ele é comediante e parece que não leva nada à sério, mas ele é rígido com a qualidade do trabalho.");

            printColoredOutput("Você conta o que aconteceu para Secretária\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Secretária", "Ufa! Então era só isso ^^\n" +
                    "Pelo visto fiquei preocupada a toa...\n" +
                    "Aproveite seu final de semana!!");


            printColoredOutput("Você passa o final de semana estudando e pensando no que a secretária disse.\n",RED_BOLD_BRIGHT);

            printStringWithIntervalsPerCharWithColor("Dia 21 - Semana 3 - Finalizada!\n\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            /*
            ============================================================================
                          ___                                        _ _
                         / __|  ___   _ __    __ _   _ _    __ _    | | |
                         \__ \ / -_) | '  \  / _` | | ' \  / _` |   |_  _|
                         |___/ \___| |_|_|_| \__,_| |_||_| \__,_|     |_|
             ============================================================================
             */

            printStringWithIntervalsPerCharWithColor("\n\nDia 22 - Semana 4 - 8:00 A.M. \n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Secretária", fullNameJogador + ", você ficou sabendo? Parece que muita não passou no desafio semana passada.\n" +
                    "A equipe de demissões e contratações vai trabalhar bastante essa semana... isso inclui você.");

            printColoredOutput("Ao chegar na sua sala, você percebe que sua mesa está lotada de currículos\n", RED_BOLD_BRIGHT);
            printColoredOutput("Karbu entra desesperado na sua sala.\n",RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", nomeJogador + ", preciso muito da sua ajuda essa semana!\n" +
                    "Nunca imaginei que fossemos ter tantos currículos assim! Tente fazer o máximo que conseguir!");



            for (int i = 0; i <= 9; i++) {
                System.out.printf("\n===================================================================================\n" +
                        "Objetivo semanal: %d/?????\n", i);
                geradorDeCurrículo();
                aceitarCurrículo();
            }

            simulacaoCarregamento();

            printStringWithIntervalsPerCharWithColor("\n\nDia 24 - Semana 4 - 8:00 A.M. \n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", "Novato, obrigado pelo seu esforço! Ainda temos muitos currículos, mas já\n" +
                    "não é mais uma quantidade tão absurda. Ainda peço para que faça o seu melhor.");

            for (int i = 9; i <= 19; i++) {
                System.out.printf("\n===================================================================================\n" +
                        "Objetivo semanal: %d/??\n", i);
                geradorDeCurrículo();
                aceitarCurrículo();
            }

            //desafio semanal

            printColoredOutput("\nDia 26 - Sexta-feira - Último dia da semana.\n\nKarbu Miosa entra alegre na sua sala\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", "Ufa! Finalmente acabaram os currículos! Como você foi de grande ajuda, vou pegar leve!");

            simulacaoCarregamento();

            printColoredOutput("\nDesafio Semanal!\n", RED_BOLD_BRIGHT);

            quantidadeTentativas = 1;
            acertou = false;
            do {
                System.out.println("\nA respeito de administração financeira e relações humanas, julgue o item.\n" +
                        "\n" +
                        "A teoria das relações humanas introduziu um novo repertório na linguagem administrativa, no qual\n" +
                        "constam motivação, liderança, comunicação, organização informal, dinâmica de grupo etc.");

                System.out.println("______________________________\n");// 30
                System.out.println("a) Certo.");
                System.out.println("b) Errado.");

                System.out.println("------------------------------\n");
                System.out.println("Escolha a alternativa digitando entre A e B:\n ");
                System.out.println("------------------------------\n");

                String resposta = entrada.next();
                System.out.println("\n------------------------------\n");// 30

                switch (resposta) {
                    case "a":
                    case "A":
                        System.out.println("Resposta Correta!");
                        acertou = true;
                        break;

                    case "b":
                    case "B":
                        System.out.println("Resposta Incorreta!!\nTentativa:" + quantidadeTentativas + "/3\n");
                        quantidadeTentativas++;
                        break;

                    default:
                        System.out.println("Resposta inválida!\nTentativa: " + quantidadeTentativas + "/3\n");
                        System.out.println("______________________________\n");
                        quantidadeTentativas++;
                }

            } while (!acertou && quantidadeTentativas <= 3);

            if (!acertou) {
                caixaDialogoAutomatico("Karbu Miosa", "Infelizmente não podemos te manter na empresa...\n" +
                        "Espero que entenda...");

                printStringWithIntervalsPerChar("Você não se provou apto a continuar\n\n");
                printStringWithIntervalsPerChar(" ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ██ \n" +
                        "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ██ \n" +
                        "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ██ \n" +
                        "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██    \n" +
                        " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ██", 100);
                return;
            }

            caixaDialogoAutomatico("Karbu Miosa", "Essa tava bem fácil!");

            printColoredOutput("Você chega em casa e dorme o final de semana inteiro por conta do cansaço.\n",RED_BOLD_BRIGHT);

            printStringWithIntervalsPerCharWithColor("Dia 28 - Semana 4 - Finalizada!\n\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

            /*
            ============================================================================
                          ___                                        ___
                         / __|  ___   _ __    __ _   _ _    __ _    | __|
                         \__ \ / -_) | '  \  / _` | | ' \  / _` |   |__ \
                         |___/ \___| |_|_|_| \__,_| |_||_| \__,_|   |___/
             ============================================================================
             */

            printStringWithIntervalsPerCharWithColor("\n\nDia 29 - Semana da entrevista - 8:00 A.M. \n", RED_BOLD_BRIGHT);
            printStringWithIntervalsPerCharWithColor("Restam 2 dias para sua entrevista\n\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Secretária", "Woba, acabei de sair da minha entrevista! Agora sou supervisora!\n" +
                    "Vou cuidar das novas secretárias que vierem ^^\n" +
                    "Ah! Eu percebi que nunca me apresentei pra você...\n" +
                    "Me chamo Bellediel Melran, prazer!");

            printColoredOutput("Você comemora a conquista de Bellediel!\n", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Bellediel Melran", "Acho melhor você ir pra sua sala agora. Bom trabalho!");

            printColoredOutput("Ao caminhar pra sua sala você vê que muitos monstros estão chorando e poucos comemorando.", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Karbu Miosa", "Novato, amanhã será minha entrevista. Espero ir bem...\n" +
                    "Parece que muitos monstros foram demitidos por ir mal...");

            printColoredOutput("Karbu Miosa sai caminhando com uma aura desanimada...", RED_BOLD_BRIGHT);

                System.out.printf("\n===================================================================================\n" +
                        "Objetivo semanal: passar na entrevista\n");
                geradorDeCurrículo();
                aceitarCurrículo();

                simulacaoCarregamento();

            printStringWithIntervalsPerCharWithColor("\n\nDia 30 - Semana da entrevista - 8:00 A.M. \n", RED_BOLD_BRIGHT);
            printStringWithIntervalsPerCharWithColor("Resta 1 dia para sua entrevista\n\n", RED_BOLD_BRIGHT);

            printColoredOutput("Você não vê mais Karbu andando e rindo maléficamente pelos corredores\n" +
                    "Muitos monstros estão chorando, outros estão caídos no chão desacreditados e pouquíssimos comemoram...", RED_BOLD_BRIGHT);

            System.out.printf("\n===================================================================================\n" +
                    "Objetivo diário: não chorar no banheiro e evitar crises de ansiedade\n");
            geradorDeCurrículo();
            aceitarCurrículo();

            simulacaoCarregamento();

            printStringWithIntervalsPerCharWithColor("\n\nDia 31 - Semana da entrevista - 8:00 A.M. \n", RED_BOLD_BRIGHT);
            printStringWithIntervalsPerCharWithColor("Restam 3 horas para sua entrevista\n\n", RED_BOLD_BRIGHT);

            printColoredOutput("O clima está péssimo. A empresa demitiu mais de 50 funcionários e outros 50 sumiram minutos antes de fazer a entrevista...\n",RED_BOLD_BRIGHT);

            printColoredOutput("Você caminha pelo corredor e está tudo em câmera lenta\n",RED_BOLD_BRIGHT);

            printColoredOutput("Sua noção de tempo vai sumindo e cada minuto parece uma eternidade\n",RED_BOLD_BRIGHT);

            printColoredOutput("Você sente seu estômago embrulhar e corre para o banheiro.\n",RED_BOLD_BRIGHT);

            printColoredOutput("Você olha para o relógio e percebe que ainda não se passaram nem 20 minutos.\n",RED_BOLD_BRIGHT);

            printColoredOutput("Sua sala parece apertada, quente, desconfortável e cinza.\n",RED_BOLD_BRIGHT);

            printColoredOutput("Você pega o primeiro currículo do dia.\n",RED_BOLD_BRIGHT);

            System.out.printf("\n===================================================================================\n" +
                    "Objetivo diário: ?????\n");
            geradorDeCurrículo();
            aceitarCurrículo();

            printStringWithIntervalsPerCharWithColor("Restam 2 horas para sua entrevista\n\n", RED_BOLD_BRIGHT);

            System.out.printf("\n===================================================================================\n" +
                    "Objetivo ??????: ?????\n");
            geradorDeCurrículo();
            aceitarCurrículo();

            printStringWithIntervalsPerCharWithColor("Resta 1 hora para sua entrevista\n\n", RED_BOLD_BRIGHT);

            System.out.printf("\n===================================================================================\n" +
                    "????????? ??????: ?????\n");
            geradorDeCurrículo();
            aceitarCurrículo();

            printStringWithIntervalsPerCharWithColor("Restam 30 minutos para sua entrevista\n\n", RED_BOLD_BRIGHT);

            System.out.printf("\n??????????????????????????????????????????????????????????????????????????????????????\n" +
                    "????????? ??????: ?????\n");
            geradorDeCurrículo();
            aceitarCurrículo();

            printStringWithIntervalsPerCharWithColor("Restam 10 minutos para sua entrevista\n\n", RED_BOLD_BRIGHT);

            printStringWithIntervalsPerCharWithColor("Você caminha lentamente até a sala do Raku Avaror\n" +
                    "Durante sua caminhada, você vê monstros chorando e gritando de desespero.\n" +
                    "Ao fundo você escuta a risada de Raku \"Hohohohohohoh!!\"\n\n", RED_BOLD_BRIGHT);

            printStringWithIntervalsPerCharWithColor("Você abre lentamente a porta da sala e entra bem devagar...\n\n", RED_BOLD_BRIGHT);

            simulacaoCarregamento();

                        /*
            ============================================================================
                                      ___    ___    ___   ___
                                     | _ )  / _ \  / __| / __|
                                     | _ \ | (_) | \__ \ \__ \
                                     |___/  \___/  |___/ |___/
             ============================================================================
             */

            printColoredOutput("\nHORA DA ENTREVISTA!!!", RED_BOLD_BRIGHT);

            caixaDialogoAutomatico("Raku Avaror", "Hohohohoh! Tudo certo?? Chegou a hora da sua entrevista!\n" +
                    "Sente-se aí! Vamos começar!");

            simulacaoCarregamento();
            System.out.println(" ");

            int pontos=boss();

            if(pontos==10){

caixaDialogoAutomatico("Raku Avaror", "Parece que você acertou tudo! Você provou merecer uma promoção!\n" +
        "Como Karbu Miosa foi demitido, você vai tomar o lugar dele de gerente!\n" +
        "Parabéns!!");

printColoredOutput("Você sai da sala feliz e tranquilo e decide contar a novidade para Bellediel Melran.", RED_BOLD_BRIGHT);

caixaDialogoAutomatico("Bellediel Melran", "Aaaaaaaaaaaaaaaa! Que demais!!! E pensar que você está aqui há tão pouco tempo!!\n" +
        "Você merece demais esse cargo. Você sempre se dedicou bastante!");

printColoredOutput("Você sorri e abraça Bellediel Melran", RED_BOLD_BRIGHT);

caixaDialogoAutomatico("Bellediel Melran", "Te vejo amanhã, novo gerente! ^^");

                printStringWithIntervalsPerCharWithColor("Semana 5 - Finalizada!\n\n", RED_BOLD_BRIGHT);

                printStringWithIntervalsPerChar("███████ ██ ███    ███     ██████  ███████          ██  ██████   ██████   ██████  \n" +
                        "██      ██ ████  ████     ██   ██ ██               ██ ██    ██ ██       ██    ██ \n" +
                        "█████   ██ ██ ████ ██     ██   ██ █████            ██ ██    ██ ██   ███ ██    ██ \n" +
                        "██      ██ ██  ██  ██     ██   ██ ██          ██   ██ ██    ██ ██    ██ ██    ██ \n" +
                        "██      ██ ██      ██     ██████  ███████      █████   ██████   ██████   ██████  ", 100);

            }else if(pontos>=6 && pontos<=8){
                caixaDialogoAutomatico("Raku Avaror", "Parabéns! Você me surpreendeu!\n" +
                        "Você provou merecer continuar aqui dentro!");

                printColoredOutput("Você sai da sala feliz e tranquilo e decide ver a Bellediel Melran.", RED_BOLD_BRIGHT);

                caixaDialogoAutomatico("Bellediel Melran", "Aaaaaaaaaaaaaaaa! Que demais!!! Então você continua aqui com a gente!!\n" +
                        "Pena que não foi promovido... Mas pense pelo lado bom. Você continua aqui na empresa!!");

                printColoredOutput("Você sorri e abraça Bellediel Melran", RED_BOLD_BRIGHT);

                caixaDialogoAutomatico("Bellediel Melran", "Te vejo amanhã, " +fullNameJogador +"! ^^");

                printStringWithIntervalsPerCharWithColor("Semana 5 - Finalizada!\n\n", RED_BOLD_BRIGHT);

                printStringWithIntervalsPerChar("███████ ██ ███    ███     ██████  ███████          ██  ██████   ██████   ██████  \n" +
                        "██      ██ ████  ████     ██   ██ ██               ██ ██    ██ ██       ██    ██ \n" +
                        "█████   ██ ██ ████ ██     ██   ██ █████            ██ ██    ██ ██   ███ ██    ██ \n" +
                        "██      ██ ██  ██  ██     ██   ██ ██          ██   ██ ██    ██ ██    ██ ██    ██ \n" +
                        "██      ██ ██      ██     ██████  ███████      █████   ██████   ██████   ██████  ", 100);

            }else{
                caixaDialogoAutomatico("Raku Avaror", "Infelizmente não podemos te manter na empresa...\n" +
                        "Você não atingiu a pontuação mínima...\n" +
                        "Espero que entenda...");

                printStringWithIntervalsPerChar("Você não se provou apto a continuar na empresa\n\n");
                printStringWithIntervalsPerChar(" ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ██ \n" +
                        "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ██ \n" +
                        "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ██ \n" +
                        "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██    \n" +
                        " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ██", 100);
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
                "OBJETIVO:\nAprimorar meus conhecimentos de susto e assustar o máximo de pessoas que eu puder para ajudar no crescimento da empresa." +
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
                "OBJETIVO:\nAprimorar meus conhecimentos de susto e assustar o máximo de pessoas que eu puder para ajudar no crescimento da empresa." +
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

    static void pressEnterToContinue() {
        Scanner entrada = new Scanner(System.in);
        printColoredOutput("\nPressione ENTER para continuar\n", RED_BOLD_BRIGHT);
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
                    simulacaoCarregamento();
                    sair = true;
                    break;

                case 3:
                    System.out.println("\n=================================================\n" +
                            "Créditos:\n" +
                            "Jogo criador por:\n");

                    System.out.print("Felipe ");
                    printColoredOutput("B", RED_BOLD_BRIGHT);
                    System.out.print("renner\n");

                    System.out.print("Juli");
                    printColoredOutput("o ", RED_BOLD_BRIGHT);
                    System.out.print("H");
                    printColoredOutput("o", RED_BOLD_BRIGHT);
                    System.out.print("nda\n");

                    System.out.print("Gu");
                    printColoredOutput("s", RED_BOLD_BRIGHT);
                    System.out.print("tavo Gonzalez\n");

                    System.out.print("Henrick Adr");
                    printColoredOutput("i", RED_BOLD_BRIGHT);
                    System.out.print("a");
                    printColoredOutput("n\n", RED_BOLD_BRIGHT);

                    System.out.print("L");
                    printColoredOutput("e", RED_BOLD_BRIGHT);
                    System.out.print("onardo Fujimura\n");

                    //TODO alterar caso saiba algum sobrenome que contenha "s"
                    System.out.print("Gu");
                    printColoredOutput("s", RED_BOLD_BRIGHT);
                    System.out.print("tavo Gonzalez\n");

                    System.out.println("\n=================================================\n");
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

    static void caixaDialogoAutomatico(String nomeFalante, String fala) {
        String topCaixaDialogo = "___________________________________________________________________________________________________\n";
        String bottomCaixaDialogo = "___________________________________________________________________________________________________\n";
        System.out.println("\n\n" + nomeFalante + ":\n" + topCaixaDialogo);
        printStringWithIntervalsPerChar("" + fala + "\n", 50);
        System.out.println(bottomCaixaDialogo);
    }

    static void simulacaoCarregamento() {
        System.out.println("Carregando: ");
        printStringWithIntervalsPerCharWithColor("████████████████████████████████████████████████████████████████████", RED_BOLD_BRIGHT);
    }

    // Boss 1 (com 5 questões)
    static int boss() {

        int quantidadePontosTotal=0;

// ============================== Questao 1 ============================== //

        String enunciadoQuestao1 = "Considere as afirmações abaixo sobre as escolas da Administração.\n" +
                "\n" +
                "I - Para Taylor, a organização e a Administração devem ser estudadas e tratadas cientificamente, para possibilitar a execução dos trabalhos com máxima produção a mínimo custo.\n" +
                "II - Henry Ford é um dos responsáveis pelo elevado grau de desenvolvimento da atual organização empresarial, no que diz respeito às peças padronizadas e ao trabalhador especializado.\n" +
                "III- Para Max Weber, as organizações formais, apresentam três características que formam o tipo ideal da burocracia: formalidade, impessoalidade e profissionalismo.\n" +
                "IV - Dentre os princípios de administração abordados por Fayol, destacam-se: divisão do trabalho, disciplina, interesse individual, importância na descentralização e a existência da dualidade de comando.\n" +
                "\nQuais estão corretas?";
        List<String> alternativasQuestao1 = Arrays.asList(
                "Apenas I e II.",
                "Apenas III e IV.",
                "Apenas I, II e III.",
                "Apenas I e IV.",
                "I, II, III e IV.");
        String alternativaCorretaQuestao1 = "Apenas I, II e III.";

        quantidadePontosTotal = quantidadePontosTotal + printaQuestaoAlternativa(enunciadoQuestao1, alternativasQuestao1, alternativaCorretaQuestao1);

        // ============================== Questao 2 ============================== //

        String enunciadoQuestao2 = "Ênfase na estrutura organizacional é característica da teoria:\n" +
                "\nAlternativas:";
        List<String> alternativasQuestao2 = Arrays.asList(
                "contingencial.",
                "clássica",
                "de sistemas",
                "das relações humanas",
                "comportamental.");
        String alternativaCorretaQuestao2 = "clássica";

        quantidadePontosTotal = quantidadePontosTotal +printaQuestaoAlternativa(enunciadoQuestao2, alternativasQuestao2, alternativaCorretaQuestao2);

        // ============================== Questao 3 ============================== //

        String enunciadoQuestao3 = "Para Henri Fayol, as funções que coordenam e sincronizam as demais funções da empresa, pairando sempre acima delas, são as:\n" +
                "\nAlternativas:";
        List<String> alternativasQuestao3 = Arrays.asList(
                "técnicas.",
                "administrativas",
                "financeiras",
                "comerciais",
                "contábeis.");
        String alternativaCorretaQuestao3 = "administrativas";

        quantidadePontosTotal = quantidadePontosTotal +printaQuestaoAlternativa(enunciadoQuestao3, alternativasQuestao3, alternativaCorretaQuestao3);

        // ============================== Questao 4 ============================== //

        String enunciadoQuestao4 = "Qual princípio da Administração, segundo Fayol, consiste na especialização das tarefas e das pessoas para aumentar a eficiência?:\n" +
                "\nAlternativas:";
        List<String> alternativasQuestao4 = Arrays.asList(
                "Autoridade e responsabilidade.",
                "Divisão do trabalho",
                "Centralização",
                "Espirito de equipe",
                "Unidade de direção.");
        String alternativaCorretaQuestao4 = "Divisão do trabalho";

        quantidadePontosTotal = quantidadePontosTotal +printaQuestaoAlternativa(enunciadoQuestao4, alternativasQuestao4, alternativaCorretaQuestao4);

        // ============================== Questao 5 ============================== //

        String enunciadoQuestao5 = "Enquanto a Administração Científica se caracterizava pela ênfase na tarefa realizada pelo operário/colaborador, a Teoria Clássica tinha por característica:\n" +
                "\nAlternativas:";
        List<String> alternativasQuestao5 = Arrays.asList(
                "a necessidade que as organizações sentiram de ordem e de exatidão e das reivindicações dos trabalhadores por um tratamento justo e imparcial.",
                "a preocupação psicológica e sociológica quanto à influência massificante da civilização industrial sobre o ser humano.",
                "a ênfase na estrutura que a organização deveria possuir para ser eficiente.",
                "a ênfase nas pessoas que trabalham ou que participam nas organizações.",
                "o enfoque nos resultados e objetivos alcançados (fins) por meio do controle de todos os aspectos de produção..");
        String alternativaCorretaQuestao5 = "a ênfase na estrutura que a organização deveria possuir para ser eficiente.";

        quantidadePontosTotal = quantidadePontosTotal +printaQuestaoAlternativa(enunciadoQuestao5, alternativasQuestao5, alternativaCorretaQuestao5);

return quantidadePontosTotal;
    }

    public static int printaQuestaoAlternativa(String questao, List<String> listAlternativas, String alternativaCorreta) {
        List<Character> listNumeracaoAlternativa = Arrays.asList('A', 'B', 'C', 'D', 'E');
        int quantidadeTentativas = 0;
        boolean acertouQuestao = false;
        do {

            // Shuffle nas alternativas
            Collections.shuffle(listAlternativas);

            // Printa Questao
            System.out.println(questao);

            // Printa alternativas
            for (int i = 0; i < listAlternativas.size(); i++) {
                System.out.println(listNumeracaoAlternativa.get(i) + ") " + listAlternativas.get(i));
            }

            // Captura resposta
            System.out.print("\nEscolha a alternativa: ");
            Scanner input = new Scanner(System.in);
            char resposta = input.next().toUpperCase(Locale.ROOT).charAt(0);
            int indiceAlterantivaEscolhida = listNumeracaoAlternativa.indexOf(resposta);

            if (indiceAlterantivaEscolhida == -1) {
                System.out.println("Resposta nao esta entre as opcoes!!! Preste mais atenção.");
            } else if ( listAlternativas.get(indiceAlterantivaEscolhida).equals(alternativaCorreta) ) {
                System.out.println("ACERTOU");
                acertouQuestao = true;
                return 2;
            } else {
                System.out.println("ERROU");
                quantidadeTentativas++;
            }

        } while(!acertouQuestao && quantidadeTentativas < 3);
        return 0;
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
                "Deueray", "Phasbemo", "Abafor", "Lasbra'te", "Be-nex",
                "Partoish", "Je'cell", "Nebusro", "Cas-bra", "Teday",
                "Ha'lus", "Haag-mur", "Moprubad", "Ormar", "Riaxthusra",
                "Nevausma", "Tan'o", "A'neus", "Bau'fur", "An-ga",
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
                "Aprimorar meus conhecimentos de susto e assustar o máximo de pessoas que eu puder para ajudar no crescimento da empresa.",
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
                "Estressado", "Assustado", "Carinhoso", "Medroso", "Carismático", "Aventureiro", "Peludo", "Escamoso", "Feio", "Quadrúpede", "Dentes afiados"
        ));
        Collections.shuffle(listaCaracteristicas);

        int quantidadeMaximaCaracteristicas = 6;
        Random aleatorio = new Random();
        int quantidadeCaracteristicas = aleatorio.nextInt(quantidadeMaximaCaracteristicas) + 1;

        String caracteristicasMonstro = "\n";

        for (int i = 0; i <= quantidadeCaracteristicas; i++) {
            String caracteristicaAtual = "";
            if (i == quantidadeCaracteristicas) {
                caracteristicaAtual = "-" + listaCaracteristicas.get(i);
            } else {
                caracteristicaAtual = "-" + listaCaracteristicas.get(i) + ",\n";
            }

            caracteristicasMonstro = caracteristicasMonstro + caracteristicaAtual;
        }

        return caracteristicasMonstro;
    }

    //TODO adicionar mais universidades
    static String sorteadorUniversidades() {
        ArrayList<String> listaFormacao = new ArrayList<>(Arrays.asList(
                "Universidade Sustos", "Universidade Monstros", "Centro Universitário Void & Darkness",
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
                "Concluído", "Interrompido", "Incompleto"
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

    static void aceitarCurrículo() {
        Scanner entrada = new Scanner(System.in);
        char aceitarCurriculo = ' ';
        boolean sair = false;

        do {
            System.out.println("Deseja aprovar esse currículo? (S/N)");
            aceitarCurriculo = entrada.next().charAt(0);
            switch (aceitarCurriculo) {
                case 's':
                case 'S':
                    sair = true;
                    break;

                case 'n':
                case 'N':
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        } while (!sair);

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

    static void printStringWithIntervalsPerChar(String string) {
        int intervaloMiliSegundos;
        if (execMode.equals("dev")) {
            intervaloMiliSegundos = 0;
        } else {
            intervaloMiliSegundos = 35;
        }

        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
            try {
                Thread.sleep(intervaloMiliSegundos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static void printStringWithIntervalsPerChar(String string, int intervaloMiliSegundos) {
        if (execMode.equals("dev")) {
            intervaloMiliSegundos = 0;
        }

        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
            try {
                Thread.sleep(intervaloMiliSegundos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static void printStringWithIntervalsPerCharWithColor(String string, String fontColor) {
        int intervaloMiliSegundos;
        if (execMode.equals("dev")) {
            intervaloMiliSegundos = 0;
        } else {
            intervaloMiliSegundos = 35;
        }

        for (int i = 0; i < string.length(); i++) {
            printColoredOutput(String.valueOf(string.charAt(i)), fontColor);
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