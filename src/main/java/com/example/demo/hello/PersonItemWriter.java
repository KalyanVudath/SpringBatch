package com.example.demo.hello;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class PersonItemWriter implements ItemWriter<Person> {


    @Override
    public void write(List<? extends Person> persons) throws Exception {
    	persons.forEach(item -> {
    		System.out.println(item.getFirstName() +" "+item.getLastName());
    	});      
    }

}