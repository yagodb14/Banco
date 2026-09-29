/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author yago62977756
 */
public class ContaBancaria {
    private double saldo;
    private String titular;
    
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.00;
    }  
    
    
    
    public String getTitular(){
        return  this.titular;
    }
    
    public Double getSaldo(){
        return this.saldo;
    }
    
    public void setTitular(String nome){
        this.titular = nome;
    }
    
    public void depositar(double valor){
            if (valor > 0 ){
                this.saldo = this.saldo + valor;
                System.out.println("Depósito realizado com sucesso!");
         }else{
                System.out.println("Valor do depósito invalido!");
         }
            
      }
    
    public void sacar(double valor){
        //verifica se o valor do saque e positivo e se o valor do saque e menor que o saque disponivel
        if (valor > 0 && valor <= this.saldo){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!!");
        }else{
            System.out.println("Saque insuficiente!!!!");
        }
    }
    public void estratoBancario(){
        if(saldo = 0){
        System.out.println("Saldo igual a zero! ");
        }else if(saldo = 0){
        System.out.println("Conta sem saldo");
        }else(saldo > 0 && saldo <= 500){
        System.out.println("Valor irregular!!");
        }else(saldo <5){
        System.out.println("Valor baixo!");
        }else(saldo >=500 && saldo <=2000){
        System.out.println("Valor não encontrado");
        }else(saldo <= 30000){
        System.out.println("Saldo normal!");
        }else(saldo >2000){
        System.out.println("Saldo acima!!");
        }else(saldo > 100000){
        System.out.println("Valor elevado!!");
    }
        public void menu(){
        System.out.println("--------CONTA BANCARIA-----------");
        switch(titular){
            case 1:
              System.out.println("Valor que deseja depositar: ");
             break;
            case 2:
              System.out.println("");
             break;     
            case 3:
              System.out.println("");
             break; 
            case 4:
              System.out.println("");
             break; 
            case 5:
              System.out.println("");
             break; 
        }
      }
    } 
    
     public void apresentar(){}
     
     
   
}
