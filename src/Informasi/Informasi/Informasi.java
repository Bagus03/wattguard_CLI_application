package Informasi;

public class Informasi implements InfoService {

    private static final String LINE =
            "====================================================";

    @Override
    public void daftarInformasi() {
        printSection(
                "Daftar Informasi",
                "1. Tips Menghemat Penggunaan Listrik",
                "2. Tarif Listrik Terkini",
                "3. Jadwal Pemadaman Berkala",
                "4. Modus Penipuan Tagihan Listrik",
                "5. Info Terbaru Pekan Ini"
        );
    }

    @Override
    public void printData(int input) {
        switch (input) {
            case 1 -> showTipsHematListrik();
            case 2 -> showTarifListrik();
            case 3 -> showJadwalPemadaman();
            case 4 -> showModusPenipuan();
            case 5 -> showInfoTerbaru();
            default -> {
                System.out.println("[Error] Harap masukkan nomor menu yang benar.");
                daftarInformasi();
            }
        }
    }

    // ========================= HELPER =========================

    private void printSection(String title, String... contents) {
        System.out.println(LINE);
        System.out.println(title);

        for (String content : contents) {
            System.out.println(content);
        }

        System.out.println(LINE);
    }

    // ========================= MENU 1 =========================

    private void showTipsHematListrik() {
        printSection(
                "Tips Menghemat Penggunaan Listrik",

                "1. Matikan alat elektronik yang tidak digunakan.",
                "2. Gunakan lampu LED yang lebih hemat energi.",
                "3. Pilih peralatan dengan label hemat energi.",
                "4. Gunakan alat listrik berat di luar jam sibuk.",
                "5. Bersihkan dan rawat peralatan secara rutin.",

                "",
                "Menghemat listrik membantu menurunkan tagihan",
                "dan menjaga lingkungan."
        );
    }

    // ========================= MENU 2 =========================

    private void showTarifListrik() {
        printSection(
                "Tarif Listrik PLN Terbaru",

                "Rumah Tangga (R-1/TR)",
                "- 900 VA          : Rp 1.352/kWh",
                "- 1.300 VA        : Rp 1.444,70/kWh",
                "- 2.200 VA        : Rp 1.444,70/kWh",
                "- 3.500-5.500 VA  : Rp 1.699,53/kWh",

                "",
                "Penerangan Jalan Umum (P-3/TR)",
                "- Rp 1.699,53/kWh",

                "",
                "Golongan Lain (L/TR, TM, TT)",
                "- Rp 1.644,52/kWh",

                "",
                "Subsidi Rumah Tangga",
                "- 450 VA : Rp 415/kWh",

                "",
                "Sumber : PLN"
        );
    }

    // ========================= MENU 3 =========================

    private void showJadwalPemadaman() {
        printSection(
                "Jadwal Pemadaman Berkala",

                "13 Desember 2024 | 10:00 - 13:00 WIB",
                "Wilayah : Bojongsong",
                "Tujuan  : Pemeliharaan saluran listrik",

                "",

                "14 Desember 2024 | 09:00 - 12:00 WIB",
                "Wilayah : Kampung Ciparay",
                "Tujuan  : Peningkatan jaringan listrik",

                "",

                "15 Desember 2024 | 13:00 - 15:00 WIB",
                "Wilayah : Desa Cisarua",
                "Tujuan  : Peningkatan trafo"
        );
    }

    // ========================= MENU 4 =========================

    private void showModusPenipuan() {
        printSection(
                "Modus Penipuan Tagihan Listrik",

                "1. Penipuan lewat SMS atau telepon",
                "2. Tawaran diskon palsu",
                "3. Pemalsuan struk pembayaran",
                "4. Petugas PLN palsu",

                "",
                "Tips Menghindari Penipuan:",
                "- Gunakan kanal pembayaran resmi.",
                "- Jangan berikan data pribadi.",
                "- Cek informasi melalui PLN atau call center 123."
        );
    }

    // ========================= MENU 5 =========================

    private void showInfoTerbaru() {
        printSection(
                "GEBYAR MERDEKA 2024",

                "Tambah Daya",
                "- Diskon 73%",
                "- Diskon 50%",

                "",
                "Penyambungan Sementara",
                "- Tarif : Rp 170.845,00",

                "",
                "Sumber : Instagram @plnbandung"
        );
    }
}