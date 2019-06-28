package montador;

import java.util.ArrayList;

public class Tim {
    //Atributos:
    private ArrayList<String> codigo;
    private ArrayList<String> simbolo;
    private ArrayList<String> bits;
    public Tim(){
        this.codigo = new ArrayList<String>();
        this.simbolo = new ArrayList<String>();
        this.bits = new ArrayList<String>();
        this.iniciaArraysList();
    }
    
    private void iniciaArraysList(){
        // Dois operandos
        this.simbolo.add("MOV");
        this.simbolo.add("ADD");
        this.simbolo.add("SUB");
        this.simbolo.add("CMP");
        this.simbolo.add("AND");
        this.simbolo.add("OR");
        this.codigo.add("1001");
        this.codigo.add("1010");
        this.codigo.add("1011");
        this.codigo.add("1100");
        this.codigo.add("1101");
        this.codigo.add("1110");
        // Um operando
        this.simbolo.add("CLR");
        this.simbolo.add("NOT");
        this.simbolo.add("INC");
        this.simbolo.add("DEC");
        this.simbolo.add("NEG");
        this.simbolo.add("TST");
        this.simbolo.add("ROR");
        this.simbolo.add("ROL");
        this.simbolo.add("ASR");
        this.simbolo.add("ASL");
        this.simbolo.add("ADC");
        this.simbolo.add("SBC");
        this.codigo.add("10000000");
        this.codigo.add("10000001");
        this.codigo.add("10000010");
        this.codigo.add("10000011");
        this.codigo.add("10000100");
        this.codigo.add("10000101");
        this.codigo.add("10000110");
        this.codigo.add("10000111");
        this.codigo.add("10001000");
        this.codigo.add("10001001");
        this.codigo.add("10001010");
        this.codigo.add("10001011");
        // Desvio condicional
        this.simbolo.add("BR");
        this.simbolo.add("BNE");
        this.simbolo.add("BEQ");
        this.simbolo.add("BPL");
        this.simbolo.add("BMI");
        this.simbolo.add("BVC");
        this.simbolo.add("BVS");
        this.simbolo.add("BCC");
        this.simbolo.add("BCS");
        this.simbolo.add("BGE");
        this.simbolo.add("BLT");
        this.simbolo.add("BGT");
        this.simbolo.add("BLE");
        this.simbolo.add("BHI");
        this.simbolo.add("BLS");
        this.codigo.add("00110000");
        this.codigo.add("00110001");
        this.codigo.add("00110010");
        this.codigo.add("00110011");
        this.codigo.add("00110100");
        this.codigo.add("00110101");
        this.codigo.add("00110110");
        this.codigo.add("00110111");
        this.codigo.add("00111000");
        this.codigo.add("00111001");
        this.codigo.add("00111010");
        this.codigo.add("00111011");
        this.codigo.add("00111100");
        this.codigo.add("00111101");
        this.codigo.add("00111110");
        //instruções especiais
        this.simbolo.add("NOP");
        this.simbolo.add("HLT");
        this.codigo.add("0000");
        this.codigo.add("1111");
        
    }
    
    // Recebe um arrayList que conte todas instruções
    // Faz o split pegando sempre array[0], conteo o nome da instrução
    public ArrayList<String> procurarBits(ArrayList<String> mnemonicos){
        int i;
        String []array = new String[10];
        
        for(i = 0; i < mnemonicos.size(); i++){
            array = mnemonicos.get(i).split(" ");
            System.out.println(array[0]);
            // procura instrução no arraylist de nomes(simblos)
            // se achar coloca o codigo referente a instrução que esta no arrayList codigo no
            // arrayListBits
            for(int j = 0; j < this.simbolo.size(); j++){
                if(this.simbolo.get(j).equals(array[0])){
                    this.bits.add(this.codigo.get(j));
                }
            }
        }
        return this.bits;
    }
    
    public void verificarBits(){
        int i;
        for(i = 0; i < this.bits.size(); i++){
            System.out.println(this.bits.get(i));
        }
    }
    

}