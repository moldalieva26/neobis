package neobistasks.week3;

public class TagDetails {
	private Long id;
	private Long tag_id;
	private String tag_name;
	
	
	public TagDetails() {
		
	}
	
	public TagDetails(Long id, Long tag_id, String tag_name) {
		super();
		this.id = id;
		this.tag_id = tag_id;
		this.tag_name = tag_name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTag_id() {
		return tag_id;
	}
	public void setTag_id(Long tag_id) {
		this.tag_id = tag_id;
	}
	public String getTag_name() {
		return tag_name;
	}
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}
	

	

}
