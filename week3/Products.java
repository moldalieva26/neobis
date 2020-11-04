package neobistasks.week3;

public class Products {
	
	private Long id;
	private String product_name;
	private Float price;
	private Long category_id;
	private String description; 
	private Boolean in_stock;
	private Integer quantity_available;
	
	public Products() {
		
	}

	
	
	public Products(Long id, String product_name, Float price, Long category_id, String description, Boolean in_stock,
			Integer quantity_available) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.price = price;
		this.category_id = category_id;
		this.description = description;
		this.in_stock = in_stock;
		this.quantity_available = quantity_available;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIn_stock() {
		return in_stock;
	}

	public void setIn_stock(Boolean in_stock) {
		this.in_stock = in_stock;
	}

	public Integer getQuantity_available() {
		return quantity_available;
	}

	public void setQuantity_available(Integer quantity_available) {
		this.quantity_available = quantity_available;
	}
	
	
	
	
	
	

}
