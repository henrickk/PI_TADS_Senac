package Boosiness;

import java.io.IOException;

import static Boosiness.Jogo.*;
import static utils.ConsoleColors.*;

public class Main {
    public static String caminhoSave = System.getProperty("java.io.tmpdir") + "save.json";
    
    public static void main(String[] args) {        
        Jogo jogo = validaExistenciaSave();

        //TODO validar se este eh o melhor lugar para este cara ficar
//        while(true) {
        coloredOutput("\n" +
        "\t\t  ___                      __   __  _             _       \n" +
        "\t\t | _ )  ___   _ __    ___  \\ \\ / / (_)  _ _    __| |  ___ \n" +
        "\t\t | _ \\ / -_) | '  \\  |___|  \\ V /  | | | ' \\  / _` | / _ \\\n" +
        "\t\t |___/ \\___| |_|_|_|         \\_/   |_| |_||_| \\__,_| \\___/\n", BLUE);
        coloredOutput("\n" +
                "\t\t\t\t\t\t    _         \n" +
                "\t\t\t\t\t\t   /_\\    ___ \n" +
                "\t\t\t\t\t\t  / _ \\  / _ \\\n" +
                "\t\t\t\t\t\t /_/ \\_\\ \\___/\n", BLUE);
        coloredOutput("\n" +
                "__________                         .__                                 \n" +
                "\\______   \\  ____    ____    ______|__|  ____    ____    ______  ______\n" +
                " |    |  _/ /  _ \\  /  _ \\  /  ___/|  | /    \\ _/ __ \\  /  ___/ /  ___/\n" +
                " |    |   \\(  <_> )(  <_> ) \\___ \\ |  ||   |  \\\\  ___/  \\___ \\  \\___ \\ \n" +
                " |______  / \\____/  \\____/ /____  >|__||___|  / \\___  >/____  >/____  >\n" +
                "        \\/                      \\/          \\/      \\/      \\/      \\/ \n", RED_BOLD_BRIGHT);

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
    
}
