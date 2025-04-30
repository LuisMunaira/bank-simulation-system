/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;
import java.util.Random;
/**
 *
 * @author Facadmin
 */
public class contaCorrente extends conta{
    private int senha;
    private char cri;
    
    public contaCorrente(String nome, int numconta, float saldo, int contacto, int senha){
    super(nome,numconta,saldo,contacto);
    this.senha = senha;
    }
 public contaCorrente(){
 this("",(int)0,(float)0,(int)0,(int)0);
 }
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public char getCri() {
        return cri;
    }

    public void setCri(char cri) {
        this.cri = cri;
    }
    
    public String toString(){
    return super.toString()+"\n|</>] Senha: "+senha+"\n\n";
    }
}
