/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tgs13.bingo;

import java.util.Arrays;
import java.util.Random;
import javax.swing.DefaultListModel;


/**
 *
 * @author Pichau
 */
public class OperacoesBingo {
    
        
    public static int Aleatorio (int a, int sel) { // Gera o numero aleatorio 
        
        Random rand = new Random();
        
        a = rand.nextInt(sel) + 1;
                        
        return a;
        
        
    }
    
    
        
        public static boolean TestarIgual (boolean test, int[] bingo4, int random) { // testa se tem o numero random no vetor
        
            for (int contador = 0; contador < bingo4.length; contador++) {
            
                if (random == bingo4[contador]) { 
                
                test = true;
                 
                break;
                
                }
                
                
            test = false;
            }
        
                
        return test;
        
        
        
        }
    
    
    
    public static DefaultListModel AdicionarElementosLista (DefaultListModel lista, int[] bingo3) { // adiciona elementos na lista
        
        lista.removeAllElements();
        
        for (int contador = 0; contador < bingo3.length; contador++) {
            
            if (bingo3[contador] != 0) {
                
                lista.addElement(bingo3[contador]);
                
            }
            
        }
        
        return lista;
        
    }
    
    public static int[] AdicionarAoVetor (int[] bingo2, int random) { // adiciona o random ao vetor
        
        for (int contador = 0; contador < bingo2.length; contador++) {
            
            if (bingo2[contador] == 0) { 
                
                bingo2[contador] = random;
                break;
                
            }
            
            
            
            
        }
        
        return bingo2;
        
    }
    
    public static DefaultListModel FaltaSortear (DefaultListModel lista, int[] bingo, int random) {
        
        
        lista.setElementAt(random + " ------ Já Sorteado!", random-1);
       
            
         
            
        
        
             
        
    
        
        return lista;
            
        
        
        
    }
    
    public static DefaultListModel FillList (DefaultListModel lista, int[] bingo) {
        
        for (int contador = 0; contador < bingo.length; contador++) {
            
            lista.add(contador,contador + 1);
                
            }
            
            
            return lista;
            
        }
    
    public static int[] SetArrayLenght (int[] vetor, int selecionado) {
        
        int novo[] = new int[selecionado];
        
        return novo;
        
        
        
    }
        
        
        
    }
