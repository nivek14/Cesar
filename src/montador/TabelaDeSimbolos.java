package montador;

import java.util.*;

public class  TabelaDeSimbolos{

    //Atributos da classe:
    private HashMap<String,Integer> tableSymbol;

    //Construtor:
    public TabelaDeSimbolos(){

        this.tableSymbol = new HashMap<String,Integer>();

    }

    // Adiciona elemento na tabela de simbolos:
    public void addSymbolTable(String key){

        if(tableSymbol.containsKey(key) == false){

            this.tableSymbol.put(key, 0);

        }

    }

    // Mostra tabela de simbolos:
    public void showTable(){

        System.out.println(tableSymbol);

    }

}
