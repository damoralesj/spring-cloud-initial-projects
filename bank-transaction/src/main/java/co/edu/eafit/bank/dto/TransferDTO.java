package co.edu.eafit.bank.dto;

public class TransferDTO {

	private String accoIdOrigin;
	private String accoIdDestination;
	private Double amount;
	private String userEmail;
	private String token;
	
	public TransferDTO(String accoIdOrigin, String accoIdDestination, Double amount, String userEmail, String token) {
		super();
		this.accoIdOrigin = accoIdOrigin;
		this.accoIdDestination = accoIdDestination;
		this.amount = amount;
		this.userEmail = userEmail;
		this.token = token;
	}

	public TransferDTO() {
		super();
	}

	public String getAccoIdOrigin() {
		return accoIdOrigin;
	}

	public void setAccoIdOrigin(String accoIdOrigin) {
		this.accoIdOrigin = accoIdOrigin;
	}

	public String getAccoIdDestination() {
		return accoIdDestination;
	}

	public void setAccoIdDestination(String accoIdDestination) {
		this.accoIdDestination = accoIdDestination;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	

}
