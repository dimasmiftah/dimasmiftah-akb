package me.dimasmiftah.dimasmiftah.Model;

/*
    Tanggal pengerjaan: Kamis, 29 Mei 2021
    NIM: 10118087
    Nama: Dimas Miftahul Huda
    Kelas: IF-2
*/

public class FriendlistModel {

    int image;
    String nama;

    public FriendlistModel(int image, String nama) {
        this.image = image;
        this.nama = nama;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
