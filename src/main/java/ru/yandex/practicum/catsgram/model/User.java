package ru.yandex.practicum.catsgram.model;

import lombok.Data;

import java.time.Instant;

@Data
public class User {
    Long id;
    String userName;
    String email;
    String password;
    Instant registrationDate;
}
