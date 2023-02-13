package spring.rumah.kita.springcrud.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor // untuk membuat constructor otomatis
@NoArgsConstructor // constructor kosong
@Builder  // manipulasi data
public class Belajar {

    @Id //agar menjadi primary key dalam db
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Long id;

    @Column(length = 50 )
    private String firstName;

    @Column(length = 50 )
    private String lastName;

}

