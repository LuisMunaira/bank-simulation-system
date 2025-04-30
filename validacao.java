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
public class validacao {

    public String validarString(String msg) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String m = null;
        do {
            System.out.println(msg);

            try {
                m = x.readLine();
                if (m.length() < 1 || m.length() > 15) {
                    System.out.println("ERRO");
                }
            } catch (NumberFormatException cc) {
                System.out.println("Erro");
            }
        } while (m.length() < 1 || m.length() > 15);
        return m;
    }

    public float validarfloat(String msg) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        float m = 0;
        do {
            System.out.println(msg);

            try {
                m = Float.parseFloat(x.readLine());
                if (m < 1 || m > 150000) {
                    System.out.println("ERRO");
                }
            } catch (NumberFormatException cc) {
                System.out.println("Erro");
            }
        } while (m < 1 || m > 150000);
        return m;
    }

    public int validarint(String msg) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;
        do {
            System.out.println(msg);

            try {
                m = Integer.parseInt(x.readLine());
                if (m < 1 || m > 150000) {
                    System.out.println("ERRO");
                }
            } catch (NumberFormatException cc) {
                System.out.println("Erro");
            }
        } while (m < 1 || m > 150000);
        return m;
    }

    public int validarresp(String msg) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;
        do {
            System.out.println(msg);

            try {
                m = Integer.parseInt(x.readLine());
                if (m < 0 || m > 1) {
                    System.out.println("ERRO");
                }
            } catch (NumberFormatException cc) {
                System.out.println("Erro");
            }
        } while (m < 0 || m > 1);
        return m;
    }
}
