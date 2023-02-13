package spring.rumah.kita.springcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.rumah.kita.springcrud.dtos.BelajarDTO;
import spring.rumah.kita.springcrud.repository.BelajarRepo;

import java.util.List;
import java.util.Optional;

@Service
public class BelajarServiceImpl implements BelajarService{
    //SeriveImpl untuk logika

    //perlunya koneksi / manipulasi ke db, gunanya class repo

    @Autowired //berfungsi untuk melakukan injection / mengambil method-method yang ada di BelajarRepo
    private BelajarRepo belajarRepo;


    public List<BelajarDTO.ResponseBelajar> getAll() {
        return null;
    }




    public BelajarDTO.ResponseBelajar save(BelajarDTO.RequestBelajar req) {
        return null;
    }

    public BelajarDTO.ResponseBelajar getById(Long id) {
        return null;
    }


    public Optional<BelajarDTO.ResponseBelajar> update(Long id, BelajarDTO.RequestBelajar req) {
        return Optional.empty();
    }


    public BelajarDTO.ResponseBelajar delete(Long id) {
        return null;
    }
}
