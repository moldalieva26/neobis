package neobistasks.week3;

public class CartDetails {
	private Long id; //???
	private Long cart_id;
	private Long product_id;
	private Long quantity;
	
	
	public CartDetails() {
		
	}
	
	public CartDetails(Long id, Long cart_id, Long product_id, Long quantity) {
		super();
		this.id = id;
		this.cart_id = cart_id;
		this.product_id = product_id;
		this.quantity = quantity;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCart_id() {
		return cart_id;
	}
	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	
	
}
