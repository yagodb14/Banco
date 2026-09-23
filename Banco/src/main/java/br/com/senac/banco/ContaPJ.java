/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author yago62977756
 */
public class ContaPJ extends ContaBancaria{
    private String cnpj;
    
    public String getContaPJ(){
        return this.cnpj;
    }
    
    public void setContaPJ(String cnpj){
        this.cnpj = cnpj;
    }
    
    public ContaPJ(String cnpj, String titular){
        super(titular);
        this.cnpj = cnpj;
    }
    
    @Override
    public void apresentar(){
        System.out.println("Conta pessoa júridica.");
    }
}
