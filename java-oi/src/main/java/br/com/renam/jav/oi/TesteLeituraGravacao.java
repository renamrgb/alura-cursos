package br.com.renam.jav.oi;

import java.io.*;

public class TesteLeituraGravacao {
    public static void main(String[] args) throws IOException {



        InputStream fileInput = System.in;
        InputStreamReader inputReader = new InputStreamReader(fileInput);
        BufferedReader bufferReader = new BufferedReader(inputReader);


        OutputStream fileOutput = System.out;
        OutputStreamWriter outputReader = new OutputStreamWriter(fileOutput);
        BufferedWriter bufferWriter = new BufferedWriter(outputReader);


        String linha = linha = bufferReader.readLine();

        while (!linha.isEmpty() && linha != null) {
            bufferWriter.write(linha + "\n");
            bufferWriter.flush();
            linha = bufferReader.readLine();

        }
        bufferWriter.close();
        bufferReader.close();
    }
}
