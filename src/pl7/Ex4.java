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
