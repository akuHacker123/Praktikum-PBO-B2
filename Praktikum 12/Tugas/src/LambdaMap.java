import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map untuk menampilkan NIM dan nama mahasiswa.
 */
public class LambdaMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("2301001", "Adi");
        mahasiswaMap.put("2301002", "Bambang");
        mahasiswaMap.put("2301003", "Cici");
        mahasiswaMap.put("2301004", "Didi");

        // lambda digunakan untuk iterasi Map (forEach dengan BiConsumer)
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}
