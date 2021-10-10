package com.springcourse.kisel.democourse;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Intellij IDEA
 * Author : Febriansyah Putra Ramadhan
 * Date : 07/10/2021;
 * Time : 12:45;
 **/

@SpringBootApplication
public class DemocourseApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemocourseApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
