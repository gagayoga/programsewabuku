/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author kelompok5
 */
public class sewabuku {
    private String nama_peminjam;
    private String pinjam;
    private String namabuku;
    private int menu_pilihan;
    private String kodebuku;
    private String tanggal;
    private String Status;
    private String lamapinjam;
    private int denda;

    public String getNama_peminjam() {
        return nama_peminjam;
    }

    public void setNama_peminjam(String nama_peminjam) {
        this.nama_peminjam = nama_peminjam;
    }

    public String getPinjam() {
        return pinjam;
    }

    public void setPinjam(String pinjam) {
        this.pinjam = pinjam;
    }

    public String getNamabuku() {
        return namabuku;
    }

    public void setNamabuku(String namabuku) {
        this.namabuku = namabuku;
    }

    public int getMenu_pilihan() {
        return menu_pilihan;
    }

    public void setMenu_pilihan(int menu_pilihan) {
        this.menu_pilihan = menu_pilihan;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getLamapinjam() {
        return lamapinjam;
    }

    public void setLamapinjam(String lamapinjam) {
        this.lamapinjam = lamapinjam;
    }
    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
   
    
    
    public void pinjam(){
        pinjam=JOptionPane.showInputDialog(null,"Silakan pilih jenis buku : \n1.Biografi \n2.Novel");
        int x=Integer.parseInt(pinjam);
        if (x==1){
           kodebuku=(JOptionPane.showInputDialog(null,"Nama buku dalam Jenis Biografi : \n1001.Perjuangan Perempuan Indonesia"+"\n1002.10 Tahun Perjalanan Hati"+" \n1003.Dari Dekat Sekali"));
        }else if (x==2){
             kodebuku=(JOptionPane.showInputDialog(null,"Nama buku dalam Jenis Novel : \n2001.Laskar Pelangi"+"\n2002.Cantik itu Luka"+"\n2003.Kita Pergi Hari Ini"));
        }else{
            JOptionPane.showMessageDialog(null,"Maaf Inputan anda salah,mohon coba lagi");
        }
        int inputnamabuku=Integer.parseInt(JOptionPane.showInputDialog(null,"Nama Buku yang dipinjam :  \n1. 1001.Perjuangan Perempuan Indonesia"+"\n2. 1002.10 Tahun Perjalanan Hati"+" \n3. 1003.Dari Dekat Sekali"+"\n4. 2001.Laskar Pelangi"+"\n5. 2002.Cantik itu Luka"+"\n6. 2003.Kita Pergi Hari Ini"));
        if (inputnamabuku==1){
            this.namabuku="Perjuangan Perempuan Indonesia";
        }else if (inputnamabuku==2){
            this.namabuku="10 Tahun Perjalanan Hati";
        }else if (inputnamabuku==3){
            this.namabuku="Dari Dekat Sekali";
        }else if (inputnamabuku==4){
            this.namabuku="Laskar Pelangi";
        }else if (inputnamabuku==5){
            this.namabuku="Cantik itu Luka";
        }else if (inputnamabuku==6){
            this.namabuku="Kita Pergi Hari Ini";
        }else {
           JOptionPane.showMessageDialog(null,"Maaf inputan anda salah");
        }
        int lamapinjam=Integer.parseInt(JOptionPane.showInputDialog(null,"Lama Meminjam Buku = \n1. 1 Minggu"+"\n2. 2 Minggu"+"\n3. 3 Minggu"+"\n4. 4 Minggu"));
        if (lamapinjam==1){
            this.lamapinjam="1 Minggu";
        } else if (lamapinjam==2){
            this.lamapinjam="2 Minggu";
        }else if (lamapinjam==3){
            this.lamapinjam="3 Minggu";
        }else if (lamapinjam==4){
            this.lamapinjam="4 Minggu";
        }
        tanggal=JOptionPane.showInputDialog(null,"Tanggal Meminjam Buku = \n*ketikkan dengan huruf");
        Status=JOptionPane.showInputDialog(null,"Status Keanggotaan = \n1.Anggota \n2.Bukan Anggota");
        int y=Integer.parseInt(Status);
        if (y==1){
            this.Status="Anggota Resmi ";
            JOptionPane.showMessageDialog(null,"Anda anggota program ini");
        }else if (y==2){
            this.Status="Bukan anggota";
            JOptionPane.showMessageDialog(null,"Anda bukan anggota program ini");
        }else{
            JOptionPane.showMessageDialog(null,"Maaf,inputan anda salah");
        }  
    }
    private void cetakdata_pinjam(){
         JOptionPane.showMessageDialog(null,"Nama Peminjam Buku  = "+ nama_peminjam +"\nKode Buku yang dipinjam= "+ kodebuku +"\nNama Buku yang dipinjam= "+ namabuku +"\nLama meminjam buku = "+ lamapinjam +"\nTanggal meminjam buku = "+ tanggal +"\nStatus keanggotaan = "+Status,"Data Peminjam Buku",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/Gambar/1.png"));
       
    }
    private void balikan(){
        String inputDenda=JOptionPane.showInputDialog(null,"Berapa hari anda telat mengembalikan buku \n1. 1 Hari \n2. 2 Hari \n3. 3 Hari \n4. 4 Hari \n5. 5 Hari \n6. 6 Hari \n7. 7hari \n8. Lebih dari 1 Minggu");
        int inputdenda=Integer.parseInt(inputDenda);
        if (inputdenda==1){
            this.denda=5000;
            JOptionPane.showMessageDialog(null,"Total Denda Rp.5000");
        }else if (inputdenda==2){
            this.denda=10000;
            JOptionPane.showMessageDialog(null,"Total Denda Rp.10000");
        }else if (inputdenda==3){
            this.denda=15000;
            JOptionPane.showMessageDialog(null,"Total Denda Rp.15000");
        }else if (inputdenda==4){
            this.denda=20000;
            JOptionPane.showMessageDialog(null,"Total Denda Rp.20000");
        }else if (inputdenda==5){
            this.denda=25000;
            JOptionPane.showMessageDialog(null,"Total Denda Rp.25000");
        }else if (inputdenda==6){
            this.denda=30000;
            JOptionPane.showMessageDialog(null,"Total Denda Rp.30000");
        }else if (inputdenda==7){
            this.denda=35000;
            JOptionPane.showMessageDialog(null,"Total Denda Rp.35000");
        }else if (inputdenda==8){
            this.denda= 100000;
            JOptionPane.showMessageDialog(null,"Total Denda Rp.100000");
        }else{
            JOptionPane.showMessageDialog(null,"Maaf inputan salah");
        }
    }
    
    private void cetakdata(){
         JOptionPane.showMessageDialog(null,"Nama Peminjam Buku  = "+ nama_peminjam +"\nKode Buku yang dipinjam= "+ kodebuku +"\nNama Buku yang dipinjam= "+ namabuku +"\nLama meminjam buku = "+ lamapinjam +"\nTanggal meminjam buku = "+ tanggal +"\nDenda yang harus dibayar = "+denda,"Data Pengembalian Buku",JOptionPane.INFORMATION_MESSAGE,newImageIcon("src/Gambar/2.png") );
    }
    public void tampilmenu(){
       
       JOptionPane.showMessageDialog(null,"Selamat Datang di Program Sewa Buku","Halaman masuk",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/Gambar/3.jpg"));
       nama_peminjam=JOptionPane.showInputDialog(null,"Masukana Nama Anda = ");
       while(true){
       int menu_pilihan=Integer.parseInt(JOptionPane.showInputDialog(null,"Silakan pilih menu dibawah ini :\n1.Meminjam Buku \n2.Mengembalikan Buku"));
       switch(menu_pilihan){
           
           case 1:
               pinjam();
               cetakdata_pinjam();
               break;
           case 2:  
               balikan();
               cetakdata();
                JOptionPane.showMessageDialog(null,"Terima Kasih telah mengggunakan program ini");
               break;
               default:
               break;     
       }
    }
    }
    
    
    public static void main(String[]args){
        sewabuku a1=new sewabuku();
        a1.tampilmenu();
    }
}
        