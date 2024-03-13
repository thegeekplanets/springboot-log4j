package study.java.log4j.pojo;

import java.io.Serializable;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 7692567956302786043L;

	private Long id;
	private String name;
	private String city;

	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
