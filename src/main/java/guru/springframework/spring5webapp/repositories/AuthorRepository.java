package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lanhu on 15/02/2022
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
