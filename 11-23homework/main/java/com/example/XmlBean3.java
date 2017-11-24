package com.example;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class XmlBean3 implements Serializable{
	
	private static final long serialVersionUID = -1643990897373338912L;

	private List list;
	
	private Map map;
	
	private Set set;
	
	private Properties pro;

	public XmlBean3() {
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}
	
	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	@Override
	public String toString() {
		return "XmlBean3 [list=" + list + ", map=" + map + ", set=" + set + ", pro=" + pro + "]";
	}

	
}
