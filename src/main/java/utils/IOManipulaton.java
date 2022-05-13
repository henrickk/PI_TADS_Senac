package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOManipulaton {
    
    /*
    #========================#=========#===========================#
    #========================# Metodos #===========================#
    #========================#=========#===========================#
    */
    
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
