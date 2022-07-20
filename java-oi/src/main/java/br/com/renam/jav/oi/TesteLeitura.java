package br.com.renam.jav.oi;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("lorem.txt");
        InputStreamReader reader = new InputStreamReader(file);
        BufferedReader buffer = new BufferedReader(reader);

        String linha = buffer.readLine();

        System.out.println(linha);

        buffer.close();
    }
}
