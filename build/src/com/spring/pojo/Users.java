package com.spring.pojo;

public class Users {
	
	/**
	 * 属性的类型尽量使用类类型，即包装类
	 * 因为包装类支持布尔值
	 * Integer id = null;   //支持
	 * int ids = null;   //不支持
	 */
	
	private Integer id;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + "]";
	}
	
}
