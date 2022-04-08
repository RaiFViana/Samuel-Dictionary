import java.io.FileReader;
import java.io.BufferedReader;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.samdict;

/**
 *
 * @author Raí
 */


public class DicioSamuca {

    /**
     * @param args the command line arguments
     */
    
    public static String [] dicionario = new String[1000]; // Cria'ao da String e limita'ao de palavras;

    public static int totalPalavras =  0; //Contabiliza;ao do br de oakavras
    
    public static void main(String[] args) {
        
        
        
        
    }
    
}

//funcao para ler o arquivo;
public static void lerArquivo (String arquivo) throws Exception {

    //FileReader para acessar o arquivo.
    //substuir o (arquivo) pelo diretorio do aquivo.
    //
    BufferedReader br = new BufferedReader(new FileReader(arquivo));

    String line = br.readline(); //String responsavel pela leitura das linhas;
    String frases[]; //Var que vai receber as linhas p/ separa;ao das palavras;

//A condi;ao se mantem falsa ate acabar as palavras;   
boolean fim = false;
    while(fim){
        line = br.readline();
        if (linha == null) {
        break;
    }
    //uso da fun;ao toLowerCase p/ deixar o codigo case insentive;
    //uso da fun;ao split (" ") p/ separa;ao das palavras
    frases = line.toLowerCase().split(" ");    
}

    


    
}
