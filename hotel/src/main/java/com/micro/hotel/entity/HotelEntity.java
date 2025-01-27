package com.micro.hotel.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel_tbl")
public class HotelEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;

		private String name;

		private String location;

		private String about;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getAbout() {
			return about;
		}

		public void setAbout(String about) {
			this.about = about;
		}
		

		public HotelEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

		public HotelEntity(long id, String name, String location, String about) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.about = about;
		}

		@Override
		public String toString() {
			return "HotelEntity [id=" + id + ", name=" + name + ", location=" + location + ", about=" + about + "]";
		}
		
}
