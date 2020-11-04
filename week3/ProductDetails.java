package neobistasks.week3;

public class ProductDetails {
	// attributes: color, weight, length, height, width
	private Long id;
	private Long product_id;
	private String material;
	private String color;
	private Integer weight;
	private Integer length;
	private Integer width;
	private Integer height;
	
	public ProductDetails() {
		
	}
	
	public ProductDetails(Long id, Long product_id, String material, String color, Integer weight, Integer length,
			Integer width, Integer height) {
		super();
		this.id = id;
		this.product_id = product_id;
		this.material = material;
		this.color = color;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.height = height;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}
	
	
	
	
	

}
