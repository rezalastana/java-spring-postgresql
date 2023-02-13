package spring.rumah.kita.springcrud.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTOS => Data Transfer Object yang membedakan antara response dan request
public class BelajarDTO {

    // Request ke database, untuk memproses data yang di minta (dapat data dari model)
    @Data
    public static class RequestBelajar{
        private String firstName;
        private String lastName;
    }

    // Response Hasil yang kita dapatkan setelah dikelola oleh DB
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResponseBelajar{
        private Long id;
        // tulis ulang field yang akan ditampilkan
        private String firstName;
        private String lastName;
    }
}
