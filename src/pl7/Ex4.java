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
public class Ex4 {
    
    public static void reverseVector(int vec[]){
        for(int i = 0, j = vec.length-1; i < vec.length/2; i++, j--){
            int aux = vec[i];
            vec[i] = vec[j];
            vec[j] = aux;
        }
    }
    
    public static void shiftVectorRight(int[] vec){
        int last = vec[vec.length-1];
        for(int i = vec.length - 2; i >= 0; i--){
            vec[i+1] = vec[i];
        }
        vec[0] = last;
    }
    
    public static void shiftVectorLeft(int[] vec){
        int first = vec[0];
        for(int i = 0; i < vec.length - 1; i++){
            vec[i] = vec[i+1];
        }
        vec[vec.length-1] = first;
    }
    
    public static void showVector(int[] vec){
        System.out.println("\nVector: ");
        for(int i = 0; i < vec.length; i++)
            System.out.print(vec[i] + " ");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de numeros:");
        int n = scanner.nextInt();
        int[] vec = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Coloque 1 numero: ");
            vec[i] = scanner.nextInt();
        }
        
        reverseVector(vec);
        showVector(vec);
        
        shiftVectorRight(vec);
        showVector(vec);
        
    }
}
