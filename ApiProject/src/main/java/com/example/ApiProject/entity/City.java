package com.example.ApiProject.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb1_city")
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY,
 getterVisibility=JsonAutoDetect.Visibility.NONE,
 setterVisibility=JsonAutoDetect.Visibility.NONE)
public class City {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cityId;
	private String name;
	private boolean isActive;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", name=" + name + ", isActive=" + isActive + "]";
	}

}