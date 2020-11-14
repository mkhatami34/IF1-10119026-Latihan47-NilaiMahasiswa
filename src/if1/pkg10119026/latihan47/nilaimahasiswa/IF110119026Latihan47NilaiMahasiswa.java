/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan47.nilaimahasiswa;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan nilai mahasiswa
 */
public class IF110119026Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        nilai.setQuiz(60);
        nilai.setUts(80);
        nilai.setUas(75);
        
        System.out.println("QUIZ\t\t= " + nilai.getQuiz());
        System.out.println("UTS\t\t= " + nilai.getUts());
        System.out.println("UAS\t\t= " + nilai.getUas());
        
        nilai.setNilaiAkhir(nilai.hitungNilaiAkhir());
        System.out.println("\nNilai Akhir\t= " + nilai.getNilaiAkhir());
        
        nilai.setIndex(nilai.indexNilai(nilai.getNilaiAkhir()));
        System.out.println("\nIndex\t\t= " + nilai.getIndex());
        
        nilai.setKeterangan(nilai.keteranganIndex(nilai.getIndex()));
        System.out.println("Keterangan\t= ".concat(nilai.getKeterangan()));
    }
    
}
