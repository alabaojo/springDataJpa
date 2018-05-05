package com.springprojects.spring5webapp.bootstrap;

import com.springprojects.spring5webapp.model.Author;
import com.springprojects.spring5webapp.model.Book;
<<<<<<< HEAD
import com.springprojects.spring5webapp.model.Publisher;
import com.springprojects.spring5webapp.repositories.AuthorRepository;
import com.springprojects.spring5webapp.repositories.BookRepository;
import com.springprojects.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
=======
import com.springprojects.spring5webapp.repositories.AuthorRepository;
import com.springprojects.spring5webapp.repositories.BookRepository;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/16/17.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
>>>>>>> origin/master
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

<<<<<<< HEAD
        Publisher publisher =  new Publisher();
        publisher.setName("Onibonoje");
        publisher.setAddress("Nibadan Lagere");
        publisherRepository.save(publisher);

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "3434", publisher);
=======
        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
>>>>>>> origin/master
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
<<<<<<< HEAD
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher );
=======
        Book noEJB = new Book("J2EE Development without EJB", "23444", "Wrox" );
>>>>>>> origin/master
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
