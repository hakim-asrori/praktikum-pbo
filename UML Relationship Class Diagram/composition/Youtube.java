package composition;

public class Youtube {
    private Video video;

    public Youtube(String judul, int ukuran) {
        video = new Video(judul, ukuran);
    }

    public void showListVideo() {
        System.out.println("Judul video : " + video.getJudul());
        System.out.println("Ukuran video : " + video.getUkuran() + " Mb");
    }
}
