package spring.rumah.kita.springcrud.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.rumah.kita.springcrud.model.Belajar;

//extend JpaRepo<(class model),(tipedata primary key nya)>
public interface BelajarRepo extends JpaRepository<Belajar, Long> {
    //kenapa class interface? karena kita akan me extends sebuah repo bawaan JPA, bisa juga menambahkan query kita sendiri DML, DCL, dan DDL



}
