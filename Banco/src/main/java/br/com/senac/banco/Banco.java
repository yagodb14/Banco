/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.banco;

/**
 *
 * @author yago62977756
 */
public class Banco {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Yago");
        
        conta1.depositar(100);
        conta1.estratoBancario();
        conta1.sacar(10);
        conta1.estratoBancario();
        
        System.out.println(conta1.getTitular());
        System.out.println(conta1.getSaldo());
        
        conta1.setTitular("Yago Daniel");
        System.out.println(conta1.getTitular());
    }
}
