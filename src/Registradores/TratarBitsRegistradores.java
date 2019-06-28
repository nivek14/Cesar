package Registradores;

import java.util.ArrayList;

/*
* Author: Rodrigo Ferreira Rodrigues
* Classe que faz a lógica para tratar os bits dos registradores.
*/
public class TratarBitsRegistradores {
    // Atributos:
    private ArrayList<String> tmp;
    
    // atributo do para acessas os metodos(getters) dos bits dos registradores
    // na classe BancoDeRegistradores.
    private BancoDeRegistradores bancoReg;
    private Simbolo[] aux;
    
    /*
    * Construtor:
    * Recebe um ArrayList que tem os mnmonicos(arquivo de entrada)
    */
    public TratarBitsRegistradores(ArrayList<String> mnmonicos){
        this.tmp = mnmonicos;
        this.bancoReg = new BancoDeRegistradores();
        
        // Criar um vetor do tipo simbolo
        // Cada posicao vai guardar um objeto simbolo 
        // que tem o a qtd de registradores e os registradores(bits) em um arrayList
        aux = new Simbolo[mnmonicos.size()];
    }
    
    /*
    * Author: Rodrigo Ferreira Rodrigues
    * Método para pegar os bits os regitradores.
    * Faz um split em cada linha do arquivo(sequencialmente), identifica os registradores
    * dessa linha. Cada vez que acha um registrador na linha seta a qtd de regitradores
    * e adiciona o nro(em bits) do registrador no arrayList dentro do objeto do tipo simbolo.
    */
    public Simbolo[] bitsRegistradores(){
        int i,j;
        
        // vetor que vai salvar o split.
        String []array = new String[10];
        
        for(i = 0; i < this.tmp.size(); i++)
        {
            // Cria um classe simbolo.
            aux[i] = new Simbolo();
            
            // Realiza o split da linha(i) e salva no array
            array = this.tmp.get(i).split(" ");
            
            for(j = 0; j < array.length; j++){
                if(array[j].contains("R0") == true){
                    this.aux[i].setNroReg();
                    this.aux[i].insere(bancoReg.getBr0());
                }
                if(array[j].contains("R1") == true){
                    this.aux[i].setNroReg();
                    this.aux[i].insere(bancoReg.getBr1());
                }
                if(array[j].contains("R2") == true){
                    this.aux[i].setNroReg();
                    this.aux[i].insere(bancoReg.getBr2());
                }
                if(array[j].contains("R3") == true){
                    this.aux[i].setNroReg();
                    this.aux[i].insere(bancoReg.getBr3());
                }
                if(array[j].contains("R4") == true){
                    this.aux[i].setNroReg();
                    this.aux[i].insere(bancoReg.getBr4());
                }
                if(array[j].contains("R5") == true){
                    this.aux[i].setNroReg();
                    this.aux[i].insere(bancoReg.getBr5());
                }
            }
        }
        // Retorna vetor de objetos do tipo simbolo para ser usado na montagem.
        return aux;
    }
    
}