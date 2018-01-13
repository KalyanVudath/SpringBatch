package com.example.demo.hello;



import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    //private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();
       // System.out.println("In processor firstName "+firstName);
        final Person transformedPerson = new Person(firstName, lastName);
        if("KAL".equals(firstName))
        		return transformedPerson;
        else
        		return null;
    }

}
