package com;

public class Email {
	private String destinatario;
	private String cco;
	private String subject;
	private String content;
	
	public Email() {
		
	}

	public Email(String destinatario, String cco, String subject, String content) {
		super();
		this.destinatario = destinatario;
		this.cco = cco;
		this.subject = subject;
		this.content = content;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getCco() {
		return cco;
	}

	public void setCco(String cco) {
		this.cco = cco;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Email [destinatario=" + destinatario + ", cco=" + cco + ", subject=" + subject + ", content=" + content
				+ "]";
	}
	
	

}
