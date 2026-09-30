/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.banco;

import java.util.Scanner;

/**
 *
 * @author yago62977756
 */
public class Banco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        String cpf;
        
        
        ContaBancaria conta1 = new ContaBancaria("pedro");
        
        int opcao;
     
        do{
             System.out.println("=========Conta Bancaria");
         System.out.println("1- Depositar");
         System.out.println("2- Sacar");
         System.out.println("3- Consulatar Saldo");
         System.out.println("4- Verificar situação da conta");
         System.out.println("5- Sair");
         
        opcao = entrada.nextInt();
         
         switch (opcao){
             case 1: 
               System.out.println("Digite o valor a ser depositado!");
               double valorDeposito = entrada.nextDouble();
             conta1.depositar(valorDeposito);
           break;
                 
             case 2:
                 System.out.println("Digite o valor a ser sacado!");
                 double valorSaque = entrada.nextDouble();
                 conta1.sacar(valorSaque);
           break;
           
             case 3:
                conta1.estratoBancario();
            break;
            
             case 4:
                conta1.verificarSaldo();
           break;
           
             case 5:
                 
                 break;
        }
        }while(opcao != 5);
         
         
  
         
    }
}
