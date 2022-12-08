/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
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
        
        Servico  servico = new Servico( 1, "barba", 30);
        Cliente  cliente = new Cliente(1, "Lucas'", "Rua teste", "2123124124");
        Usuario usuario = new Usuario(1, "Barbeiro", "123456");
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "09/12/2022 10:00");
        System.out.println( agendamento.getCliente().getNome());
    }
}
