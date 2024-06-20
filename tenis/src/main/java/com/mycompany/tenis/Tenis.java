/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tenis;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isadora
 */
public class Tenis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> niveis = new ArrayList<>();
        ArrayList<Integer> diferencasNiveis = new ArrayList<>();
        
        for(int i=0; i<4; i++){
            int nivel = scanner.nextInt();
            niveis.add(nivel);
        }
        
        //soma todos os numeros do arrayList
        int soma =0;
        for(int i=0; i<niveis.size(); i++){
            soma += niveis.get(i);
        }
        
        // identifica um pivor para fazer as somas
        int pivot = niveis.get(0);
       
        for(int i=1; i<niveis.size(); i++){
            int soma1 = pivot + niveis.get(i);
            // acha a soma dos dois valores que sobram
            int soma2 = soma - soma1;
            System.out.println("Soma2: " + soma2);
            
            if(soma1 > soma2){
                int diff = soma1 - soma2;
                diferencasNiveis.add(diff);
            }
            
            if(soma2 > soma1) {
                int diff = soma2 - soma1;
                diferencasNiveis.add(diff);
            }
        }
   
        
        // ordena o array que armazena as diferenças e pega o primeiro lugar
        for(int i = diferencasNiveis.size() - 1; i<0; i--){
            boolean swapped = false;
            for(int j=0; j<i; j++){
                int temp = diferencasNiveis.get(j);
                
                if(diferencasNiveis.get(j) > diferencasNiveis.get(j+1)){
                    diferencasNiveis.remove(j);
                    diferencasNiveis.set(j, diferencasNiveis.get(j+1));
                    diferencasNiveis.remove(j+1);
                    diferencasNiveis.set(j+1, temp);
                    
                    swapped = true;
                }
                
                if(!swapped){ break;}
            }
        }
        
        System.out.println(diferencasNiveis.get(0));
    }
}
