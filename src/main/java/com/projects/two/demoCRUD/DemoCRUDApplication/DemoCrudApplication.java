package com.projects.two.demoCRUD.DemoCRUDApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.projects.two.demoCRUD.DemoCRUDApplication.DAO.StudentDAO;
import com.projects.two.demoCRUD.DemoCRUDApplication.entity.Student;

@SpringBootApplication
public class DemoCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCrudApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner->{
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		
        //create student object
		System.out.println("creating the student object");
		Student tempStudent = new Student("Prateek", "Mandal", "prateek.work911@gmail.com");
	//save the student object
		System.out.println("saving the student object");
	     studentDAO.Save(tempStudent);
		
	//display id of saved student	
	     System.out.println("display Id of saved student :" +tempStudent.getId());
	}

}
