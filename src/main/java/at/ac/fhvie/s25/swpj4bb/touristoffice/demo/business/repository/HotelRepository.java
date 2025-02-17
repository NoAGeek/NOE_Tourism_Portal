package at.ac.fhvie.s25.swpj4bb.touristoffice.demo.business.repository;

import at.ac.fhvie.s25.swpj4bb.touristoffice.demo.business.entity.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * This class declares the Database accesses.
 * See also the Spring SQL example on the Moodle page of the course!
 * -
 * Defining Query Methods:
 * <a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details">...</a>
 * -
 * Supported query method subject keywords:
 * <a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#appendix.query.method.subject">...</a>
 * -
 * Supported query method predicate keywords and modifiers:
 * <a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#appendix.query.method.predicate">...</a>
 */
public interface HotelRepository  extends JpaRepository<Hotel, Long> {
  List<Hotel> findAllByOrderByIdAsc();

  @Query(value = "SELECT o FROM Hotel o ORDER BY id")
  Page<Hotel> findAll(Pageable pageable);

  List<Hotel> findByName(String lastName);

  List<Hotel> findAllById(Long id, Pageable pageable);
}
