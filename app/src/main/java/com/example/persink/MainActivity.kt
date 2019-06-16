package com.example.persink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Button;
import android.widget.TextView






class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Finds you button from the xml layout file
        val createNotificationButton = findViewById<Button>(R.id.bigButton)
        val createNotification20Button = findViewById<Button>(R.id.button20)
        val createNotification10Button = findViewById<Button>(R.id.button10)
        val createSTNKButton = findViewById<Button>(R.id.buttonSTNK)
        val createSIMButton = findViewById<Button>(R.id.buttonSIM)

        // Waits for you to click the button
        createNotificationButton.setOnClickListener {
            // Starts the function below
            addNotification()
        }

        createNotification20Button.setOnClickListener {
            // Starts the function below
            addNotificationTimed("20")
        }

        createNotification10Button.setOnClickListener {
            // Starts the function below
            addNotificationTimed("10")
        }
        createSTNKButton.setOnClickListener {
            // Starts the function below
            buttonClickSTNK()
        }

        createSIMButton.setOnClickListener {
            // Starts the function below
            buttonClickSIM()
        }
    }

    // Creates and displays a notification
    private fun addNotification() {
        // Builds your notification
        val builder = NotificationCompat.Builder(this)
            .setSmallIcon(R.mipmap.ic_launcher_round)
            .setContentTitle("STNK / SIM akan habis 30 hari lagi")
            .setContentText("STNK / SIMK anda akan berakhir 30 hari lagi")

        // Creates the intent needed to show the notification
        val notificationIntent = Intent(this, MainActivity::class.java)
        val contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT)
        builder.setContentIntent(contentIntent)

        // Add as notification
        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(0, builder.build())
    }

    // Creates and displays a notification
    private fun addNotificationTimed(m: String) {
        // Builds your notification
        val builder = NotificationCompat.Builder(this)
            .setSmallIcon(R.mipmap.ic_launcher_round)
            .setContentTitle("STNK / SIM akan habis $m hari lagi")
            .setContentText("STNK / SIM anda akan berakhir  $m  hari lagi")

        // Creates the intent needed to show the notification
        val notificationIntent = Intent(this, MainActivity::class.java)
        val contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT)
        builder.setContentIntent(contentIntent)

        // Add as notification
        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(0, builder.build())
    }

    private fun buttonClickSIM() {
        val tv = findViewById(R.id.textView) as TextView
        tv.text = "Perpanjangan SIM\n" +
                "Dokumen yang harus disiapkan adalah :\n" +
                "1. Membawa KTP Asli\n" +
                "2. Membawa SIM Asli yang masih aktif / berlaku\n" +
                "3. Membawa Surat Keterangan Kesehatan dari Kedokteran atau KIR Dokter\n" +
                "4. Fotocopy KTP, 2 lembar cukup namun lebih untuk berjaga-jaga\n" +
                "\n" +
                "Prosedur perpanjangan SIM :\n" +
                "Persyaratan administrasi pengajuan perpanjangan SIM meliputi :\n" +
                "1. Mengisi formulir pengajuan perpanjangan SIM\n" +
                "2. Kartu Tanda Penduduk asli setempat yang masih berlaku bagi Warga Negara Indonesia atau dokumen keimigrasian bagi Warga Negara Asing\n" +
                "3. SIM lama\n" +
                "4. Surat keterangan lulus uji keterampilan Simulator\n" +
                "5. Surat keterangan kesehatan mata\n" +
                "\n" +
                "Perpanjangan SIM dilakukan sebelum masa berlakunya berakhir.\n" +
                "Perpanjangan yang dilakukan setelah lewat waktu, sebagimana dimaksud harus diajukan SIM baru.\n" +
                "Perpanjangan SIM dapat dilaksanakan di Satpas atau tempat pelayanan SIM lain di seluruh Indonesia.\n" +
                "\n" +
                "Pengajuan perpanjangan SIM beserta dokumen persyaratan diajukan ke :\n" +
                "1. Petugas kelompok kerja identifikasi dan verifikasi bagi perpanjangan SIM yang dilakukan di Satpas\n" +
                "2. Petugas pada tempat pelayanan SIM lain\n" +
                "\n" +
                "Biaya untuk perpanjangan SIM :\n" +
                "1. Biaya perpanjangan untuk SIM A adalah sebesar Rp 80.000\n" +
                "2. Biaya perpanjangan untuk SIM Internasional adalah sebesar Rp 225.000\n" +
                "3. Biaya perpanjangan untuk SIM B1 adalah sebesar Rp 80.000\n" +
                "4. Biaya perpanjangan untuk SIM B2 adalah sebesar Rp 80.000\n" +
                "5. Biaya perpanjangan untuk SIM D adalah sebesar Rp 30.000\n" +
                "6. Biaya perpanjangan untuk SIM D1 adalah sebesar Rp 30.000\n" +
                "7. Biaya perpanjangan untuk SIM C adalah sebesar Rp 75.000\n" +
                "8. Biaya perpanjangan untuk SIM C1 adalah sebesar Rp 75.000\n" +
                "9. Biaya perpanjangan untuk SIM C2 adalah sebesar Rp 75.000"
    }

    private fun buttonClickSTNK() {
        val tv = findViewById(R.id.textView) as TextView
        tv.text = "Perpanjangan STNK\n" +
                "Dokumen yang harus disiapkan adalah :\n" +
                "1. STNK asli dan fotokopinya 1 lembar.\n" +
                "2. KTP asli sesuai STNK dan fotokopi KTP sebanyak 1 lembar.\n" +
                "3. BPKB asli dan fotokopinya 1 lembar.\n" +
                "4. Motor yang ingin dibayar pajaknya.\n" +
                "\n" +
                "Prosedur perpanjangan STNK:\n" +
                "1. Mengisi formulir permohonan untuk perpanjagan STNK di loket pendaftaraan dan isi sesuai data yang ada di STNK dan BPKB\n" +
                "2. Menyerahkan dokumen permohonan perpanjang STNK ke loket Penyerahan berkas, tunggu hingga dipanggil oleh petugas\n" +
                "3. Anda akan menerima Slip pembayaran pajak, dan lihat berapa jumlah pajak yang harus dibayar\n" +
                "4. Menuju kearah kasirlah dan lakukan pembayaran pajak STNK tersebut dan mendapatkan bukti pelunasanya\n" +
                "5. Kemudian tunggu kembali di ruang tunggu, sampai nama Anda dipanggil khusus untuk perpanjang STNK 1 tahun, untuk yang 5 tahun, lanjutkan dengan membawa bukti pelunasan pajak ke loket TNKB untuk mendapatkan plat nomor baru\n" +
                "\n" +
                "Rincian biaya perpanjangan STNK untuk kendaraan roda dua :\n" +
                "1. Untuk biaya Adminitrasi pembuatan baru juga perpanjang baru sebesar Rp 100.000\n" +
                "2. Biaya Penerbitan TNKB (Tanda Nomor Kendaraan) atau Plat Nomor sebesar Rp 60.000\n" +
                "3. Biaya Penerbitan BPKB sebesar Rp 225.000\n" +
                "4. Dan biaya penerbitan Surat Mutasi kendaran bermotor ke luar daerah sebesar Rp 150.000\n" +
                "\n" +
                "Rincian biaya perpanjang STNK untuk kendaraan roda empat :\n" +
                "1. Biaya Andmin STNK untuk pembuatan baru dan perpanjang STNK sebesar Rp 200.000\n" +
                "2. Biaya Penerbitan TNKB atau Plat Nomor kendaraan sebesar Rp 100.000\n" +
                "3. Biaya Penerbitan BPKB sebesar Rp 375.000\n" +
                "4. Biaya penerbitan surat mutasi ke luar daerah Rp 250.000"
    }
}
