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

/**
 *
 * @author Rui Almeida
 */
public class Ex2 {
    
    public static void showMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void showCompositeMatrix(int[][] m){
        for(int i = 0; i < m[0].length; i++){
            for(int j = 0; j < m.length; j++){
                System.out.print(m[j][i]);
            }
            System.out.println();
        }
    }
    
    public static void averageColumns(int[][] m){
        for(int i = 0; i < m[0].length; i++){
            int sum = 0;
            for(int j = 0; j < m.length; j++){
                sum += m[j][i];
            }
            System.out.println("Media da coluna " + i + ": " + (double)sum/m.length);
        }
    }
    
    public static void averageGlobal(int[][] m){
        int sum = 0;
        int counter = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                sum += m[i][j];
                counter++;
            }
        }
        
        System.out.println("Media global da matriz: " + (double)sum/counter);
    }
    
    public static void main( String[] args ) {
        
        /*
        Faz print do elemento maior de cada linha
        */
        int x;
        int m[][] = {{1,4,2,1},
                     {9,7,2,2},
                     {1,7,3,5},
                     {2,5,0,3},
                     {4,7,2,1}};
        for ( int i=0; i < m.length; i++) {
            x = m[i][0];
            for (int j=1; j < m[i].length; j++)
                if (m[i][j] > x)
                    x = m[i][j];
            //System.out.println(x);
        }        
        
        //showMatrix(m);
        
        averageColumns(m);
        showCompositeMatrix(m);
    }                
}
