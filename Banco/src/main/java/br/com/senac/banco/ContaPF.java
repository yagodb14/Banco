/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author yago62977756
 */
public class ContaPF extends ContaBancaria{
    private String cpf;
    
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public ContaPF(String cpf, String titular){
        super(titular);
        this.cpf = cpf;
    }
    
    @Override
    public void apresentar(){
        System.out.println("Conta pessoa física.");
    }
 
}
