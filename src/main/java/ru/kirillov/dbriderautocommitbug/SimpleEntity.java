package ru.kirillov.dbriderautocommitbug;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SimpleEntity {

    @Id
    int id;

    String name;
}
