package Registradores;

/*
* Classe auxiliar que ajudo no processo de tratamento dos bits dos registradores.
* Author: Rodrigo Ferreira Rodrigues
* Classe Simbolo:
* nroReg: é quantidade de registradores que uma instrução possui.
* bits: de arcordo com a qtd de nroReg salva  os bits dos registrados.
* ex: ADD R0 R1
* bits.get(0) == "000", bits.get(1) = 001
*/
import java.util.ArrayList;

public class Simbolo {
    // Atributos:
    private int nroReg; // Quantidade de registradores das instruções.
    private ArrayList<String> bits; // ArrayList que guarda os bits dos registradores.
    
    // Construtor
    public Simbolo(){
        nroReg = 0;
        bits = new ArrayList<String>();
    }
    
    
    /*
    * @Author: Rodrigo Ferreira Rodrigues
    * Este método é para insere o bit de um registrador no ArrayList<String> bits
    */
    public void insere(String bits){
        this.bits.add(bits);
    }
    
    /*
    * @Author: Rodrigo Ferreira Rodrigues
    * Este método incrementa o número de registradores de um instrução(controle).
    * Exemplo: ADD R3 R4 nroReg = 2
    * Exemplo: MOV R1 nroReg = 1
    */
    public void setNroReg(){
        nroReg += 1;
    }
    
    /*
    * @Author: Rodrigo Ferreira Rodrigues
    * Retorna o número de registradores de uma instrução.
    */
    public int GetNroReg(){
        return nroReg;
    }
    
    
    /*
    * @Author: Rodrigo Ferreira Rodrigues
    * Método usado para pegar os bits dos registradores de uma instruções.
    */
    public ArrayList<String> pegaBits(){
        int i;
        ArrayList<String> bit = new ArrayList<String>();
        for(i = 0; i < nroReg;i++){
            bit.add(this.bits.get(i));
        }
        return bit; // Retornar um array com os bits da instrução.
    }
    
}