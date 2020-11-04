package neobistasks.week3;

public class Tags {
	private Long id;
	private Long product_id;
	
	public Tags() {
		
	}
	
	public Tags(Long id, Long product_id) {
		super();
		this.id = id;
		this.product_id = product_id;
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
	

	
}
