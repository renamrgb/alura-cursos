package br.com.renam.jav.oi;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("lorem.txt");
        InputStreamReader reader = new InputStreamReader(file);
        BufferedReader buffer = new BufferedReader(reader);

        String linha = buffer.readLine();

        while (!linha.isEmpty()){
            System.out.println(linha);
            linha = buffer.readLine();
        }




        buffer.close();
    }
}
