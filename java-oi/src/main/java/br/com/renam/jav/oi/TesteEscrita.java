package br.com.renam.jav.oi;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        OutputStream file = new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(file);
        BufferedWriter buffer = new BufferedWriter(writer);

        buffer.write("Testando a criação de arquivo\nmesmo assim vamos ver\n \n" +
                "testando linhas");

        buffer.close();
    }
}
