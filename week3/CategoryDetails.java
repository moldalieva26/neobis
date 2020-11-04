package neobistasks.week3;

public class CategoryDetails {
	private Long id; //???
	private Long category_id;
	private String category_name;
	private String sub_category_name;
	
	public CategoryDetails() {
		
	}
	
	public CategoryDetails(Long id, Long category_id, String category_name, String sub_category_name) {
		super();
		this.id = id;
		this.category_id = category_id;
		this.category_name = category_name;
		this.sub_category_name = sub_category_name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getSub_category_name() {
		return sub_category_name;
	}
	public void setSub_category_name(String sub_category_name) {
		this.sub_category_name = sub_category_name;
	}

	


}
