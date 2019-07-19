package com.student.StudentProjectHibernate;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	

	@Entity
	@Table(name = "table_student")
	public class StudentDto implements Serializable{

		
			@Id
			@Column(name = "pk_rollno")
			private int id;
			private String name, email, stream;
			
		/**
			 * @return the id
			 */
			public int getId() {
				return id;
			}
			
			/**
			 * @param id the id to set
			 */
			public void setId(int id) {
				this.id = id;
			}
	/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}



			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}



			/**
			 * @return the email
			 */
			public String getEmail() {
				return email;
			}



			/**
			 * @param email the email to set
			 */
			public void setEmail(String email) {
				this.email = email;
			}



			/**
			 * @return the stream
			 */
			public String getStream() {
				return stream;
			}



			/**
			 * @param stream the stream to set
			 */
			public void setStream(String stream) {
				this.stream = stream;
			}



		public StudentDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Student [id =" +id+", name = "+name+" , email= "+email+" , stream = "+stream+"]";
		}

	}


