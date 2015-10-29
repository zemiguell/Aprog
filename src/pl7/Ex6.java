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
public class Ex6 {
    public static String[] visitors = new String[100];
    public static int nElem = 0;
    public static Scanner scanner = new Scanner(System.in);
    
    public static void addVisitor(){
        if(nElem < 100){
            System.out.print("Novo visitante: ");
            String visitor = scanner.nextLine();
            visitors[nElem] = visitor;
            nElem++;
        } else {
            System.out.println("Atingiu limite de visitantes.");
        }
    }
    
    public static void showVisitors(){
        System.out.println("Visitantes:");
        showVector(visitors, nElem);
    }
    
    public static void showVector(String[] vec, int size){
        for(int i = 0; i < size; i++)
            System.out.println(vec[i]);
    }
    
    public static int getVisitorIndex(String visitor){
        return getIndex(visitors, visitor, nElem);
    }
    
    public static int getIndex(String[] vec, String value, int size){
        for(int i = 0; i < size; i++)
            if(vec[i].equals(value))
                return i;
        return -1;
    }
    
    public static void updateVisitor(){
        System.out.print("Visitante a atualizar: ");
        String visitor = scanner.nextLine();
        System.out.print("Novo nome para o visitante: ");
        String newVisitor = scanner.nextLine();
        if(getVisitorIndex(visitor) != -1)
            visitors[getVisitorIndex(visitor)] = newVisitor;
    }
    
    public static void removeVisitor(){
        System.out.print("Visitante a remover: ");
        String visitor = scanner.nextLine();
        int visitorIndex = getVisitorIndex(visitor);
        if(visitorIndex != -1){
            for(int i = visitorIndex; i < nElem - 1; i++){
                visitors[i] = visitors[i+1];
            }
            nElem--;
        }
    }
    
    public static void showVisitorsStartingWithChar(){
        System.out.print("Letra inicial a procurar: ");
        String input = scanner.next();
        char c = input.charAt(0);
        
        System.out.println("Visitantes a começar com: " + c);
        for(int i = 0; i < nElem; i++){
            if(visitors[i].charAt(0) == c){
                System.out.println(visitors[i]);
            }
        }
    }
    
    public static boolean isRepeated(String visitor){
        int count = 0;
        for(int i = 0; i < nElem; i++){
            if(visitors[i].equals(visitor)){
                count++;
            }
        }
        return count >= 2;
    }
    
    public static void showRepeatedVisitors(){
        String[] repeated = new String[100];
        int size = 0;
        for(int i = 0; i < nElem; i++){
            //Cada elemento repetido apenas é adicionado à array 1 vez
            if(isRepeated(visitors[i]) && getIndex(repeated, visitors[i], size) == -1 ){
                repeated[size] = visitors[i];
                size++;
            }
        }
        
        System.out.println("Visitantes repetidos:");
        showVector(repeated, size);
        
    }
    
    public static void showMenu(){
        System.out.println("1- Inserir visitante");
        System.out.println("2- Listar visitantes");
        System.out.println("3- Atualizar visitante");
        System.out.println("4- Eleminar visitante");
        System.out.println("5- Listar visitante começado por letra");
        System.out.println("6- Listar visitantes repetidos");
        
        int option = scanner.nextInt();
        scanner.nextLine(); // é necessario para limpar o \n
        switch(option){
            case 1:
                addVisitor();
                break;
            case 2:
                showVisitors();
                break;
            case 3:
                updateVisitor();
                break;
            case 4:
                removeVisitor();
                break;
            case 5:
                showVisitorsStartingWithChar();
                break;
            case 6:
                showRepeatedVisitors();
                break;
            default:
                System.out.println("Numero invalido!");
                return;
            
        }
        
        System.out.println("**************");
        showMenu();
        
        
    }
    
    public static void main(String args[]){
        showMenu();
    }
}
