/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Rubem
 */
public class Main {
    public static void main(String[ ] args){
        
        String nome = "reis";
        System.out.println("");
        
        Servico barba = new Servico( 1, "barba", 30);
        System.out.println(barba.getDescricao());
        System.out.println("R$ " + barba.getValor());
        
        Cliente cliente = new Cliente(1, "Lucas'", "Rua teste", "2123124124");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "Lucas", "123456");
        System.out.println(usuario.getSenha());
        
        Pessoa pessoa = new Pessoa(01, "teste");
    }
}
