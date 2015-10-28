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
package pl6;

import java.util.Scanner;

/**
 *
 * @author Rui Almeida
 */
public class Ex7 {
    
    public static String reverseString(String text){
        String reversed = "";
        for(int i = text.length() - 1; i >= 0; i--){
            reversed += text.charAt(i);
        }
        return reversed;
    }
   
   public static boolean isOctal(int num){
       int digito;
       do{
           digito = num % 10;
           if (digito > 7)
               return false;
           num = num/10;
               
         
       } while (num >0);
       return true;    
   }
   
   public static int oct2dex(int num){
       int i = 0;
       int oct = 0;
       do{
           int digito = num % 10;
           oct = (int) (oct + digito*Math.pow(8, i));
           num = num / 10;
           i++;
                   
       } while (num>0);
       return oct;
   }
   
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (isOctal (num)){
            System.out.println(oct2dex(num));
            num = scanner.nextInt();
        }
    }
   
}