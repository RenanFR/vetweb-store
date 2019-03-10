package vetweb.store.entity;

import javax.persistence.Entity;

@Entity
public class Category extends AbstractEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Category() {
	}
	
	public Category(String description) {
		this.description = description;
	}

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category [description=" + description + "]";
	}
	
}
