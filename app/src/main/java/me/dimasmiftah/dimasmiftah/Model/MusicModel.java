package me.dimasmiftah.dimasmiftah.Model;

/*
    Tanggal pengerjaan: Kamis, 2 Juni 2021
    NIM: 10118087
    Nama: Dimas Miftahul Huda
    Kelas: IF-2
*/

public class MusicModel {

    int image;
    String title;
    String penyanyi;

    public MusicModel(int image, String title, String penyanyi) {
        this.image = image;
        this.title = title;
        this.penyanyi = penyanyi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }
}
