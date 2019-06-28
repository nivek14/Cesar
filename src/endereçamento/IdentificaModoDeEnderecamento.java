package endereçamento;

import java.util.ArrayList;

/*
*Author: Rodrigo Ferreira Rodrigues
*Classe que contém a lógica para identificar os modos de endereçamentos.
*/
public class IdentificaModoDeEnderecamento {
	
    /* 	Atributos:
     	Esse atributo aux é o que nos permite acessar a classe ModosDeEnderecamento
    	e dar um get no modo identificado.
    */
    private ModosDeEnderecamento aux;
    
    /* 	A string linha vai ser receber a linha que deve ser tratado do arquivo.*/
    private String linha;
    
    // Guarda o split feito na linha.
    private String[] array;
    
    private ArrayList<String> bits;
    
    // Construtor:
    public IdentificaModoDeEnderecamento(){
        aux = new ModosDeEnderecamento();
        this.linha = " ";
        this.array = new String[10];
        this.bits = new ArrayList<String>();
    }
    
    
    /*
    @author: Rodrigo Ferreira Rodrigues
    recebe um arrayList que tem as linhas(arquivo de entrada).
    para cada linha reconhe o padrão do modo de endereçamento e salva o bit referente ao modo
    no arrayList de bits que será usado no processo de montagem.
    */
    public ArrayList<String> identificaModo(ArrayList<String> alinha){
        
    int i = -1;
    
    //System.out.println(alinha);
    
    for(i = 0; i < alinha.size(); i++){
        
        this.setLinha(alinha.get(i));
        this.quebraFrase();
        
        // Encontra o modo de endereçamento registrador.
        if(array[1].equals("R0") || array[1].equals("R1") || array[1].equals("R2") 
           || array[1].equals("R3") || array[1].equals("R4") || array[1].equals("R5")){
        	//System.out.println("aquiii");
            this.bits.add(this.aux.getReg());
            
        // // modo de endereçamento registrador pós-incrementado
        }else if(array[1].equals("(R0)+") || array[1].equals("(R1)+") || array[1].equals("(R2)+")
                || array[1].equals("(R3)+") || array[1].equals("(R4)+") || array[1].equals("(R5)+")){
        	//System.out.println("aquiii");
            this.bits.add(this.aux.getRpi());
            
        // Enconstra o modo de endereçamento registrador pré-incrementado
        }else if(array[1].equals("-(R0)") || array[1].equals("-(R1)") || array[1].equals("-(R2)")
                || array[1].equals("-(R3)") || array[1].equals("-(R4)") || array[1].equals("-(R5)")){
        	 //System.out.println("aquiii");
            this.bits.add(this.aux.getRpd());
            
        // Encontra o modo de endereçamento indexado
        }else if(array[1].equals("ddd(R0)") || array[1].equals("ddd(R1)") ||array[1].equals("ddd(R2)")
                || array[1].equals("ddd(R3)") || array[1].equals("ddd(R4)") || array[1].equals("ddd(R5)")){
        	 //System.out.println("aquiii");
            this.bits.add(this.aux.getInx());
            
        // Encontra o modo de endereçamento registrador indireto
        }else if(array[1].equals("(R0)") || array[1].equals("(R1)") || array[1].equals("(R2)") 
           || array[1].equals("(R3)") || array[1].equals("(R4)") || array[1].equals("(R5)")){
        	 //System.out.println("aquiiiPorraaaa");
            this.bits.add(this.aux.getInd());
            
        // Encontra o modo de endereçamento pós-incr
        }else if(array[1].equals("((R0)+)") || array[1].equals("((R1)+)") || array[1].equals("((R2)+)")
                || array[1].equals("((R3)+)") || array[1].equals("((R4)+)") || array[1].equals("((R5)+)")){
        	// System.out.println("aquiii");
            this.bits.add(this.aux.getPii());
            
        // Enontra o modo de endereamento pré-dec
        }else if(array[1].equals("(-(R0))") || array[1].equals("(-(R1))") || array[1].equals("(-(R2))")
                || array[1].equals("(-(R3))") || array[1].equals("(-(R4))") || array[1].equals("(-(R5))")){
        	// System.out.println("aquiii");
            this.bits.add(this.aux.getPdi());;
            
        // Encontra o modo de endereçamento indexado indireto    
        }else if(array[1].equals("(ddd(R0))") || array[1].equals("(ddd(R1))") || array[1].equals("(ddd(R2))")
                || array[1].equals("(ddd(R3))") || array[1].equals("(ddd(R4))") || array[1].equals("(ddd(R5))")){
        	 //System.out.println("aquiii");
            this.bits.add(this.aux.getIxi());
            
        }else{
            // NILL é um padrão inválido, neste caso, montador não pode realizar a montagem.
            this.bits.add("NILL");
        }
    }
        // Retorna o array com todos os bits.
        return this.bits;
    }
    
    // Acessor da linha.
    public String getLinha() {
        return linha;
    }

    // Modificador da linha.
    public void setLinha(String linha) {
        this.linha = linha;
    }
   
    /*
     * @author: Rodrigo Ferreira Rodrigues
     * Realiza o split na frase de entrada.
     * Realiz um split por espaço exemplos:
     * ADD (R2)+, (R3)+
     * array[0] = ADD
     * array[1] = (R2)+,
     * array[2] = (R3)+
    */
    public void quebraFrase(){
        this.array = linha.split(" ");
    }
    
    /*
    * @author: Rodrigo Ferreira Rodrigues
    * Método para teste:
    * apenas para mostrar o split.(Teste);
    */
    public void verSplit(){
        for(int i = 0 ; i < this.array.length; i++){
            System.out.println(this.array[i]);
        }
    }
    
    /*
    * @author: Rodrigo Ferreira Rodrigues
    * mostra os bits no arrayList para teste.
    */
    public void mostraBits(){
        for(int i = 0; i < this.bits.size(); i++){
            System.out.println(this.bits.get(i));
        }
    }
    
}