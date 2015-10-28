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
public class Ex2 {

    public static int leitura(String [] funcionarios, double [] ordenados){
      Scanner scan = new Scanner(System.in);
      double ordenado;
      System.out.println("nome: ");
      String funcionario = scan.next();
      int nElem = 0;
      while(!funcionario.equals("tt")){
          System.out.println("ordenado: ");
          ordenado = scan.nextDouble();
         
          funcionarios[nElem] = funcionario;
          ordenados[nElem] = ordenado;
          nElem++;
         
          System.out.println("nome: ");
          funcionario = scan.next();
      }
      return nElem;
    }
   
    public static double media(double[] ordenados, int nElem){
        double media = 0;
        for(int i =0; i < nElem; i++){
            media = media + ordenados[i];
        }
        media = (double)media/nElem;
        return media;
    }
    public static void listarBaixoVencimento(String [] funcionarios, double [] ordenados, double media, int nElem){
       
        System.out.println("Baixo rendimento: ");
        for(int i = 0; i < nElem; i++){
            if(ordenados[i] < media){
                System.out.println(funcionarios[i]);
            }
        }
       
    }
   
    public static void percentagemVencimentoInferior(String [] funcionarios, double [] ordenados, double valor, int nElem){
       
        int contador = 0;
        for(int i = 0; i < nElem; i++){
            if(ordenados[i] < valor){
                contador++;
            }
        }
       
        System.out.println("Funcionarios com rendimento inferior a " + valor + " : " + (double)contador/nElem * 100 + "%");
       
    }
   
   
    public static void main(String[] args) {
        String [] funcionarios = new String[50];
        double [] ordenados = new double [50];
        int nElem = leitura(funcionarios, ordenados);
        double media = media(ordenados, nElem);
        percentagemVencimentoInferior(funcionarios, ordenados, 100, nElem);
    }
   
}
