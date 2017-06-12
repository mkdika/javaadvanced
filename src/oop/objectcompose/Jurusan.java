/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.objectcompose;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Jurusan {
    
    private String namaJurusan;
    private Mahasiswa mahasiswa[];
    
    public Jurusan() {}

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public Mahasiswa[] getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa[] mahasiswa) {
        this.mahasiswa = mahasiswa;
    }                 
}
