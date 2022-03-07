package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lanhu on 05/03/2022
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
