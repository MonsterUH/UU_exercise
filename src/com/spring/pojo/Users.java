package com.spring.pojo;

public class Users {
	
	/**
	 * ���Ե����;���ʹ�������ͣ�����װ��
	 * ��Ϊ��װ��֧�ֲ���ֵ
	 * Integer id = null;   //֧��
	 * int ids = null;   //��֧��
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
