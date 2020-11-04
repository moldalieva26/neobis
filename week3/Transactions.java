package neobistasks.week3;

public class Transactions {
	
	private Long id;
	private Long order_id;
	private Long customer_id;
	private Short status;
	private String created_at;
	private String updated_at;
	
	public Transactions() {
		
	}
	
	public Transactions(Long id, Long order_id, Long customer_id, Short status, String created_at, String updated_at) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	

}
