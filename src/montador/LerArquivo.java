package montador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerArquivo {
    // Atributos da classe:
    private ArrayList<String> mnemonicos;
    private String nomeDoArquivo;
    private String linha;
    
    // Construtor da classe:
    public LerArquivo(String nomeDoArquivo){
        this.mnemonicos = new ArrayList<String>();
        this.nomeDoArquivo = nomeDoArquivo;
        this.linha = "";
    }

    //##########################################################################
    // Manipulação do arquivo:
    public ArrayList<String> lerArquivo() throws FileNotFoundException, IOException{
        FileReader arq = new FileReader(this.getNomeDoArquivo());
        BufferedReader lerArq = new BufferedReader(arq);

        this.setLinha(lerArq.readLine());

        while(this.getLinha() != null){

            this.mnemonicos.add(this.getLinha());
            this.setLinha(lerArq.readLine());
        }
        
        lerArq.close();
        
        return this.mnemonicos;
    }
    //##########################################################################
    
    //##########################################################################
    // Métodos acessores e modificadores:
    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public void setNomeDoArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }
    //##########################################################################
    
    //##########################################################################
    public void mostrarLinhas(){
        int i = -1;
        for(i = 0; i < this.mnemonicos.size(); i++){
            System.out.println(this.mnemonicos.get(i));
        }
    }
}