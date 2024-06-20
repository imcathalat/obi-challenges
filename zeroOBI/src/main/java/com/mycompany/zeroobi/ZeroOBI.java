/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zeroobi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isadora
 */
public class ZeroOBI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int indexAnterior = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        System.out.println("");
        int n = scanner.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.println("");
            int num = scanner.nextInt();
            
            if (num != 0){
                numeros.add(num);
                indexAnterior++;
            }
            
            if(num == 0){
                numeros.remove(numeros.indexOf(numeros.get(indexAnterior-1)));
                indexAnterior--;
            }
        }
        
        
        for(int j=0; j<numeros.size(); j++){
            soma += numeros.get(j);
        }
        System.out.println(soma);
        
    }
}
