package com.springcore.standalone.collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friend;
    private Map<String, Integer> feesstructure;
	private Properties properties;
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeesstructure() {
		return feesstructure;
	}

	public void setFeesstructure(Map<String, Integer> feesstructure) {
		this.feesstructure = feesstructure;
	}

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "Person [friend=" + friend + ", feesstructure=" + feesstructure + "]";
	}

}