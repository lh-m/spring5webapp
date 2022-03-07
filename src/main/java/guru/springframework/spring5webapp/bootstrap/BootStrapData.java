package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Address;
import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author lanhu on 05/03/2022
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("Folio");

        Address address = new Address("102 boulevard gallieni","Issy", "Idf","91230");
        publisher.setAddress(address);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
//        ddd.setPublisher(publisher);



        Author rod= new Author("Rob", "Johnson");
        Book j2ee = new Book("J2EE", "156456488");

        rod.getBooks().add(j2ee);
        j2ee.getAuthors().add(rod);







        authorRepository.save(eric);
        bookRepository.save(ddd);
        authorRepository.save(rod);
        bookRepository.save(j2ee);
        publisher.getBooks().add(ddd);
        publisher.getBooks().add(j2ee);


        publisherRepository.save(publisher);

        System.out.println("Started in Boostrap");
        System.out.println("Number of books " + bookRepository.count());
        System.out.println("Publisher book number : " + publisher.getBooks().size());


    }

}
