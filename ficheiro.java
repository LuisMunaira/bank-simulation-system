
package Banco;

import java.util.StringTokenizer;
import java.io.*;
import java.util.Vector;

/**
 *
 * @author Facadmin
 */
public class ficheiro {
//private Vector list;

    public void lerfich(Vector list, String nomef) {
        StringTokenizer x;
        String nome, umalinha = "";
        int nrc, cont, sh, nmeses;
        float sald;
        char criterio;
        try {
            FileReader bb = new FileReader(nomef);
            BufferedReader c = new BufferedReader(bb);
            umalinha = c.readLine();
            while (umalinha != null) {
                x = new StringTokenizer(umalinha, ";");
                nome = x.nextToken();
                nrc = Integer.parseInt(x.nextToken());
                sald = Float.parseFloat(x.nextToken());
                cont = Integer.parseInt(x.nextToken());
                criterio = (x.nextToken()).charAt(0);

                if (criterio == 'C' || criterio == 'c') {
                    sh = Integer.parseInt(x.nextToken());
                    contaCorrente cc = new contaCorrente(nome, nrc, sald, cont, sh);
                    list.addElement(cc);
                } else if (criterio == 'p' || criterio == 'P') {
                    nmeses = Integer.parseInt(x.nextToken());
                    contaPoupanca pp = new contaPoupanca(nome, nrc, sald, cont, nmeses);
                    list.addElement(pp);
                }
                umalinha = c.readLine();
            }
            c.close();

        } catch (FileNotFoundException f) {
            System.out.println("Ficheiro Nao Encontrado");
        } catch (NumberFormatException fa) {
            System.out.println("Erro na conversao");
        } catch (IOException m) {
            System.out.println(m.getMessage());
        }

    }

    public void inserir(Vector list) throws IOException {
        conta co;
        contaCorrente cc;
        contaPoupanca cp;
        try {
            FileWriter b = new FileWriter("C:\\Users\\Facadmin\\Desktop\\m.txt");
            BufferedWriter nn = new BufferedWriter(b);
            for (int i = 0; i < list.size(); i++) {
                co = (conta) list.elementAt(i);
                if (co instanceof contaCorrente) {
                    cc = (contaCorrente) co;
                    nn.write(cc.getNome() + ";" + cc.getNumconta() + ";" + cc.getSaldo() + ";" + cc.getContacto() + ";"+"c" + ";" + cc.getSenha());
                    nn.newLine();
                } else {
                    cp = (contaPoupanca) co;
                    nn.write(cp.getNome() + ";" + cp.getNumconta() + ";" + cp.getSaldo() + ";" + cp.getContacto() +";"+ "p" + ";" + cp.getNmeses());
                    nn.newLine();
                }
            }
            nn.close();

        } catch (IOException n) {
            System.out.println(n.getMessage());
        }

    }
}
