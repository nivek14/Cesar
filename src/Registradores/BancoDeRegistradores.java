package Registradores;

/*
* @Author: Rodrigo Ferreira Rodrigues
* Classe BandoDeRegistradores
* Classe que possui a memória de dados e os registradores.
* Possui também o código de cada registrador.
* R0 - R5: registradores de uso geral.
* R6 - stack pointer
* Re - Apontador de programa(PC)
*/
public class BancoDeRegistradores {
    // Atributos:
    private int r0,r1,r2,r3,r4,r5,r6,r7;
    private String br0,br1,br2,br3,br4,br5,br6,br7;
    private int[] memoriaDeDados;
    
    public BancoDeRegistradores(){
        this.memoriaDeDados = new int[65536]; // 2 ^ 16
        // Inicializa os bits do registradores.
        this.br0 = "000";
        this.br1 = "001";
        this.br2 = "010";
        this.br3 = "011";
        this.br4 = "100";
        this.br5 = "101";
        this.br6 = "110";
        this.br7 = "111";
        // Inicia o valor dos registradores.
        this.r0 = -1;
        this.r1 = -1;
        this.r2 = -1;
        this.r3 = -1;
        this.r4 = -1;
        this.r5 = -1;
        this.r6 = -1;
        this.r7 = -1;
    }
    
    /*
    *@author: Rodrigo Ferreira Rodrigues
    * Metodos acessores dos registradores
    * Retorna um valor inteiro que está no registrador.
    */
    public int getR0() {
        return r0;
    }

    public int getR1() {
        return r1;
    }

    public int getR2() {
        return r2;
    }

    public int getR3() {
        return r3;
    }

    public int getR4() {
        return r4;
    }

    public int getR5() {
        return r5;
    }

    public int getR6() {
        return r6;
    }

    public int getR7() {
        return r7;
    }
    
    /*
    *@author: Rodrigo Ferreira Rodrigues
    * Metodos acessores dos bits dos registradores
    * Retorna um valor(código/bit) referente ao registrador.
    */
    public String getBr0() {
        return br0;
    }

    public String getBr1() {
        return br1;
    }

    public String getBr2() {
        return br2;
    }

    public String getBr3() {
        return br3;
    }

    public String getBr4() {
        return br4;
    }

    public String getBr5() {
        return br5;
    }

    public String getBr6() {
        return br6;
    }

    public String getBr7() {
        return br7;
    }
    
    /*
    *@author: Rodrigo Ferreira Rodrigues
    * Insere um valor na memória de dados.
    * Retorna o valor inserido, se for necessário usar.
    */
     public int getMemoriaDeDados(int pos) {
        return memoriaDeDados[pos];
    }
     
     /*
    *@author: Rodrigo Ferreira Rodrigues
    * Métodos modificadores dos registradores.
    */
    public void setR0(int r0) {
        this.r0 = r0;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public void setR3(int r3) {
        this.r3 = r3;
    }

    public void setR4(int r4) {
        this.r4 = r4;
    }

    public void setR5(int r5) {
        this.r5 = r5;
    }

    public void setR6(int r6) {
        this.r6 = r6;
    }

    public void setR7(int r7) {
        this.r7 = r7;
    }
   
     /*
    *@author: Rodrigo Ferreira Rodrigues
    * Método para retornar um valor da memória de dados.
    */
    public void setMemoriaDeDados(int pos, int valor) {
        this.memoriaDeDados[pos] = valor;
    }
    
    /*
    *@author: Rodrigo Ferreira Rodrigues
    * Método para iniciar a memória de dados.
    */
    public void iniciarMemoriaDeDados(){
        int i = -1;
        for(i = 0; i < 65536; i++){
            this.memoriaDeDados[i] = -1;
        }
    }
    
}
