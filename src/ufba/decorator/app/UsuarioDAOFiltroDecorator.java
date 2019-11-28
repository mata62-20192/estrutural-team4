package ufba.decorator.app;

import ufba.decorator.lib.Usuario;
import ufba.decorator.lib.UsuarioDAO;
//Sub classe que é responsavel por filtrar o usuario
public class UsuarioDAOFiltroDecorator extends UsuarioDAODecorator{
	
	protected UsuarioDAOFiltroDecorator(UsuarioDAO usuarioDAO) {
		super(usuarioDAO);
	}
	@Override
	public void inserir(Usuario u) {
		if(UsuarioUtils.ehValido(u)) { usuarioDAO.inserir(u); }
		else{ usuarioDAO.inserir(UsuarioUtils.filtraEntrada(u)); }
	}
	@Override
	public Usuario obter(String username) {
		Usuario user = usuarioDAO.obter(username);
		if(UsuarioUtils.ehValido(user)) { return user; }
		else{ return UsuarioUtils.filtraEntrada(user); } 
	}

}