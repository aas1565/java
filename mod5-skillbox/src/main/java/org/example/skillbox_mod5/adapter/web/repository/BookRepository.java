package org.example.skillbox_mod5.adapter.web.repository;

import org.example.skillbox_mod5.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    Optional<Book> findByNameAndAuthor(String name, String author);
}
