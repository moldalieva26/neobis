package neobistasks.week3;

public class Orders {
	private Long id;
	private Long customer_id;
	private String order_date; //? IN DB WHAT IS THE DATETIME
	private Short status;

	public Orders() {
		
	}

	public Orders(Long id, Long customer_id, String order_date, Short status) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.order_date = order_date;
		this.status = status;
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

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}
	
	
	
}
