package com.mycompany.desafiosesc.leitor;

import com.mycompany.desafiosesc.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhonatan
 * @since 18/02/2018
 *
 * Classe responsável por carregar o arquivo de entrada e transformar os dados
 * do arquivo em objetos;
 */
public class Leitor {

    private BufferedReader readFile;
    private List<ConversorEntradaDados> entradasDados = new ArrayList<>();

    public Leitor(String filePath) throws FileNotFoundException, UnsupportedEncodingException {
        if (Util.isNullOrEmpty(filePath)) {
            throw new FileNotFoundException("Caminho arquivo não especificado.");
        }
        readFile = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
    }

    /**
     * Realiza a leitura linha a linha do arquivo, chamando a cada laço o
     * cenversor de dados para transformar a linha em um objeto do tipo
     * {@link ConversorEntradaDados}
     * @return 
     */
    public List<ConversorEntradaDados> readLines() {
        try {
            String row = readFile.readLine();
            while (row != null) {
                entradasDados.add(new ConversorEntradaDados().converter(row));
                row = readFile.readLine();
            }
            readFile.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        return entradasDados;
    }
}
