package flow;

public class FlowElseIf {
    public static void main(String[] args) {
        String hakAkses = "tamu";
        String fasilitas;

        if (hakAkses.equals("admin")) {
            fasilitas = "Kelola buku, pegawai, dan mahasiswa";
        } else  if (hakAkses.equals("pegawai")) {
            fasilitas = "Kelola buku dan mahasiswa";
        } else if (hakAkses.equals("mahasiswa")) {
            fasilitas = "Pinjam buku";
        } else {
            fasilitas = "Lihat daftar buku";
        }

        System.out.println(fasilitas);
    }
}
