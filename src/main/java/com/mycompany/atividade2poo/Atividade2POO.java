/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2poo;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Atividade2POO {

    public static void main(String[] args) {
        int qtd_num=0, soma=0, maior_num=0, menor_num=0, temp;
        double media=0;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print("Digite um valor ou digite -1 para parar: ");
            temp = scan.nextInt();
            
            if(temp != -1){
                soma += temp;
                
                if(qtd_num == 0){
                    menor_num = temp;
                    maior_num = temp;
                }
                else{
                    if(temp < menor_num){
                        menor_num = temp;
                    }
                    if(temp > maior_num){
                        maior_num = temp;
                    }
                }
            qtd_num++;
            }            
        }while(temp != -1);
        
        media = (double) soma/qtd_num;
        System.out.println("Quantidade de numeros digitados: "+qtd_num);
        System.out.println("menor numero digitado: "+menor_num);
        System.out.println("Maior numero digitado: "+maior_num);
        System.out.println("Média dos valores: "+media);
    }
}
