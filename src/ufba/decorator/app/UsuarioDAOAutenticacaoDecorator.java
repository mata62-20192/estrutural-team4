package ufba.decorator.app;

import ufba.decorator.lib.Usuario;
import ufba.decorator.lib.UsuarioDAO;

public class UsuarioDAOAutenticacaoDecorator extends UsuarioDAODecorator {
	private String ip;

	public UsuarioDAOAutenticacaoDecorator(UsuarioDAO usuarioDAO, String ip) {
		super(usuarioDAO);
		this.ip = ip;
	}
	@Override
	public void apagarTudo() {
		if(UsuarioUtils.ehAdministrador(ip)) { usuarioDAO.apagarTudo(); }
	}

	@Override
	public void inserir(Usuario u) {
		if(UsuarioUtils.ehAdministrador(ip)) { usuarioDAO.inserir(u); }
	}

	@Override
	public Usuario obter(String username) {
		if(UsuarioUtils.ehAdministrador(ip)) { return usuarioDAO.obter(username); }
		return null;
	}
}