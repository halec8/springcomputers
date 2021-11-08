package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Cody Hale - chale CIS175 - Fall 2021 Oct 20, 2021
 */

@Entity
public class Computers {

	// will be a unique id that will identify each added computer
	@Id
	@GeneratedValue
	private long id;

	// each computer will have a brand, Apple, Lenova, Dell, HP for example
	private String brand;

	// each computer should have a model type
	private String model;

	// each computer should have a individual year released
	private int yearReleased;

	// multiple sizes available
	private int screenSize;

	// desktop or laptop
	private String type;

	// instance of the address class to gather shipping information
	@Autowired
	private ShippingAddress shippingAddress;

	public Computers() {
		super();

	}

	public Computers(String type, String brand, String model, int yearReleased, int screenSize) {
		super();

		this.brand = brand;
		this.model = model;
		this.yearReleased = yearReleased;
		this.screenSize = screenSize;
		this.type = type;
	}

	public Computers(int id, String type, String brand, String model, int yearReleased, int screenSize) {
		super();

		this.id = id;
		this.brand = brand;
		this.model = model;
		this.yearReleased = yearReleased;
		this.screenSize = screenSize;
		this.type = type;

	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the yearReleased
	 */
	public int getYearReleased() {
		return yearReleased;
	}

	/**
	 * @param yearReleased the yearReleased to set
	 */
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	/**
	 * @return the screenSize
	 */
	public int getScreenSize() {
		return screenSize;
	}

	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the shippingAddress
	 */
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "Computer [id = " + id + ", type = " + type + ", brand = " + brand + ", model = " + model
				+ ", year released = " + yearReleased + ", screen size = " + screenSize + "] " + "Shipping Address: "
				+ shippingAddress;
	}

}
