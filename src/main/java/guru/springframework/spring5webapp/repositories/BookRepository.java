package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lanhu on 05/03/2022
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
