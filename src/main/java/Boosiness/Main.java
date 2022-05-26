package Boosiness;

//Bibliotecas da classe: Jogo
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Bibliotecas da classe: IOManipulaton
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Bibliotecas gerais
import java.util.*;

public class Main {

    public static String caminhoSave = System.getProperty("java.io.tmpdir") + "save.json";

    // Nao acho que vale a pena fazer wrapper nesse projeto pequeno, Explicito > Implicito.
    public static void enterContinue(){

        Scanner input = new Scanner(System.in);
        System.out.println("Pressione ENTER para continuar");
        input.nextLine();
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
    
    public static void main(String[] args) {        
        Jogo jogo = Jogo.validaExistenciaSave();

        //TODO validar se este eh o melhor lugar para este cara ficar
        ConsoleColors.printColoredOutput("\n" +
        "\t\t  ___                      __   __  _             _       \n" +
        "\t\t | _ )  ___   _ __    ___  \\ \\ / / (_)  _ _    __| |  ___ \n" +
        "\t\t | _ \\ / -_) | '  \\  |___|  \\ V /  | | | ' \\  / _` | / _ \\\n" +
        "\t\t |___/ \\___| |_|_|_|         \\_/   |_| |_||_| \\__,_| \\___/\n", ConsoleColors.BLUE);
        ConsoleColors.printColoredOutput("\n" +
                "\t\t\t\t\t\t    _         \n" +
                "\t\t\t\t\t\t   /_\\    ___ \n" +
                "\t\t\t\t\t\t  / _ \\  / _ \\\n" +
                "\t\t\t\t\t\t /_/ \\_\\ \\___/\n", ConsoleColors.BLUE);
        ConsoleColors.printColoredOutput("\n" +
                "__________                         .__                                 \n" +
                "\\______   \\  ____    ____    ______|__|  ____    ____    ______  ______\n" +
                " |    |  _/ /  _ \\  /  _ \\  /  ___/|  | /    \\ _/ __ \\  /  ___/ /  ___/\n" +
                " |    |   \\(  <_> )(  <_> ) \\___ \\ |  ||   |  \\\\  ___/  \\___ \\  \\___ \\ \n" +
                " |______  / \\____/  \\____/ /____  >|__||___|  / \\___  >/____  >/____  >\n" +
                "        \\/                      \\/          \\/      \\/      \\/      \\/ \n", ConsoleColors.RED_BOLD_BRIGHT);

        Curriculo curriculo = new Curriculo();
        System.out.println(curriculo);
    }
}

class Curriculo {

    public String nome;
    public String sobrenome;
    public int idade;
    public String objetivo;
    public String caracteristicas;
    public String universidade;
    public String curso;
    public String nivelFormacao;

    //Construtor
    public Curriculo() {
        this.nome = sorteadorNomes();
        this.sobrenome = sorteadorSobrenomes();
        this.idade = sorteadorIdade();
        this.objetivo = sorteadorObjetivos();
        this.caracteristicas = sorteadorCaracteristicas();
        this.universidade = sorteadorUniversidades();
        this.curso = sorteadorCurso();
        this.nivelFormacao = sorteadorNivelFormacao();
    }

    public String sorteadorNomes() {

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

    public String sorteadorSobrenomes() {

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

    public int sorteadorIdade() {
        int max = 450, min = 18;

        Random num = new Random();

        return num.nextInt(max - min) + min;

    }

    public String sorteadorObjetivos() {
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

    public String sorteadorCaracteristicas() {

        ArrayList<String> listaCaracteristicas = new ArrayList<>();
        listaCaracteristicas.add("Assustador");
        listaCaracteristicas.add("Grande");
        listaCaracteristicas.add("Inteligente");
        listaCaracteristicas.add("Timido");
        listaCaracteristicas.add("Estressado");
        listaCaracteristicas.add("Assustado");
        listaCaracteristicas.add("Fofo");
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

    public String sorteadorUniversidades() {
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

    public String sorteadorCurso() {
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

    public String sorteadorNivelFormacao() {
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

    @Override
    public String toString() {
        return "Nome: " + this.nome + " " + this.sobrenome + "\n" +
               "Idade: " + this.idade + "\n" +
               "Objetivo: " + this.objetivo + "\n" +
               "Caracteristicas: " + this.caracteristicas + "\n" +
               "Universidade: " + this.universidade + "\n" +
               "Curso: " + this.curso + "\n" +
               "Nivel de Formação: " + this.nivelFormacao;
    }
}

class ConsoleColors {
    // Reset
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

    public static void printColoredOutput(String text, String fontColor, String backgroundColor) {
        System.out.println(backgroundColor + fontColor + text + RESET);
    }
    public static void printColoredOutput(String text, String fontColor) {
        System.out.println(fontColor + text + RESET);
    }
}

class IOManipulaton {

    public static void criaArquivoTXT(String caminhoCompletoArquivo, String conteudoArquivo) {
        try {
            FileWriter myWriter = new FileWriter(caminhoCompletoArquivo);
            myWriter.write(conteudoArquivo);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public static String leArquivoTXT(String caminhoCompletoArquivo) {
        Scanner in;
        try {
            in = new Scanner(new FileReader(caminhoCompletoArquivo));
        } catch (FileNotFoundException ex) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while(in.hasNext()) {
            sb.append(in.next());
        }
        in.close();

        return sb.toString();
    }
}

class Jogador {
    public String nome;
    public String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Jogo {
    public int nivel;
    public ArrayList<String> cargos = new ArrayList<>(Arrays.asList("Coordenador", "Gestor", "Gerente", "Socio", "Owner"));

    /*
    #========================#===================#===========================#
    #========================# Getters e Setters #===========================#
    #========================#===================#===========================#
    */

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<String> getCargos() {
        return cargos;
    }

    public void setCargos(ArrayList<String> cargos) {
        this.cargos = cargos;
    }

    /*
    #========================#=========#===========================#
    #========================# Metodos #===========================#
    #========================#=='=======#===========================#
    */

    public static Jogo validaExistenciaSave() {
        //Le o arquivo de Save
        String retornoArquivoSave = IOManipulaton.leArquivoTXT(Main.caminhoSave);

        //Caso nao tenha um save
        if (retornoArquivoSave.equals("")) {
            System.out.println("Nao ha nenhum save existente.");
            return new Jogo();
        }

        //Da Load no save que foi obtido
        ObjectMapper mapper = new ObjectMapper();
        Jogo jogo;
        try {
            jogo = mapper.readValue(retornoArquivoSave, Jogo.class);
        } catch (JsonProcessingException ex) {
            System.out.println("Nao foi possivel realizar o load do save.");
            jogo = new Jogo();
        }

        return jogo;
    }

    public void salvaJogoCriaSave() throws CloneNotSupportedException {
        ObjectMapper mapper = new ObjectMapper();

        String stringfiedJsonJogo = "";
        try {
            stringfiedJsonJogo = mapper.writeValueAsString(this);
            System.out.println("ResultingJSONstring = " + stringfiedJsonJogo);
        } catch (JsonProcessingException e) {
            System.out.println("Erro ao clonar instancia do objeto");
        }

        IOManipulaton.criaArquivoTXT(Main.caminhoSave, stringfiedJsonJogo);
    }
}