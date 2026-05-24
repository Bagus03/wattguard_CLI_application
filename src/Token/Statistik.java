package Token;

import Token.RiwayatBeli;
import Token.Token;

import java.util.List;

public class Statistik {

    private double masaPakai;
    private int biaya;
    private int bulan;

    public Statistik(double masaPakai, int biaya, int bulan) {
        this.masaPakai = masaPakai;
        this.biaya = biaya;
        this.bulan = bulan;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public void setMasaPakai(double masaPakai) {
        this.masaPakai = masaPakai;
    }

    public void showMasaPakai() {
        System.out.println("Masa Pakai: " + masaPakai + " tahun");
    }

    public String showBiaya() {
        return "Biaya = " + biaya;
    }

    public void calculateStatistics(List<RiwayatBeli> riwayatPembelian) {
        int totalNominal = 0;
        int totalBiaya = 0;
        for (RiwayatBeli riwayat : riwayatPembelian) {
            totalNominal += riwayat.getKwh();
            totalBiaya += riwayat.getHarga();
        }

        System.out.println("= = = Informasi Transaksi = = =");
        System.out.println("Total Nominal Pembelian: " + totalNominal + " Kwh");
        System.out.println("Total Biaya Pembelian  : Rp. " + totalBiaya);
    }

}
