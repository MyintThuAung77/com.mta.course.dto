package com.mta.course.dto.useraccount;

public class LoginResponseDTO {
	private UserAccountDTO userAccount;
	private String sessionId;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public UserAccountDTO getUserAccountDTO() {
		return userAccount;
	}

	public void setUserAccountDTO(UserAccountDTO userAccount) {
		this.userAccount = userAccount;
	}

	@Override
	public String toString() {
		return "LoginResponseDTO [userAccount=" + userAccount + ", sessionId=" + sessionId + "]";
	}

}
