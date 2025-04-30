                             
/*
 * To change this license header, choose License Headers in Project Properties.
 * 
 *public void criarCC(String a, int b, float c, int d, int f) {
        contaCorrente cc = new contaCorrente();
        cc.setNome(a);
        cc.setNumconta(b);
        cc.setSaldo(c);
        cc.setContacto(d);
      //  cc.setCri(e);
        cc.setSenha(f);
        vet.addElement(cc);
        vet.trimToSize();
    }

    public void criarCP(String a, int b, float c, int d, int f) {
        contaPoupanca cp = new contaPoupanca();
        cp.setNome(a);
        cp.setNumconta(b);
        cp.setSaldo(c);
        cp.setContacto(d);
       // cp.setCrit(e);
        cp.setNmeses(f);
        vet.addElement(cp);
        vet.trimToSize();
    }.
 */
package Banco;

import java.util.*;
import java.io.*;

/**
 *
 * @author Facadmin
 */
public class Banco {

    private Vector vet;

    public Banco() {
        vet = new Vector();

    }
    validacao vv = new validacao();

    public int getquant() {
        return vet.size();
    }

    public String tostring() {
        String ver = "";
        for (int i = 0; i < vet.size(); i++) {
            ver += vet.elementAt(i).toString();

        }
        return ver;
    }

    public String vercc() {
        String ver = "";
        conta co;
        contaCorrente cc;
        for (int j = 0; j < vet.size(); j++) {
            co = (conta) vet.elementAt(j);
            if (co instanceof contaCorrente) {
                cc = (contaCorrente) co;
                ver += cc.toString();
            }
        }
        return ver;
    }

    public String vercp() {
        String ver = "";
        conta co;
        contaPoupanca cp;
        for (int j = 0; j < vet.size(); j++) {
            co = (conta) vet.elementAt(j);
            if (co instanceof contaPoupanca) {
                cp = (contaPoupanca) co;
                ver += cp.toString();
            }
        }
        return ver;
    }

    public void trocarnr(int nr, int n) throws IOException {
        String ver = "";
        conta co = new conta();
        for (int i = 0; i < vet.size(); i++) {
            co = (conta) vet.elementAt(i);
            if (co.getNumconta() == nr) {
               co.setContacto(n);
                inserir();
            }
        }
    }
    public void Removerconta(int nr) throws IOException {
        String ver = "";
        conta co = new conta();
        for (int i = 0; i < vet.size(); i++) {
            co = (conta) vet.elementAt(i);
            if (co.getNumconta() == nr) {
                vet.remove(i);
                inserir();
            }
        }
    }

    public void recebeDoFich(String nameFil) {
        ficheiro fc = new ficheiro();
        fc.lerfich(vet, nameFil);
    }

    public void inserir() throws IOException {
        ficheiro fc = new ficheiro();
        fc.inserir(vet);
    }

    public void AddC() throws IOException {
        int r = 0;
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.conta Poupanca\n2.Conta Corrente");
        try {
            r = Integer.parseInt(x.readLine());
        } catch (NumberFormatException c) {
            System.out.println("Erro");
        }

        switch (r) {
            case 1:
                contaPoupanca cp = new contaPoupanca(vv.validarString("Nome :"), vv.validarint("Numero de Conta :"), vv.validarfloat("Saldo Inicial"), vv.validarint("Contacto : "), vv.validarint("Senha : "));
                vet.addElement(cp);
                vet.trimToSize();
                break;
            case 2:
                contaCorrente c = new contaCorrente(vv.validarString("Nome :"), vv.validarint("Numero de Conta :"), vv.validarfloat("Saldo Inicial"), vv.validarint("Contacto : "), vv.validarint("Numero de meses"));
                vet.addElement(c);
                vet.trimToSize();
                break;
        }
    }
}
