package org.tnsindia.service;

public class studentservice {
	

	public interface studentservice {

		//abstract method for CRUD 
			void create(student student);
			void update(student student);
			void delete(student student);
			student retrieve(int id);



	}


}