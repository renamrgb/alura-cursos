package br.com.renam.jav.oi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
//        OutputStream file = new FileOutputStream("lorem2.txt");
//        Writer writer = new OutputStreamWriter(file);
//        BufferedWriter buffer = new BufferedWriter(writer);




        //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));


        PrintStream printStream = new PrintStream("lorem2.txt");

        printStream.println("lorem teste nova linha printStream");

        printStream.println();

        printStream.println("teste linha");


        printStream.close();

//        bw.write("Testando a criação de arquivomesmo assim");
//        bw.write(System.lineSeparator());
//        bw.write("vamos ver testando linhas");
//
//        bw.close();

    }
}
