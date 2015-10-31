/*
 * The MIT License
 *
 * Copyright 2015 Rui Almeida.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package pl7;

import java.util.Scanner;

/**
 *
 * @author Rui Almeida
 */
public class Ex5 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static int lerNomes(String[] nomes){
        System.out.println("Coloque 1 lista de nomes terminada com FIM");
        int nElem = 0;
        String nome = scanner.nextLine();
        while(!nome.equals("FIM")){
            nomes[nElem] = nome;
            nElem++;
            nome = scanner.nextLine();
        }
        return nElem;
    }
    
    public static String apelido(String nome){
        int lastSpacePos = nome.lastIndexOf(" ");   
        return nome.substring(lastSpacePos + 1, nome.length());
    }
    
    public static void mostrarListagem(String[] nomes, int nElem){
        for(int i = 0; i < nElem; i++)
            System.out.println(nomes[i]);
    }
    
    public static int preencherVetorApelidosS(String[] v1, String[]v2, int nElem){
        int n = 0;
        for(int i = 0; i < nElem; i++)
            if(apelido(v1[i]).charAt(0) == 'S')
                v2[n++] = v1[i];
        return n;
    }
    
    public static void main(String[] args){
        String[] nomes = new String[100];
        String[] nomesApelidosS = new String[100];
        
        int nElem = lerNomes(nomes);
        System.out.println("Todos os nomes:");
        mostrarListagem(nomes, nElem);
        
        int nElemApelidosS = preencherVetorApelidosS(nomes, nomesApelidosS, nElem);
        System.out.println("Todos os nomes com apelidos começados com S:");
        mostrarListagem(nomesApelidosS, nElemApelidosS);
        
        System.out.println("Percentagem dos nomes com apelidos começados com S: " +
                                (double)nElemApelidosS/nElem * 100 + "%");
    }
    
}
