package endereçamento;

import java.util.ArrayList;

public class IdentificaModoDeEnderecamento {
	
    /* 	Atributos:
     	Esse atributo aux é o que nos permite acessar a classe ModosDeEnderecamento
    	e dar um get no modo identificado.*/
    private ModosDeEnderecamento aux;
    
    /* 	A string linha vai ser receber a linha que deve ser tratado do arquivo.
     	Vai ter la no montador ex: while(nao chegar no final do arquivo)
     	le uma linha e manda pra funcao identficaModo desta classe
     	a função vai dar um spli na linha ex ADD R0 R1 e guardar no vetor array*/
    
    private String linha;
    // Guarda o split feito na linha
    
    private String[] array;
    
    private ArrayList<String> bits;
    
    // Construtor:
    public IdentificaModoDeEnderecamento(){
        aux = new ModosDeEnderecamento();
        this.linha = " ";
        this.array = new String[10];
        this.bits = new ArrayList<String>();
    }
    
    // Recebe um linha do arquivo
    // Faz um split nela
    // E salva num vetor
    // Como sempre depois da instrução vem algum padrão que identifica um modo de endereçamento
    // to usando sempre a posição array[1] que guarda a segunda palavra depois da instrução
    // EX ADD R0 R1 pega array[1] = R0
    public ArrayList<String> identificaModo(ArrayList<String> alinha){
    int i = -1;
    for(i = 0; i < alinha.size(); i++)
    {
        this.setLinha(alinha.get(i));
        this.quebraFrase();
        // Encontra o modo de endereçamento registrador.
        // Registradore de uso geral(R0 - R5)
        if(array[1].equals("R0") || array[1].equals("R1") || array[1].equals("R2") 
           || array[1].equals("R3") || array[1].equals("R4") || array[1].equals("R5")){
            // Acessa a classe modo de endereçamento e retorna o codigo
            this.bits.add(this.aux.getReg());
        // // modo de endereçamento registrador pós-incrementado
        }else if(array[1].equals("(R0)+") || array[1].equals("(R1)+") || array[1].equals("(R2)+")
                || array[1].equals("(R3)+") || array[1].equals("(R4)+") || array[1].equals("(R5)+")){
            this.bits.add(this.aux.getRpi());
        // Enconstra o modo de endereçamento registrador pré-incrementado
        }else if(array[1].equals("-(R0)") || array[1].equals("-(R1)") || array[1].equals("-(R2)")
                || array[1].equals("-(R3)") || array[1].equals("-(R4)") || array[1].equals("-(R5)")){
            this.bits.add(this.aux.getRpd());
        // Encontra o modo de endereçamento indexado
        }else if(array[1].equals("ddd(R0)") || array[1].equals("ddd(R1)") ||array[1].equals("ddd(R2)")
                || array[1].equals("ddd(R3)") || array[1].equals("ddd(R4)") || array[1].equals("ddd(R5)")){
            this.bits.add(this.aux.getInx());
        // Encontra o modo de endereçamento registrador indireto
        }else if(array[1].equals("(R0)") || array[1].equals("(R1)") || array[1].equals("(R2)") 
           || array[1].equals("(R3)") || array[1].equals("(R4)") || array[1].equals("(R5)")){
            this.bits.add(this.aux.getInd());
        // Encontra o modo de endereçamento pós-incr
        }else if(array[1].equals("((R0)+)") || array[1].equals("((R1)+)") || array[1].equals("((R2)+)")
                || array[1].equals("((R3)+)") || array[1].equals("((R4)+)") || array[1].equals("((R5)+)")){
            this.bits.add(this.aux.getPii());
        // Enontra o modo de endereamento pré-dec
        }else if(array[1].equals("(-(R0))") || array[1].equals("(-(R1))") || array[1].equals("(-(R2))")
                || array[1].equals("(-(R3))") || array[1].equals("(-(R4))") || array[1].equals("(-(R5))")){
            this.bits.add(this.aux.getPdi());;
        // Encontra o modo de endereçamento indexado indireto    
        }else if(array[1].equals("(ddd(R0))") || array[1].equals("(ddd(R1))") || array[1].equals("(ddd(R2))")
                || array[1].equals("(ddd(R3))") || array[1].equals("(ddd(R4))") || array[1].equals("(ddd(R5))")){
            this.bits.add(this.aux.getIxi());
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
   
    // Realiza o split na frase de entrada.
    // Realiz um split por espaço exemplos:
    // ADD (R2)+, (R3)+
    // array[0] = ADD
    // array[1] = (R2)+,
    // array[2] = (R3)+
    public void quebraFrase(){
        this.array = linha.split(" ");
    }
    
    // Apenas para mostrar o split.(Teste);
    public void verSplit(){
        for(int i = 0 ; i < this.array.length; i++){
            System.out.println(this.array[i]);
        }
    }
    
    // Mostra os bits no arrayList(Teste)
    public void mostraBits(){
        for(int i = 0; i < this.bits.size(); i++){
            System.out.println(this.bits.get(i));
        }
    }
    
}