/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Facadmin
 */
public class contaPoupanca extends conta {
    private int Nmeses;
    private float juros;
    private char crit;
    
    public contaPoupanca(String nome, int numconta, float saldo, int contacto, int Nmeses){
    super(nome,numconta,saldo,contacto);
    this.Nmeses = Nmeses;
    this.juros = 150;
    }
 public contaPoupanca(){
 this("",(int)0,(float)0,(int)0,(int)0);
 }
    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        if(saldo > 0){
         this.juros = juros + 100;
        }
       
    }

    
    public int getNmeses() {
        return Nmeses;
    }

    public void setNmeses(int Nmeses) {
        this.Nmeses = Nmeses;
    }

    public char getCrit() {
        return crit;
    }

    public void setCrit(char crit) {
        this.crit = crit;
    }
    
    public String toString(){
    return super.toString()+"\n|</]Numero de Meses : "+Nmeses+"[</>]Juros : "+juros+"\n\n";
    }
}
