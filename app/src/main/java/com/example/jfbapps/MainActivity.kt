package com.example.jfbapps

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

//Nama        : Dini Yuliani ;
//NIM         : 10121905 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan S.Kom., M.Kom. ;
//Selesai     : 22 Agustus 2024. 22:00 ;

class MainActivity : AppCompatActivity() {

    private lateinit var jobListView: ListView
    private val jobs = arrayOf(
        "Project Manager",
        "System Analyst",
        "UI/UX Design",
        "Software Engineer",
        "Database Engineer",
        "Quality Assurance",
        "DevOps Engineer",
        "Network Engineer",
        "Cybersecurity Analyst",
        "Cloud Architect",
        "Full-Stack Developer",
        "Mobile App Developer",
        "AI/ML Engineer",
        "Data Analyst",
        "Data Scientist"


    )

    private val jobDetails = arrayOf(
        "Bandung, PT Alpha.\n\nSebagai seorang Project Manager, Anda akan bertanggung jawab untuk mengelola proyek pengembangan perangkat lunak dari awal hingga akhir. Tugas Anda mencakup penyusunan rencana proyek, koordinasi antar tim, serta memastikan bahwa semua tahapan proyek berjalan sesuai jadwal dan anggaran yang telah ditentukan. Anda juga akan memfasilitasi komunikasi antara pemangku kepentingan untuk memastikan keberhasilan proyek.",
        "Bandung, PT Beta.\n\nDalam peran sebagai System Analyst, Anda akan menganalisis kebutuhan sistem dari berbagai departemen perusahaan dan merancang solusi teknologi yang sesuai. Anda akan bekerja sama dengan tim pengembangan untuk memastikan bahwa solusi yang diimplementasikan mampu mendukung operasi bisnis secara efisien. Tugas Anda juga termasuk melakukan evaluasi terhadap sistem yang sudah ada dan merekomendasikan perbaikan.",
        "Bandung, PT Gamma.\n\nSebagai UI/UX Designer, Anda akan bertanggung jawab untuk merancang antarmuka pengguna yang menarik dan intuitif serta menciptakan pengalaman pengguna yang optimal. Anda akan bekerja sama dengan tim pengembangan untuk menerjemahkan kebutuhan bisnis dan pengguna menjadi desain yang fungsional dan estetik. Fokus Anda adalah memastikan bahwa produk yang dihasilkan mudah digunakan dan memberikan kepuasan kepada pengguna.",
        "Bandung, PT Delta.\n\nDalam peran sebagai Software Engineer, Anda akan mengembangkan aplikasi berbasis web dan mobile dengan fokus pada performa, keandalan, dan skalabilitas. Anda akan bekerja dalam tim pengembangan yang dinamis, menggunakan berbagai bahasa pemrograman dan teknologi terbaru untuk membangun solusi yang memenuhi kebutuhan bisnis. Tugas Anda juga mencakup pengujian dan pemeliharaan perangkat lunak yang dikembangkan.",
        "Bandung, PT Epsilon.\n\nSebagai Database Engineer, Anda akan bertanggung jawab untuk mengelola dan mengoptimalkan basis data perusahaan. Anda akan memastikan bahwa data yang tersimpan terorganisir dengan baik, aman, dan mudah diakses oleh pengguna yang berwenang. Anda juga akan melakukan pemeliharaan rutin, pembaruan, dan backup data untuk memastikan kelancaran operasi perusahaan.",
        "Bandung, PT Zeta.\n\nDalam peran sebagai Quality Assurance, Anda akan mengembangkan dan menjalankan pengujian untuk memastikan perangkat lunak bebas dari bug dan memenuhi standar kualitas yang tinggi. Anda akan bekerja sama dengan tim pengembangan untuk mengidentifikasi dan memperbaiki masalah yang muncul selama proses pengembangan. Tugas Anda adalah memastikan bahwa produk yang dirilis ke pasar adalah produk yang andal dan berkualitas tinggi.",
        "Bandung, PT Eta.\n\nSebagai DevOps Engineer, Anda akan mengotomatiskan alur kerja pengembangan dan penerapan (CI/CD) serta mengelola infrastruktur cloud perusahaan. Anda akan bekerja untuk memastikan bahwa aplikasi yang dikembangkan dapat diskalakan dan berjalan dengan efisien di lingkungan cloud. Selain itu, Anda juga akan bertanggung jawab untuk memantau kinerja sistem dan mengatasi masalah teknis yang muncul.",
        "Bandung, PT Theta.\n\nDalam peran sebagai Network Engineer, Anda akan mengelola dan memelihara jaringan komputer perusahaan. Anda akan memastikan bahwa jaringan yang digunakan aman, andal, dan memiliki kinerja yang optimal. Tugas Anda juga termasuk instalasi perangkat keras jaringan, konfigurasi perangkat lunak, dan pemantauan jaringan untuk mencegah serta menyelesaikan masalah konektivitas.",
        "Bandung, PT Iota.\n\nSebagai Cybersecurity Analyst, Anda akan menganalisis ancaman siber yang mungkin menyerang sistem perusahaan dan mengimplementasikan langkah-langkah keamanan untuk melindungi data serta infrastruktur TI. Anda akan memantau aktivitas jaringan untuk mendeteksi aktivitas mencurigakan dan bekerja sama dengan tim TI lainnya untuk menanggulangi potensi serangan. Fokus utama Anda adalah menjaga integritas dan kerahasiaan informasi perusahaan.",
        "Bandung, PT Kappa.\n\nDalam peran sebagai Cloud Architect, Anda akan merancang arsitektur cloud yang aman dan efisien untuk mendukung operasi perusahaan di lingkungan cloud. Anda akan bekerja untuk memastikan bahwa solusi cloud yang dipilih dapat memenuhi kebutuhan bisnis, termasuk skalabilitas, keamanan, dan efisiensi biaya. Selain itu, Anda juga akan memantau kinerja dan mengelola sumber daya cloud untuk memastikan kelancaran operasional.",
        "Bandung, PT Lambda.\n\nSebagai Full-Stack Developer, Anda akan bertanggung jawab untuk mengembangkan aplikasi dari sisi frontend hingga backend. Anda akan bekerja dengan berbagai teknologi dan bahasa pemrograman untuk memastikan aplikasi yang dihasilkan berfungsi dengan baik di semua lapisan. Tugas Anda juga mencakup integrasi API, pengelolaan basis data, serta optimasi kinerja aplikasi agar tetap responsif dan mudah digunakan.",
        "Bandung, PT Mu.\n\nDalam peran sebagai Mobile App Developer, Anda akan membangun dan memelihara aplikasi mobile untuk platform Android dan iOS. Anda akan menggunakan bahasa pemrograman seperti Kotlin atau Swift untuk mengembangkan aplikasi yang kompatibel dengan berbagai perangkat. Tugas Anda juga termasuk pengujian aplikasi untuk memastikan bahwa aplikasi berjalan dengan lancar dan memenuhi kebutuhan pengguna.",
        "Bandung, PT Nu.\n\nSebagai AI/ML Engineer, Anda akan mengembangkan model pembelajaran mesin dan algoritma kecerdasan buatan untuk menganalisis data dan mengotomatiskan proses bisnis. Anda akan bekerja dengan data dalam jumlah besar untuk melatih model AI yang dapat membuat prediksi akurat atau melakukan tugas tertentu. Fokus utama Anda adalah menciptakan solusi AI yang efektif dan dapat diterapkan di berbagai skenario bisnis.",
        "Bandung, PT Xi.\n\nDalam peran sebagai Data Analyst, Anda akan mengumpulkan, menganalisis, dan menginterpretasikan data untuk memberikan wawasan yang dapat mendukung pengambilan keputusan bisnis. Anda akan bekerja dengan tim manajemen untuk memahami kebutuhan bisnis dan menyajikan data dalam bentuk laporan atau visualisasi yang mudah dipahami. Tugas Anda adalah memastikan bahwa keputusan yang diambil berdasarkan data yang akurat dan relevan.",
        "Bandung, PT Omicron.\n\nSebagai Data Scientist, Anda akan bekerja dengan data besar untuk mengidentifikasi tren dan pola yang dapat memberikan keuntungan kompetitif bagi perusahaan. Anda akan mengembangkan model prediksi dan melakukan analisis mendalam untuk memberikan rekomendasi yang mendukung strategi bisnis. Selain itu, Anda juga akan bekerja dengan tim lain untuk mengintegrasikan temuan Anda ke dalam proses operasional perusahaan."
    )

