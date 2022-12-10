/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Rubem
 */
public class LoginController {
    public final Login view;
    private final LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //>>>  Pegar um usuario da View e transforma em uma Entidade/Model Usuario
        Usuario usuario = helper.obterModelo();
        
        //Pesquisar usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        // Se o usuario da view tiver o mesmo usuario e senha que o usuario que veio do banco , redireciona para o menu principal
        if(usuarioAutenticado != null ){
            //Navegar para menu principal 
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true); 
            this.view.dispose();
        // Se não mostrar msg "Usuario ou senha invalidos" 
        }else{
            view.exibeMensagem("Usuario ou Senha invalidos");
        }
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
