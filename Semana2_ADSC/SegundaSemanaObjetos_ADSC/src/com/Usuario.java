package com;

public class Usuario {
	
	private String nickName;
	private String email;
	private boolean registred;
	private int cellNumber;
	
	public Usuario() {
		
	}

	public Usuario(String nickName, String email, boolean registred, int cellNumber) {
		super();
		this.nickName = nickName;
		this.email = email;
		this.registred = registred;
		this.cellNumber = cellNumber;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isRegistred() {
		return registred;
	}

	public void setRegistred(boolean registred) {
		this.registred = registred;
	}

	public int getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(int cellNumber) {
		this.cellNumber = cellNumber;
	}

	@Override
	public String toString() {
		return "Usuario [nickName=" + nickName + ", email=" + email + ", registred=" + registred + ", cellNumber="
				+ cellNumber + "]";
	}
	
	
}
