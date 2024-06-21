/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista;

/**
 *
 * @author isadora
 */
import java.util.Scanner;

// Questão OBI 2021 Fase 2 Lista Palíndroma
public class Lista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantNum = scanner.nextInt();
        scanner.nextLine();
        String stringNumeros = scanner.nextLine();
        String regex = "[ ]";
        String[] array = stringNumeros.split(regex);
        
        // cria vetor de inteiros com os valores lidos
        int[] numerosArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            numerosArray[i] = Integer.parseInt(array[i]);
        }
        
        int contador = 0;
        //iterar sobre a lista fazendo as contrações de necessário
        if(verificaPalindromo(numerosArray)){
            System.out.println(contador);
        } else if(!verificaPalindromo(numerosArray)){
            contrai(numerosArray);
            
        }
        
        
        
        
        
    }
    
    public static boolean verificaPalindromo(int[] nums){
        int tamanho = nums.length;
        for(int i=0; i<nums.length; i++){
            if(!(nums[i] == nums[(tamanho-i-1)])){
                return false;
            }
        }
        
        return true;
    }
    
    public static void contrai(int[] nums){
        int contador = 0;
        int tam = nums.length;
        boolean palindromoEncontrado = false;
        for(int i=0; i<nums.length; i++){
            int pivot = nums[i];
            for(int j=0; j<nums.length; j++){
                int soma = nums[j] + nums[j+1];
                int[] newNums = new int[tam - 1];
                newNums[0] = soma;
                // cria novo array contraido
                for(int w=1; w<newNums.length; w++){
                    newNums[w] = nums[w+1];
                }
                contador++;
                
                palindromoEncontrado = verificaPalindromo(newNums);
                
                if(palindromoEncontrado){
                    break;
                }
                
                if(nums.length == 2){
                    break;
                }
            }
            
            if(palindromoEncontrado){
                break;
            }
        }
        
        System.out.println(contador);
    
    }
}
