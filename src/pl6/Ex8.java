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

/**
 *
 * @author Rui Almeida
 */
public class Ex8 {
    
    public static String reverseString(String text){
        String reversed = "";
        for(int i = text.length() - 1; i >= 0; i--){
            reversed += text.charAt(i);
        }
        return reversed;
    }
   
    public static String dec2hex(int dec){
        String hex = "";
        int digito;
        do{
            digito = dec % 16;
           
            switch(digito){
                case 10:
                    hex += 'A';
                    break;
                case 11:
                    hex += 'B';
                    break;
                case 12:
                    hex += 'C';
                    break;
                case 13:
                    hex += 'D';
                    break;
                case 14:
                    hex += 'E';
                    break;
                case 15:
                    hex += 'F';
                    break;
                default:
                    hex += digito;
            }
           
            dec = dec / 16;
        } while (dec > 0);
       
       
        return reverseString(hex);
    }
   
 
    public static void main(String[] args) {
        System.out.println(dec2hex(64123));
    }
   
}