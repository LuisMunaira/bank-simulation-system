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
public class conta {

    protected String nome;
    protected int numconta;
    protected float saldo;
    protected int contacto;

    public conta(String nome, int numconta, float saldo, int contacto) {
        this.nome = nome;
        this.numconta = numconta;
        this.saldo = saldo;
        this.contacto = contacto;
    }
    public conta(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "CONTA\n" + "Nome = " + nome + "\nNumero da Conta = " + numconta + "\nSaldo = " + saldo + "\nContacto = " + contacto;
    }

}
