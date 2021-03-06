/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Pasien {

   


    public String Nama,Alamat, TempatLahir, nik, NoRekamMedis; // attribute Nama, Alamat, Tempat Lahir yang dideklarasikan sebagai private 
    //dengan tipe data String
    private int TanggalLahir, BulanLahir, TahunLahir;
    // attribute TanggalLahir, BulanLahir, TahunLahir, NoRekamMedis yang dideklarasikan sebagai private dengan tipe data Interge
    public static ArrayList<Pasien> daftarPasien
            = new ArrayList<Pasien>();

    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public static void setDaftarPasienAntri(ArrayList<Pasien> daftarPasienAntri) {
        Pasien.daftarPasien = daftarPasien;
    }
    
    public static void tambahPasienBaru(Pasien pasien) {

        daftarPasien.add(pasien);
    }

    public static Pasien cariPasien(String string) {

        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).NoRekamMedis == string) {
                return daftarPasien.get(i);
            }

        }
        return null;
    }
    
    public static void simpanDaftarPasien(File file) throws IOException{
        
       try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
}
    
        }
     
   
      public static void bacaDaftarPasien(File file) {
       FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasilBaca = hasilBaca + (char) dataInt;
                } else {
                    Pasien temp = new Pasien();
                    temp.setNama(hasilBaca);
                    tambahPasienBaru(temp);
                }
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
         

    
    public Pasien(String Nama, String Alamat, String TempatLahir, int TanggalLahir, int BulanLahir, int TahunLahir, String nik) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.TempatLahir = TempatLahir;
        this.TanggalLahir = TanggalLahir;
        this.BulanLahir = BulanLahir;
        this.TahunLahir = TahunLahir;
        this.nik = nik;
    }

   public Pasien(){}

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void setTahunLahir(int TahunLahir) {
        this.TahunLahir = TahunLahir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public int getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(int TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public int getBulanLahir() {
        return BulanLahir;
    }

    public void setBulanLahir(int BulanLahir) {
        this.BulanLahir = BulanLahir;
    }

    public void setNoRekamMedis(String noRekamMedis)  {
        
        this.NoRekamMedis = noRekamMedis;

    }

    public void setTempatLahir(String TempatLahir) { // method dengan parameter berupa obyek TempatLahir yang bertipe String  
        this.TempatLahir = TempatLahir;               //Menyimpan Nilai dari obyek TempatLahir ke attribute TempatLahir
    }

//   
    public String getTempatLahir() {
        return TempatLahir;
    }

    public int getTahunLahir() {
        return TahunLahir;
    }

    public String getNoRekamMedis() {
        return NoRekamMedis;
    }

    @Override
    public String toString() {
        return Nama+ " " +Alamat+"\n";
    }


    
    }

