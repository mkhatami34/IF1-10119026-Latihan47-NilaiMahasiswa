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
public class Nilai {
    private double quiz, uts, uas, nilaiAkhir;
    private char index;
    private String keterangan;
    
     public Nilai() {
        this.quiz = 0;
        this.uts = 0;
        this.uas = 0;
        this.nilaiAkhir = 0;
        this.index = '/';
        this.keterangan = "/";
    }
    
    public double getQuiz() {
        return quiz;
    }
    
    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }
    
    public double getUts() {
        return uts;
    }
    
    public void setUts(double uts) {
        this.uts = uts;
    }
    
    public double getUas() {
        return uas;
    }
    
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
    
    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public double hitungNilaiAkhir() {
        return (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
    }
    
    public char getIndex() {
        return index;
    }
    
    public void setIndex(char index) {
        this.index = index;
    }
    
    public char indexNilai(double nilaiAkhir) {
        if (nilaiAkhir >= 80 && nilaiAkhir <=100) {
            return 'A';
        } else if (nilaiAkhir >= 68 && nilaiAkhir < 80) {
            return 'B';
        } else if (nilaiAkhir >= 56 && nilaiAkhir < 68) {
            return 'C';
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 56) {
            return 'D';
        } else {
            return 'E';
        }
    }
    
    public String getKeterangan() {
        return keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public String keteranganIndex(char index) {
        switch(index) {
            case 'A': return "Sangat Baik";
            case 'B': return "Baik"; 
            case 'C': return "Cukup"; 
            case 'D': return "Kurang";
            case 'E': return "Sangat Kurang";
            default: return "/";
        }
    }
    
}