    private val jobLocations = arrayOf(
        "Jalan Ir. H. Juanda No. 50, Bandung, Jawa Barat",
        "Jalan Asia Afrika No. 112, Bandung, Jawa Barat",
        "Jalan Braga No. 23, Bandung, Jawa Barat",
        "Jalan Setiabudi No. 192, Bandung, Jawa Barat",
        "Jalan Riau (RE Martadinata) No. 45, Bandung, Jawa Barat",
        "Jalan Cihampelas No. 101, Bandung, Jawa Barat",
        "Jalan Dipatiukur No. 20, Bandung, Jawa Barat",
        "Jalan Surapati No. 88, Bandung, Jawa Barat",
        "Jalan Sukajadi No. 131, Bandung, Jawa Barat",
        "Jalan Pasteur No. 68, Bandung, Jawa Barat",
        "Jalan Merdeka No. 18, Bandung, Jawa Barat",
        "Jalan Tamansari No. 29, Bandung, Jawa Barat",
        "Jalan Wastukencana No. 15, Bandung, Jawa Barat",
        "Jalan Kebon Jati No. 7, Bandung, Jawa Barat",
        "Jalan Pahlawan No. 25, Bandung, Jawa Barat"
    )

    private val jobInformation = arrayOf(
        "Perusahaan: PT Alpha\n\nTelepon: +62 812-3456-7890\n\nEmail: contact@ptalpha.com",
        "Perusahaan: PT Beta\n\nTelepon: +62 812-2345-6789\n\nEmail: hr@ptbeta.com",
        "Perusahaan: PT Gamma\n\nTelepon: +62 812-3456-1234\n\nEmail: jobs@ptgamma.com",
        "Perusahaan: PT Delta\n\nTelepon: +62 812-5678-9012\n\nEmail: info@ptdelta.com",
        "Perusahaan: PT Epsilon\n\nTelepon: +62 812-6789-0123\n\nEmail: support@ptepsilon.com",
        "Perusahaan: PT Epsilon\n\nTelepon: +62 812-6789-0123\n\nEmail: support@ptepsilon.com",
        "Perusahaan: PT Eta\n\nTelepon: +62 812-8901-2345\n\nEmail: devops@pteta.com",
        "Perusahaan: PT Theta\n\nTelepon: +62 812-9012-3456\n\nEmail: network@pttheta.com",
        "Perusahaan: PT Iota\n\nTelepon: +62 812-0123-4567\n\nEmail: security@ptiota.com",
        "Perusahaan: PT Kappa\n\nTelepon: +62 812-1234-5678\n\nEmail: cloud@ptkappa.com",
        "Perusahaan: PT Lambda\n\nTelepon: +62 812-2345-6789\n\nEmail: fullstack@ptlambda.com",
        "Perusahaan: PT Mu\n\nTelepon: +62 812-3456-7890\n\nEmail: mobile@ptmu.com",
        "Perusahaan: PT Nu\n\nTelepon: +62 812-4567-8901\n\nEmail: ai@ptnu.com",
        "Perusahaan: PT Xi\n\nTelepon: +62 812-5678-9012\n\nEmail: data@ptxi.com",
        "Perusahaan: PT Omicron\n\nTelepon: +62 812-6789-0123\n\nEmail: scientist@ptomicron.com"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jobListView = findViewById(R.id.jobListView)

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, jobs)
        jobListView.adapter = adapter

        jobListView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, JobDetailActivity::class.java).apply {
                putExtra("jobTitle", jobs[position])
                putExtra("jobDetails", jobDetails[position])
                putExtra("jobLocation", jobLocations[position])
                putExtra("jobInformation", jobInformation[position])
            }
            startActivity(intent)
        }
    }
}
