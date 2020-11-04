package neobistasks.week3;

public class Reviews {
	private Long id;
	private String text;
	private Long product_id;
	private Long customer_id;
	private Short rating;
	private String published_at;
	
	public Reviews() {
		
	}
	
	public Reviews(Long id, String text, Long product_id, Long customer_id, Short rating, String published_at) {
		super();
		this.id = id;
		this.text = text;
		this.product_id = product_id;
		this.customer_id = customer_id;
		this.rating = rating;
		this.published_at = published_at;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
	public Short getRating() {
		return rating;
	}
	public void setRating(Short rating) {
		this.rating = rating;
	}
	public String getPublished_at() {
		return published_at;
	}
	public void setPublished_at(String published_at) {
		this.published_at = published_at;
	}
	
	
	
	

}
