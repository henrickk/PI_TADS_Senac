package Boosiness;

//Standard java
import java.util.ArrayList;
import java.util.Arrays;

//Json
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static utils.IOManipulaton.*;

public class Jogo {
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
        String retornoArquivoSave = leArquivoTXT(Main.caminhoSave);
        
        //Caso nao tenha um save
        if (retornoArquivoSave == "") {
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
        
        criaArquivoTXT(Main.caminhoSave, stringfiedJsonJogo);
    }
}
