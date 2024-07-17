package com.example.saphana;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Entity
@Document(collection = "Employee")

public class Users {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Name;
    private String City;
    private String role;

}
