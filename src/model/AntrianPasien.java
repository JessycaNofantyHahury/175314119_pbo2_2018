/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AntrianPasien {

   

    private int Tanggal_antrian, Bulan_antrian, Tahun_antrian; // attribute dari kelas AntrianPasien yang dideklarasikan sebagai private
    //dengan tipe data Interge
    private Pasien daftarPasien[]; // attribute daftarPasien array  yang dideklarasikan sebagai Private dengan tipe data Pasien 
    private Klinik klinik; //attribute klinik yang dideklarasikan sebagai Private dengan tipe data Klinik 
    public static ArrayList<Pasien> daftarAntrian = new ArrayList<Pasien>();
    //private AntrianPasien daftarAntrian[];
    public static void Mendaftar (Pasien pasien, int tanggal, int bulan, int tahun){
       
        daftarAntrian.add(pasien);
    }

    public AntrianPasien() {
    }

    public AntrianPasien(int Tanggal_antrian, int Bulan_antrian, int Tahun_antrian, Pasien[] daftarPasien, Klinik klinik) {
        this.Tanggal_antrian = Tanggal_antrian;
        this.Bulan_antrian = Bulan_antrian;
        this.Tahun_antrian = Tahun_antrian;
        this.daftarPasien = daftarPasien;
        this.klinik = klinik;
    }
        
    public static int cariPasien(String NoRM){
   
     for (int i = 0; i < daftarAntrian.size(); i++) {
            if (NoRM.equalsIgnoreCase(daftarAntrian.get(i).getNoRekamMedis())) {
                return i;

        }
        
    } return -1;
}
    
    public int getTanggal_antrian() { // method untuk membaca Nilai balikan dari attribute Tanggal_antrian
        return Tanggal_antrian;
    }

    public void setTanggal_antrian(int Tanggal_antrian) { // method dengan parameter berupa obyek Tanggal_antrian yang bertipe integer
        this.Tanggal_antrian = Tanggal_antrian;
    }

    public int getBulan_antrian() { // method untuk membaca Nilai balikan dari attribute Bulan_antrian
        return Bulan_antrian;
    }

    public void setBulan_antrian(int Bulan_antrian) { // method dengan parameter berupa obyek Bulan_antrian yang bertipe integer  
        this.Bulan_antrian = Bulan_antrian;
    }

    public int getTahun_antrian() { // method untuk membaca Nilai balikan dari attribute Tahun_antrian
        return Tahun_antrian;
    }

    public void setTahun_antrian(int Tahun_antrian) { // method dengan parameter berupa obyek Tahun_antrian yang bertipe integer
        this.Tahun_antrian = Tahun_antrian;
    }

    public Pasien[] getDaftarPasien() {// method untuk membaca Nilai balikan dari attribute daftarPasien
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) { // method dengan parameter berupa obyek daftarPasien yang bertipe Pasien[]
        this.daftarPasien = daftarPasien;
    }

    public Klinik getKlinik() {// method untuk membaca Nilai balikan dari attribute Klinik
        return klinik;
    }

    public void setKlinik(Klinik klinik) { // method dengan parameter berupa obyek klinik yang bertipe Klinik
        this.klinik = klinik;
    }

    @Override
    public String toString() {
        return Tanggal_antrian+"\t"+Bulan_antrian+ "\t" +Tahun_antrian+"\n";
    }
}
