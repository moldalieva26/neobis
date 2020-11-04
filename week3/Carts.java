package neobistasks.week3;

public class Carts {
	private Long id;
	private Long customer_id;
	
	public Carts() {

	}
	
	public Carts(Long id, Long customer_id) {
		super();
		this.id = id;
		this.customer_id = customer_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	

}
