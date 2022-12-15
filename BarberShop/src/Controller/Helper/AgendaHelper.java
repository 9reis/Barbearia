/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rubem
 */
public class AgendaHelper {
    private final Agenda view; 

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        // Pega o modelo da TB // O conteudo 
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos( ).getModel();
        tableModel.setNumRows(0);
        
        //Percorrer a lista preenchedo o TB model 
        for(Agendamento agendamento : agendamentos ){
            tableModel.addRow(new Object[ ]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
            
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboboxCliente().getModel();
        
        for(Cliente cliente : clientes){
            comboBoxModel.addElement(cliente);
        }
    }

    public void preecherServico(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboboxServico().getModel();
        
        for(Servico servico : servicos){
            comboBoxModel.addElement(servico);
        }
    }
     
    
}
