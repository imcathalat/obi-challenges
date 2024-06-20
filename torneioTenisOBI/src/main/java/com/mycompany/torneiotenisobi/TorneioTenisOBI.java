/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torneiotenisobi;

import java.util.Scanner;

/**
 *
 * @author isadora
 */
public class TorneioTenisOBI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultadoFinal = 0;
        
        for(int i=0; i<6; i++){
            System.out.println("");
            String resultado = scanner.nextLine();
            
            if("V".equals(resultado)){
                resultadoFinal++;
            }
        }
        
        switch(resultadoFinal){
            case 0 -> System.out.println(-1);
            case 1 -> System.out.println(3);
            case 2 -> System.out.println(3);
            case 3 -> System.out.println(2);
            case 4 -> System.out.println(2);
            case 5 -> System.out.println(1);
            case 6 -> System.out.println(1);
        }
    }
}
