/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baralhoobi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isadora
 */

// iterar sobre a entrada e criar um array de string que possuem 3 caracteres cada elemento
// iterar sobre esse array verificando a existência de uma das letras 
// incrementar 1 ao contador daquele tipo de carta
public class BaralhoOBI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allCartas = new ArrayList<String>();
        int cartasC = 0, cartasE = 0, cartasU = 0, cartasP = 0;
        int cartasFaltantesC, cartasFaltantesE, cartasFaltantesU, cartasFaltantesP;
        
        
        System.out.println("");
        String entrada = scanner.nextLine();
        
        String entradaSemEspacos = entrada.trim();
        
        allCartas = separaEmArray(entradaSemEspacos);
        
        for(int i=0; i<allCartas.size(); i++){
            String carta = allCartas.get(i);
            if(carta.endsWith("P")){
                cartasP += 1;  
            }
            if(carta.endsWith("C")){
                cartasC += 1;  
            }
            if(carta.endsWith("E")){
                cartasE += 1;  
            }
            if(carta.endsWith("U")){
                cartasU += 1;  
            } 
        }
        
        cartasFaltantesC = 13 - cartasC;
        cartasFaltantesE = 13 - cartasE;
        cartasFaltantesU = 13 - cartasU;
        cartasFaltantesP = 13 - cartasP;
        
        
        System.out.println((13 - cartasC)+ "\n" + (13-cartasE) + "\n" + (13 - cartasU) + "\n" + (13 - cartasP));
    }
    
    public static ArrayList<String> separaEmArray(String entradaSemEspacos){
        ArrayList<String> allCartas = new ArrayList<String>();
        
        int pedacoFinal = 3;
        int inicio = 0;
        
        int vezesParaIterar = entradaSemEspacos.length()/3;
        
        for(int i=0; i<vezesParaIterar; i++){
            allCartas.add(entradaSemEspacos.substring(inicio, pedacoFinal));
            pedacoFinal += 3;
            inicio += 3;
        }
        
        return allCartas;
        
        //for(int j=0; j<allCartas.size(); j++){
        //   System.out.println(allCartas.get(j));
        //}
  
    }
}
