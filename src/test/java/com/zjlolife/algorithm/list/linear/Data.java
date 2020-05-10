package com.zjlolife.algorithm.list.linear;

public class Data {

	private long id;

	private String data;

	public Data(long id, String data) {
		this.id = id;
		this.data = data;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Data data = (Data) o;
		return id == data.id;
	}

	public String toString() {
		return id + "_" + data;
	}

}
