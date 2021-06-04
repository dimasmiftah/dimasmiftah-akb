package me.dimasmiftah.dimasmiftah.Model;

/*
    Tanggal pengerjaan: Kamis, 29 Mei 2021
    NIM: 10118087
    Nama: Dimas Miftahul Huda
    Kelas: IF-2
*/

public class DailyModel {

    int image;
    String title;
    String desc;

    public DailyModel(int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
