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
package pl8;

import java.util.Scanner;

/**
 *
 * @author Rui Almeida
 */
public class Ex1 {
    
    //Ordem descrescente
    public static void sortVec(int[] vec, int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = i+1; j < n; j++){
                if(vec[i] < vec[j]){
                    int aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de numeros:");
        int n = scanner.nextInt();
        int[] vec = new int[n];
        System.out.println("Coloque a lista de numeros:");
        for(int i = 0; i < n; i++){
            vec[i] = scanner.nextInt();
        }
        
        System.out.println("Quantidade de numeros maiores:");
        int m = scanner.nextInt();
        
        sortVec(vec, n);
        
        System.out.println("Lista dos " + m + " maiores numeros:");
        for(int i = 0; i < m; i++){
            System.out.println(vec[i]);
        }
        
    }
    
}
