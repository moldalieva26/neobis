package neobistasks.week3;

public class Favorites {
	private Long id; //?
	private Long product_id;
	private Long customer_id;
	
	public Favorites() {
		
	}
	
	
	public Favorites(Long id, Long product_id, Long customer_id) {
		super();
		this.id = id;
		this.product_id = product_id;
		this.customer_id = customer_id;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getProduct_id() {
		return product_id;
	}


	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}


	public Long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	
	

}
