/**
 *
 * @author 
 * Nama   : Muhammad Rizqi Ardiansyah
 * Kelas  : MI 1D
 * Absen  : 19
 * NIM    : 2031710041
 * Projek : Aplikasi perbankan (M-Banking)
 * Judul  : KIT Mobile
 * 
 * =====================================
 * Data Nasabah yang sudah terdaftar :
 * Username : rizqi
 * Password : 12345678
 * Nomor Rekening : 1236547890
 * =====================================
 * 
 * =====================================
 * Transfer
 * 
 * Bank KIT 
 * Nomor Rekening : 1236547890 (rekening utama)
 * Untuk mentransfer di Rekening Bank KIT memerlukan
 * register dahulu, karena tidak bisa transfer sesama
 * rekening
 * 
 * Bank BRI
 * Nomor Rekening : 01236547890
 * 
 * Bank Mandiri
 * Nomor Rekening : 11236547890
 * 
 * Bank BCA
 * Nomor Rekening : 21236547890
 * 
 * Bank BNI 
 * Nomor Rekening : 31236547890
 * 
 * Bank Cimb Niaga 
 * Nomor Rekening : 41236547890
 * 
 * =====================================
 * 
 * =====================================
 * Pembelian
 * 
 * Beli Pulsa
 * Nomor tujuan : Nomor sendiri
 * 
 * Top Up Link Aja
 * Nomor tujuan : 085730945122
 * 
 * Listrik Prabayar
 * Nomor tujuan : 123654789
 * 
 * =====================================
 * 
 * =====================================
 * Pembayaran
 * 
 * Briva
 * Nomor pembayaran : 9876543210
 * 
 * Kartu Kredit
 * Nomor pembayaran : 9876543211
 * 
 * BPJS
 * Nomor pembayaran : 9876543212
 * =====================================
 */

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class KITMobile {

    static Scanner sc = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);
    static Scanner scInt = new Scanner(System.in);
    static int noID = 0, validasiUbhPwd = 0;
    
    //Syntax menampilkan tanggal
    static String getTanggal() {
        DateFormat formatData = new SimpleDateFormat("dd//MM/yyyy");
        Date date = new Date();

        return formatData.format(date);
    }
    
    //Syntax menampilkan waktu
    static String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    //Menu di saat user baru membuka    
    static void menuAwal() {
        System.out.println("======================================================");
        System.out.println("|          SELAMAT DATANG DI KIT Mobile              |");
        System.out.println("|         Konkret, Independen, Terpercaya            |");
        System.out.println("======================================================");
    }

    //Menampilkan menu di saat daftar   
    static void menuDaftar() {
        System.out.println("=======================================================");
        System.out.println("|          SELAMAT DATANG DI KIT Mobile               |");
        System.out.println("|         Konkret, Independen, Terpercaya             |");
        System.out.println("|=====================================================|");
        System.out.println("|  Untuk memulai, silahkan daftar terlebih dahulu     |");
        System.out.println("|=====================================================|");
        System.out.println("===================Silahkan Daftar====================");
    }

    //Menampilkan menu di saat login    
    static void menuLogin() {
        System.out.println("======================================================");
        System.out.println("|          SELAMAT DATANG DI KIT Mobile              |");
        System.out.println("|         Konkret, Independen, Terpercaya            |");
        System.out.println("|====================================================|");
        System.out.println("|         Untuk memulai, silahkan login              |");
        System.out.println("|     dengan akun M-Banking mu terlebih dahulu       |");
        System.out.println("======================================================");
    }

    //Menampilkan jenis tabungan   
    static void menuJenisTabungan() {
        System.out.println("=========================================================");
        System.out.println("|         PremiKIT          |         StandKIT          |");
        System.out.println("|=======================================================|");
        System.out.println("|         Fasilitas         |         Fasilitas         |");
        System.out.println("|===========================|===========================|");
        System.out.println("|1. E-Banking               |1. E-Banking               |");
        System.out.println("|2. Gratis asuransi         |2. Gratis asuransi         |");
        System.out.println("|   kecelakaan diri         |   kecelakaan diri         |");
        System.out.println("|3. Pengambilan uang        |3. Pengambilan uang        |");
        System.out.println("|   maksimal sebesar        |   maksimal sebesar        |");
        System.out.println("|   Rp 10.000.000/hari      |   Rp 5.000.000/hari       |");
        System.out.println("|===========================|===========================|");
        System.out.println("|        Syarat             |        Syarat             |");
        System.out.println("|===========================|===========================|");
        System.out.println("|1. Mempunyai KTP           |1. Mempunyai KTP           |");
        System.out.println("|2. Setor awal minimal      |2. Setor awal minimal      |");
        System.out.println("|   sebesar Rp 200.000      |   sebesar Rp 50.000       |");
        System.out.println("|3. Saldo minimum yang      |3. Saldo minimum yang      |");
        System.out.println("|   mengendap = Rp 100.000  |   mengendap = Rp 50.000   |");
        System.out.println("=========================================================");
    }

    //Menampilkan notifikasi salah input    
    static void warning() {
        System.out.println();
        System.out.println("\t===========================================");
        System.out.println("\t|    Mohon masukkan data dengan benar!    |");
        System.out.println("\t===========================================");
        System.out.println();
    }

    //Menampilkan notifikasi saldo kurang   
    static void warningSaldo() {
        System.out.println();
        System.out.println("\t===========================================");
        System.out.println("\t|   Nominal saldo yang dimasukkan kurang  |");
        System.out.println("\t===========================================");
        System.out.println();
    }

    //Menampilkan keterangan disaat setor awal pembukaan rekening    
    static void notifSetorUang() {
        System.out.println();
        System.out.println("\t============================================");
        System.out.println("\t| Silahkan transfer di rekening Bank KIT   |");
        System.out.println("\t| Nama Rekening   = PT Bank KIT            |");
        System.out.println("\t| Nomor Rekening  = 12365478900            |");
        System.out.println("\t| Anda bisa melakukan pembayaran melalui   |");
        System.out.println("\t| Indomaret, Alfamart, Link Aja atau GoPay |");
        System.out.println("\t============================================");
        System.out.println();
    }
   
    static void validasiSudah() {
        System.out.println("\t\t======================");
        System.out.println("\t\t| ketik 1 jika sudah |");
        System.out.println("\t\t| ketik 2 jika belum |");
        System.out.println("\t\t======================");

    }

    static void validasiYa() {
        System.out.println("\t\t=======================");
        System.out.println("\t\t|   ketik 1 jika Ya   |");
        System.out.println("\t\t|  ketik 2 jika Tidak |");
        System.out.println("\t\t=======================");
    }

    static void warningPwd() {
        System.out.println();
        System.out.println("\t===========================================");
        System.out.println("\t|  Mohon masukkan password dengan benar!  |");
        System.out.println("\t===========================================");
        System.out.println();
    }
    
    //Menampilkan pilihan jenis tabungan
    static String jenisTabungan(String jnsTabungan) {

        menuJenisTabungan();
        System.out.println("\t    ===============================");
        System.out.println("\t    |   ketik 1 untuk PremiKIT    |");
        System.out.println("\t    |   ketik 2 untuk StandKIT    |");
        System.out.println("\t    ===============================");
        System.out.print("Masukkan jawaban Anda\t\t= ");

        jnsTabungan = sc.next();

        return jnsTabungan;
    }    
    
    /*Jumlah akun yang diasumsikan sudah melakukan 
      di bank secara offline terdapat 1 nasabah, 
      sehingga dapat langsung masuk pada menu login dengan 
      username dan password
    */
    static String[][] dataNasabah(String akunNasabah[][]) {

        akunNasabah = new String[100][19];

        akunNasabah[0][0] = "Muhammad Rizqi Ardiansyah";
        akunNasabah[0][1] = "3528070611020001";
        akunNasabah[0][2] = "0";
        akunNasabah[0][3] = "L";
        akunNasabah[0][4] = "rizqiardiasnyah73@gmail.com";
        akunNasabah[0][5] = "085648224202";
        akunNasabah[0][6] = "Mahasiswa";
        akunNasabah[0][7] = "64395";
        akunNasabah[0][8] = "02";
        akunNasabah[0][9] = "01";
        akunNasabah[0][10] = "Mojokendil";
        akunNasabah[0][11] = "Ngronggot";
        akunNasabah[0][12] = "Nganjuk";
        akunNasabah[0][13] = "Jawa Timur";
        akunNasabah[0][14] = "PremiKIT";
        akunNasabah[0][15] = "250000";
        akunNasabah[0][16] = "1236547890";
        akunNasabah[0][17] = "rizqi";
        akunNasabah[0][18] = "12345678";

        return akunNasabah;
    }    

    /*Berisi syntax untuk memberikan No ID secara otomatis
      jika ada yang mendaftar
    */
    static int noID(String[][] nomorID) {

        for (int i = noID; i == noID; i++) {
            for (int j = 0; j < 1; j++) {

                if (nomorID[i + 1][1] == null) {
                    noID = noID;
                } else if (nomorID[i + 1][1] != null) {
                    noID++;
                }
            }

        }

        return noID;
    }

    //matches berfungsi untuk validasi huruf atau angka
    static String namaLengkap() {
        String namaLengkap = "l";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Nama Lengkap\t\t= ");
            namaLengkap = scStr.nextLine();

            if (namaLengkap.matches("[^0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }

        return namaLengkap;
    }

    static String nomorKTP() {
        String nomorKTP = "1";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Nomor KTP\t\t= ");
            nomorKTP = sc.next();

            if (nomorKTP.matches("[0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }

        return nomorKTP;
    }

    static char jnsKelamin() {
        char gender = 'L';
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Jenis Kelamin (L/P)\t= ");
            gender = sc.next().charAt(0);
            if (gender == 'L' || gender == 'P' || gender == 'l' || gender == 'p') {
                x = 2;
            } else {
                warning();
                x = 1;
            }

        }
        return gender;
    }

    static String email() {

        String email = "1";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Alamat Email\t\t= ");
            email = sc.next();

            if (email.matches("[a-zA-Z0-9@.]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }

        return email;
    }

    static String noHP() {
        String inputNomor = "1";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Nomor HP\t\t= ");
            inputNomor = sc.next();

            if (inputNomor.matches("[0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }

        return inputNomor;
    }

    static String profesi() {
        String profesi = "l";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Profesi Sekarang\t= ");
            profesi = scStr.nextLine();

            if (profesi.matches("[^0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }
        return profesi;
    }

    static String kodePos() {
        String kodePos = "l";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Kode Pos\t\t= ");
            kodePos = sc.next();

            if (kodePos.matches("[0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }
        return kodePos;
    }

    static String nomorRT() {
        String nomorRT = "l";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Nomor RT\t\t= ");
            nomorRT = sc.next();

            if (nomorRT.matches("[0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }

        return nomorRT;
    }

    static String nomorRW() {
        String nomorRW = "a";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Nomor RW\t\t= ");
            nomorRW = sc.next();

            if (nomorRW.matches("[0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }
        return nomorRW;
    }

    static String kelurahan() {
        String kelurahan = "a";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Nama Kelurahan/Desa\t= ");
            kelurahan = scStr.nextLine();

            if (kelurahan.matches("[^0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }
        return kelurahan;
    }

    static String kecamatan() {
        String kecamatan = "a";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Nama Kecamatan\t\t= ");
            kecamatan = scStr.nextLine();

            if (kecamatan.matches("[^0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }
        return kecamatan;
    }

    static String kota() {
        String kabupaten = "a";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Nama Kabupaten/Kota\t= ");
            kabupaten = scStr.nextLine();

            if (kabupaten.matches("[^0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }
        return kabupaten;
    }

    static String provinsi() {
        String provinsi = "a";
        int x = 0;

        while (x <= 1) {
            System.out.print("Masukkan Nama Provinsi\t\t= ");
            provinsi = scStr.nextLine();

            if (provinsi.matches("[^0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }
        return provinsi;
    }

    static int saldo(String jmlSaldo) {

        int x = 1, saldo = 0;

        while (x <= 1) {

            switch (jmlSaldo) {
                case "1":

                    System.out.print("Masukkan Nominal Setor Awal\t= ");
                    saldo = scInt.nextInt();
                    if (saldo < 200000) {
                        warningSaldo();
                        x = 0;

                    } else {
                        x = 2;
                        break;
                    }
                    break;

                case "2":

                    System.out.print("Masukkan Nominal Setor Awal\t= ");
                    saldo = scInt.nextInt();
                    if (saldo < 50000) {
                        warningSaldo();
                        x = 0;

                    } else {
                        x = 2;
                        break;
                    }
                    break;

                default:
                    warning();
                    x = 0;
                    jmlSaldo = jenisTabungan(jmlSaldo);

            }
        }
        return saldo;
    }

    //Berisi syntax yang mengatur bagian login    
    static String[][] fungsiLogin(String akunFungsiLogin[][]) {

        int nomorID = noID(akunFungsiLogin);
        int x = 0;
        String pilih;

        String cekAkun[][] = new String[1][2];

        System.out.print("Masukkan username\t= ");
        cekAkun[0][0] = sc.next();

        System.out.print("Masukkan password\t= ");
        cekAkun[0][1] = sc.next();

        for (int i = 0; i <= nomorID; i++) {

            for (int j = 17; j < 18; j++) {
                
                /*Validasi jika username dan password benar, hal ini juga berlaku
                  juga berlaku untuk semua user yang login di KIT Mobile
                */
                if (cekAkun[0][0].equalsIgnoreCase(cekAkun[0][0]) == cekAkun[0][0].equalsIgnoreCase(akunFungsiLogin[i][j]) && cekAkun[0][1].equalsIgnoreCase(cekAkun[0][1]) == cekAkun[0][1].equalsIgnoreCase(akunFungsiLogin[i][j + 1])) {

                    noID = Integer.parseInt(akunFungsiLogin[i][2]);
                    System.out.println();
                    System.out.println("\t    ===============================");
                    System.out.println("\t    | Username dan password benar |");
                    System.out.println("\t    ===============================");
                    System.out.println();
                    x = 1;
                    break;
                }

                if (i < nomorID) {
                    continue;

                } else {
                    
                    System.out.println();
                    System.out.println("\t=========================================");
                    System.out.println("\t| Username dan password salah, silahkan |");
                    System.out.println("\t|          periksa input Anda           |");
                    System.out.println("\t=========================================");
                    System.out.println();
                    x = 0;

                    while (x == 0) {
                        System.out.println("Apakah Anda ingin membuat akun M-Banking?");
                        validasiYa();
                        System.out.print("Masukkan jawaban Anda\t= ");
                        pilih = sc.next();

                        switch (pilih) {

                            case "1":
                                System.out.println();
                                menuDaftar();
                                fungsiDaftar(akunFungsiLogin);
                                x = 1;
                                break;

                            case "2":
                                System.out.println();
                                menuLogin();
                                fungsiLogin(akunFungsiLogin);
                                x = 1;
                                break;

                            default:
                                x = 0;
                                warning();

                        }

                    }

                }

            }
            if (x == 1) {
                break;
            }
        }

        return akunFungsiLogin;
    }

    /*Berisi syntax yang mengatur bagian daftar.
      Pada bagian daftar, user bisa melakukan
      buka rekening secara online dengan memasukkan
      data, setor saldo awal, kode verifikasi serta
      username dan password yang digunakan sebagai
      akun M-Banking  
    */       
    static String[][] fungsiDaftar(String akunFungsiDaftar[][]) {

        String pilih;
        String pilih1 = "l";
        String[][] akunFungsiDaftar2 = new String[1][1];

        int nomorID = noID(akunFungsiDaftar);
        int updatenomorID = nomorID + 1;
        int x = 1;

        for (int i = updatenomorID; i == updatenomorID; i++) {
            for (int j = 0; j < akunFungsiDaftar[0].length; j++) {

                if (j == 0) {
                    System.out.println();
                    System.out.println("\t\t=======================");
                    System.out.println("\t\t|   Mohon Masukkan    |");
                    System.out.println("\t\t|   Identitas Diri    |");
                    System.out.println("\t\t=======================");
                    akunFungsiDaftar[i][j] = namaLengkap();
                }
                if (j == 1) {
                    akunFungsiDaftar[i][j] = nomorKTP();
                }
                if (j == 2) {

                    akunFungsiDaftar[i][j] = Integer.toString(noID(akunFungsiDaftar));
                }

                if (j == 3) {
                    akunFungsiDaftar[i][j] = Character.toString(jnsKelamin());
                }
                if (j == 4) {

                    akunFungsiDaftar[i][j] = email();
                }
                if (j == 5) {

                    akunFungsiDaftar[i][j] = noHP();
                }
                if (j == 6) {

                    akunFungsiDaftar[i][j] = profesi();
                }
                if (j == 7) {
                    System.out.println();
                    System.out.println("\t\t=======================");
                    System.out.println("\t\t|   Mohon Masukkan    |");
                    System.out.println("\t\t| Data Tempat Tinggal |");
                    System.out.println("\t\t=======================");
                    akunFungsiDaftar[i][j] = kodePos();
                }
                if (j == 8) {
                    akunFungsiDaftar[i][j] = nomorRT();
                }
                if (j == 9) {
                    akunFungsiDaftar[i][j] = nomorRW();
                }
                if (j == 10) {

                    akunFungsiDaftar[i][j] = kelurahan();
                }
                if (j == 11) {

                    akunFungsiDaftar[i][j] = kecamatan();
                }
                if (j == 12) {
                    akunFungsiDaftar[i][j] = kota();
                }
                if (j == 13) {

                    akunFungsiDaftar[i][j] = provinsi();
                }
                if (j == 14) {
                    System.out.println();
                    System.out.println("\t\t=======================");
                    System.out.println("\t\t|   Mohon Masukkan    |");
                    System.out.println("\t\t|   Jenis Tabungan    |");
                    System.out.println("\t\t=======================");
                    akunFungsiDaftar[i][j] = jenisTabungan(pilih1);
                    pilih1 = akunFungsiDaftar[i][j];
                    if (akunFungsiDaftar[i][j].equals("1")) {
                        akunFungsiDaftar[i][j] = "PremiKIT";
                    } else if (akunFungsiDaftar[i][j].equals("2")) {
                        akunFungsiDaftar[i][j] = "StandKIT";
                    }
                }

                if (j == 15) {
                    
                    akunFungsiDaftar[i][j] = Integer.toString(saldo(pilih1));

                    while (x <= 1) {
                        notifSetorUang();
                        System.out.println("Apakah Anda sudah Membayar?");
                        System.out.println("\t\t======================");
                        System.out.println("\t\t| ketik 1 jika sudah |");
                        System.out.println("\t\t| ketik 2 jika belum |");
                        System.out.println("\t\t======================");
                        System.out.print("Masukkan jawaban Anda = ");
                        pilih = sc.next();
                        System.out.println();

                        switch (pilih) {

                            case "1":

                                while (x <= 1) {
                                    System.out.println("\t    ==================================");
                                    System.out.println("\t    | Mohon buka alamat URL berikut  |");
                                    System.out.println("\t    | di WEB, untuk mendapatkan kode |");
                                    System.out.println("\t    | verifikasi setelah pembayaran  |");
                                    System.out.println("\t    | berhasil                       |");
                                    System.out.println("\t    |================================|");
                                    System.out.println("\t    |        www.KITMobile.com       |");
                                    System.out.println("\t    ==================================");
                                    System.out.print("Masukkan jawaban Anda = ");
                                    pilih = sc.next();

                                    if (pilih.equalsIgnoreCase("www.KITMobile.com")) {
                                        System.out.println();
                                        System.out.println("\t\t======================");
                                        System.out.println("\t\tKode verifikasi :     ");
                                        System.out.println("\t\t890" + akunFungsiDaftar[i][5]);
                                        System.out.println("\t\t======================");
                                        System.out.println();

                                        x = 2;
                                    } else {
                                        warning();
                                        x = 0;
                                    }

                                }
                                break;

                            case "2":

                                System.out.println("\t    =================================");
                                System.out.println("\t    | Silahkan melakukan pembayaran |");
                                System.out.println("\t    |       terlebih dahulu         |");
                                System.out.println("\t    =================================");
                                x = 0;
                                break;

                            default:
                                warning();

                        }

                    }
                    while (x <= 2) {
                        System.out.println("\t===========================================");
                        System.out.println("\t| Silahkan masukkan kode verifikasi yang  |");
                        System.out.println("\t|            telah dikirimkan             |");
                        System.out.println("\t===========================================");
                        System.out.print("Masukkan jawaban Anda\t= ");
                        pilih = sc.next();

                        if (pilih.equalsIgnoreCase("890" + akunFungsiDaftar[i][5])) {
                            System.out.println();
                            System.out.println("\t===========================================");
                            System.out.println("\t|     Kode yang Anda masukkan benar       |");
                            System.out.println("\t===========================================");
                            System.out.println();
                            x = 3;
                            break;
                        } else {
                            warning();

                            x = 2;
                        }

                    }

                }

                if (j == 16) {
                    System.out.println("\t====================================================");
                    System.out.println("\t| Selamat Anda telah menjadi Nasabah dari Bank KIT |");
                    System.out.println("\t====================================================");
                    System.out.println("\t| Berikut nomor Rekening Anda :                    |");
                    System.out.println("\t====================================================");
                    System.out.println("\t123654789" + akunFungsiDaftar[i][2]);
                    System.out.println("\t====================================================");
                    System.out.println("\t| *No Rekening ini sudah terdaftar dan bisa        |");
                    System.out.println("\t|  digunakan untuk transaksi                       |");
                    System.out.println("\t| *Jika memerlukan buku Rekening & kartu ATM, Anda |");
                    System.out.println("\t|  bisa mengambilnya di cabang Bank KIT terdekat   |");
                    System.out.println("\t| *Cepat dan tanpa menunggu lama                   |");
                    System.out.println("\t====================================================");
                    akunFungsiDaftar[i][j] = "123654789" + akunFungsiDaftar[i][2];
                }

                if (j == 17) {
                    int y = 1;
                    System.out.println();
                    System.out.println("\t===================================================");
                    System.out.println("\t|      Agar Anda dapat mengakses M-Banking        |");
                    System.out.println("\t|     silahkan membuat akun terlebih dahulu       |");
                    System.out.println("\t===================================================");

                    while (x <= 3) {
                        System.out.print("Silahkan masukkan username\t= ");
                        akunFungsiDaftar[i][j] = sc.next();

                        for (int m = (i - 1); m >= 0; m--) {
                            for (int n = 17; n < 18; n++) {

                                if (akunFungsiDaftar[i][j].equals(akunFungsiDaftar[m][n])) {
                                    y = 0;
                                    break;

                                } else {
                                    y = 1;
                                }

                            }
                            if (y == 0) {
                                break;
                            }
                        }

                        if (y == 0) {
                            //Validasi jika username sama dengan username user lainnya
                            System.out.println();
                            System.out.println("\t===================================================");
                            System.out.println("\t|  Username sudah digunakan, silahkan masukkan    |");
                            System.out.println("\t|                   username lain                 |");
                            System.out.println("\t===================================================");
                            System.out.println();
                            x = 3;
                        }

                        if (y == 1) {
                            x = 4;
                        }

                    }
                }

                if (j == 18) {

                    while (x <= 4) {
                        System.out.print("Silahkan masukkan password Anda\t= ");
                        akunFungsiDaftar[i][j] = sc.next();
                        System.out.print("Masukkan ulang password Anda\t= ");
                        akunFungsiDaftar2[0][0] = sc.next();

                        if (akunFungsiDaftar2[0][0].equalsIgnoreCase(akunFungsiDaftar[i][j])) {
                            x = 5;
                            System.out.println();
                            System.out.println("\t==============================");
                            System.out.println("\t|  Berhasil, silahkan login  |");
                            System.out.println("\t|    dengan username Anda    |");
                            System.out.println("\t==============================");
                            System.out.println();
                            menuLogin();
                            fungsiLogin(akunFungsiDaftar);
                        } else {
                            x = 4;
                            System.out.println();
                            System.out.println("\t===========================================");
                            System.out.println("\t|  Mohon, masukkan kembali password       |");
                            System.out.println("\t|             dengan benar                |");
                            System.out.println("\t===========================================");
                            System.out.println();
                        }
                    }

                }

            }
        }

        return akunFungsiDaftar;
    }

    /*Dalam bagian ini, berisi fungsi-fungsi
      dan syntax yang mengatur sesi menu
    */
    static void tampilMenu() {
        System.out.println("======================================================");
        System.out.println("|                        Menu                        |");
        System.out.println("======================================================");
        System.out.println("| 1. Info Rekening         | 4. Beli & Bayar         |");
        System.out.println("| 2. Setor & Tarik Tunai   | 5. Keamanan             |");
        System.out.println("| 3. Transfer              | 6. Keluar               |");
        System.out.println("|====================================================|");
        System.out.println("| Silahkan pilih menu dengan mengetik nomor menu nya |");
        System.out.println("======================================================");

    }

    static void kembaliMenu() {
        System.out.println("\t  ================================");
        System.out.println("\t  | Apakah Anda ingin kembali ke |");
        System.out.println("\t  |          menu utama?         |");
        System.out.println("\t  ================================");
    }


    static void notifSaldo() {
        System.out.println("\t===========================================");
        System.out.println("\t|     Sisa saldo Anda tidak mencukupi     |");
        System.out.println("\t===========================================");
    }

    //Validasi dalam menginputkan nominal uang  
    static String validasiNominal() {
        String nominal = "1";
        int x = 0;
        
        while (x <= 1) {
        System.out.print(" Masukkan Nominal Uang\t= ");
        nominal = sc.next(); 

            if (nominal.matches("[0-9]*")) {
                x = 2;
            } else {
                warning();
                x = 1;
            }
        }
        
        return nominal;
    }
    
    //Berisi syntax yang mengatur sesi info rekening   
    static void tampilInfo(String[][] akunTampilInfo) {

        int x = 0;
        String pilih;

        while (x == 0) {
            System.out.println("======================================================");
            System.out.println("|                 Info Rekening                      |");
            System.out.println("======================================================");
            System.out.println("| 1. Cek Data                                        |");
            System.out.println("| 2. Cek Saldo                                       |");
            System.out.println("| 3. Kembali                                         |");            
            System.out.println("|====================================================|");
            System.out.println("| Silahkan pilih menu dengan mengetik nomor menu nya |");
            System.out.println("======================================================");
            System.out.print("Masukkan jawaban Anda\t= ");
            pilih = sc.next();
            System.out.println();

            switch (pilih) {

                case "1":
                    System.out.println("======================================================");
                    System.out.println("|          Data Nasabah Tabungan " + akunTampilInfo[noID][14] + "            |");
                    System.out.println("======================================================");
                    System.out.println("| Identitas Diri                                     |");
                    System.out.println("======================================================");
                    System.out.println("  ID Nasabah\t\t= " + akunTampilInfo[noID][2]);
                    System.out.println("  Nomor Rekening\t= " + akunTampilInfo[noID][16]);
                    System.out.println("  Nama Lengkap\t\t= " + akunTampilInfo[noID][0]);
                    System.out.println("  Nomor KTP\t\t= " + akunTampilInfo[noID][1]);
                    System.out.println("  Alamat Email\t\t= " + akunTampilInfo[noID][4]);
                    System.out.println("  Nomor HP\t\t= " + akunTampilInfo[noID][5]);
                    System.out.println("  Profesi\t\t= " + akunTampilInfo[noID][6]);
                    System.out.println("=====================================================|");
                    System.out.println("| Data Alamat                                        |");
                    System.out.println("======================================================");
                    System.out.println("  Kode Pos\t\t= " + akunTampilInfo[noID][7]);
                    System.out.println("  Nomor RT/RW\t\t= " + akunTampilInfo[noID][8] + "/" + akunTampilInfo[noID][9]);
                    System.out.println("  Nama Kelurahan/Desa\t= " + akunTampilInfo[noID][10]);
                    System.out.println("  Nama Kecamatan\t= " + akunTampilInfo[noID][11]);
                    System.out.println("  Nama Kabupaten/Kota\t= " + akunTampilInfo[noID][12]);
                    System.out.println("  Nama Provinsi\t\t= " + akunTampilInfo[noID][13]);
                    System.out.println("======================================================");
                    x = 1;
                    break;

                case "2":

                    System.out.println("======================================================");
                    System.out.println("|                    Saldo Nasabah                   |");
                    System.out.println("======================================================");
                    System.out.println("  Saldo Anda\t= " + akunTampilInfo[noID][15]);
                    System.out.println("======================================================");
                    x = 1;

                    break;
                
                case "3":
                    x=2;
                break;
                default:
                    x = 0;
                    warning();
                    break;
            }

        }
    }

    //Berisi syntax yang mengatur sesi setor dan tarik tunai       
    static void tampilMenuSetarik(String[][] akunTampilSetarik) {

        int[] kelipatanSeratus = new int[10000];
        int i, filterTarik, kelipatanSratus = 0;
        int nominal = 0, total, x = 0;
        String totalSaldo, totalSblm, pilih;

        totalSblm = akunTampilSetarik[noID][15];

        if (akunTampilSetarik[noID][14].equals("PremiKIT")) {
            filterTarik = Integer.parseInt(totalSblm) - 100000;
        } else {
            filterTarik = Integer.parseInt(totalSblm) - 50000;
        }

        for (i = 1; i < kelipatanSeratus.length; i++) {
            kelipatanSratus = 100000 * i;
            kelipatanSeratus[i] = kelipatanSratus;
        }

        while (x <= 6) {
            x = 0;
            System.out.println();
            System.out.println("======================================================");
            System.out.println("|                Setor & Tarik Tunai                 |");
            System.out.println("======================================================");
            System.out.println("| 1. Setor Tunai                                     |");
            System.out.println("| 2. Tarik Tunai                                     |");
            System.out.println("| 3. Kembali                                         |");                        
            System.out.println("|====================================================|");
            System.out.println("| Silahkan pilih menu dengan mengetik nomor menu nya |");
            System.out.println("======================================================");
            System.out.print("Masukkan jawaban Anda\t= ");
            pilih = sc.next();
            System.out.println();

            switch (pilih) {

                case "1":
                    while (x <= 1) {
                        System.out.println("======================================================");
                        System.out.println("|            Setor Tunai Tanpa Kartu ATM             |");
                        System.out.println("======================================================");
                        System.out.println("| Langkah-langkah                                    |");
                        System.out.println("======================================================");
                        System.out.println("| 1. Kunjungi ATM yang melayani setor tabungan       |");
                        System.out.println("| 2. Pilih Transaksi Tanpa Kartu                     |");
                        System.out.println("| 3. Masukkan nomor Handphone Anda                   |");
                        System.out.println("| 4. Selesaikan transaksi di KIT Mobile              |");
                        System.out.println("| 5. Masukkan kode 6 digit dari KIT Mobile pada ATM  |");
                        System.out.println("| 6. Masukkan uang dalam ATM (kelipatan 100.000)     |");
                        System.out.println("| 7. Selesai                                         |");
                        System.out.println("======================================================");
                        lanjut();
                        validasiYa();
                        System.out.print("Masukkan jawaban Anda\t= ");
                        pilih = sc.next();

                        if (pilih.equals("1")) {
                            x = 2;
                            break;
                        }

                        if (pilih.equals("2")) {
                            x = 1;
                            continue;
                        } else {
                            warning();
                            x = 0;
                        }
                    }

                    while (x <= 2) {
                        System.out.println();
                        System.out.println("======================================================");
                        System.out.println("|            Setor Tunai Tanpa Kartu ATM             |");
                        System.out.println("======================================================");
                        System.out.println(" Tujuan Rekening\t= " + akunTampilSetarik[noID][16]+" -Rekening Utama");
                        
                        nominal = Integer.parseInt(validasiNominal());
                        System.out.println("======================================================");

                        for (i = 1; i < kelipatanSeratus.length; i++) {

                            if (nominal == kelipatanSeratus[i]) {
                                x = 3;
                                break;
                            }
                            if (i < kelipatanSeratus.length) {
                                continue;
                            } else {

                                x = 2;

                            }

                        }
                        if (x == 2) {
                            System.out.println();
                            System.out.println("\t===========================================");
                            System.out.println("\t|  Nominal saldo harus kelipatan 100.000! |");
                            System.out.println("\t===========================================");

                        }
                    }

                    konfirmasi();
                    validasiYa();
                    System.out.print("Masukkan jawaban Anda\t= ");
                    pilih = sc.next();

                    if (pilih.equals("1")) {
                        System.out.println();
                        System.out.println("======================================================");
                        System.out.println("|               Masukkan password Anda               |");
                        System.out.println("======================================================");
                        System.out.print("Masukkan jawaban Anda\t= ");
                        pilih = sc.next();

                        if (pilih.equalsIgnoreCase(akunTampilSetarik[noID][18])) {

                            while (x <= 3) {

                                System.out.println();
                                System.out.println("\t\t======================");
                                System.out.println("\t\t Kode verifikasi :     ");
                                System.out.println("\t\t 12345" + akunTampilSetarik[noID][2]);
                                System.out.println("\t\t======================");
                                System.out.println();
                                System.out.println("\t===========================================");
                                System.out.println("\t| Apakah kode sudah dimasukkan pada ATM?  |");
                                System.out.println("\t===========================================");
                                validasiYa();
                                System.out.print("Masukkan jawaban Anda\t= ");
                                pilih = sc.next();

                                if (pilih.equals("1")) {
                                    total = nominal + Integer.parseInt(akunTampilSetarik[noID][15]);
                                    totalSaldo = Integer.toString(total);
                                    akunTampilSetarik[noID][15] = totalSaldo;
                                    System.out.println();
                                    System.out.println("======================================================");
                                    System.out.println("|                                " + getTanggal() + " " + getWaktu() + "|");
                                    System.out.println("|                 Transaksi Berhasil                 |");
                                    System.out.println("======================================================");
                                    System.out.println("                     Setor Tunai                      ");
                                    System.out.println("                    Rp " + nominal);
                                    System.out.println("======================================================");
                                    System.out.println(" Tujuan Rekening\t= " + akunTampilSetarik[noID][16]+" -Rekening Utama");
                                    System.out.println(" Nama Pemilik Rekening\t= " + akunTampilSetarik[noID][0]);
                                    System.out.println("======================================================");
                                    System.out.println(" Saldo sebelumnya\t\t\t= " + totalSblm);
                                    System.out.println(" Nominal uang masuk\t\t\t= " + nominal);
                                    System.out.println(" Total\t\t\t\t\t= " + totalSaldo);
                                    System.out.println("======================================================");
                                    x = 8;
                                    break;
                                }

                                if (pilih.equals("2")) {
                                    x = 3;
                                }

                            }

                        }
                        if (x == 8) {
                            break;
                        } else {
                            warningPwd();
                            x = 2;
                            break;
                        }
                    }

                    if (pilih.equals("2")) {
                        x = 2;

                    } else {
                        warning();
                        x = 2;
                        continue;
                    }

                    break;

                case "2":

                    while (x <= 4) {
                        System.out.println("======================================================");
                        System.out.println("|            Tarik Tunai Tanpa Kartu ATM             |");
                        System.out.println("======================================================");
                        System.out.println("| Langkah-langkah                                    |");
                        System.out.println("======================================================");
                        System.out.println("| 1. Kunjungi ATM terdekat                           |");
                        System.out.println("| 2. Pilih Transaksi Tanpa Kartu                     |");
                        System.out.println("| 3. Masukkan nomor Handphone Anda                   |");
                        System.out.println("| 4. Selesaikan transaksi di KIT Mobile              |");
                        System.out.println("| 5. Masukkan kode 6 digit dari KIT Mobile pada ATM  |");
                        System.out.println("| 6. Ambil uang dari ATM (kelipatan 100.000)     |");
                        System.out.println("| 7. Selesai                                         |");
                        System.out.println("======================================================");
                        lanjut();
                        validasiYa();
                        System.out.print("Masukkan jawaban Anda\t= ");
                        pilih = sc.next();

                        if (pilih.equals("1")) {
                            x = 5;
                            break;
                        }

                        if (pilih.equals("2")) {
                            x = 4;

                        } else {
                            warning();
                            x = 4;
                        }
                    }

                    while (x <= 6) {
                        System.out.println();
                        System.out.println("======================================================");
                        System.out.println("|            Tarik Tunai Tanpa Kartu ATM             |");
                        System.out.println("======================================================");
                        System.out.println(" Sumber Dana\t\t= " + akunTampilSetarik[noID][16] + " -Rekening Utama");
                       
                        nominal = Integer.parseInt(validasiNominal());
                        System.out.println("======================================================");

                        for (i = 1; i < kelipatanSeratus.length; i++) {

                            if (nominal == kelipatanSeratus[i] && nominal <= filterTarik) {
                                x = 8;
                                break;
                            }
                            if (nominal > filterTarik) {
                                x = 6;
                                break;
                            }
                            if (i < kelipatanSeratus.length) {
                                continue;
                            } else {
                                x = 5;    
                            }

                        }
                        if (x == 6) {
                            System.out.println();
                            notifSaldo();
                            x = 7;

                        }

                        if (x == 5) {
                            System.out.println();
                            System.out.println("\t===========================================");
                            System.out.println("\t|  Nominal saldo harus kelipatan 100.000! |");
                            System.out.println("\t===========================================");
                        }
  
                    }
                    if (x == 7) {
                        continue;
                    }

                    konfirmasi();
                    validasiYa();
                    System.out.print("Masukkan jawaban Anda\t= ");
                    pilih = sc.next();

                    if (pilih.equals("1")) {
                        System.out.println();
                        System.out.println("======================================================");
                        System.out.println("|               Masukkan password Anda               |");
                        System.out.println("======================================================");
                        System.out.print("Masukkan jawaban Anda\t= ");
                        pilih = sc.next();

                        if (pilih.equalsIgnoreCase(akunTampilSetarik[noID][18])) {

                            while (x <= 8) {

                                System.out.println();
                                System.out.println("\t\t======================");
                                System.out.println("\t\t Kode verifikasi :     ");
                                System.out.println("\t\t 12346" + akunTampilSetarik[noID][2]);
                                System.out.println("\t\t======================");
                                System.out.println();
                                System.out.println("\t===========================================");
                                System.out.println("\t| Apakah kode sudah dimasukkan pada ATM?  |");
                                System.out.println("\t===========================================");
                                validasiYa();
                                System.out.print("Masukkan jawaban Anda\t= ");
                                pilih = sc.next();

                                if (pilih.equals("1")) {

                                    total = Integer.parseInt(akunTampilSetarik[noID][15]) - nominal;
                                    totalSaldo = Integer.toString(total);
                                    akunTampilSetarik[noID][15] = totalSaldo;
                                    System.out.println();
                                    System.out.println("======================================================");
                                    System.out.println("|                                " + getTanggal() + " " + getWaktu() + "|");
                                    System.out.println("|                 Transaksi Berhasil                 |");
                                    System.out.println("======================================================");
                                    System.out.println("                     Tarik Tunai                      ");
                                    System.out.println("                     Rp " + nominal);
                                    System.out.println("======================================================");
                                    System.out.println(" Sumber Dana\t\t= " + akunTampilSetarik[noID][16] + " -Rekening Utama");
                                    System.out.println("======================================================");
                                    System.out.println(" Saldo sebelumnya\t\t\t= " + totalSblm);
                                    System.out.println(" Nominal uang keluar\t\t\t= " + nominal);
                                    System.out.println(" Total\t\t\t\t\t= " + totalSaldo);
                                    System.out.println("======================================================");
                                    x = 9;
                                    break;
                                }

                                if (pilih.equals("2")) {
                                    x = 8;
                                }

                            }

                        }
                        if (x == 9) {
                            break;
                        } else {
                            warningPwd();
                            x = 5;
                            break;
                        }
                    }

                    if (pilih.equals("2")) {
                        x = 5;
                    } else {
                        warning();
                        x = 5;
                    }

                    break;
                    
                case "3":
                    x=9;
                   
                    break;
                    
                default:
                    warning();
                    x = 5;
            }

        }

    }
    
    /*Berisi data Nasabah dari beberapa Bank
      Jika terdapat array yang berisi angka 0, maka
      diasumsikan sebagai nomor ID
    */
    static String[][] dataBankBRI(String[][] dataNasabah) {
        dataNasabah = new String[100][5];

        dataNasabah[0][0] = "0";              //nomor ID
        dataNasabah[0][1] = "BANK BRI";       //nama Bank
        dataNasabah[0][2] = "Bayu Prasetyo";  //nama nasabah
        dataNasabah[0][3] = "01236547890";    //nomor rekening 
        dataNasabah[0][4] = "500000";         //jumlah saldo

        return dataNasabah;

    }

    static String[][] dataBankMandiri(String[][] dataNasabah) {
        dataNasabah = new String[100][5];

        dataNasabah[0][0] = "0";
        dataNasabah[0][1] = "BANK MANDIRI";
        dataNasabah[0][2] = "Ferdy Hahan";
        dataNasabah[0][3] = "11236547890";
        dataNasabah[0][4] = "500000";

        return dataNasabah;

    }

    static String[][] dataBankBCA(String[][] dataNasabah) {
        dataNasabah = new String[100][5];

        dataNasabah[0][0] = "0";
        dataNasabah[0][1] = "BANK BCA";
        dataNasabah[0][2] = "Dwiki Septian";
        dataNasabah[0][3] = "21236547890";
        dataNasabah[0][4] = "600000";
        return dataNasabah;

    }

    static String[][] dataBankBNI(String[][] dataNasabah) {
        dataNasabah = new String[100][5];

        dataNasabah[0][0] = "0";
        dataNasabah[0][1] = "BANK BNI";
        dataNasabah[0][2] = "Ibnu Rizal";
        dataNasabah[0][3] = "31236547890";
        dataNasabah[0][4] = "700000";
        return dataNasabah;

    }

    static String[][] cimbNiaga(String[][] dataNasabah) {
        dataNasabah = new String[100][5];

        dataNasabah[0][0] = "0";
        dataNasabah[0][1] = "BANK CIMB NIAGA";
        dataNasabah[0][2] = "Ilham Sinatrio Gumelar";
        dataNasabah[0][3] = "41236547890";
        dataNasabah[0][4] = "800000";
        return dataNasabah;

    }

    static void tampilBank() {
        System.out.println("============================================================");
        System.out.println("|                  Daftar Bank                             |");
        System.out.println("============================================================");
        System.out.println("| 1. Bank KIT            | 4. Bank BCA         | 7.Kembali |");
        System.out.println("| 2. Bank BRI            | 5. Bank BNI                     |");
        System.out.println("| 3. Bank Mandiri        | 6. Bank CIMB                    |");
        System.out.println("|==========================================================|");
        System.out.println("| Silahkan pilih menu dengan mengetik nomor menu nya       |");
        System.out.println("============================================================");
    }


    static void konfirmasi() {
        System.out.println();
        System.out.println("\t  =================================");
        System.out.println("\t  |           KONFIRMASI?         |");
        System.out.println("\t  =================================");
        System.out.println();
    }

    static void lanjut() {
        System.out.println();
        System.out.println("\t  =================================");
        System.out.println("\t  |             LANJUT?           |");
        System.out.println("\t  =================================");
        System.out.println();
    }

    //Tampilan jika user memilih pembelian dan pembayaran
    static void tampilBeliBayar() {
        System.out.println("======================================================");
        System.out.println("|                  Beli & Bayar                      |");
        System.out.println("======================================================");
        System.out.println("| 1. Pembelian                                       |");
        System.out.println("| 2. Pembayaran                                      |");
        System.out.println("| 3. Kembali                                         |");        
        System.out.println("|====================================================|");
        System.out.println("| Silahkan pilih menu dengan mengetik nomor menu nya |");
        System.out.println("======================================================");
    }
    
    //Menampilkan jika user memilih pembelian
    static void tampilPembelian() {
        System.out.println("======================================================");
        System.out.println("|                    Pembelian                       |");
        System.out.println("======================================================");
        System.out.println("| 1. Beli Pulsa                                      |");
        System.out.println("| 2. Top Up Link Aja                                 |");
        System.out.println("| 3. PLN Pra Bayar                                   |");
        System.out.println("| 4. Kembali                                         |");        
        System.out.println("|====================================================|");
        System.out.println("| Silahkan pilih menu dengan mengetik nomor menu nya |");
        System.out.println("======================================================");

    }
    
    //Tampilan daftar nominal pulsa dan harganya
    static void tampilMenuPulsa() {
        System.out.println("====================================================");
        System.out.println("|               Daftar Harga Pulsa                 |");
        System.out.println("====================================================");
        System.out.println("|          Pulsa         |         Harga           |");
        System.out.println("====================================================");
        System.out.println("|          5000          |          6500           |");
        System.out.println("|         10000          |         11000           |");
        System.out.println("|         15000          |         16500           |");
        System.out.println("|         20000          |         20000           |");
        System.out.println("|         25000          |         24950           |");
        System.out.println("|         30000          |         29850           |");
        System.out.println("|         50000          |         49250           |");
        System.out.println("|        100000          |         98500           |");
        System.out.println("|        150000          |        145000           |");
        System.out.println("|        200000          |        193000           |");
        System.out.println("|        250000          |        237500           |");
        System.out.println("|        500000          |        470000           |");
        System.out.println("|       1000000          |        962000           |");
        System.out.println("====================================================");

    }
    
    //Array yang akan dipanggil untuk verifikasi harga pulsa
    static String[][] hargaPulsa(String[][] hargaPulsa) {
        hargaPulsa = new String[13][2];

        hargaPulsa[0][0] = "5000";
        hargaPulsa[0][1] = "6500";
        hargaPulsa[1][0] = "10000";
        hargaPulsa[1][1] = "11000";
        hargaPulsa[2][0] = "15000";
        hargaPulsa[2][1] = "16500";
        hargaPulsa[3][0] = "20000";
        hargaPulsa[3][1] = "20000";
        hargaPulsa[4][0] = "25000";
        hargaPulsa[4][1] = "24950";
        hargaPulsa[5][0] = "30000";
        hargaPulsa[5][1] = "29850";
        hargaPulsa[6][0] = "50000";
        hargaPulsa[6][1] = "49250";
        hargaPulsa[7][0] = "100000";
        hargaPulsa[7][1] = "98500";
        hargaPulsa[8][0] = "150000";
        hargaPulsa[8][1] = "145000";
        hargaPulsa[9][0] = "200000";
        hargaPulsa[9][1] = "193000";
        hargaPulsa[10][0] = "250000";
        hargaPulsa[10][1] = "237500";
        hargaPulsa[11][0] = "500000";
        hargaPulsa[11][1] = "470000";
        hargaPulsa[12][0] = "1000000";
        hargaPulsa[12][1] = "962000";

        return hargaPulsa;
    }

    static String[][] linkAja(String[][] dataLinkAja) {
        dataLinkAja = new String[100][3];

        dataLinkAja[0][0] = "0";
        dataLinkAja[0][1] = "Muhammad Rizqi Ardiansyah";
        dataLinkAja[0][2] = "085730945122";

        return dataLinkAja;

    }

    static String[][] dataPln(String[][] dataPln) {
        dataPln = new String[100][4];

        dataPln[0][0] = "0";
        dataPln[0][1] = "123654789";
        dataPln[0][2] = "Bagos Hadi Wijaya";
        dataPln[0][3] = "R1M/900 VA";

        return dataPln;

    }

    static String[][] biayaAdmin(String[][] dataBiaya) {
        dataBiaya = new String[100][1];

        dataBiaya[0][0] = "1000"; //Biaya Administrasi Bank BRI
        dataBiaya[1][0] = "1200"; //Biaya Administrasi Bank Mandiri
        dataBiaya[2][0] = "1000"; //Biaya Administrasi Bank BCA
        dataBiaya[3][0] = "2000"; //Biaya Administrasi Bank Mandiri
        dataBiaya[4][0] = "6000"; //Biaya Administrasi Bank Cimb Niaga

        return dataBiaya;
    }
    
    //Menampilkan jika user memilih pembayaran
    static void tampilPembayaran() {
        System.out.println("======================================================");
        System.out.println("|                    Pembayaran                      |");
        System.out.println("======================================================");
        System.out.println("| 1. Briva                                           |");
        System.out.println("| 2. Kartu Kredit                                    |");
        System.out.println("| 3. BPJS                                            |");
        System.out.println("| 4. Kembali                                         |");        
        System.out.println("|====================================================|");
        System.out.println("| Silahkan pilih menu dengan mengetik nomor menu nya |");
        System.out.println("======================================================");

    }

    static String[][] briva(String[][] dataBriva) {
        dataBriva = new String[100][5];

        dataBriva[0][0] = "0";
        dataBriva[0][1] = "9876543210";
        dataBriva[0][2] = "Tigor Imam Hamdani";
        dataBriva[0][3] = "Shopee";
        dataBriva[0][4] = "90000";

        return dataBriva;
    }

    static String[][] kartuKredit(String[][] dataKartuKredit) {
        dataKartuKredit = new String[100][5];

        dataKartuKredit[0][0] = "0";
        dataKartuKredit[0][1] = "9876543211";
        dataKartuKredit[0][2] = "Bintang Nur Auliya'";
        dataKartuKredit[0][3] = "PT Home Credit Indo";
        dataKartuKredit[0][4] = "412000";

        return dataKartuKredit;
    }

    static String[][] bpjs(String[][] dataBpjs) {
        dataBpjs = new String[100][5];

        dataBpjs[0][0] = "0";
        dataBpjs[0][1] = "9876543212";
        dataBpjs[0][2] = "Arifiyan Wahyu (PST:2)";
        dataBpjs[0][3] = "1301 Jember";
        dataBpjs[0][4] = "120000";

        return dataBpjs;
    }
    
    //Menampilkan jika user memilih Keamanan
    static void tampilKeamanan() {

        System.out.println("======================================================");
        System.out.println("|                      Keamanan                      |");
        System.out.println("======================================================");
        System.out.println("| 1. Ubah Password                                   |");
        System.out.println("| 2. Kembali                                         |");                
        System.out.println("|====================================================|");
        System.out.println("| Silahkan pilih menu dengan mengetik nomor menu nya |");
        System.out.println("======================================================");

    }
    
    //Syntax yang mengatur sesi transfer
    static void transfer(String[][] akunFungsiTransfer, String[][] bankKIT) {

        String pilih, totalSblm, totalSaldo;
        int IDBankKIT = 0, filterTarik, nominal = 0, total = 0, totalSaldo2;
        int x = 0, y = 0;
        String[][] biayaAdminTransfer = new String[100][1];
        biayaAdminTransfer = biayaAdmin(biayaAdminTransfer);
        int biayaAdmin = 0;

        totalSblm = bankKIT[noID][15];

        if (bankKIT[noID][14].equals("PremiKIT")) {
            filterTarik = Integer.parseInt(totalSblm) - 100000;
        } else {
            filterTarik = Integer.parseInt(totalSblm) - 50000;
        }

        while (x <= 2) {
            System.out.println();
            System.out.println("============================================================");
            System.out.println("|                         Transfer                         |");
            tampilBank();
            System.out.print("Masukkan Nama Bank Tujuan\t= ");
            pilih = sc.next();

            switch (pilih) {

                case "1":
                    akunFungsiTransfer[0][0] = bankKIT[IDBankKIT][2];
                    akunFungsiTransfer[0][1] = "BANK KIT";
                    akunFungsiTransfer[0][2] = bankKIT[IDBankKIT][0];
                    akunFungsiTransfer[0][3] = bankKIT[IDBankKIT][16];
                    akunFungsiTransfer[0][4] = bankKIT[IDBankKIT][15];
                    x = 2;
                    break;

                case "2":
                    akunFungsiTransfer = dataBankBRI(akunFungsiTransfer);
                    biayaAdmin = Integer.parseInt(biayaAdminTransfer[0][0]);
                    x = 2;
                    break;

                case "3":
                    akunFungsiTransfer = dataBankMandiri(akunFungsiTransfer);
                    biayaAdmin = Integer.parseInt(biayaAdminTransfer[1][0]);

                    x = 2;
                    break;

                case "4":
                    akunFungsiTransfer = dataBankBCA(akunFungsiTransfer);
                    biayaAdmin = Integer.parseInt(biayaAdminTransfer[2][0]);

                    x = 2;
                    break;

                case "5":
                    akunFungsiTransfer = dataBankBNI(akunFungsiTransfer);
                    biayaAdmin = Integer.parseInt(biayaAdminTransfer[3][0]);

                    x = 2;
                    break;

                case "6":
                    akunFungsiTransfer = cimbNiaga(akunFungsiTransfer);
                    biayaAdmin = Integer.parseInt(biayaAdminTransfer[4][0]);

                    x = 2;
                    break;
                
                case "7":
                    
                    x=10;
                    continue;
                   
                default:
                    warning();
                    x = 1;
                    continue;
            }

            System.out.print("Masukkan Nomor Rekening Tujuan\t= ");
            pilih = sc.next();
            
            //validasi untuk mencari nomor rekening sesama nasabah di bankKIT
            if (akunFungsiTransfer[0][1].equals("BANK KIT")) {
                for (IDBankKIT = 0; IDBankKIT < bankKIT.length; IDBankKIT++) {
                    for (int n = 16; n < 17; n++) {

                        if (IDBankKIT == noID) {
                            continue;
                        }

                        if (pilih.equals(bankKIT[IDBankKIT][n])) {
                            y = 2;
                            akunFungsiTransfer[0][0] = bankKIT[IDBankKIT][2];
                            akunFungsiTransfer[0][1] = "BANK KIT";
                            akunFungsiTransfer[0][2] = bankKIT[IDBankKIT][0];
                            akunFungsiTransfer[0][3] = bankKIT[IDBankKIT][16];
                            akunFungsiTransfer[0][4] = bankKIT[IDBankKIT][15];
                            break;

                        } else {
                            y = 1;

                        }

                    }
                    if (y == 2) {
                        x = 3;
                        break;
                    }

                }

                if (y == 1) {
                    IDBankKIT = 0;
                    x = 10;
                    System.out.println();
                    System.out.println("\t  =================================");
                    System.out.println("\t  | Mohon masukkan nomor rekening |");
                    System.out.println("\t  |          dengan benar!        |");                    
                    System.out.println("\t  =================================");
                    System.out.println();
                    continue;
                }
            }
            
            /*Jika selain bank KIT, maka akan disesuaikan
              array data bank yang dibuat secara manual
            */
            if (pilih.equals(akunFungsiTransfer[0][3])) {
                x = 3;
            } else {
                    System.out.println();
                    System.out.println("\t=================================");
                    System.out.println("\t| Mohon masukkan nomor rekening |");
                    System.out.println("\t|          dengan benar!        |");                    
                    System.out.println("\t=================================");
                    System.out.println();
                x = 2;
                continue;
            }

            nominal = Integer.parseInt(validasiNominal());
            
            //validasi jika nominal lebih dari saldo
            if (nominal > (filterTarik - biayaAdmin)) {
                notifSaldo();
                x = 10;

            } else {
                x = 3;
            }
            if (x == 10) {
                continue;
            }

            konfirmasi();
            validasiYa();
            System.out.print("Masukkan jawaban Anda\t= ");
            pilih = sc.next();

            if (pilih.equals("1")) {
                System.out.println();
                System.out.println("======================================================");
                System.out.println("                        Transfer                      ");
                System.out.println("======================================================");
                System.out.println(" Sumber Dana\t\t= " + bankKIT[noID][16] + " -Rekening Utama");
                System.out.println("======================================================");
                System.out.println(" Nama Bank Tujuan\t= " + akunFungsiTransfer[0][1]);
                System.out.println(" Nomor Rekening Tujuan\t= " + akunFungsiTransfer[0][3]);
                System.out.println(" Nama Pemilik Rekening\t= " + akunFungsiTransfer[0][2]);
                System.out.println("======================================================");
                System.out.println("                    Rincian Transfer                  ");
                System.out.println("======================================================");
                System.out.println(" Nominal Transfer\t= " + nominal);
                System.out.println(" Biaya Admin\t\t= " + biayaAdmin);
                System.out.println("======================================================");
                System.out.println(" Total\t\t\t= " + (biayaAdmin + nominal));
                System.out.println("======================================================");

                lanjut();
                validasiYa();
                System.out.print("Masukkan jawaban Anda\t= ");
                pilih = sc.next();

                if (akunFungsiTransfer[0][1].equals("BANK KIT")) {
                    totalSaldo2 = Integer.parseInt(bankKIT[IDBankKIT][15]) + nominal;
                    bankKIT[IDBankKIT][15] = Integer.toString(totalSaldo2);
                }

                if (pilih.equals("1")) {
                    System.out.println();
                    System.out.println("======================================================");
                    System.out.println("|               Masukkan password Anda               |");
                    System.out.println("======================================================");
                    System.out.print("Masukkan jawaban Anda\t= ");
                    pilih = sc.next();

                    if (pilih.equalsIgnoreCase(bankKIT[noID][18])) {

                        total = Integer.parseInt(totalSblm) - (nominal + biayaAdmin);
                        totalSaldo = Integer.toString(total);
                        bankKIT[noID][15] = totalSaldo;

                        System.out.println();
                        System.out.println("======================================================");
                        System.out.println("|                                " + getTanggal() + " " + getWaktu() + "|");
                        System.out.println("|                 Transaksi Berhasil                 |");
                        System.out.println("======================================================");
                        System.out.println("                     Transfer                        ");
                        System.out.println("                     Rp " + nominal);
                        System.out.println("======================================================");
                        System.out.println(" Sumber Dana\t\t= " + bankKIT[noID][16] + " -Rekening Utama");
                        System.out.println("======================================================");
                        System.out.println(" Nama Bank Tujuan\t= " + akunFungsiTransfer[0][1]);
                        System.out.println(" Nomor Rekening Tujuan\t= " + akunFungsiTransfer[0][3]);
                        System.out.println(" Nama Pemilik Rekening\t= " + akunFungsiTransfer[0][2]);
                        System.out.println("======================================================");
                        System.out.println(" Saldo sebelumnya\t\t\t= " + totalSblm);
                        System.out.println(" Nominal uang transfer\t\t\t= " + nominal);
                        System.out.println(" Biaya admin\t\t\t\t= " + biayaAdmin);
                        System.out.println("======================================================");
                        System.out.println(" Total\t\t\t\t\t= " + (biayaAdmin + nominal));
                        System.out.println("======================================================");
                        System.out.println(" Saldo akhir\t\t\t\t= " + totalSaldo);
                        System.out.println("======================================================");

                        x = 10;

                    }
                    if (x == 10) {
                        continue;
                    } else {
                        warningPwd();
                        x = 2;
                        continue;
                    }
                }
                
                //Validasi jika memilih tidak melanjutkan
                if (pilih.equals("2")) {
                    x = 2;
                    continue;
                } else {
                    warning();
                    x = 2;
                    continue;
                }

            }
            
            //Validasi jika dalam konfirmasi memilih tidak
            if (pilih.equals("2")) {
                x = 2;
                continue;
            } else {
                warning();
                x = 2;
            }

        }

    }
    
    //Syntax yang mengatur menu pembelian dan pembayaran
    static void beliBayar(String[][] akunBeliBayar) {

        String pilih, nominal2;
        String[][] harga = {};
        String[][] beli = {};
        String totalSblm = akunBeliBayar[noID][15];

        int x = 0, i, j, nominal = 0, filterTarik, hargaPulsa = 0, saldoAkhir;

        if (akunBeliBayar[noID][14].equals("PremiKIT")) {
            filterTarik = Integer.parseInt(totalSblm) - 100000;
        } else {
            filterTarik = Integer.parseInt(totalSblm) - 50000;
        }
        while (x <= 2) {
            x=0;
            System.out.println();
            tampilBeliBayar();
            System.out.print("Masukkan jawaban Anda\t= ");
            pilih = sc.next();

            switch (pilih) {
                
                //Jika user memilih menu pembelian
                case "1":

                    while (x <= 1) {
                        System.out.println();
                        tampilPembelian();

                        System.out.print("Masukkan jawaban Anda\t= ");
                        pilih = sc.next();
                        
                        //Jika user memilih beli pulas
                        if (pilih.equals("1")) {
//                            beli = beliPulsa(beli);

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                      Beli Pulsa                      ");
                            System.out.println("======================================================");
                            System.out.print("Masukkan nomor HP tujuan\t= ");
                            pilih = sc.next();
                            System.out.println("======================================================");

                            if (pilih.equals(akunBeliBayar[noID][5])) {
                                x = 2;
                            } else {
                            System.out.println();
                            System.out.println("\t===========================================");
                            System.out.println("\t|   Mohon masukkan nomor dengan benar!    |");
                            System.out.println("\t===========================================");
                            System.out.println();
                                x = 1;
                                continue;
                            }

                            System.out.println();
                            tampilMenuPulsa();
                            System.out.print("Masukkan nominal pulsa\t= ");
                            nominal2 = sc.next();
                            System.out.println("======================================================");

                            harga = hargaPulsa(harga);

                            for (i = 0; i < harga.length; i++) {
                                for (j = 0; j < 1; j++) {

                                    if (nominal2.equals(harga[i][j])) {

                                        nominal = Integer.parseInt(nominal2);
                                        hargaPulsa = Integer.parseInt(harga[i][1]);
                                        x = 3;
                                        break;
                                    }

                                    if (i < harga.length) {
                                        x = 1;
                                        continue;

                                    }

                                }
                                if (x == 3) {
                                    break;
                                }

                            }

                            if (x == 1) {
                            System.out.println("\t==============================================");
                            System.out.println("\t| Mohon masukkan nominal pulsa dengan benar! |");
                            System.out.println("\t==============================================");
                                continue;
                            }

                            if (hargaPulsa > filterTarik) {
                                notifSaldo();
                                x = 10;
                                break;
                            }
                            if (x == 10) {
                                break;
                            } else {
                                x = 2;
                            }

                            konfirmasi();
                            validasiYa();
                            System.out.print("Mohon masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {
                                System.out.println();
                                System.out.println("======================================================");
                                System.out.println("|               Masukkan password Anda               |");
                                System.out.println("======================================================");
                                System.out.print("Masukkan jawaban Anda\t= ");
                                pilih = sc.next();

                                if (pilih.equals(akunBeliBayar[noID][18])) {

                                    saldoAkhir = Integer.parseInt(totalSblm) - hargaPulsa;
                                    akunBeliBayar[noID][15] = Integer.toString(saldoAkhir);
                                    System.out.println();
                                    System.out.println("======================================================");
                                    System.out.println("|                                " + getTanggal() + " " + getWaktu() + "|");
                                    System.out.println("|                 Transaksi Berhasil                 |");
                                    System.out.println("======================================================");
                                    System.out.println("                     Beli Pulsa                       ");
                                    System.out.println("                     Rp " + nominal);
                                    System.out.println("======================================================");
                                    System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                                    System.out.println("======================================================");
                                    System.out.println(" Nomor HP Tujuan\t= " + akunBeliBayar[noID][5]);
                                    System.out.println("======================================================");
                                    System.out.println(" Saldo sebelumnya\t\t\t= " + totalSblm);
                                    System.out.println(" Harga pulsa\t\t\t\t= " + hargaPulsa);
                                    System.out.println("======================================================");
                                    System.out.println(" Saldo akhir\t\t\t\t= " + akunBeliBayar[noID][15]);
                                    System.out.println("======================================================");
                                    x = 10;
                                    continue;
                                } else {
                                    warningPwd();
                                    x = 1;
                                    continue;
                                }
                            }

                            if (pilih.equals("2")) {
                                x = 2;
                                continue;
                            }

                        }
                        
                        //Jika user memilih Top Up Link Aja
                        if (pilih.equals("2")) {
                            beli = linkAja(beli);

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                     Top Up Link Aja                 ");
                            System.out.println("======================================================");
                            System.out.print("Masukkan nomor HP tujuan\t= ");
                            pilih = sc.next();
                            System.out.println("======================================================");

                            if (pilih.equals(beli[0][2])) {
                                x = 2;
                            } else {
                                warning();
                                x = 1;
                                continue;
                            }

                            nominal = Integer.parseInt(validasiNominal());
                            System.out.println("======================================================");

                            if (nominal > filterTarik) {
                                notifSaldo();
                                x = 10;
                                continue;
                            } else {
                                x = 2;
                            }

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                     Top Up Link Aja                  ");
                            System.out.println("                     Rp " + nominal);
                            System.out.println("======================================================");
                            System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                            System.out.println("======================================================");
                            System.out.println(" Nama Akun\t\t= " + beli[0][1]);
                            System.out.println(" Nomor HP Tujuan\t= " + beli[0][2]);
                            System.out.println("======================================================");

                            konfirmasi();
                            validasiYa();
                            System.out.print("Mohon masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {
                                System.out.println();
                                System.out.println("======================================================");
                                System.out.println("|               Masukkan password Anda               |");
                                System.out.println("======================================================");
                                System.out.print("Masukkan jawaban Anda\t= ");
                                pilih = sc.next();

                                if (pilih.equals(akunBeliBayar[noID][18])) {

                                    saldoAkhir = Integer.parseInt(totalSblm) - nominal;
                                    akunBeliBayar[noID][15] = Integer.toString(saldoAkhir);
                                    System.out.println();
                                    System.out.println("======================================================");
                                    System.out.println("|                                " + getTanggal() + " " + getWaktu() + "|");
                                    System.out.println("|                 Transaksi Berhasil                 |");
                                    System.out.println("======================================================");
                                    System.out.println("                     Top Up Link Aja                  ");
                                    System.out.println("                     Rp " + nominal);
                                    System.out.println("======================================================");
                                    System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                                    System.out.println("======================================================");
                                    System.out.println(" Nama Akun\t\t= " + beli[0][1]);
                                    System.out.println(" Nomor HP Tujuan\t= " + beli[0][2]);
                                    System.out.println("======================================================");
                                    System.out.println(" Saldo sebelumnya\t\t\t= " + totalSblm);
                                    System.out.println(" Nominal uang keluar\t\t\t\t= " + nominal);
                                    System.out.println("======================================================");
                                    System.out.println(" Saldo akhir\t\t\t\t= " + akunBeliBayar[noID][15]);
                                    System.out.println("======================================================");
                                    x = 10;
                                    continue;

                                } else {
                                    warningPwd();
                                    x = 1;
                                    continue;
                                }
                            }
                            if (pilih.equals("2")) {
                                x = 1;
                                continue;
                            }
                        }
                        
                        //Jika user memilih Listrik Pra Bayar
                        if (pilih.equals("3")) {
                            beli = dataPln(beli);

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                   Listrik Pra Bayar                  ");
                            System.out.println("======================================================");
                            System.out.print("Masukkan nomor meter\t= ");
                            pilih = sc.next();
                            System.out.println("======================================================");

                            if (pilih.equals(beli[0][1])) {
                                x = 2;
                            } else {
                                warning();
                                x = 1;
                                continue;
                            }

                            nominal = Integer.parseInt(validasiNominal());

                            System.out.println("======================================================");

                            if (nominal > filterTarik) {
                                notifSaldo();
                                x = 10;
                                continue;
                            } else {
                                x = 2;
                            }
                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                   Listrik Pra Bayar                  ");
                            System.out.println("                     Rp " + nominal);
                            System.out.println("======================================================");
                            System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                            System.out.println("======================================================");
                            System.out.println(" Nama Pelanggan\t\t= " + beli[0][2]);
                            System.out.println(" Nomor Meter\t\t= " + beli[0][1]);
                            System.out.println(" Tarif / Daya\t\t= " + beli[0][3]);
                            System.out.println("======================================================");

                            konfirmasi();
                            validasiYa();
                            System.out.print("Mohon masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {
                                System.out.println();
                                System.out.println("======================================================");
                                System.out.println("|               Masukkan password Anda               |");
                                System.out.println("======================================================");
                                System.out.print("Masukkan jawaban Anda\t= ");
                                pilih = sc.next();

                                if (pilih.equals(akunBeliBayar[noID][18])) {

                                    saldoAkhir = Integer.parseInt(totalSblm) - nominal;
                                    akunBeliBayar[noID][15] = Integer.toString(saldoAkhir);

                                    System.out.println();
                                    System.out.println("======================================================");
                                    System.out.println("|                                " + getTanggal() + " " + getWaktu() + "|");
                                    System.out.println("|                 Transaksi Berhasil                 |");
                                    System.out.println("======================================================");
                                    System.out.println("                   Listrik Pra Bayar                  ");
                                    System.out.println("                     Rp " + nominal);
                                    System.out.println("======================================================");
                                    System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                                    System.out.println("======================================================");
                                    System.out.println(" Nama Pelanggan\t\t= " + beli[0][2]);
                                    System.out.println(" Nomor Meter\t\t= " + beli[0][1]);
                                    System.out.println(" Tarif / Daya\t\t= " + beli[0][3]);
                                    System.out.println("======================================================");
                                    System.out.println(" Saldo sebelumnya\t\t\t= " + totalSblm);
                                    System.out.println(" Nominal uang keluar\t\t= " + nominal);
                                    System.out.println("======================================================");
                                    System.out.println(" Saldo akhir\t\t\t\t= " + akunBeliBayar[noID][15]);
                                    System.out.println("======================================================");
                                    x = 10;
                                    continue;
                                } else {
                                    warningPwd();
                                    x = 1;
                                    continue;
                                }
                            }
                            if (pilih.equals("2")) {
                                x = 10;
                                continue;
                            }

                        }
                        if(pilih.equals("4")){
                        x=2;
                        continue;
                        }
                        else {
                            warning();
                            x = 1;
                        }

                    }
                    break;
                
                //Jika user memilih menu pembayaran
                case "2":
                    while (x <= 1) {
                        System.out.println();
                        tampilPembayaran();

                        System.out.print("Masukkan jawaban Anda\t= ");
                        pilih = sc.next();

                        if (pilih.equals("1")) {
                            beli = briva(beli);

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                   Pembayaran Briva                   ");
                            System.out.println("======================================================");
                            System.out.print("Masukkan nomor pembayaran\t= ");
                            pilih = sc.next();
                            System.out.println("======================================================");

                            if (pilih.equals(beli[0][1])) {
                                x = 2;
                            } else {
                                warning();
                                x = 1;
                                continue;
                            }

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                   Pembayaran Briva                   ");
                            System.out.println("======================================================");
                            System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                            System.out.println("======================================================");
                            System.out.println(" Nama Pelanggan\t\t= " + beli[0][2]);
                            System.out.println(" Nomor Pembayaran\t= " + beli[0][1]);
                            System.out.println(" Institusi\t\t= " + beli[0][3]);
                            System.out.println(" Nominal tagihan\t= " + beli[0][4]);
                            System.out.println("======================================================");

                            konfirmasi();
                            validasiYa();
                            System.out.print("Mohon masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {

                                nominal = Integer.parseInt(beli[0][4]);
                                if (nominal > filterTarik) {
                                    notifSaldo();
                                    x = 10;
                                    continue;
                                } else {
                                    x = 2;
                                }

                            }
                            if (pilih.equals("2")) {
                                x = 10;
                                continue;
                            }

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("|               Masukkan password Anda               |");
                            System.out.println("======================================================");
                            System.out.print("Masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals(akunBeliBayar[noID][18])) {

                                saldoAkhir = Integer.parseInt(totalSblm) - nominal;
                                akunBeliBayar[noID][15] = Integer.toString(saldoAkhir);

                                System.out.println();
                                System.out.println("======================================================");
                                System.out.println("|                                " + getTanggal() + " " + getWaktu() + "|");
                                System.out.println("|                 Transaksi Berhasil                 |");
                                System.out.println("======================================================");
                                System.out.println("                   Pembayaran Briva                   ");
                                System.out.println("                     Rp " + nominal);
                                System.out.println("======================================================");
                                System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                                System.out.println("======================================================");
                                System.out.println(" Nama Pelanggan\t\t= " + beli[0][2]);
                                System.out.println(" Nomor Pembayaran\t= " + beli[0][1]);
                                System.out.println(" Institusi\t\t= " + beli[0][3]);
                                System.out.println("======================================================");
                                System.out.println(" Saldo sebelumnya\t\t\t= " + totalSblm);
                                System.out.println(" Nominal tagihan\t\t\t= " + nominal);
                                System.out.println("======================================================");
                                System.out.println(" Saldo akhir\t\t\t\t= " + akunBeliBayar[noID][15]);
                                System.out.println("======================================================");
                                x = 10;
                                continue;
                            } else {
                                warningPwd();
                                x = 1;
                                continue;
                            }
                        }

                        if (pilih.equals("2")) {
                            beli = kartuKredit(beli);

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                     Kartu Kredit                    ");
                            System.out.println("======================================================");
                            System.out.print("Masukkan nomor pembayaran\t= ");
                            pilih = sc.next();
                            System.out.println("======================================================");

                            if (pilih.equals(beli[0][1])) {
                                x = 2;
                            } else {
                                warning();
                                x = 1;
                                continue;
                            }

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                     Kartu Kredit                    ");
                            System.out.println("======================================================");
                            System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                            System.out.println("======================================================");
                            System.out.println(" Nama Pelanggan\t\t= " + beli[0][2]);
                            System.out.println(" Nomor Pembayaran\t= " + beli[0][1]);
                            System.out.println(" Institusi\t\t= " + beli[0][3]);
                            System.out.println(" Nominal tagihan\t= " + beli[0][4]);
                            System.out.println("======================================================");

                            konfirmasi();
                            validasiYa();
                            System.out.print("Mohon masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {

                                nominal = Integer.parseInt(beli[0][4]);
                                if (nominal > filterTarik) {
                                    notifSaldo();
                                    x = 10;
                                    continue;
                                } else {
                                    x = 2;
                                }

                            }
                            if (pilih.equals("2")) {
                                x = 10;
                                continue;
                            }

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("|               Masukkan password Anda               |");
                            System.out.println("======================================================");
                            System.out.print("Masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals(akunBeliBayar[noID][18])) {

                                saldoAkhir = Integer.parseInt(totalSblm) - nominal;
                                akunBeliBayar[noID][15] = Integer.toString(saldoAkhir);

                                System.out.println();
                                System.out.println("======================================================");
                                System.out.println("|                                " + getTanggal() + " " + getWaktu() + "|");
                                System.out.println("|                 Transaksi Berhasil                 |");
                                System.out.println("======================================================");
                                System.out.println("                     Kartu Kredit                    ");
                                System.out.println("                     Rp " + nominal);
                                System.out.println("======================================================");
                                System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                                System.out.println("======================================================");
                                System.out.println(" Nama Pelanggan\t\t= " + beli[0][2]);
                                System.out.println(" Nomor Pembayaran\t= " + beli[0][1]);
                                System.out.println(" Institusi\t\t= " + beli[0][3]);
                                System.out.println("======================================================");
                                System.out.println(" Saldo sebelumnya\t\t\t= " + totalSblm);
                                System.out.println(" Nominal tagihan\t\t\t= " + nominal);
                                System.out.println("======================================================");
                                System.out.println(" Saldo akhir\t\t\t\t= " + akunBeliBayar[noID][15]);
                                System.out.println("======================================================");
                                x = 10;
                                continue;
                            } else {
                                warningPwd();
                                x = 1;
                                continue;
                            }
                        }

                        if (pilih.equals("3")) {
                            beli = bpjs(beli);

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                    Pembayaran BPJS                   ");
                            System.out.println("======================================================");
                            System.out.print("Masukkan nomor pembayaran\t= ");
                            pilih = sc.next();
                            System.out.println("======================================================");

                            if (pilih.equals(beli[0][1])) {
                                x = 2;
                            } else {
                                warning();
                                x = 1;
                                continue;
                            }

                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("                    Pembayaran BPJS                   ");
                            System.out.println("======================================================");
                            System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                            System.out.println("======================================================");
                            System.out.println(" Nama Pemilik\t\t= " + beli[0][2]);
                            System.out.println(" Nomor Pembayaran\t= " + beli[0][1]);
                            System.out.println(" Keterangan\t\t= " + beli[0][3]);
                            System.out.println(" Nominal tagihan\t= " + beli[0][4]);
                            System.out.println("======================================================");

                            konfirmasi();
                            validasiYa();
                            System.out.print("Mohon masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {

                                nominal = Integer.parseInt(beli[0][4]);
                                if (nominal > filterTarik) {
                                    notifSaldo();
                                    x = 10;
                                    continue;
                                } else {
                                    x = 2;
                                }

                            }
                            if (pilih.equals("2")) {
                                x = 10;
                                continue;
                            }
                            System.out.println();
                            System.out.println("======================================================");
                            System.out.println("|               Masukkan password Anda               |");
                            System.out.println("======================================================");
                            System.out.print("Masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals(akunBeliBayar[noID][18])) {

                                saldoAkhir = Integer.parseInt(totalSblm) - nominal;
                                akunBeliBayar[noID][15] = Integer.toString(saldoAkhir);

                                System.out.println();
                                System.out.println("======================================================");
                                System.out.println("|                                " + getTanggal() + " " + getWaktu() + "|");
                                System.out.println("|                 Transaksi Berhasil                 |");
                                System.out.println("======================================================");
                                System.out.println("                    Pembayaran BPJS                   ");
                                System.out.println("                     Rp " + nominal);
                                System.out.println("======================================================");
                                System.out.println(" Sumber Dana\t\t= " + akunBeliBayar[noID][16] + " -Rekening Utama");
                                System.out.println("======================================================");
                                System.out.println(" Nama Pemilik\t\t= " + beli[0][2]);
                                System.out.println(" Nomor Pembayaran\t= " + beli[0][1]);
                                System.out.println(" Keterangan\t\t= " + beli[0][3]);
                                System.out.println("======================================================");
                                System.out.println(" Saldo sebelumnya\t\t\t= " + totalSblm);
                                System.out.println(" Nominal tagihan\t\t\t= " + nominal);
                                System.out.println("======================================================");
                                System.out.println(" Saldo akhir\t\t\t\t= " + akunBeliBayar[noID][15]);
                                System.out.println("======================================================");
                                x = 10;
                                continue;
                            } else {
                                warningPwd();
                                x = 1;
                                continue;
                            }

                        }
                        if (pilih.equals("4")){
                        x=2;
                        continue;
                        }
                        else {
                            warningPwd();
                            x = 1;

                        }
                    }

                    break;
                    
                case "3":
                    x=10;
                   
                break; 
                    
                default:
                    warning();
                    x = 1;

            }

        }

    }
    
    //Syntax yang mengatur sesi keamanan
    static void keamanan(String[][] dataKeamanan) {

        String pilih, pilih2;
        int x = 0;

        while (x <= 1) {
            System.out.println();
            tampilKeamanan();
            System.out.print("Masukkan jawaban Anda\t= ");
            pilih = sc.next();

            switch (pilih) {

                case "1":

                    System.out.println();
                    System.out.println("======================================================");
                    System.out.println("                       Keamanan                       ");
                    System.out.println("======================================================");
                    System.out.print("Masukkan password lama Anda\t= ");
                    pilih = sc.next();
                    System.out.println("======================================================");

                    if (pilih.equals(dataKeamanan[noID][18])) {
                        x = 2;
                    } else {
                        warningPwd();
                        x = 10;
                        continue;
                    }
                    System.out.println();
                    System.out.println("======================================================");
                    System.out.println("                       Keamanan                       ");
                    System.out.println("======================================================");
                    System.out.print("Masukkan password baru Anda\t= ");
                    pilih2 = sc.next();
                    System.out.print("Ketik ulang password baru Anda\t= ");
                    pilih = sc.next();
                    System.out.println("======================================================");

                    if (pilih.equals(pilih2)) {
                        dataKeamanan[noID][18] = pilih;
                        System.out.println();
                        System.out.println("\t===========================================");
                        System.out.println("\t|         Password berhasil diubah        |");
                        System.out.println("\t===========================================");
                        System.out.println();
                        System.out.println("\t\t=========================");
                        System.out.println("\t\t| Silahkan login dengan |");
                        System.out.println("\t\t|   password yang baru  |");
                        System.out.println("\t\t=========================");

                        validasiUbhPwd = 1;
                        x = 10;
                        continue;
                    } else {
                        warning();
                        x = 1;
                    }

                    break;
                    
                    case"2":
                        x=10;
                     break;   
                default:
                    warning();
                    x = 1;
            }
        }

    }

    public static void main(String[] args) {

        int x = 0;

        String pilih, buatAkun;

        String akun[][] = {};
        String akun1[][] = dataNasabah(akun);
        String transfer[][] = new String[100][5];

        while (x <= 8) {
            x = 0;
            
            //Menampilkan menu awal
            System.out.println();
            menuAwal();
            System.out.println();
            System.out.println("Apakah Anda sudah mempunyai akun M-Banking?");
            validasiSudah();
            System.out.print("Masukkan jawaban Anda\t= ");
            pilih = sc.next();

            switch (pilih) {
                
                //Jika sudah mempunyai akun M-Banking
                case "1":
                    System.out.println();
                    menuLogin();
                    fungsiLogin(akun1);

                    break;
                
                //Jika user belum mempunyai akun M-Banking
                case "2":

                    while (x == 0) {

                        System.out.println();
                        System.out.println("Apakah Anda ingin membuat Akun ?");
                        validasiYa();
                        System.out.print("Masukkan jawaban Anda\t= ");
                        buatAkun = sc.next();
                        
                        //Jika user akan membuat rekening dan akun M-Bankinig
                        if (buatAkun.equals("1")) {

                            System.out.println();
                            menuDaftar();
                            fungsiDaftar(akun1);
                            x = 1;
                            break;

                        }
                        
                        //Jika user ingin mencoba login kembali
                        if (buatAkun.equals("2")) {

                            System.out.println();
                            menuLogin();
                            fungsiLogin(akun1);
                            x = 1;
                            break;

                        } else {
                            x = 0;
                            warning();
                        }
                    }

                    break;

                default:
                    x = 0;
                    warning();
                    continue;

            }
            
            //Tampilan jika user berhasil login dan masuk ke menu
            while (x <= 7) {
                x = 0;
                System.out.println();
                System.out.println("======================================================");
                System.out.println("Hai, " + akun1[noID][0]);
                System.out.println("======================================================");
                System.out.println();

                tampilMenu();
                System.out.print("Masukkan jawaban Anda\t= ");
                pilih = sc.next();

                switch (pilih) {
                    
                    //Jika user memilih Info Rekening
                    case "1":

                        while (x <= 2) {
                            System.out.println();
                            tampilInfo(akun1);
                            kembaliMenu();
                            validasiYa();
                            System.out.print("Masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {
                                x = 3;
                                continue;

                            }
                            if (pilih.equals("2")) {
                                x = 2;
                            } else {
                                warning();
                            }
                        }
                        break;
                    
                    //Jika user memilih Setor dan Tarik Tunai                    
                    case "2":

                        while (x <= 3) {
                            System.out.println();
                            tampilMenuSetarik(akun1);
                            kembaliMenu();
                            validasiYa();
                            System.out.print("Masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {
                                x = 4;
                                continue;

                            }
                            if (pilih.equals("2")) {
                                x = 3;

                            } else {
                                warning();
                            }
                        }
                        break;
                    
                    //Jika user memilih Transfer                        
                    case "3":

                        while (x <= 4) {
                            System.out.println();
                            transfer(transfer, akun1);
                            kembaliMenu();
                            validasiYa();
                            System.out.print("Masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {
                                x = 5;
                                continue;

                            }
                            if (pilih.equals("2")) {
                                x = 4;

                            } else {
                                warning();
                            }

                        }
                        break;
                        
                    //Jika user memilih Pembelian dan Pembayaran                        
                    case "4":
                        while (x <= 5) {
                            System.out.println();
                            beliBayar(akun1);
                            kembaliMenu();
                            validasiYa();
                            System.out.print("Masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {
                                x = 6;
                                continue;

                            }
                            if (pilih.equals("2")) {
                                x = 5;

                            } else {
                                warning();
                            }

                        }
                        break;

                    //Jika user memilih Keamanan                        
                    case "5":

                        while (x <= 6) {
                            System.out.println();
                            keamanan(akun1);

                            if (validasiUbhPwd == 1) {
                                x = 8;
                                continue;
                            } else {
                                kembaliMenu();
                                validasiYa();
                                System.out.print("Masukkan jawaban Anda\t= ");
                                pilih = sc.next();

                                if (pilih.equals("1")) {
                                    x = 7;
                                    continue;

                                }
                                if (pilih.equals("2")) {
                                    x = 6;

                                } else {
                                    warning();
                                }
                            }

                        }

                        break;
                        
                    //Jika user memilih Keluar                        
                    case "6":
                        while (x <= 7) {
                            System.out.println();
                            System.out.println("\t  =================================");
                            System.out.println("\t  |    Apakah Anda ingin keluar?  |");
                            System.out.println("\t  =================================");
                            validasiYa();
                            System.out.print("Masukkan jawaban Anda\t= ");
                            pilih = sc.next();

                            if (pilih.equals("1")) {
                                x = 8;
                                System.out.println();
                                System.out.println("\t  =================================");
                                System.out.println("\t  |         Berhasil keluar       |");
                                System.out.println("\t  =================================");
                                continue;

                            }
                            if (pilih.equals("2")) {
                                x = 7;
                                break;
                            } else {
                                warning();
                            }

                        }

                        break;
                        
                    //Validasi jika user tidak memilih nomor sesuai menu                        
                    default:
                        x = 2;
                        warning();
                }
            }

        }

    }
}
