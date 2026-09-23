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
        
        ContaPF conta01 = new ContaPF("0123456789","Aika");
        conta01.apresentar();
        conta01.depositar(50.0);
        conta01.estratoBancario();
        conta01.sacar(12.0);
        conta01.estratoBancario();
        
        System.out.println("----------");
        ContaPJ conta2 = new ContaPJ("112233445566","Orlando");
        conta2.apresentar();
        conta2.depositar(10.0);
        conta2.estratoBancario();
        conta2.sacar(6.0);
        conta2.estratoBancario();
    }
}
