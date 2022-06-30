package q2;

import java.io.Serializable;

public class Address implements Serializable {
	private String state;
	private String city;
	private String pincde;
	
	public Address() {
		
	}
	
	public Address(String state, String city, String pincde) {
		this.state = state;
		this.city = city;
		this.pincde = pincde;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincde() {
		return pincde;
	}
	public void setPincde(String pincde) {
		this.pincde = pincde;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincde=" + pincde + "]";
	}
	
	
}