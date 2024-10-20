package ru.kirillov.dbriderautocommitbug;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleRepository extends JpaRepository<SimpleEntity, Integer> {
}
