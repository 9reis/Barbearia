/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Rubem
 */
public class AgendaController {
    public final Agenda view;
    private final AgendaHelper helper; 

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela( ){
        //Busca Lista com agendamentos do banco 
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        // Exibir a Lista na view 
        helper.preencherTabela(agendamentos);
    }
    
}
