/**************************************************
 * Purpose : It is a POJO concept program to store contact details
 * @author Rosy Rupali
 * @since 09-07-2021
 *
 *************************************************/
package model;

public class ContactDetails {
	private String first_name;
	private String last_name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phone_number;
	private String email_id;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	@Override
	public String toString() {
		return "ContactDetails [first_name=" + first_name + ", last_name=" + last_name + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone_number=" + phone_number
				+ ", email_id=" + email_id + "]";
	}

}