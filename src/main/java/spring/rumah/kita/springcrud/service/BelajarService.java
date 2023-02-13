package spring.rumah.kita.springcrud.service;

import spring.rumah.kita.springcrud.dtos.BelajarDTO;

import java.util.List;
import java.util.Optional;

// class yang menggambarkan business process / call API
public interface BelajarService {

    // perlu implement method getAll() untuk mengambil semua datanya
    List<BelajarDTO.ResponseBelajar> getAll();
    // save data - return data yang ada pada class ResponseBelajar
    BelajarDTO.ResponseBelajar save(BelajarDTO.RequestBelajar req);
    // detail data
    BelajarDTO.ResponseBelajar getById(Long id);
    // update data berdasar id, return datanya berupa ResponseBelajar
    Optional<BelajarDTO.ResponseBelajar> update(Long id, BelajarDTO.RequestBelajar req);
    // delete data
    BelajarDTO.ResponseBelajar delete(Long id);


}
