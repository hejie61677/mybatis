package cn.com.mybatis.pojo;

/**
 * <p>Title: Category</p>
 * <p>Description:实体类(category)</p>
 * <p>Company: </p>
 * @author 何杰
 * @date 下午9:35:27
 */
public class Category {

	private int id;
	private String name;
	private String description;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
