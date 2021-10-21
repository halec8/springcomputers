package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */

@Embeddable
public class ShippingAddress {
	
	private String street;
	private String city;
	private String state;
	
	public ShippingAddress() {
		super();
	}
	
	public ShippingAddress(String street, String city, String state) {
		super();
		
		this.street = street;
		this.city = city;
		this.state = state;
		
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		return "[street = " + street + ", city = " + city + ", state = " + state + "]";
	}
	
}
