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
                System.out.println("Valor do depósito inválido!");
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
    
    public void verificarSaldo(){
        if (saldo == 0){
           System.out.println("Conta sem saldo!");
        }else if (this.saldo > 0 && this.saldo >=500){
            System.out.println("Saldo baixo!");
        }else if (this.saldo > 500 && this.saldo <= 2000){
            System.out.println("saldo normal");
        }else  if(this.saldo > 2000){
           System.out.println("Saldo elevado!");
        }
      }
        
        
    public void estratoBancario(){
     System.out.println("Saldo: " + this.saldo);
    
       
     }        
    }  
    
