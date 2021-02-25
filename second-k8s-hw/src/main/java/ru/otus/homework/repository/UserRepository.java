package ru.otus.homework.repository;

import org.springframework.data.repository.CrudRepository;
import ru.otus.homework.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
