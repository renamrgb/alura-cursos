package br.com.renam.jav.oi;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("contas.csv"));


        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
           // System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);

            linhaScanner.useDelimiter(",");

            String valor1 = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

           String valorFormatado =  String.format(new Locale("pt","br"),"%s - %04d-%08d, %s: %04.2f"
                   ,valor1,agencia,numero,titular,saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();
//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));

        }

        sc.close();

    }
}
