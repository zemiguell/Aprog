/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

import java.util.Scanner;

/**
 *
 * @author Rui
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
        // TODO code application logic here
        String [] funcionarios = new String[50];
        double [] ordenados = new double [50];
        int nElem = leitura(funcionarios, ordenados);
        double media = media(ordenados, nElem);
        percentagemVencimentoInferior(funcionarios, ordenados, 100, nElem);
    }
   
}
