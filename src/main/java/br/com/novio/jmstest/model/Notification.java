package br.com.novio.jmstest.model;

public class Notification {
	
	private String mensagem;

	
	public Notification() {
		super();
	}

	public Notification(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Notification [mensagem=" + mensagem + "]";
	}
	
}
