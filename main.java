/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.*;

/**
 *
 * @author Facadmin
 */
public class main {

    public static void main(String args[]) throws IOException {
        BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
        ficheiro f = new ficheiro();
        //f.lerfich();
        String nome;
        int resp;
        Banco b = new Banco();
        validacao vv = new validacao();
        b.recebeDoFich("C:\\Users\\Facadmin\\Desktop\\m.txt");
        // System.out.println("Ver CC");
        do {
            System.out.println("1.Ver Contas Poupanca\n2.Ver contas Correntes\n3. ver todas Contas\n4.levantar\n5.Depositar\n6.Adicionar Contas\n7.Trocar Contacto Conta\n8.Remover ContaPoupanca");
            int a = Integer.parseInt(bb.readLine());
            switch (a) {
                case 1:
                    System.out.println(b.vercp());
                    break;
                // System.out.println("Ver CP");
                case 2:
                    System.out.println(b.vercc());
                    break;
                case 3:
                    System.out.println(b.vercp());
                    System.out.println("======OUTRAS=======");
                    System.out.println(b.vercp());
                    break;
                case 6:
                    b.AddC();
                    b.inserir();
                    break;
                case 7: System.out.println("Numero da Conta do Usuario");
                      int nrc = Integer.parseInt(bb.readLine());
                      System.out.println("Contacto Actual ");
                      int nrtell = Integer.parseInt(bb.readLine());
                      b.trocarnr(nrc, nrtell);
                     // System.out.println(b);
                      // System.out.println();   
                    break;
                case 8: System.out.println("Numero da conta do Usuario");
                      int nn  = Integer.parseInt(bb.readLine());
                       b.Removerconta(nn);
                        
                    break;
                       //System.out.println(b.vercp());
                default : System.out.println("Erro");
            }

            resp = vv.validarresp("1.continuar.0.Terminar");
        } while (resp == 1);
    }
}
