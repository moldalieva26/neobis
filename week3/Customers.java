package neobistasks.week3;

public class Customers {
	
	private Long id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number; 
	private String address_line1;
	private String address_line2;
	private String city;
	private String province;
	private String country;
	private Integer postal_code; 

	
	public Customers() {
		
	}
	

	public Customers(Long id, String first_name, String last_name, String email, String phone_number,
			String address_line1, String address_line2, String city, String province, String country,
			Integer postal_code) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.province = province;
		this.country = country;
		this.postal_code = postal_code;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getAddress_line1() {
		return address_line1;
	}


	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}


	public String getAddress_line2() {
		return address_line2;
	}


	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Integer getPostal_code() {
		return postal_code;
	}


	public void setPostal_code(Integer postal_code) {
		this.postal_code = postal_code;
	}
	
	
		

}
