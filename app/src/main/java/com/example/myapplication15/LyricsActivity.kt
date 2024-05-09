package com.example.myapplication15


import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class LyricsActivity : AppCompatActivity() {

    private val lyrics = mapOf(
        "1. Hormat Bagi Bapa Serta Anak dan Rohul’Kudus" to "\n" + "\n" +
                "1 = D \n" +"\n" +
                "1. Hormat bagi Bapa serta Anak dan Rohu'lkudus, seperti pada permulaan, s'karang ini dan selama-lamanya. Amin.\n",
        "2. Ya Tuhan, Kami Puji Nama-Mu Besar" to "\n" +
                "1 = G \n" + "\n" +
                "1. Ya Tuhan, kami puji nama-Mu besar.\n" +
                "Ya Bapa, makhluk-Mu menyanyi bergemar.\n" +
                "Hai, langit, bumi, laut bersoraklah semua.\n" +
                "Malaikat turutlah memuji Allah Hua.\n" +
                "Kemuliaan-Nya tetap senantiasa.\n" +
                "Kudus, kudus, kuduslah Tuhan Mahakuasa.\n" +
                "\n" +
                "2. Rasul-Mu di tempat kemuliaan-Mu,\n" +
                "nabi dan syahid-Mu memuji Engkau, Hu.\n" +
                "Jemaat yang t'lah menang, jemaat diperjuangan\n" +
                "mengaku nama-Mu, sehati, berulangan.\n" +
                "Terpuji rahmat-Mu, di bawah dan di atas.\n" +
                "Ya Bapa yang kekal, kasih-Mu tak terbatas.\n" +
                "\n" +
                "3. Ya Kristus yang di tangan kanan Bapa-Mu,\n" +
                "sehingga nanti sangkakala menderu\n" +
                "memanggil kami pun menghadap arasy Tuhan,\n" +
                "b'ri kami oleh-Mu benar di penghukuman;\n" +
                "segala dosa kami Engkau tanggung juga,\n" +
                "oleh-Mu kami lihat Bapa yang di sorga.\n" +
                "\n" +
                "4. Rohu'lkudus, berilah hati beriman,\n" +
                "persekutuan-Mu dengan kesucian,\n" +
                "supaya kami janganlah percaya diri\n" +
                "dan janganlah sesat ke kanan dan ke kiri.\n" +
                "Ya Bapa, Anak, Roh, b'ri kami mengalami\n" +
                "serta-Mu nanti kepenuhan harap kami.\n",
        "3. Hormat Bagi Allah Bapa, Hormat Bagi Anak-Nya" to "1. Hormat bagi Allah Bapa,\n" +
                "hormat bagi Anak-Nya,\n" +
                "hormat bagi Roh Penghibur,\n" +
                "ketiganya Yang Esa.\n" +
                "Haleluya, haleluya,\n" +
                "ketiganya yang Esa.\n" +
                "\n" +
                "2. Hormat bagi Raja sorga,\n" +
                "Tuhan kaum manusia.\n" +
                "Hormat bagi Raja G'reja\n" +
                "di seluruh dunia.\n" +
                "Haleluya, haleluya,\n" +
                "di seluruh dunia.\n" +
                "\n" +
                "3. Haleluya, persembahan\n" +
                "bala kerajaan-Mu\n" +
                "diletakkan siang-malam\n" +
                "di hadapan takhta-Mu.\n" +
                "Haleluya, haleluya.\n" +
                "di hadapan takhta-Mu.\n",
        "4. Kudus, Kudus, Kuduslah, Tuhan Mahakuasa" to "1. Kudus, kudus, kuduslah, Tuhan Mahakuasa,\n" +
                "kami dini hari menyanyi pujian.\n" +
                "Kudus, kudus, kuduslah, Pemerintah masa,\n" +
                "Allah dan Raja kaum sekalian.\n" +
                "\n" +
                "2. Kudus, kudus, kuduslah, arasy-Mu di sorga,\n" +
                "hamba-Mu yang suci menghadap bertelut.\n" +
                "Sekalian malaikat menudungkan muka,\n" +
                "seisi sorga menyembah sujud.\n" +
                "\n" +
                "3. Kudus, kudus, kuduslah, tidak kelihatan\n" +
                "bagi mata dunia yang najis cemar.\n" +
                "Sempurnalah terang-Mu, Allah kekuatan,\n" +
                "sama sempurna kasih-Mu besar.\n" +
                "\n" +
                "4. Kudus, kudus, kuduslah, Tuhan Mahakuasa,\n" +
                "Bapa, Anak, Roh, yang mulia-Nya baka.\n" +
                "Kudus, kudus, kuduslah, ribuan bahasa\n" +
                "memuji Tuhan, Allah yang Esa.\n",
        "5. Hai Makhluk Allah-hu Besar" to "\n" +
                "1. Hai makhluk Allah Hu Besar,\n" +
                "bernyanyilah dan bergemar,\n" +
                "haleluya, haleluya!\n" +
                "Nyanyian baru angkatlah,\n" +
                "pujaan dari dunia,\n" +
                "puji Allah sedekala,\n" +
                "haleluya, haleluya, haleluya!\n" +
                "\n" +
                "2. Hai surya terang benderang,\n" +
                "yang mas cahayamu cerlang,\n" +
                "haleluya, haleluya.\n" +
                "dan bulan yang mencurahkan\n" +
                "t'rang perak berpenghiburan,\n" +
                "puji Allah sedekala,\n" +
                "haleluya, haleluya, haleluya!\n" +
                "\n" +
                "3. Hai angin yang serbu serang,\n" +
                "dan hujan seraman bendang,\n" +
                "haleluya, haleluya,\n" +
                "kau dinihari yang teduh,\n" +
                "petang yang ungu tejamu,\n" +
                "puji Allah sedekala,\n" +
                "haleluya, haleluya, haleluya!\n" +
                "\n" +
                "4. hai sungai hablur yang jernih\n" +
                "dan tanah yang b'ri rezeki,\n" +
                "haleluya, haleluya,\n" +
                "samud'ra, pulau dan selat\n" +
                "dan hutan-rimba yang lebat,\n" +
                "puji Allah sedekala,\n" +
                "haleluya, haleluya, haleluya!\n" +
                "\n" +
                "5. Segala hewan yang terbang,\n" +
                "berjalan kaki dan ber'nang,\n" +
                "haleluya, haleluya,\n" +
                "kembang dan buah-buah pun\n" +
                "di taman-taman dan kebun,\n" +
                "puji Allah sedekala,\n" +
                "haleluya, haleluya, haleluya!\n" +
                "\n" +
                "6. Manusia, hai turutlah\n" +
                "memuji pengasihan-Nya\n" +
                "haleluya, haleluya,\n" +
                "segala kaum di dunia\n" +
                "sebagai anak-anak-Nya\n" +
                "puji Allah sedekala,\n" +
                "haleluya, haleluya, haleluya!\n" +
                "\n" +
                "7. Hai mahluk-Nya sekalian\n" +
                "berhimpun dan bernyanyian,\n" +
                "haleluya, haleluya,\n" +
                "dan puji Allah yang kudus\n" +
                "sekarang dan selalu t'rus,\n" +
                "puji Allah sedekala,\n" +
                "haleluya, haleluya, haleluya!\n",

        "6. Dengarlah, Allahmu Esa" to """
                |
                |1=A 4/2
                |
                |1. Dengarlah, Allahmu Esa, tiadalah tara-Nya
        |Kukuduslah ekadaan-Nya; muliakanlah nama-Nya
        |Tak tampak Ia bagimu; hendaklah hatimu teguh
        |percaya dan menurut.
        |
        |2. Siapa dengan firma-Nya yang sungguh berkuasa,
        |memanggil isi dunia dan menentukan masa?
        |Yaitu Allahmu benar yang tanda hikmat-Nya besar
        |di sorga dan di bumi.
        |
        |3. Pengasihan siapakah yang memeliharakan
        |segala makhluk yang diberi-Nya makan?
        |Yaitu sayang Bapamu, pendengar doa dan keluh
        |seluruh muka bumi.
        |
        |4. Kendati tinggi takhta-Nya dilihat Tuhan jua
        |kelakuan manusia di jalannya semua.
        |Di dalam g'lap perbuata, di dalam hati pikiran,
        |tiada tersembunyi.""".trimMargin(),

            "7. Nyanyianku Memuji Allah Jua" to """1. Nyanyianku memuji Allah jua.
        |Mulialah mujizat-Nya semua
        |dan kerajaan-Nya teguh.
        |
        |2. Kutahulah dekatlah Tuhan Allah
        |dan sabda-Nya kudengar sedekala.
        |'Ku disertai rahmat-Nya
        |
        |3. Dibaca-Nya di hatiku pikiran,
        |segala doaku dan kerinduan,
        |dan susahku ditilik-Nya.
        |
        |4. Nyanyianku memuji kasih Bapa,
        |sejak kulihat dan kutahu
        |betapa besarnya sayang Tuhanku.
        |
        |5. Tak adalah yang memang aku punya,
        |semua kepunyaanku di dunia
        |anug'rah karya tangan-Nya.
        |
        |6. Ya Tuhanku, nyanyianku kiranya
        |di hati dan di bibir selamanya
        |penuh pujian bagi-Mu.""".trimMargin(),

            "8. Haleluya, Hai Pujilah" to """1. Haleluya, hai pujilah
        |muliakan Bapa dan sembah
        |khalik semesta alam.
        |Hendaklah kemurahan-Nya
        |yang menyenggara dunia
        |dipuji siang malam.
        |
        |2. Haleluya, hai nyanyilah
        |pujian bagi Anak-Nya,
        |yang turun dari sorga.
        |Yang mengorbankan nyawa-Nya
        |'kan menebus manusia,
        |tetap dipuji juga.
        |
        |3. Haleluya, b'ri pujian
        |kepada Roh kesungguhan,
        |Penghibur yang setia.
        |Pemb'ri kehidupan baka
        |dengan persekutuan-Nya,
        |jemaat memuji Dia.
        |
        |4. Ya Allah, Tuhan yang esa,
        |sujudlah kami menyembah
        |kemuliaan Tuhan.
        |Hendaklah dunia berseru:
        |"Kuduslah keadaan-Mu,
        |kuduslah tiga kian.""".trimMargin(),

            "9. Hai Kaum Tuhan Hu, Allahmu Benar" to """1. Hai kaum Tuhan Hu, Allahmu benar
        |b'ri nyanyian mu berbunyi besar.
        |Yang mahamulia dan Sumber hayat,
        |muliakanlah Dia, segala tempat!
        |
        |2. Yang rumah-Nya t'rang yang Mahakudus,
        |b'ri Anak-Nya yang hendak menebus
        |manusia yang hina di dunia cemar.
        |Hai, puji kasih-Nya yang heran benar.
        |
        |3. Ya Allah Esa, Penabur berkat,
        |terima sembah segala jemaat.
        |Kuasa dan hikmat, syukur bagi-Mu,
        |ya pokok selamat, kekal dan teguh.""".trimMargin(),

            "10. Pujilah Tuhanmu, Raja yang mahamulia" to """1. Pujilah Tuhanmu, Raja yang Mahamulia
        |Langit dan bumi hendak mempertinggikan Dia
        |Dan jiwaku, tambahlah nyanyian mu!
        |Allahmu baik dan setia.
        |
        |2. Pujilah Tuhan yang t'lah memenuhi angkasa
        |dengan segala mujizat dan tanda kuasa
        |Hikmat besar, firman adil dan benar
        |yang memerintahkan masa.
        |
        |3. Pujilah Tuhanmu yang sebelum engkau minta
        |t'lah mengetahui susah dan duka dan cinta.
        |Harap tetap; siang dan malam gelap
        |Bapamu yang memerintah.
        |
        |4. Pujilah Tuhan, pemimpin bintangan dan awan.
        |Tidak pernah niat kasih-Nya dapat dilawan.
        |Yang menyerah 'pada perlongan-Nya
        |sungguh tak usah merawan.
        |
        |5. Amin, ya amin, sekali 'kan nyata benarnya
        |nama-Nya Bapa, mahkota segala gelar-Nya.
        |Kau bertekun, engkau didukung-Nya pun
        |sampai ke tempat gemar-Nya.""".trimMargin(),

        "10. Pujilah Tuhanmu, Raja yang mahamulia" to """1. Pujilah Tuhanmu, Raja yang Mahamulia
        |Langit dan bumi hendak mempertinggikan Dia
        |Dan jiwaku, tambahlah nyanyian mu!
        |Allahmu baik dan setia.
        |
        |2. Pujilah Tuhan yang t'lah memenuhi angkasa
        |dengan segala mujizat dan tanda kuasa
        |Hikmat besar, firman adil dan benar
        |yang memerintahkan masa.
        |
        |3. Pujilah Tuhanmu yang sebelum engkau minta
        |t'lah mengetahui susah dan duka dan cinta.
        |Harap tetap; siang dan malam gelap
        |Bapamu yang memerintah.
        |
        |4. Pujilah Tuhan, pemimpin bintangan dan awan.
        |Tidak pernah niat kasih-Nya dapat dilawan.
        |Yang menyerah 'pada perlongan-Nya
        |sungguh tak usah merawan.
        |
        |5. Amin, ya amin, sekali 'kan nyata benarnya
        |nama-Nya Bapa, mahkota segala gelar-Nya.
        |Kau bertekun, engkau didukung-Nya pun
        |sampai ke tempat gemar-Nya.""".trimMargin(),

        "11. Kami Puji Engkau, Hu" to """
        xz1=G 3/4

        1. Kami puji Engkau, Hu, Tuhan
        yang empunya kuasa
        Dibesarkan nama-Mu Oleh
        sekalian bah'sa
        Barang dunia fana.
        Pengasihan-Mu baka.

        2. Suci keadaan-Mu,
        Mahamurah, mahakaya.
        Orang-Mu yang berseru
        Kaulepaskan dari bahaya.
        Langit, bumi, milik-Mu,
        menghormati kuasa-Mu.

        3. Bapa kami, janganlah
        anak-anak-Mu binasa.
        Pimpin dan sayangilah
        kami pun senantiasa.
        Sambut kami akhirnya
        di tempat terang baka.
    """.trimIndent(),
        "12. B'ri Hormatmu dan Pujian" to """
            
        1=G 4/2

        1. B'ri hormatmu dan pujian
        kepada Tuhan saja.
        Yang akan kita berkenan,
        menjauhkan bahaya,
        menyatakan anugerah
        dan memberikan damai-Nya.
        Perjuangan berhenti.

        2. Ya Bapa kami, Tuhan Hu,
        tahlis syukur dan hormat.
        Selalu naik kepada-Mu,
        Yang murah dan berhikmat.
        Yang alas arasy-Mu teguh,
        dan yang kekal perintah-Mu,
        Yang mengerjakan s'lamat.

        3. Ya Tuhan Yesus, penebus,
        'Kau Anak Tunggal Allah.
        Mukhalis, Engkau yang kudus
        menyambut yang bersalah.
        'Kau, Anak Domba yang menang,
        sertai kami dalam p'rang,
        sayangi kami, Tuhan.

        4. Rohu'l kudus, kuasa-Mu
        menjadi pertolongan,
        ketika iblis menyerbu
        tak ada lain sokongan.
        Teguhkan hati yang lemah
        di tengah susah dunia,
        Pemimpin yang setia.
    """.trimIndent(),

        "13. Haleluya, Hormat dan Pujian" to """
            
        1=G 2/2

        1. Haleluya, hormat dan pujian,
        nyanyian syukur sembah,
        harus naik kepada-Mu, ya Tuhan,
        kar'na rahmat-Mu baka.
        Bapa tunjuk kasih selamanya,
        Anak b'ri anugerah kiranya
        dalam persekutuan
        Roh Kudus Kesungguhan.
    """.trimIndent(),
        "14. Kesukaan yang Ceria Hanya Ada Pada-Mu" to """
            
        1=G 4/4

        1. Kesukaan yang ceria hanya ada pada-Mu,
        Khalik alam yang setia, pohon suka yang teguh.
        T'rang-Mu menembuskan hati, mengenyahkan awan g'lap.
        Yang mencari mendapati dalam Dikau t'rang tetap.

        2. Cakrawala membunyikan hormat-madah-Mu, ya Hu.
        Bintang intan sekalian membesarkan Nama-Mu.
        Unggasmu bersukaria dengan bunga di lembah,
        laut dan sungai turut dia, ramai-ramai soraknya.

        3. T'rang dan warna beribuan mengilaukan indah-Mu,
        yang menghibur sekalian, yang kuatir mengeluh.
        Atas sayap kesukaan kami pun Kaunaikkanlah
        jauh di atas kedukaan ke terang-Mu yang cerah.

        4. Buka hati, buka mata bagi kesukaanMu,
        agar tangan, agar kata memuliakan Dikau, Hu.
        B'rilah hidup kami jadi sungguh t'rang, benar, Kudus,
        Bapa kami yang abadi, oleh Yesus Penebus.
    """.trimIndent(),
        "15. Hormat dan Puji Kepada Tuhan" to """
            
        1=A 3/4

        1. Hormat dan puji kepada Tuhan, yang kemurahan-Nya besar.
        Yang disertai-Nya di jalan, dapat pertolongan benar.
        Hamba-Nya yang disuruh-Nya dib'ri-Nya
        Roh dan hikmat-Nya. Haleluya, haleluya!

        2. Barangsiapa dipanggil Tuhan ke dalam pekerjaan-Nya.
        Akan melihat tanda heran yang sudah diadakan-Nya.
        Dan meskit jalan turun naik, mengaku: Jalan Tuhan baik.
        Haleluya, haleluya!
    """.trimIndent(),
        "16. Sekarang B'ri Syukur, Besarkan Nama Tuhan" to """
            
        1=F 4/4

        1. Sekarang b'ri syukur, besarkan nama Tuhan.
        Pemimpin hidupmu yang mendengar seruan.
        Yang oleh Anak-Nya memb'ri anugerah
        dan tak terbilang pun mujizat berkat-Nya.

        2. Sempurna kaya-Nya, oleh-Nya diberkati
        semua anak-Nya, dengan sejaht'ra hati.
        Roh Tuhan memberi kekuatan dan t'rang.
        Di atas bah'ya maut, kuasa-Nya menang.

        3. Muliakan Allahmu, hai makhluk sekalian.
        Kepada arasy-Nya bumbungkanlah pujian.
        ya Bapa, Anak, Roh, ketiga yang Esa,
        Engkaulah yang besar selama-lamanya.
    """.trimIndent(),
        "17. Ya Bapa Kami Mahabaik" to """
            
        1=Bes

        1. Ya Bapa kami Mahabaik, ke sorga doa kami naik:
        Kiranya dalam dunia nama-Mu dikuduskanlah,
        malaikat menyembah sujud, segala bangsa bertelut.

        2. Datangkanlah kerajaan yang sudah Kausediakan.
        B'ri kehendak-Mu jadilah: di sorga dan di dunia,
        Sehingga bumi pun penuh sejaht'ra kebenaran-Mu.

        3. Hari ini juga apalah, b'ri makanan secukupnya.
        Kiranya angkatlah beban, kuatir dan ketakutan.
        B'ri kami tunjuk kasih-Mu kepada lain yang mengeluh.

        4. Ampunkanlah kesalahan, seperti kami ampunkan.
        Segala salah seteru; kiranya b'ri tolongan-Mu.
        Kuasa jahat basmilah dan jauhkanlah godaannya.

        5. Engkaulah yang mempunyai Kerajaan yang berseri.
        kuasa-Mu kekal teguh, baka kemuliaan-Mu.
        Engkau yang patut disembah, tetap selama-lamanya.
    """.trimIndent(),
        "18. Anugerah Tuhan kami Yesus Kristus" to """
            
        1=D 2/2

        1. Anug'rah Tuhan kami Yesus Kristus,
        pengasihan Allah,
        persekutuan dengan Roh Kudus
        kiranya menyertai kami. Amin.
    """.trimIndent(),
        "19. Berkati dan Lindung Kami, Hu" to """
            
        1=D 4/4

        1. Berkati dan lindungi kami, Hu!
        Terangi kami dengan wajah-Mu, Tuhan!
        Sayangi kami!
        B'ri wajah-Mu tetap serta kami, ya Tuhan!
        B'ri kami s'lamat dan sejahtera!
        Amin, amin.
    """.trimIndent(),
        "20. Terpujilah Allah Israel" to """
            
        1=F

        1. Terpuji Allah Israel,
        yang t'lah melawat kita
        dan turut niat-Nya kekal
        'ngerjakan sukacita,
        membawa penebusan-Nya
        dan akan tanda kasih-Nya
        bangunkan tanduk s'lamat
        dirumah Daud, hamba-Nya
        yang dari awal dunia
        terjanji dinubuat.

        2. yaitu: kaum yang mengesah
        mendapat kelepasan,
        tak ada lagi musuhnya,
        terangkat penindasan.
        Kerja-Nya yang dimulai-Nya,
        hendak menunjuk rahmat-Nya,
        tentu diselesaikan.
        Kepada Abraham telah
        disumpahkan-Nya kaul-Nya
        yang kini disampaikan.

        3. Sehingga kita akhirnya,
        seumur hidup kita,
        berbakti bebas bagi-Nya
        serta bersukacita,
        sebagai kaum yang ditebus
        adil dan suci dan kudus,
        setia sampai tamat.
        Dan ini jadi tandanya:
        Nabi-Nya yang disuryh-Nya
        kabarkan jalan s'lamat.

        4. Begitu fajar merekah,
        yaitu rahmat Tuhan
        menyatakan bahagia
        di dalam keampunan.
        Cahaya dari ataslah
        melawat kita, kaum-Nya,
        bersinar jauh di dunia,
        b'ri bayang-bayang maut lenyap
        dan langkah kita pun tetap
        ke t'rang sejahtera-Nya.
    """.trimIndent(),

        "21. Kunantikan Betapa, Ya Tuhan, Datang-Mu" to """
            
        1=C 2/2

        1. Kunantikan betapa, ya Tuhan, datang-Mu?
        Dengan kubuat apa sedia hatiku?
        Turunkanlah, ya Tuhan, terang-Mu yang benar,
        sucikan kerinduan, pengharapan besar.

        2. Jauh dari takhta sorga, jauh dari t'rang baka.
        'Ngkau tanggung susah juga dengan manusia.
        Engkau kena sengsara, hukuman dosaku;
        Kaupulangkan saudara kepada Bapa-Mu.

        3. Mengapa dari sorga dengan mulianya
        'Ngkau hendak turun juga ke dalam dunia?
        Pengasihan belaka b'ri hati-Mu sedih,
        manusia celaka yang Engkau sayangi.

        4. Tak takut lagi aku seorang musuh pun.
        Di susah dan balaku 'ku dapat bertekun.
        T'lah tibalah Pahlawan dengan kuasa-Nya,
        t'rus kalah si pelawan, yang kuatnya lemah.

        5. Kurasa dilemaskan, terikat jiwaku.
        'Ngkau datang melepaskan, t'rus jiwaku sembuh.
        Kurasa sudah mati, kata-Mu: "Bangkitlah!"
        Kaub'ri kepada hati kekayaan baka.
    """.trimIndent(),
        "22. Di Langit Seb'lah Timur" to """
            
        1=F 4/4

        1. Di langit seb'lah timur
        t'rang siang merekah,
        dan datanglah Pengbibur
        seisi dunia.

        2. Dihalaukan-Nya malam
        dan kegelapannya.
        Teranglah seg'nap alam
        di cah'yanya cerah.

        3. Yang terpenjara lagi
        dan duduk mengeluh
        menyambut sinar pagi:
        terbuka belenggun!

        4. T'rang Kristus bercahaya
        dan malam maut lenyap.
        T'rang Kristus yang berjaya,
        kuasa-Nya tetap.

        5. Di langit seb'lah timur
        t'rang siang merekah,
        dan datanglah Penghibur
        seisi dunia
    """.trimIndent(),
        "23. Ya, Datanglah, Immanuel! Merindu Kaum-Mu Israel" to """
            
        1=G 2/2

        1. Ya, datanglah, Immanuel! Merindu kaum-Mu Israel.
        K'lam kabut 'nutup dunia, yang putus asa rupanya.
        Bersukacita, Israel! Kan datanglah Immanuel!

        2. Dahulu t'lah Kauantarkan kaum Israel ke Kanaan.
        Ya, turun dari sorga, Hu dan lawat pula umat-Mu.
        Bersukacita, Israel! 'Kan datang Immanuel!

        3. Ya Putera perjanjian, kerjakanlah perdamaian;
        b'ri kasih-Mu t'rang benderang, dan seg'nap dunia terang.
        Bersukacita, Israel! 'Kan datanglah Immanuel!

        4. Ya datang, Tuhan Penebus, 'Ngkau Anak Bapa yang kuds,
        sengsara naik ke puncaknya; Penolong kami, datanglah!
        Bersukacita, Israel! 'Kan datanglah Immanuel!
    """.trimIndent(),

        "24. Allah 'Ngaruniakan" to """
            
        1=G 4/4
        VERSI 1
        
        1. Allah 'ngaruniakan Anak-Nya yang akan
        mengeyangkan kita dengan sukacita.
        Nanti isi dunia Anak ini punya.
        2. Hari ini juga segenap benua,
        dengar pengajaran Raja Kebenaran.
        Mari turut Dia, kawan yang setia.
        3. Orang yang percaya nanti jadi kaya,
        kar'na diberkati dengan damai hati.
        Putra Sorga itu, s'lamat-Nya begitu
    """.trimIndent(),
        "25. T'rang Bintang Siang Gemerlap" to """
            
        1=F 4/4

        1. T'rang bintang siang gemerlap,
        yang turut janji yang tetap,
        terbit di seb'lah timur.
        Ya, Anak Daud, Rajaku,
        cahaya pengasihan-Mu
        b'ri hatiku terhibur.
        Amin, amin.
        Kebenaran, kegemaran, kemurahan,
        kauberi berkelimpahan.

        2. Kau cari aku yang sesat
        di dalam hutan yang lebat,
        bers'ru berulang-ulang.
        Di tengah kegelapanku
        kulihat cah'ya wajah-Mu,
        Kau bawa aku pulang.

        3. Hendak 'ku ikut bintang-Mu
        kepada rumah s'lamatku,
        Ya, Yesus, tolong aku.
        Kehendak hatiku lemah,
        supaya tambah kuatnya
        b'ri Roh-Mu kepadaku.
    """.trimIndent(),

        "26. T'rus dari Sorga Datang-Ku" to """
            
        1=D 4/4

        1. T'rus dari sorga datang-Ku.
        Kukabarkan kepadamu
        selamat dan kesukaan yang
        untuk kaum sekalian!

        2. Seorang Putra lahirlah,
        seorang p'rawan bunda-Nya.
        Meski kecil, lemah-lembut,
        bagi-Nya kita bertelut.

        3. Yaitu Kristus, Penebus,
        Yang Tuhan kita yang kudus,
        yang melepaskan dunia
        serta menghapus dosanya.

        4. Selamat yang dijanji Hu
        dibawa-Nya kepadamu,
        supaya kamu masuklah
        ke rumah Bapa yang baka.

        5. Dan ini tanda bagimu:
        'kan kamu dapat Tuhanku
        sebagai anak yang rendah
        berbaring di palungan-Nya.

        6. Kuasa dan mulia-Nya
        semua ditanggalkan-Nya:
        kain lampin saja pakaian
        Mukhalis kaum sekalian

        7. Hai, turut angkat suaramu:
        Kemuliaan bagi Hu
        yang mahatinggi tempat-Nya.
        Di bumi pun sejahtera!
    """.trimIndent(),
        "27. Ku Memegahkan Hu, Juruselamatku" to """
            
        1=C

        1. 'Ku memegahkan Hu, Juruselamatku.
        Rohku bersukaria.
        Hamba-Nya yang rendah
        telah ditilik-Nya. Kumuliakan Dia.

        2.Kaum bumi s'kalian 'kan membicarakan
        bahagiaku ini.
        Hu b'ri anugerah; mujizat rahmat-Nya
        ternyatalah di sini.

        3. Kuduslah nama-Nya! Sentosa umat-Nya
        tetap terpelihara.
        Set'ru yang bermegah, yang sombong hatinya,
        dib'ri-Nya mengembara.

        4. Yang hatinya rendah 'kan ditinggikan-Nya,
        dan raja direndahkan.
        dib'ri-Nya orang yang kelaparan kenya,
        yang kaya dihampakan.

        5. Menurut rahmat-Nya dib'ri-Nya umat-Nya
        harapan yang tak goyang.
        Benarlah dan teguh segala sabda Hu
        kepada nenek moyang.
    """.trimIndent(),
        "28. Terbitlah dari Awan-awan" to """
            
        1=C 3/2

        1. Terbitlah dari awanawan yang menudungi dunia,
        terang mulia yang mewawan keg'lapan dan kuasanya.
        Bersuka, bangsasekalian, dan kami turut menyembah.
        Lenyaplah malam kematian dan fajar hidup merekah!

        2. Seorang Anak sudah jadi, seorang Putra diberi.
        yang kerajaan-Nya abadi, selamat diperbarui.
        Ajaib, ilahi dan mulia dan Mahasuci nama-Nya.
        Berkat dan ampun-Nya sedia, mujizat-Nya anugerah!

        3. T'lah datang Ia dengan damai, sejaht'ra kemerdekaan.
        Bersukaria ramai-ramai, terangkatlah perbudakan!
        Segala tombak harus patah, seluruh bumi pun teduh,
        dibakar habislah senjata, sebab t'lah datang Rajamu.

        4. Ya Raja Damai, Engkau jua yang memberi sejahtera.
        Beri manusia semua bersama-sama menyembah.
        Karunia Bapa Mahakuasa b'ri alas takhta-Mu teguh,
        supaya dunia senantiasa memuliakan nama-Mu.
    """.trimIndent(),
        "29 . Muliakanlah, Muliakanlah Tuhan Allah" to """
            
        1=Es 4/4

        1. Muliakanlah, muliakanlah
        Tuhan Allah, Tuhan Allah, Mahatinggi!
        Damai sejaht'ra turun ke bumi
        bagi orang kesudian Allah
        Muliakanlah Tuhan Allah,
        muliakanlah Tuhan Allah!
        Damai sejaht'ra turun ke bumi.
        Damai sejaht'ra turun ke bumi
        bagi orang, bagi orang kesudian Allah,
        bagi orang kesudian Allah, kesudian Allah.
        Muliakanlah, muliakanlah
        Tuhan Allah, Tuhan Allah, Mahatinggi!
        Damai sejaht'ra turun ke bumi
        bagi orang kesudian Allah.
        Amin, amin.
    """.trimIndent(),
        "30. S'lamat, S'lamat Datang, Yesus Tuhanku" to """
            
        1=G 2/2
        VERSI 1

        1. S'lamat, s'lamat datang, Yesus Tuhanku,
        yang turun dari sorga yang rumah-Mu.
        S'lamat, s'lamat datang-Mu di dalam dunia,
        Tuhan jadi sama dengan manusia.
        Salam, salam!

        2. Bangunlah, gembala, lihat t'rang besar,
        dengar berita sorga dan bergemar:
        sungguh malam ini Tuhan Yesus lahirlah,
        cari Kanak-kanak yang dipalungan-Nya!
        Salam, salam!

        3. orang majus datang 'nurut bintang-Nya,
        hendak mencari Tuhan dan menyembah.
        Mas dan kemnyan dan mur dipersembahkannya.
        akan hormat Raja dan Jurus'lamatnya.
        Salam, salam!
    """.trimIndent(),

        "31. Malam Kudus, Sunyi Senyap" to """
            
        1=C 6/8

        1. Malam kudus, sunyi senyap,
        bintangmu gemerlap.
        Jurus'lamat manusia
        ada datang di dunia.
        Kristus Anak Daud (2x)

        2. Anak kecil, Anak kudus
        Tuhanku Penebus.
        Tent'ra sorga menyanyi merdu,
        bawa kabar kedatangan-Mu:
        Kristus Anak Daud (2x)

        3. Malam kudus, sunyi senyap,
        bintangmu gemerlap.
        Aku datang, ya Tuhanku,
        bersembahyang di kandang-Mu
        dan mengucap syukur (2x)
    """.trimIndent(),
        "32. Terbit Sepucuk Taruk" to """
            
        1=F

        1. Terbit sepucuk taruk di tunggul suku Daud.
        Bersinarlah t'rang baru di kegelapan maut.
        T'lah jadi Penebus menurut sabda sungguh
        perjanjian kudus.

        2. Ke pulau dan benua tersiarlah terang.
        Kaum dunia semua bersuka dan senang.
        Manusia menyembah dan nama Tuhan Yesus,
        dimuliakannya.

        3. Ya Yesus, b'rilah damai kepada dunia.
        Kiranya bimbang kami denga anugerah.
        Dan pada akhirnya, b'ri kami dapat juga,
        bahagia baka.
    """.trimIndent(),
        "33. Yang Tuhan di Sorga Menjadi Rendah" to """
            
        1=G 3/4

        1. Yang Tuhan di sorga menjadi rendah,
        manusia sungguh dan tak bercela,
        Yang Mahakuasa, lemah dan lembut
        berbaring di kandang, hai, mari sujud!
        Hai, puji kasih-Nya dan turut sembah,
        sebab dosa dunia diampunkan-Nya.

        2. Di sini Immanuel, Anak kudus;
        t'lah turun ke bumi salam Penebus.
        kuasa-Nya atas seg'nap dunia;
        sejah'tra dan damai kerajaan-Nya.

        3. Mulialah sabda kudus dan baka,
        di sini teranglah kesungguhan-Nya.
        Ya, Anak di kandang, kejadian-Mu
        menghukumkan dusta selamat semu.
    """.trimIndent(),
        "34. Anak Maryam, Bimbinglah" to """
            
        1=G 4/4

        1. Anak, Maryam, bimbinglah aku pun ke Betlehem.
        Siapakah sendiri tahu jalannya kepada-Mu?
        Panggil aku, Tuhanku, agar aku turut pun,
        dengan tangan bimbingla aku pun di sisi-Mu.
        Dan di kandang Betlehem 'ku memandang Tuhanku.
        Siapakah sendiri tahu jalannya kepada-Mu?
        Rasa hatiku berat oleh dosa dan sesal.
        Yesus, angkatlah beban, kuat kanlah kakiku.
        Tuhan Yesus, bimbinglah aku pun ke Betlehem,
        agar sambil menyembah 'ku memandang Tuhanku
    """.trimIndent(),
        "35. Ya Anak Kecil, Ya Anak Lembut" to """
            
        1=As 3/4

        1. Ya Anak kecil, ya Anak lembut,
        di kandang-Mu 'ku bertelut.
        'Ngkau lahir, miskin dan rendah,
        'kan melepaskan dunia
        Ya Anak kecil, ya Anak lembut.

        2. Ya Anak kecil, ya Anak lembut.
        Yang tidak suka merebut
        kuasa dan kekayaan,
        Yang Roh-Mu Roh Pengasihan.
        Ya Anak kecil, ya Anak lembut.

        3. Ya Anak kecil, ya Anak lembut,
        rendah-Mu itu menjemput
        manusia sekalian
        ke dalam T'rang Kerajaan.
        Ya Anak kecil, ya Anak lembut.

        4. Ya Anak kecil, ya Tuhan kudus,
        ya Anak Allah, Penebus.
        Telah terbuka hatiku,
        'Ngkau masuk dengan kasih-Mu.
        Ya Anak kecil, ya Tuhan Kudus.
    """.trimIndent(),
        "36. Di Betlehem T'lah Jadi" to """
            
        1=F 4/4

        1. Di Betlehem t'lah jadi seorang Putera,
        Yang b'ri salam abadi kepada dunia
        Amin, amin, salam bahagia.

        2. Segala bukit diam, tetapi dengarlah,
        malaikat bernyanyian di atas Efrata.
        Amin, amin, salam bahagia.

        3. Gembala dengan suka mendapat Penebus.
        Di matanya terbuka t'rang sorga yang kudus.
        Amin, amin, salam bahagia.

        4. Jikalau satu kali kau pandang mata-Nya,
        kau t'rimalah kembali sejahtera baka.
        Amin, amin, salam bahagia.
    """.trimIndent(),
        "37. Adalah di Kota Daud" to """
            
        1=F 4/4

        1. Adalah dikota Daud kandang satu yang rendah.
        Di palungan dibaringkan oleh ibu bayinya.
        Anak Maria jadilah, Yesus Kristus nama-Nya!

        2. Anak itu sudah turun dari kemuliaan-Nya.
        Tuhan sorga serta bumi, lahir di tempat rendah.
        Jadi sobat dan teman orang yang dihinakan.

        3. Pengasihan Anak ini menebus manusia
        nati kita lihat Dia di kemuliaan-Nya.
        Kita pun dipimpin-Nya ke kerajaan baka.
    """.trimIndent(),
        "38. Dari Pulau dan Benua" to """
            
        1=As 4/4

        1. Dari pulau dan benua terdengar selalu t'rus
        lagu pujian semua bagi nama Penebus.
        Gloria, muliakan Tuhan... (2x).

        2. Tinggi-tinggi dalam sorga tent'ra Tuhan yang kudus,
        tak lelah menyanyi juga di hadapan Penebus.
        Gloria, muliakan Tuhan... (2x).

        3. Tentara yang Tuhan punya, 'ninggikan Panglima-Nya.
        Lagu sorga, lagu dunia, sama diterima-Nya.
        Gloria, muliakan Tuhan ... (2x)
    """.trimIndent(),
        "39. Hai Mari, Berhimpun dan Bersukaria" to """
            
        1=As 4/4

        1. Hai, mari, berhimpun dan bersukaria,
        turut semua ke Betlehem!
        Marilah, pandang Tuhan bala sorga!
        Sembah dan puji Dia (...3x) yang Raja!

        2. Bernyanyilah kamu, tentara malaikat,
        turut bernyanyi, manusia!
        Pujilah Tuhan, Jurs'lamat dunia!
        Sembah dan puji Dia (...3x) yang Raja!

        3. Yang Mahamulia lahirlah di bumi
        sama benar dengan kita pun.
        Datanglah Ia mengampunkan dosa.
        Sembah dan puji Dia (...3x) yang Raja!

        4. Perjanjian Allah sudah disampaikan,
        kasih-Nya nyata di dunia.
        Nyanyi bersorak dan bersukaria!
        Sembah dan puji Dia (...3x) yang Raja!
    """.trimIndent(),
        "40. Hai Gembala Efrata" to """
            
        1=Es 6/8

        1. Hai gembala Efrata,
        bangun, bangun, tengoklah!
        Dengar, segenap udara
        dipenuhi bunyi suara.
        Gloria, gloria!
        Kidung yang belum pernah
        terdengar didunia
        bawa kabar yang senang
        dari langit yang cerlang.

        2. Betlehem di Efrata,
        baik di sana carilah.
        Anak dalam kain bedungan,
        yang berbaring di palungan.
        Gloria, gloria!
        Kanak-kanak itulah,
        Tuhan seg'nap dunia.
        Bangun, carilah terus,
        Putra yang kudus.

        3. Persembahan apakah
        kamu b'ri kepada-Nya?
        Atas mas dan harta benda,
        dipilih-Nya hati rendah.
        Gloria, gloria!
        Mari, kita kabarkan
        di neg'ri sekalian:
        Kejadian Putera,
        Jurus'lamat dunia!
    """.trimIndent(),

        "41. Hai, Puji Hu, Bersukacita" to """
            
        1=G 3/4

        1. Hai, puji Hu, bersukacita;
        t'lah datang yang lepaska kita.
        Segala jani sudah g'nap.
        Halaukan duka hati juga,
        bersorak dengan bala sorga:
        "Salam di bumi yang gelap.

        2. Hai, angkat mazmur kegemaran.
        Terbitlah bunga kebenaran
        dan malam ini berkembang.
        Tuhan b'ri Putera Samawi,
        nyatakan rahmat-Nya abadi,
        membawa s'lamat dan terang.

        3. T'lah kita lihat kemuliaan,
        karunia dan kebenaran
        dan t'rang samawi Al-Kalam,
        Yang jadi daging dalam dunia.
        Manusia yang Bapa punya
        dib'ri-Nya ampun dan salam.
    """.trimIndent(),
        "42. Hai Langit, Bumi, Nyanyilah" to """
            
        1=F 3/4

        1. Hai langit, bumi, nyanyilah,
        muliakan Tuhanmu,
        ajaiblah hikmat firman-Nya
        dan daulat-Nya teguh.

        2. Manusia jatuh dan sesat
        tetap lihatlah
        kasihan Allah yang besar:
        dib'ri-Nya Anak-Nya.

        3. Tentulah sabda-Nya kekal
        penuh anugerah;
        di dalam Yesus Kristus pun
        dib'ri-Nya diri-Nya.

        4. Dib'rikan-Nya Manusia
        sempurna dan kududs
        menanggung utang dan beban
        dan jadi Penebus.

        5. Di taman dan di Golgota
        kasih-Nya yang menang
        dan jalan susah dan salib
        yaitu jalan t'rang.

        6. Hai langit, bumi, nynyilah
        muliakan Tuhanmu,
        ajaiblah gikmat firman-Nya
        dan daulat-Nya teguh.
    """.trimIndent(),
        "43. Mari, Puji Jurs'lamat" to """
            
        1=F 3/4

        1. Mari, puji juru s'lamat,
        kamu yang beroleh rahmat.
        Nyanyilah dan b'rilah hormat
        akan Yesus Tuhan-Mu.

        2. Kabar pengasihan Allah
        turun dari cakrawala.
        Yang lepaskan dari salah
        sudah jadi bagimu.

        3. Alangkah besar kasih-Nya,
        murah, suci pekerti-Nya.
        S'lamat saja diber-Nya,
        tiap hari, tiap jam.

        4. Mari, nyanyi ramai-ramai,
        dunia beroleh damai
        oleh Yesus yang dinamai:
        Kristus, Jurus'lamatmu.
    """.trimIndent(),
        "44. Putri Sion, bergemar" to """
            
        1=Es 4/4

        1. Putri Sion, bergemar!
        Soraklah, Yerusalem!
        Lihat, ini rajamu,
        Raja damai adalah!

        2. Hosiana, Anak Daud,
        s'lamatkanlah bangsa-Mu!
        Bawalah bahagia
        damai kerajaan-Mu!

        3. Hosiana, Anak Daud,
        perdamaikan seteru!
        Basmilah senjata p'rang
        di seluruh dunia.

        4. Hosiana, Anak Daud,
        b'ri sehajtera kekal.
        Perset'ruan dan benci
        dikalahkan kasih-Mu!
    """.trimIndent(),
        "45. Tuhanku Yesus" to """
            
        1=Es 2/2

        1. Tuhanku Yesus, Raja seg'nap alam,
        Ilahi dan manusia,
        hendak kuturut, dan kukasihi.
        'Ngkau harta rohku yang baka.

        2. Indahlah bukit, indah sawah ladang,
        kena embun yang gemerlap.
        Tuhanku Yesus yang lebih indah,
        b'ri kesukaan-Nya tetap.

        3. Indah t'rang bulan, indah matahari,
        dan bintang-bintang yang cerlang.
        Tetapi Yesus jauh lebih indah,
        cahaya Yesus yang menang.

        4. Apa yang elok dalam alam ini
        menjadi bayang tiruan.
        Indah-Mu, Yesus, Tuhan dan Raja
        di atas makhluk s'kalian.
    """.trimIndent(),
        "46. Tetap Kuharap denga Suka" to """
            
        1=G 3/4

        1. Tetap kuharap dengan suka 'kan Dikau, Jurus'lamatku.
        Ya Tuhan, hatiku terbuka hendak menjadi rumah-Mu.
        Malaikat sorga sekalian memuliakan nama-Mu.
        Ya, Matahari Pengasihan, bersinarlah dibatinku!

        2. Ya Tuhan, hatiku kiranya kaupilih dan Kauisilah,
        dengan pengasihan yang hanya serta-Mu berbahagia.
        Begitu sukaku bertambah, sempurna penghiburan-Mu.
        Tetaplah Kausertai hamba, ya, jadi dalam hatiku!

        3. Sampaikan, Tuhan, kerinduan yang memenuhi hatiku,
        sedia dengan kerendahan, kuharap kedatangan-Mu.
        jikalau aku dilingkungi bahaya ribut dunia,
        oleh-Mu aku dilindungi. Ya Tuhan Yesus, datanglah!
    """.trimIndent(),
        "47. Sekarang Biarlah" to """
            
        1=F

        1. Sekarang biarlah
        dengan sejahtera
        berpulang hamba Tuhan
        menurut firman-Mu, sesudah mataku
        melihat s'lamat Tuhan.

        2. Terang-Mu merekah;
        kaum kafir menyembah
        cahaya yang gemilang
        dan Israel hendak ditinggikan kelak;
        kedukaannya hilang.
    """.trimIndent(),
        "48. Hosiana! Raja-Mu" to """
            
        1=F

        1. Hosiana! Rajamu, Anak Daud yang mubarak,
        datang dengan nama Hu! Mari, kitapun berarak
        mengelu-elukan-Nya.Putri Sion, nyanyilah!

        2. Hosiana! Lihatlah: Juruss'lamat, Raja Dammai.
        Hendak naik ke takhta-Nya, mari, kita ramai-ramai,
        membentangkan pakaian dan bersuka-sukaan!

        3. Hosiana! Kota-Mu buka pintu keemasan.
        Sudah lama mengeluh kami akan kelepasan.
        Datanglah ke negeri yang tetap Kau kasihi.

        4. Hosiana! Masuklah kota milik-Mu, ya Raja.
        Kami hendak menyerah dan menurut Engkau saja.
        T'rima hormat dan sembah. Tuhan kami, masuklah!
    """.trimIndent(),
        "49. Kepala yang Berdarah" to """
            
        1=D 4/4

        1. Kepala yang berdarah, diejek, dicela
        tertunduk di sengsara dan sakit siksanya.
        Cahaya kemuliaan digantikan ngeri,
        mahkota kehinaan yang durinya pedih.

        2. Sengsara-Mu semua yaitu salahku.
        'Ku menyebabkan jua segala luka-Mu.
        Dengan sesal dan malu 'ku tunduk menyembah,
        'ku patut kena palu, ya Tuhan, sayanglah!

        3. Ketika 'ku meninggal, bri hatiku teduh.
        Engkau, ya Tuhan, tinggal tetap di sisiku.
        Dan dari penuduhan segala dosaku
        lepaskan aku, Tuhan, berkat sengsara-Mu.

        4. B'ri di hadapan mata yang akan terpejam,
        salib-Mu jadi nyata di malam maut kelam,
        sehingga kegelapan dengan ketakutan
        diganti pengharapan, terang kebangkitan.
    """.trimIndent(),
        "50. Lihat, Ibu Tuhan Kita" to """
            
        1=F 4/4

        1. Lihat, ibu Tuhan kita
        sangatlah berdukacita
        'mandang palang Anak-Nya.
        Anak-Nya disengsarakan,
        dan pedang yang diramalkan
        menembuskan hati-Nya.

        2. Pahit sangatlah sedihnya
        kar'na siksa dan pedihnya
        susah buat hatinya.
        Tapi kasih Anak Allah
        akan orang yang bersalah
        tahan sampai mati-Nya.

        3. Hati kita mengenangkan,
        Yesus mati dipalangkan,
        agar kita ditebus.
        Cari sungai kasihan-Nya
        yang berpancar selamanya
        dari palang-Nya kudus.

        4. B'ri salib tudungi aku;
        Yesus, maut-Mu selaku
        tempat perlindunganku.
        Dan, ketika tubuh mati,
        b'rilah dengan suka hati
        jiwa masuk firdaus-Mu.
    """.trimIndent(),
        "51. B'ri Salib Tudungi Aku" to """
            
        1=G 4/4

        1. B'ri salib tudungi aku, Yesus,
        maut-Mu selaku tempat perlindunganku.
        Dan, ketika tubuh mati,
        b'rilah dengan suka hati
        jiwa masuk firdaus-Mu.
    """.trimIndent(),
        "52. Hai Dunia, Lihat Tuhan" to """
            
        1=F 4/4

        1. Hai dunia, lihat Tuhan,
        yang Raja kehidupan
        tergantung di salib,
        Ah, untuk kita jua
        ditanggung-Nya semua
        sengsara dan cela dan aib.

        2. Wai, aku yang celaka,
        'ku patut di neraka
        menanggung utangku.
        'ku patut menderita
        segala dukacita,
        sesahan-Mu dan bilur-Mu.

        3. Kesalahanku jua
        dan dosaku semua
        sebanyak pasir laut
        yang menyebabkan duka,
        sengsara-Mu dan luka
        dan siksa yang membawa maut.

        4. Kasih-Mu tak terbalas.
        Salib menjadi alas
        iman dan harapku,
        sehingga sampai mati
        kusimpan dalam hati
        segala tanda sayang-Mu.
    """.trimIndent(),
        "53. Ya Yesus, 'Ngkau Bersalah Bagaimana" to """
            
        1=Bes 4/4

        1. Ya Yesus, 'Ngkau bersalah bagaimana,
        sehingga patut 'Ngkau kena bencana?
        Siapakah yang menyebut tuduhan
        melawan Tuhan?

        2. 'Ngkau disesah, diejek, diludahi,
        dan tubuh-Mu yang suci dilukai,
        mahkota duri menekan kepala
        yang tak bersalah.

        3. Rahasia ini mengkinkah ketara,
        mengapa Engkau yang kena sengsara?
        Siapakah yang dapat menerangkan
        'Ngkau dipalangkan?

        4. Ajaib benar pengasihan Gembala
        yang mati ganti domba yang bersalah!
        Ya Tuhan, utang hamba-Mu semua
        Kautanggung jua.

         5. 'Ngkau mengorbankan diri sampai mati;
        kepada-Mu kupersembahkan hati.
        Curahkan kasih-Mu yang tak terduga
        di rohku juga!
    """.trimIndent(),
        "54. Memandang Palang Rajaku" to """
            
        1=Es 3/4

        1. Memandang palang Rajaku
        yang mati untuk dunia,
        kurasa hancur congkakku
        dan harta hilang harganya.

        2. B'ri Tuhan, jangan 'ku menggah
        melainkan akan mati-Mu.
        Kupersembahkan dunia
        dan untungnya kepada-Mu.

        3. Terpancar dari luka-Nya
        belas kasihan tak terp'ri.
        Belum pernah manusia
        melihat sayang sejernih.

        4. Tidak terbalas kasih-Nya
        yang seajaib kepadaku.
        Tak persembahan lain yang sah
        melainkan seg'nap hatiku.
    """.trimIndent(),
        "55. Hatiku Beriman" to """
            
        1=Es 3/4

        1. Hatiku beriman 'mandang kesiksaan di Golgota.
        Dengarlah, Tuhanku, doa sembahyangku
        kepada sayang-Mu ku menyerah, ku menyerah.

        2. Kuatkan hatiku dengan kuasa-Mu,
        agar tetap aku menjalani jalan ke negeri,
        di mana Kauberi damai genap, damai genap.

        3. Pasanglah api-Mu di dalam hatiku, suci dan t'rang.
        Ya Tuhan Penebus, b'ri oleh Roh Kudus
        aku menahan t'rus sampai menang, sampai menang.

        4. Jangan terpadamlah kasih-Mu yang betah di hatiku,
        agar kubagikan banyak kesukaan
        bagi sekalian yang kutemu, yang kutemu.
    """.trimIndent(),
        "56. Penebusku Disalib" to """
            
        1=G 4/4

        1. Penebusku disalib,
        dalam nista dan nestapa.
        Anak Bapa, mana kuat-Mu teguh,
        mana kemuliaan-Mu?

        2. Penebusku disalib.
        Ia yang kena celaku,
        agar aku dari laknat luputlah,
        hidup oleh mati-Nya

        3. Penebusku disalib.
        Aku tidak putus asa
        dalam susah;
        tiada lagi 'ku penat,
        ringanlah beban berat.

        4. Penebusku disalib.
        Aku berkerja setia
        bagi Dia.
        Aku dibabtiskan-Nya
        dalam kematian-Nya

        5. Penebusku disalib.
        Dalam maut dan hidup akan
        kuserahkan
        diriku kepada-Mu
        Tuhan, Jurus'lamatku!
    """.trimIndent(),
        "57. S'lamat Datang, Hari Terutama" to """
            
        1=G 2/2

        1. S'lamat datang, hari terutama,
        fajar t'rang kebangkitan!
        Sudah dikalahkan musuh lama,
        kalah pun kematian.
        Kristus, Matahari Kebenaran,
        biar kami dengan kegemaran
        menerima t'rang baka,
        lalu menyiarkan-Nya.

        2. Firman-Mu berbunyi dengan kuasa,
        Hidup yang menghidupkan.
        Kami bangun dari kubur dosa,
        kapan kami tanggalkan.
        Ajar kami tiap hari mati
        dalam maut-Mu dengan rela hati
        bangkit, beriman teguh
        di persekutuan-Mu.

        3. Dalam tangan-Mu terpelihara
        hidup kami amanlah.
        Akhirnya disudahkan sengsara,
        waktu siang merekah.
        Alangkah senangnya perhentian,
        set'lah bangkit dari kematian,
        berbahagia penuh
        kami lihat wajah-Mu!
    """.trimIndent(),
        "58. Betapa Indah" to """
            
        1=F 3/4

        1. Betapa indah cahaya matahari,
        tapi lebih indah salib Jurus'lamatku,
        yang mengajar aku, 'kuat dan bijaksana
        dalam angkau dan benar Allah, Jurus'lamatku.

        2. Betapa manis mawar yang bunga segar,
        tapi manis Yesus, jurus'lamat dalam hati.
        Dalam doa dan pujian hatiku terpuji,
        rindu kepada-Mu, Jurus'lamat dalam hati.

        3. Betapa kaya segala harta dunia,
        tapi kaya Yesus, jadi sebab seg'nap harta.
        Hendaklah hatiku mengasihi Yesus Kristus,
        'kan kuberi hatiku pada-Mu, Yesus Kristus.

        4. Segenap bangsa akan lihat keajaiban
        yang Tuhan sudah janji bagi mereka pengasi,
        yang terluka dan lara, yang miskin dan terbuang,
        yang hatinya kerinduan kepada-Mu, Pengasih.
    """.trimIndent(),
        "59. Puji Syukur bagi Allah" to """
            
        1=Es 4/4

        1. Puji syukur bagi Allah
        karena kurnianya.
        Kebenaran dan kasih-Nya
        tiada bertepi.

        2. Allah Bapa, kasih-Mu
        sudah buktikan,
        beri Anak-Mu yang t'rang,
        pada kami semua.

        3. Roh Kudus, kehadiran-Mu
        dengar dan pandang,
        b'ri hidup yang baru
        pada jiwa hamba.

        4. Dengan Nama Yesus Kristus
        sembah kami-Mu.
        Kautanggung dosa kami
        dan beri hidup baru.

        5. Puji syukur, mazmur baru,
        kar'na kurnianya.
        Kebenaran dan kasih-Nya
        tiada bertepi.
    """.trimIndent(),
        "60. Tuhan, Dalam Kerahiman-Mu" to """
            
        1=G 3/4

        1. Tuhan, dalam kerahiman-Mu
        s'lalu kaubimbing hamba-Mu
        menurut firman-Mu yang suci.
        Hidupkan roh yang mati.

        2. Dalam gelapku yang besar
        terang-Mu menyinari hati.
        Buka mata hati yang buta,
        buat 'ku lihat jalan-Mu.

        3. Kurniakan kasih yang suci,
        kuatkanlah iman 'ku dalam-Mu,
        t'lahutkanlah s'lamat-Mu
        di dalam jalan-Mu.
    """.trimIndent(),

        "61. Pengawal Mau Menjaga"
                to """ 
            1=As 4/4
            
            1. Pengawal maut menjaga, Mukhalis bangkitlah.
            Kemuliaaan-Nya 'ngejutkan orang gagah.
            
            2. Kita berduka hati pergi ke kubur-Nya.
            T'rang sorga turunlah di tempat orang mati.
            
            3. Hai, jangan putus asa; tak jadi maut menang.
            Kau bangkit dalam t'rang, senang senantiasa.
            
            4. Fi tengah p'rang dan dosa, percaya hilangkah?
            K'lak dalam rumah-Nya, kau hidup bersentosa.
                """.trimIndent(),

        "62. Hari Ini yang Kudus, Haleluya"
                to """ 
            
            1=C 4/4
            
            1. Hari ini yang kudus, haleluya,
            sudah bangkit Penebus, haleluya,
            yang dibukit Golgota, haleluya,
            angkut dosa dunia, haleluya!
            
            2. Mari, muliakanlah, haleluya,
            Raja, damai yang baka, haleluya.
            Dari kubur yang gelap, haleluya,
            terbit's'lamat yang tetap, haleluya!
            
            3. Habis siksa dan perang, haleluya,
            Yesus naik ke dalam t'rang, haleluya.
            Dan malak selamanya, haleluya,
            nyanyi akan hormat-Nya, haleluya!
            
            4. Sembah, nyanyilah mazmur, haleluya,
            hormat, kasih dan syukur, haleluya.
            Pujilah selalu t'rus, haleluya,
            Bapa, Anak, Roh Kudus, haleluya!
                """.trimIndent(),

        "63. Maseh Menang" to """
    
    1=F 4/4
    
    1. Maseh menang.
    Dibasmi-Nya tentu kuasa lawan-Nya Kepada-Nya.
    Penanggung dosaku,tertakluk dunia
    Yang menerima maut siksaan, t'lah naik ke takhta kerajaan.
    Maseh menang! Maseh menang!
    
    
    2. Maseh menang,meski lembing set'ru b'ri luka yang pedas.
    Kuasa-Nya b'ri sakitmu sembuh dan rantai terlepas.
    Tetap pusaka yang mulia, disimpan untuk kaum setia.
    Maseh menang! Maseh menang!
    
    
    3. Maseh menang.
    dimerdekakan-Nya yang masih mengeluh.
    Perhambaan kelah dihabiskan dan patah belenggu,
    ketika musuh akhir tewas dan kita pun bernapas bebas.
    Maseh menang! Maseh menang!
      """.trimIndent(),

            "64. Sesungguhnya Kukatakan"

                    to """
    
    1=F
    
    1. Sesungguhnya kukatakan:
    "Mukhalis hiduplah,
    dan kita disertai-Nya
    selama-lamanya.
    
    2. Hai, lihat, dunia terang,
    dan baru hidupku,
    dan jalanku menujulah,
    ke rumah Bapaku.
    
    3. Syukur, t'lah hilang dahsyat maut,
    Mukhalis yang menang,
    dan kitapun disambut-Nya,
    di sorga yang terang.
      """.trimIndent(),

            "65. Sesungguhnya Kukatakan"

                    to """
    
    1=As 4/4
    
    1. Yesus hidup! Sungguhlah, kalah maut dandukacita!
    Yesus hidup, suara-Nya nanti membangunkan kita.
    Tuhan, kebangkitan-Mu Itu penghiburanku.
    
    2. Yesus hidup! Kuasa-Nya dihormati senantiasa.
    Di kerajaan baka kita pun dib'ri kuasa.
    Tuhan, kebangkitan-Mu, itu penghiburanku.
    
    3. Yesus hidup! Kinilah mauh menjadi pintu sorga.
    Yang sempurna hidupnya, hatiku tak takut juga.
    Tuhan, kebangkitan-Mu itu penghiburanku.
      """.trimIndent(),

            "66. Hai, Puji Kuasa Nama-Nya"

                    to """
    
    1=Bes 4/4
    
    1. Hai, puji kuasa nama-Nya, malak sembah sujud
    dan di hadapan arasy-Nya
    b'ri hormat, hormat, hormat Yesus Tuhanmu!
    
    2. Hai, syahid kar'na sabda-Nya, senangkan hatimu
    sehingga jumlahmu genap,
    b'ri hormat, hormat, hormat Yesus Tuhanmu!
    
    3. Berbalik, bani Israel kepada Rajamu,
    yang melepaskan kamu pun,
    b'ri hormat, hormat, hormat Yesus Tuhanmu!
    
    4. Segala bangsa dunia, neg'ri dekat dan jauh,
    yang menerima damai-Nya,
    b'ri hormat, hormat, hormat Yesus Tuhanmu!
    
    5. Jemaat genap, yang akhirnya 'kan dipersatukan,
    berhimpun di hadapan-Nya,
    b'ri hormat, hormat, hormat Yesus Tuhanmu!
      """.trimIndent(),

            "67. Terbuka Pintu Gerbang Emas"

                    to """
    
    1=G 4/4
    
    1. Terbuka pintu gerbang mas,
    di sorga yang terang.
    Malak menyambut Tuhannya,
    Panglima yang menang,
    Panglima yang menang.
    
    2. Yang merendahkan diri-Nya
    di bumi yang cemar,
    menjadi raja yang kekal,
    tertinggi, terbesar,
    tertinggi, terbesar.
    
    3. Dahulu dari murid-Mu,
    'Ngkau naik ke dalam t'rang.
    Kausediakan tempatnya,
    di rumah-Mu senang,
    di rumah-Mu senang.
    
    4. Dan dari jauh bersinarlah
    cahaya kasih-Mu,
    selaku mercusuar yang
    menunjuk jalanku,
    menunjuk jalanku.
      """.trimIndent(),

            "68. Yesus Kristus Memerintah"

                    to """
    
    1=G 4/4
    
    1. Yesus Kristus memerintah
    dalam sorga-Nya yang indah
    anak buah-Nya sujud.
    Orang yang beroleh s'lamat
    dengan tentara malaikat
    sama-sama bertelut.
    
    2. Yesus suka memberkati
    yang mau menyerahkan hati.
    Marilah kepada-Nya!
    Penghiburan bagi duka,
    penyembukan bagi luka
    datang dari mati-Nya
    
    3. Kalau minta disucikan,
    kamu pula dijadikan
    anak-anak Allahmu.
    Jangan mengeraskan hati.
    Ah, mengapa suka mati
    dalam dosa congkakmu?
    
    4. Yesus Tuhan yang setia
    Barang siapa ikut Dia
    dihiburkan suara-Nya.
    Turut suara itu saja;
    nanti engkau lihat wajah
    Raja negeri baka.
      """.trimIndent(),

            "69. Muhkhalisku yang T'lah Menang"

                    to """
    
    1=D 4/4
    
    1. Mukhalisku yang t'lah menang, Kau, Raja dan Pahlawan
    Yang naik ke sorga yang terang di atas awan-awan.
    Tak boleh cukup hormatku dan pujian kepada-Mu.
    'Ngkau dapat kemenangan di dalam perjuangan.
    
    2. Sekarang duni bertelut, di depan Raja Sorga.
    Malaikan menyembah sujud menghadap arasy juga.
    Dan jika ada seteru hendak melawan kuasa-Mu,
    terus tergagal jua upayanya semua.
    
    3. Ya Yesus, antar aku pun, b'ri jiwaku melayang,
    terbang ke taman dan kebun, di sorga yang gemilang.
    Di sana s'lamatku baka, tiada lagi bercela.
    Kuharap kesukaan memandang wajah Tuhan.
      """.trimIndent(),

            "70. Jemaat-Mu Ini Bertelut"

                    to """
    
    1=F 2/2
    
    1. Jemaat-Mu ini bertelut, ya Tuhan dan kepala,
    menyanyi, menyembah sujud, ya Anak Tunggal Allah
    Penguasa dunia menyerah dan menb'ri hormat juga. 'Ngkau,
    Saksi Allah, disembah di bumi dan di sorga.
    
    2. Dan kami pun Kausucikan, sehingga kami jadi
    suatu kaum kerajaan dan kaum imam abadi.
    Jemaat yang Kaukasihi menyanyi bersukaan,
    sebab kepada-Mu dib'ri mahkota kemuliaan.
    
    3. Percaya umat-Mu teguh, sesungguhnya sekali
    menurut perjanjian-Mu, 'Ngkau datang k'lak kembali.
    Bersoraklah, manusia dan malak setiawan!
    Sebentar Tuhan datanglah di atas awan-awan!
      """.trimIndent(),

            "71. Yesus Kristus yang Menang"

                    to """
    
    1=G 4/4
    
    1. Yesus Kristus yang menang, kar'na Ialah Pahlawan
    yang memutuskan perang dengan tent'ra si pelawan.
    Yesus naik ke takhta-Nya, Allah dan manusia.
    
    2. Yesus Kristus, Ialah Tuhan yang dib'ri kuasa.
    Mazmur baru angkatlah bagi Penebus perkasa,
    yang memimpin umat-Nya ke neg'ri sejahtera.
      """.trimIndent(),

            "72. Roh Kudus, Roh Kebenaran"

                    to """
    
    1=Es 4/4
    
    1. Roh Kudus, Roh Kebenaran, curahkanlah api-Mu
    dengan angin kesegaran, agar dunia sembuh!
    Serta t'rangmu bercahaya, bangsa bumi menyembah
    Yesus Kristus, Tuhannya, dengan harap dan percaya.
    Turunlah, ya Roh Kudus! Turunlah, ya Roh Kudus!
    
    2. B'rilah oleh kaum semua Tuhan Allah diseru
    dengan nama bapa jua, oleh pengajaran-Mu.
    Ajar kami jalan s'lamat, agar kami tak sesat,
    lagi tahan tak penat dan setia sampai tamat.
    Turunlah, ya Roh Kudus! Turunlah, ya Roh Kudus!
      """.trimIndent(),

            "73. Ya Roh Penyuci, Turunlah"

                    to """
    
    1=Es 4/4
    
    1. Ya Roh Penyuci, turunlah dan curahkan karunia,
    supaya hati yang cemar menjadi suci dan benar.
    
    2. Penghibur, sumber air hayat, Pembagi kasih dan berkat,
    b'ri kami beriman teguh dan tubuh kami rumah-Mu.
    
    3. Kiranya api yang kudus di dunia menyala t'rus
    dan kesungguhan-Mu cerah. Ya Roh Penghibur, datanglah!
      """.trimIndent(),

        "74. Hai kristen, Nyanyilah" to """

    1=C 6/8

    1. Hai Kristen, nyanyilah,
    sucikan hari ini!
    Bersuka-sukaan
    melihat tanda ini.
    Roh Allahmu Kudus
    'lengkapkan laskar-Nya,
    Kiranya kuasa Roh
    di sini nyatalah!

    2. Menurut janji-Mu
    b'ri kami hidup pula,
    dan oleh Roh Kudus
    dijadikan semula.
    B'ri kami pun penuh
    percaya yang benar
    anggota tubuh-Mu
    yang hidupnya segar.

    3. Yang hatinya penuh
    Roh Tuhan dan sabda-Nya
    seraya bergemar
    mendapat karunia-Nya,
    hai, puji Allahmu!
    yang pengasihan-Nya
    setia dan baka.
    """.trimIndent(),


"75. Hai, Nyanyi dan Bersuka Hati"

to """

1=A 4/4

1. Hai, nyanyi dan bersukahati, ha Kristen kamu nyanyilah!
Jemaat sudah diberkati Roh Tuhan dengan kuat-Nya.
Telah dicurahkan kuasa ke dalam murid yang lemah
dan api, angin dan bahasa menjadi tanda datang-Nya.

2. Segala bangsa bumi ini mengaku sambil menyembah.
Roh Tuhan memberi di sini, jaminan kesungguhan-Nya.
Sekarang Yesus yang mulia disambut dalam dunia,
dan hati kami pun sedia, hendak menjadi rumah-Nya.

3. Ya Roh Kudus, peliharakan jemaat dengan anugerah.
B'ri jangan kami disesatkan penggodaan di dunia.
Nyalakanlah di dalam hati pengasihan dengan iman.
oleh-Mu waktu kami mati menjadi jam kesukaan.
  """.trimIndent(),

    "76. Tuhanku, Berkat-Mu Limpah"

    to """

    1=G 6/4

    1. Tuhanku, berkat-Mu limpah bagai hujan yang deras;
    b'rilah titiknya menimpa hati kami yang lemas
    Aku pun, aku pun, dan menimpa aku pun.

    2. Bapa kami, jangan lalu, ingat akan anak-Mu.
    Aku menyesal dan malu, ampunkanlah dosaku.
    Aku pun, aku pun, ingat akan daku pun.

    3. Yesus, b'rilah pertolongan oleh pengasihan-Mu.
    Jurus'lamat, b'ri sokongan dalam kehidupanku.
    Aku pun, aku pun, Yesus, tolong aku pun.

    4. Roh, Kudus, berkat-Mu turun, limpah-limpah dan segar,
    b'rilah tumbuhan di gurun hidup pula bergemar.
    Aku pun, aku pun, turun dalam aku pun.

    5. Hatiku yang dikeraskan, Tuhan, Kaulembutkanlah.
    Engkau dapat melepaskan dari dosa dunia.
    Aku pun, aku pun, ya, lepaskan daku pun.

    6. Kasih Allah, suci, kuat, sucikanlah hatiku,
    sampai aku pun membuat apa pun kehendak-Mu.
    Aku pun, aku pun, sucikanlah aku pun.
    """.trimIndent(),

"77. Ku Percaya Allah Bapa"

to """

1=G 2/2

1. 'Ku percaya Allah Bapa, mahakuasa dan benar.
Khalik langit, laut dan bumi, seg'nap dunia besar.
Oleh rahmat-Nya 'ku ada. Pengharapanku teguh,
kar'na Bapa menentukan perjalanan hidupku.

2. 'Ku percaya Yesus Kristus, Ia Anak Tunggal-Nya.
Tuhan dan Kepala kami, Allah dan Manusia.
Yang telah kena sengsara, mati dan ditanamkan,
bangkit, lalu naik ke sorga, memegang Kerajaan.

3. 'Ku percaya dan kumohon: Roh Kudus Kesungguhan.
Yang mengaruniai Gereja, hidup dan persatuan.
Usir hikmat duniawi, roh pendusta dan benci;
B'ri Gereja bersekutu dan percayanya jernih.

4. Pujian syukur dan hormat, Tuhanku dan Allahku
T'lah kudengar sabda s'lamat, kabar kesukaan-Mu.
T'lah kulihat nyata-nyata, kemurahan-Mu besar.
Amin! Rohku pun berkata: "Amin, sabda-Mu benar!"
  """.trimIndent(),

    "78. Di dalam Satu Tuhan Jua"

    to """

    1=D 4/4

    1. Di dalam satu Tuhan jua dan oleh satu baptisan,
    berbungalah jemaat semua yang bersehati beriman.
    Roh suci memberi kuasa menantikan selamat-Mu,
    ya Tuhan, b'ri senantiasa jemaat-Mu satu dan teguh.
    """.trimIndent(),

"79. Tuhanlah kekal Raja Hati Kami"

to """

1=Es

1. Tuhanlah kekal Raja hati kami; kami tak sesat
ikut firman-Mu beriman teguh pada jalan damai.

2. Bimbing kami pun, agar di gangguan,
kami bertekun, sampai akhirnya
di terang baka, kami pandang Tuhan.
  """.trimIndent(),

    "80. Yesus, Pimpinlah"

    to """

    1=Es 3/2

    1. Yesus pimpinlah ke neg'ri baka,
    dan berjalanlah di muka, kami ikut dengan suka.
    Di perjalanan, Tuhan, b'ri iman.

    2. B'rilah kami pun tahan bertekun.
    Jangan kami dalam susah, mengeluh dan putus asa.
    Jalan susah yang jadi jalan t'rang.

    3. Duka dan beban, kawan dan teman
    kami pikul selamanya oleh sayang-Mu kiranya.
    B'ri penghiburan di percobaan.

    4. Uruslah tetap dalam t'rang dan g'lap,
    langkah kami dan bekalan, sampai pada akhir jalan,
    kami masuklah rumah-Mu baka.
    """.trimIndent(),

"81. Beri, Ya Pokok Anggur Sungguh"

to """

1=F 3/4

1. Beri, ya Pokok Anggur sungguh, tetaplah aku pada-Mu,
supaya dapat 'ku bertumbuh; Engkaulah pokok hidupku.
B'ri oleh Roh-Mu 'ku segar, sehingga buahku benar.

2. Tak dapat kukuatkan diri, percumalah usahaku.
Dengan kuasa-Mu sendiri berbuah aku bagi-Mu.
Oleh-Mu buahku lebat; yang tak berbuah terkerat.

3. ya Tuhan, tolong agar jangan 'ku jadi carang yang lepas,
dan jangan aku kebimbangan, sehingga hatiku lemas.
Tetaplah Engkau Tuhanku, tetaplah aku milik-Mu.

4. B'ri aku dengan rendah hati, berbuah banyak bagi-Mu.
Yang Kauhidupkan takkan mati, meskipun mati tubuhku.
Ya Pokok Anggur yang benar, mujizat kasih-Mu besar!
  """.trimIndent(),

    "82. Asal Yesus Jua Tuhan Hidupku"

    to """

    1=Es 4/4

    1. Asal Yesus jua Tuhan hidupku,
    oleh sabda-Nya semua, s'lamat hatiku penuh.
    Biar 'ku setia pada jalanku menurut Dia.

    2. Asal Yesus jua Tuhan hidupku,
    penghiburan-Nya semua memperhentikan keluh.
    Apa yang kubuat, dengan Dia juga aku kuat.

    3. Oleh yesus jua dunia sembuh.
    Hai saudaraku semua, Yesus juga Tuhanmu.
    Turut ikut Dia; s'lamat kerajaan-Nya sedia!
    """.trimIndent(),

"83. Kukasih Yesus, T'rang dan Kuatku"

to """

1=G 2/2

1. Kukasih Yesus, t'rang dan kuatku! Penghibur kalau
hatiku gelisah, Yang melepaskan orang dari
susah. Hai jiwaku, kaupuji Tuhanmu.

2. Kukasih Yesus, Penebus benar!
Oleh-Nya taurat tak mengutuk lagi;
tiada lagi utang yang ditagih;
'ku terlepas dan hati bergemar.

3. Kukasih Yesus, Penganugerah!
Ketika 'ku sebagai kanak-kanak
hendak berjalan dan gelincuh banyak,
seb'lum tersungkur 'ku disokong-Nya.

4. Kukasih Yesus! Rela hatiku
menangguh penyuruhan dan beban-Nya
dan menyampaikan maksud-Nya kiranya,
sebab kutahu kasih-Nya teguh.

5. Kukasih Yesus, yang setia-Nya
memimpin aku sampai waktu mati,
ketika itu dengan bebas hati
kunyanyikan syukur dan menyembah.

6. Kukasih Yesus! Hari-Nya dekat!
Hendak kulihat kemuliaan Tuhan;
di dalam t'rang-Nya nyata kesungguhan.
Pujilah Tuhan, segenap jemaat!
  """.trimIndent(),

    "84. Tak Kita Menyerahkan"

    to """

    1=Es 4/4

    1. Tak kita menyerahkan kepada musuh-Nya,
    pelita yang bersinar di dalam dunia.
    Tak boleh firman Allah yang sungguh dan teguh,
    Alkitab yang mulia diambil seteru.

    2. Penyokong orang tua dan orang yang lemah,
    pemimpin orang muda dan sukacitanya.
    Senjata perjuangan di p'rang penggodaan
    dan bantal perhentian di jam kematian.

    3. Yang dapat memecahkan segala hati k'ras,
    yang mencurahkan hidup di hati yang lemas,
    yang menyembuhkan luka, mujarab obatnya,
    yaitu firman Allah, penuh anugerah.

    4. Di hati kami, Tuhan Kautulis sabda-Mu,
    supaya kami juga setia dan teguh.
    Kendati gunung goyah, binasa dunia,
    kekallah firman Allah, selama-lamanya.
    """.trimIndent(),

"85. Ya Tuhan, Bimbing Aku di Jalanku"

to """

1=Es 2/2

1. Ya Tuhan, bimbing aku di jalanku.
B'ri tanganku kutaruh di tangan-Mu.
Karna anak-Mu sendiri tiada tahu
berjalan dan berdiri jik' Engkau jauh.

2. Di tengah angin ribut dan ombak laut
b'ri jangan aku takut bahaya maut.
Kulihat bergemilang cahaya-Mu.
Berilah jangan hilang percayaku.

3. Dan kalau tersembunyi kuasa-Mu
dan dalam gurun sunyi jalananku,
Tentu maksud-Mu nanti kulihatlah,
ketika'ku berhenti di t'rang baka.
  """.trimIndent(),

    "86. Tahanlah dan Berjuang T'rus"

    to """

    1=D 4/4

    1. Tahanlah dan berjuang
    t'rus dalam perjuangan kudus.
    Kristuslah pokok kuatmu
    dan kemenangan mu tentu.

    2. Maju tetap dan capailah
    harta kehidupan baka.
    Upah perjuangan berat
    itu mahkota alhayat.

    3. Jangan sesat di dunia,
    ikutlah t'rang anugerah.
    Jalan benar yang kautempuh
    itulah Kristus, Tuhanmu.

    4. Jangan kuatir, Ialah
    membimbing dengan tangan-Nya.
    Kristus pemimpin yang teguh,
    tenagamu dan hidupmu.

    5. Janganlah takut p'rang berat;
    senjata-Nya tetap dekat.
    Nanti kau masuk di neg'ri
    tempat kau dimahkotai.
    """.trimIndent(),

"87. Ya Bapa, Tilik dalam Rahmat-Mu"

to """

1=G 6/4

1. Ya Bapa, tilik dalam rahmat-Mu, jemaat-Mu yang Kau
kumpulkan di sini. Menghadap kami dengan anak
ini, sebab percaya perjajian-Mu.

2. Jemaat beroleh kesucianya.
di nama-Mu, ya Bapa yang di sorga,
dan anak-Nya pun dikuduskan juga.
B'ri Kristus hidup dalam batinnya.

3. Kiranya oleh Roh dan sabda-Mu
roh anak diterangi, diperkuat
dan hatinya hendaklah Kauperbuat
'kan tempat diam kebenaran-Mu.

4. Ditahbiskanlah ia bagi-Mu
dan namanya yang kini ditentukan
Kautulis dalam kitab kehidupan,
B'ri hidupnya menurut maksud-Mu.
  """.trimIndent(),

    "88. Yesus, Roti Kehidupan, B'ri Anug'rah Perjamuan"

    to """

    1=F 4/4

    1. Yesus, Roti Kehidupan, b'ri anugrah perjamuan
    yang Kausajikan di sini memberkati hati ini.
    Jangan lagi aku malu ikut Tuhanku selalu,
    agar nanti aku juga jadi jamu-Mu di sorga.
    """.trimIndent(),

"89. Yesus Roti Kehidupan, Turun dari Sorga-Nya"

to """

1=F 3/4

1. Yesus, Roti Kehidupan, turun
dari sorga-Nya b'ri selamat
dan tenaga yang tiada taranya.

2. Yesus itu Jalan Lurus.
Orang yang telah sesat,
diantarkan-Nya kembali
ke pancaran air hayat.

3. Yesus itu Sumber Hidup
bagi yang kehausan.
Barangsiapa minta minum
hausnya t'rus dipuaskan.

4. Yesus itulah Gembala,
untuk domba yang lemah.
T'lah dilawan-Nya si jahat
mengorbankan nyawa-Nya.

5. Yesus itu Anak Domba
yang menjadi Penebus
bagi kita sekalian,
oleh darah yang kudus.

6. Yesus itu Gunung Batu
yang tiada tergerak,
Biar bumi pun binasa.
Biar bumi pun binasa,
Ialah tetap tegak.
  """.trimIndent(),

    "90. Yesusku yang Dikurbankan"

    to """

    1=G 4/4

    1. Yesusku yang dikurbankan, agaraku hiduplah,
    mempersilahkan 'ku makan minum pada meja-Nya.
    Bagi mata jadi nyata: dosa diampunkan-Nya.

    2. Lihat, Tuhan membagikan tubuh-Nya dan darah-Nya.
    Perjanjian didirikan dengan orang milik-Nya.
    Dosa kita, dukacita, sama disembuhkan-Nya.

    3. Aku sudah direndahkan, Yesus, dalam maut-Mu.
    Bangkit-Mu menganug'rahkan hidup yang penuh-penuh.
    B'ri kiranya selamanya 'ku berpaut kepada-Mu.

    4. Amin, amin! Ku percaya: Engkau Jurus'lamatku.
    B'rikan Roh Kudus, supaya 'ku tetap di jalan-Mu.
    B'rilah, Tuhan, perjamuan menetapkan harapku.
    """.trimIndent(),

"91. Mau Apa pun Kubuat"

to """

1=G 4/4

1. Mau apa pun kubuat, kucari roh dan kuat
pada-Mu, Tuhanku. Jik' aku berjabatan,
segala perbuatan bergantung pada hikmat-Mu.

2. Usaha manusia sendiri sia-sia,
akibatnya fana.
Tiada pertolongan di luar Engkau, Tuhan;
b'ri berkat dan anugerah.

3. Hai jiwaku, percaya kepada Tuhan saja.
Khalikmu yang jabar.
Dan apa jadi juga, b'ri Bapamu di sorga,
menunjuk jalan yang Benar.
  """.trimIndent(),

    "92. Sejaht'ra Hari Tuhan"

    to """

    1=G 4/4

    1. Sejaht'ra hari Tuhan, selamat datangmu,
    pembawa keteduhan, karunia Tuhan Hu.
    serta malak di sorga, seisi rumahnya
    menyanyi kami juga: "Kuduslah nama-Nya!"

    2. Berhentilah di sini saudara yang penat;
    di rumah Tuhan ini kaucarilah berkat.
    Kautiliklah, ya Tuhan, segala anak-Mu,
    sekalian ribuan yang cari had'rat-Mu.

    3. Di rumah tempat duka, penyakit dan kesah,
    yang kehilangan suka, yang padam harapnya,
    berikanlah, ya Tuhan, t'rang Injil-Mu kudus
    membawa penyembuhan, anug'rah Penebus.

    4. Tetapkan perdamaian dan kasih yang teguh.
    B'ri jangan pertikaian rusakkan umat-Mu.
    B'ri kami di sengsara percaya yang tetap
    dan habis mengembara sejahtera genap.
    """.trimIndent(),

"93. Yesus, Lihatlah Jemaat"

to """

1=G 4/4

1. Yesus, lihatlah jemaat yang telah berhimpun ini, yang
menantikan berkat sabda Injil-Mu di sini.
B'rilah kami pertemuan dengan Dikau juga, Tuhan.

2. Yesus yang mencurahkan Roh Kudus di atas G'reja,
Tuhan yang menjadikan Roti Hidup-Mu di meja,
b'rilah hari ini juga sabda s'lamat dari sorga.

3. Budi kami t'rangilah, makin sucikanlah mata.
Sampai pada akhirnya, maksud Tuhan jadi nyata
dan di atas, di cahaya, pandang gantilah percaya.
  """.trimIndent(),

    "94. Berhimpun Semua, Menghadap Tuhan"

    to """

    1=D 3/4

    1. Berhimpun semua, menghadap Tuhan,
    dan pujilah Dia yang murah benar.
    Berhentilah segala pengharuan,
    diganti s'lamat dan berkat besar.

    2. Hormati nama-Nya serta kenangkan
    mujizat yang sudah dibuat-Nya.
    Hendaklah t'rus syukurmu dinyatakan.
    di dalam hidupmu dan buahnya.

    3. Berdoa dan jaga supaya jangan
    penggoda merugikan jiwamu.
    Di dunia ada satu kemenangan,
    yakni iman kepada Tuhan Hu.
    """.trimIndent(),

"95. Firman Hu, Berp'rintahlah"

to """

1=D 4/4

1. Firman Hu berp'rintahlah sampai ujung dunia.
Oleh-Nya dijadikan kita pun sekalian.

2. Firman Bapa yang menang, sudah menerbitkan t'rang.
Maksud-Nya kekal tentu, perjanjian-Nya teguh.

3. Firman Anak, yang telah angkut utang dunia.
kematian-Nya memb'ri kita pun diampuni.

4. Firman Roh membebaskan, memberi kesungguhan.
Kita masuk oleh-Nya, ke k'rajaan yang baka.

5. Firman hidup, datanglah, bangkitkan manusia.
Bangsa-bangsa mengeluh: Datanglah perintah-Mu!
 """.trimIndent(),

    "96. Hari Damai yang Teduh"

    to """
    1=Bes 3/4

    1. Hari damai yang teduh, hari berkat Tuhan Hu,
    bawalah kesukaan yang kudus.
    Dengar lonceng yang berbunyi sampai dalam hutan sunyi.
    Puji Tuhan, nyanyilah! Puji Tuhan, nyanyilah!
    Muliakan nama-Nya! Muliakan nama-Nya!

    2. Burung pun kecil besar, nyanyi sambil bergemar:
    "S'lamat datang, hari Hu yang kudus."
    Dari langit yang terbuka turun damai, turun suka.
    Puji Tuhan, nyanyilah! Puji Tuhan, nyanyilah!
    Muliakan nama-Nya! Muliakan nama-Nya!
    """.trimIndent(),

"97. Tuhan Allah Hadir"

to """

1=G 4/4

1. Tuhan Allah hadir dalam rumah ini;
hai sembah sujud di sini
Diam dengan hormat, tunduklah semua,
tubuh serta jiwa juga.
T'rimalah sabda-Nya.
Minta diberkati
dan serahkan hati.

2. Tuhan Allahhadir, suci dan mulia,
sorga-Nya memuji Dia.
Tentara malaikat bunyikan nyanyian:
"Tuhan suci tiga kian."
Lihatlah, dengarlah:
Kami pun semua
bernyanyian juga.

3. Datang dalam hati, sucikanlah dia,
akan rumah yang sedia.
Hendak anug'rahi kami sekalian,
sukma yang berpengasihan.
B'rilah, Hu, wajah-Mu:
Nyata bercahaya,
kuatkan percaya.

4. Jadikan kiranya, Raja yang mulia,
kami hamba-Mu setia.
Dan serta malak-Mu, b'rilah kami ini
puji had'rat-Mu di sini.
Tuhan Hu, tangan-Mu:
Bimbinglah kiranya
kami selamanya.
 """.trimIndent(),

    "98. Berkatilah, Ya Tuhan, Nikah Ini"

    to """

    1=Es 4/4

    1. Berkatilah, ya Tuhan, nikah ini,
    berkati permulaannya di sini,
    nasib dan niatnya.

    2. Berkatilah, baik dalam kesenangan
    dan waktu susah pun kedua tangan
    dan perjanjiannya.

    3. Berkatilah segala pencarian,
    beri sejahtera dan pengasiha,
    di dalam rumahnya.

    4. B'ri apalah salib pun diberkati,
    salib yang ditangungnya bersehati
    dan sama sabrnya.

    5. Dengakanlah, ya Tuhan, doa kami,
    supaya keduanya mengalami,
    Engkaulah Bapanya.
    """.trimIndent(),

"99. Bapa Kami, Allah Kekekalan"

to """

1=G 2/2

1. Bapakami, Allah kekekalan,
takterbatas waktu-Mu
tapi matahari Kau b'ri jalan
yang ukurannya tentu.
Apa yang berbah dan beralih,
kerajaan-Mu tetap sekali
Kar'na kasih-Mu teguh,
pujian kepada-Mu!

2. Haleluya, puji Bapa sorga,
Yang tak lupa makhluk-Nya,
Yang sepanjang tahun inijuga
memberi anugerah.
Biarpun gelora lautan dunia,
perlindungan Tuhan dan teduh-Nya
b'ri penghiburan tetap
juga dalam zaman g'lap.

3. Bapa, kami tahu 'Ngkau menuntut
kasih dan kesungguhan;
dengan malu anak-Mu berlutut,
harapkan keampunan.
Oleh Yesus, yang b'ri penebusan
b'ri kiranya dengan kekudusan
kami pun dibangkitkan
di neg'ri perhentian.
  """.trimIndent(),

    "100. Senja Disambut Dengan Suka"

    to """

    1=G

    1. Senja disambut dengan suka oleh peladang yang penat;
    Menengok kitapun ke muka ke kesudahan yang dekat.
    Di rumah Bapa t'lah sedia segala tempat diampun
    dan janji-Nya tak siasia; imanmu harus bertekun.

    2. Tak mungkin, siapa yang percaya, kecewa nanti harapnya.
    Sahabat kurang berupaya, tetapi Yesus tak pernah.
    Semesta alam diserahkan kepada kuasa firman-Nya.
    Tiada dapat ditegahkan segala maksud kasih-Nya

    3. Percaya itu meringankan kesukaran perjalanan:
    segala gunung direndahkan dan dikeringkan lautan.
    Bahagia yang tak terbilang, tak habis kesukaan!
    Seng ara perasingan hilang kelak di tanah air baka!
    """.trimIndent(),

"101. Luruh Bunga, Layu Daun"

to """

1=G 4/4

1. Luruh bunga, layu daun, rupa dunia
Lalu bulan, lewa tahun buruburu larinya.
Meski kami mengalami peringatan pun lenya,
kami rasa utang kami, Tuhan, firman-Mu tetap.

2. Nenek-moyang sudah lama turun ke pekuburan,
hilang harga, hilang nama kami pun sekalian.
Dengan hati tak terharu, maut membawa mangsanya.
Apa juga jadi baru, nanti tua segera.

3. Bukannya kepada masa kugantungkan nasibku.
Bapaku yang Mahakuasa, kupercaya janji-Mu.
Dalam susah apa juga, Rasa hatiku teduh;
Engkau Bapaku di sorga oleh Yesus Anak-Mu.

4. Bapa waktu susah hati, Bapa waktu 'ku senang,
dalam alam orang mati, dalam dunia terang.
Apa juga yang berganti dan kena perubahan.
Kasih Bapa tak berhenti, tidak berkesudahan.

5. Biar tahun berturut-turut dengan isinya lenyap,
kesukaan hidup surut, rahmat Allahku tetap.
Biar sunyi jalan ini, 'ku dibimbing tangan-Nya.
'Ku memandang dari sini tanah airku baka!
  """.trimIndent(),

    "102. Hai Sobat Sekalian"

    to """

    1=Bes 4/4

    1. Hai sobat sekalian,
    sekarang perceraian,
    dan kamu masing-masing
    ke tempat yang terasing.
    Salam, salam di jalanmu.
    Salam, salam di jalanmu.

    2. Hai, tahan dan percaya,
    di susah dan bahaya.
    Roh b'rilah dan berkat jua
    b'ri kerjamu berbuah.
    Salam, salam di jalanmu.
    Salam, salam di jalanmu.

    3. Sobat yang setiawan.
    tak lupa kawan-kawan.
    Di mana pun kerjamu,
    sembahyang iring kamu.
    Salam, salam di jalanmu.
    Salam, salam di jalanmu
    """.trimIndent(),

"103. Syukurlah, Tuhan Hu Setia"

to """

1=Bes 3/4

1. Syukurlah, Tuhan Hu setia, ke mana juga jalanmu.
Percayamu tak siasia dan tak berubah kasih Hu.
Di mana kau tengadahlah, terbuka juga sorga-Nya.

2. T'rang matahari kebenaran bersinar jauh di dunia.
Meski bertambah kesukaran, tak boleh padam cah'yanya.
Berjalan saja dalam t'rang, di zaman damai dan perang.

3. Sebentak kasih Hu yang sama, di sini dan di seberang.
Sesudah perceraian lama, b'ri pertemuan yang senang.
Dan jauh di muka jalanmu, tertentu dalam tangan Hu.
  """.trimIndent(),

    "104. Berb'hagia Kekal"

    to """

    1=F 3/4

    1. Berb'hagia kekal serikat yang kudus,
    yang bersehati menyerah kepada Penebus.

    2. Selalu doa naik sehingga bertemu:
    Menjadi satu doa k'lak, di 'dapan takhta Hu.

    3. Yang sungguh beriman gendak dipikulnya.
    Meski berat sekalipun, beban saudaranya.

    4. Sebentar bercerai, menangis tersedu.
    Tetapi harap, Tuhan b'ri k'lak kita bertemu
    """.trimIndent(),

"105. Sinar Fajar yang Baka"

to """

1=Des

1. Sinar Fajar yang baka,
t'rang yang tidak dijadikan,
pagi ini datanglah dengan
cah'ya yang berikan
Roh yang kuat dan
segar dan benar.

2. B'ri embun penghiburan
menyegarkan jiwa kami,
hati yang kehausan,
rindu-dendam akan damai.
B'ri penyiraman sedap,
yang tetap.

3. Bara api kasih-Mu
apalah membakar saja,
dari hati p'ri semu,
pikiran yang sia-sia,
hingga diperbarui
dan bersih

4. Hari yang penghabisan,
Tuhan, suruh dari sorga:
Cah'ya yang membangunkan
kami dari kubur juga,
akan masuk, terlepas,
pintu mas

5. Dan di sanalah tetap,
wajah-Mu yang bercahaya.
Tiada lagi malam g'lap,
hanya siang suci saja.
Itulah bahagia
yang baka.
  """.trimIndent(),

    "106. Terang Matahari"

    to """

    1=A 3/4

    1. Terang matahari telah menyinari segala neg'ri
    dan gunung dan padang dan sawah dan ladang, senang berseri.

    2. Bersuka sekali kulihat kembali terang merekah,
    dan Bapa di sorga, yang Bapaku juga, hendak kusembah.

    3. Syukur bagi Dia, Gembala Setia, yang jaga tetap.
    Dan waktu semua karunia-Nya jua, terang dan gelap.

    4. Tenaga dan kuat, kerja yang kubuat, kepunyaan-Nya.
    Yang t'lah memberkati, hendak kuhormati, berhati rendah.

    5. Sehari-harian besar pemberian kemurahan-Mu.
    Ya Tuhan, kiranya kuingat reganya, dan tanggunganku.
    """.trimIndent(),

"107. Kepada-Mu, ya Tuhan Hua"

to """

1=G 4/4

1. Kepada-Mu, ya Tuhan Hua syukur dinyanyian petang.
T'rang matahari masuk jua, Engkaulah yang tetap terang.
Sehari hari an betapa besar karunia sayang-Mu,
yang melampaui sayang bapa. Ya Tuhan, Pokok hidupku.

2. Ketika malam pun kutaruh, kepada-Mu percayaku.
B'ri esok dengan suka baru, 'ku hidup akan hormat-Mu.
Dan kalau tiada esok nanti Kaut'rima rohku apalah,
sehingga dapat 'ku berhenti dan ketemu sejahtera.

3. 'Ku tahu siang malam siapa Pelindungku dan harapku.
'Ngkau batu-karangku, ya Bapa, sandaran yang tetap teguh.
Dan pada malam kesudahan perjalanan kehidupan,
kar'na segala hari, Tuhan, kub'ri syukur dan pujian.
  """.trimIndent(),

    "108. Ya Yesus Kristus, T'rang Baka"

    to """

    1=Bes

    1. Ya Yesus Kristus, T'rang Baka
    yang menerangi dunia,
    meskipun siang jadi g'lap
    dan sinar bulan pun lenyap.

    2. B'ri kami pun, kecil besar
    terlindung waktu tak sadar.
    Dan jauhkanlah kesusahan
    bahaya dan penggodaan.

    3. B'ri kami hati yang teduh,
    sedia bagi datang-Mu,
    dan yang penuh pengharapan,
    Kauampunkan kesalahan.

    4. Di waktu perjuangan pun
    b'ri kami dapat bertekun,
    dan jangan biar seteru
    merugikan jemaat-Mu.

    5. kiranya segenap jemaat,
    meski salib menindih b'rat,
    bersuka dalam suka-Mu.
    Ber percayanya teguh.

    6. Besarlah susah dunia;
    dengarkan juga doanya,
    hiburkanlah yang meneluh,
    yang sakit jadikan sembuh.

    7. Kasih-Mu, Bapa, tunjuklah,
    ya Anak, b'ri anugerah,
    ya Roh, b'ri kami s'kalian
    kudus dan dipersatukan.
    """.trimIndent(),

"109. Tetap 'Ku Harap Pada-Mu"

to """

1=G 4/4

1. Tetap 'ku harap pada-Mu, ya Bapa yang di sorga,
meski t'lah hampir malamku dan surya turun juga.
Kendati tinggi usia dan tubuh surut kuatnya,
bertambah susah paya, tak kulepaskan tangan-Mu,
di hidupku dan matiku tetaplah 'ku percaya.
  """.trimIndent(),


        "110. Ya Tuhan, Pada-Mu Tak Ada Malam G'lap"

    to """

    1=D 4/4

    1. Ya Tuhan, pada-Mu tak ada malam g'lap.
    Di sana kabut dunia diganti t'rang tetap.

    2. Di dalam siang-Mu lenyap kedukaan
    bekas air mata yang sedih hendak dihapuskan.

    3. Di kawan yang besar yang putih jubahnya
    tak mungkin satu dosa pun cemarkan sukanya.

    4. Tak ada lagi maut di t'rang-Mu yang baka.
    Yang bangun dalam rumah-Mu, baharu hidupnya.

    5. Penganjur yang kudus, Kaupimpin anak-Mu
    di jalan duka, dosa, maut, kepada rumah-Mu!
    """.trimIndent(),

"111. Tinggal Sertaku, Kawanku Kudus"

to """

1=Es 2/2

1. Tinggal sertaku, Kawanku kudus;
t'lah hampir malam, jangan jalan t'rus.
Tiada tolongan, hanya pada-Mu.
Silahkan Tuhan, tinggal sertaku.

2. Hariku surut, s'perti air di laut.
Hormat dan nama hilang dalam maut.
Berubah dan fana alam debu.
Yang tak berubah, tinggal sertaku.

3. Engkau perlu padaku tiap jam.
Siapa menolong di pencobaan,
melainkan Tuhan dan Pemimpinku?
Ya, siang malam, tinggal sertaku.

4. Tak ada musuh yang menakutkan.
Tak air mata yang berpahitan.
Sengatmu, maut, dan kemenanganmu,
t'lah hilang, kar'na Tuhan sertaku.

5. Beri salib, ketika matiku,
bersinar dan menunjuk sorga-Mu.
Menyingsing fajar, bayang maut lenyap
ya Tuhan, tinggal sertaku tetap.
  """.trimIndent(),

    "112. Tempat Berhenti"

    to """

    1=G 3/4

    1. Tempat berhenti, tempat sejahtera
    orang mukaddas sehabis p'rang besar,
    sampai terdengar bunyi nafiri
    dan bangkit ia ke s'lamat yang kekal.

    2. Tuhan, 'Ngkau juga sudah dikuburkan
    set'lah Kautanggung sengsara di salib,
    tapi tak lama hari ketiga
    'Ngkau bangkit pula dan hidup dalam t'rang.

    3. Jikalau nanti di tempat ini pun
    kami berhenti sehabis p'rang besar,
    Tuhan Mukhalis, Kaupanggil kami
    dan bangkit kami ke s'lamat yang kekal.
    """.trimIndent(),

"113. Dari Tempat Perhentianmu"

to """

1=Bes 3/4

1. Dari tempat perhentian-Mu
Kau bangkit tubuhku
dan hidup pula kekal
di dalam sorga.
Haleluya, haleluya.

2. Sungguh, tubuhku ditaburkan,
menjadi tanaman,
yang k'lak di sorga
berbunga dan berbuah.
Haleluya, haleluya.

3. Hari, syukur dan kesukaan,
segala pujian
bagi-Mu Tuhan.
'Ku tahu Kauberikan
'ku bangkitlah, 'ku bangkitlah!
  """.trimIndent(),

    "114. Besarlah Khalik Dunia"

    to """

    1=C 2/4

    1. Besarlah Khalik dunia, yang arasynya di atas alam.
    Dipuji oleh makhluk-Nya kuasa Tuhan siangmalam.
    Besarlah Tuhan yang Kudus.

    2. T'rang matahari cemerlang memuliakan nama Tuhan
    dan langit malam pun cerlang dengan t'rang bintang beribuan.
    Besarlah Tuhan yang Kudus.

    3. Segala bunga terkembang dan padi yang terbit di ladang
    memuji Dia dalam t'rang yang menghidupkan warna padang.
    Besarlah Tuhan yang Kudus.

    4. Suara Tuhan bergema dengan gemuruh dalam awan.
    Dicurahkan-Nya hujan-Nya, anug'rah Allah setiawan.
    Besarlah Tuhan yang Kudus.

    5. Ya Tuhan Allahku besar, ya Bapa kami yang di sorga,
    kiranya sudi mendengar suara aku ini juga
    Besarlah Tuhan yang Kudus.
    """.trimIndent(),

"115. Ya Khalik Dunia"

to """

1=G 3/4

1. Ya Khalik dunia, firman-Mu yang telah
memanggil t'rang.
Jemaat-Mu berseru: b'ri dunia penuh
dengan cahaya-Mu; t'rang-Mu menang!

2. Tak buta yang telah Kaubuka matanya,
rohnya terang.
Bumi pun mengeluh, buta kena semu;
b'ri matanya sembuh; t'rang-Mu menang!

3. Dalam terang cerah Kasih-Mu yang baka,
hati senang.
Bapa, berfirmanlah di atas dunia,
di malam dosanya: "jadilah t'rang!"
  """.trimIndent(),

    "116. Setia Hu, Tak Gagal Niat-Nya"

    to """

    1=D

    1. Setia Hu, tak gagal niat-Nya.
    Yang t'lah dipilih-Nya dipanggil juga.
    Semuanya tetap dilihat-Nya
    dan janji-Nya disampaikan semua.
    Tentu kelak yang t'lah dimulai-Nya,
    sempurnalah.

    2. Perintah-Nya dan maksud-Nya tentu,
    segala masa dikemudikan-Nya.
    Dan tangan-Nya yang kuat dan teguh,
    'megang pedang rohani selamanya
    dan napas bibir-Nya mengalahkan
    perlawanan.

    3. Roh'ulkudus hendak menyatakan
    kepada jemaat Tuhan rah'sia s'lamat.
    Dan hikmat-Nya menunjuk tujuan
    serta menyokong dia sampai tamat.
    Seluruh bumi oleh giat-Nya
    k'lak menyerah.
    """.trimIndent(),

"117. Di Gunung dan di Lembah"

to """

1=C

1. Di gunung dan di lembah, ke mana jalanku,
di padang dan di rimba hadirlah Tuhanku.
Di atas dalam sorga, pun dalam dunia,
di manamana juga Tuhanku adalah.

2. Tetaplah mata Bapa menilik dunia.
Terlindung barangsiapa yang harap kasih-Nya.
Segala sesuatu tetap dijagai-Nya.
Tak diberi-Nya batu yang minta nafakah.

3. Meskipun ketinggalan saudara dan teman,
yang tinggal itu Tuhan, tetap setiawan.
Jika 'ku putus asa dan hatiku lemah,
syukur, yang Mahakuasa, Tuhanku adalah.
  """.trimIndent(),

    "118. Selalu Hu, Gembalaku"

    to """

    1=Bes 3/4

    1. Selalu Hu, Gembalaku, b'ri hatiku senang
    di padang hijau di tepi telaga air tenang.

    2. Dib'ri-Nya jiwaku segar dan kar'na nama-Nya,
    ditunjukkan-Nya jalanku yang lurus dan baka.

    3. Tak usah takut hatiku di lembah maut gelap;
    kudengar saja tongkat-Nya, penghiburan tetap.

    4. Kaupanggil ke perjamuan; sedia mejaku;
    kepalaku Kauurapi dan cawanku penuh.

    5. 'Ku disertai rahmat-Nya seumur hidupku
    dan tempat diamku kekal di rumah Tuhan Hu.
    """.trimIndent(),

"119. Jemaat Memuji Tuhannya"

to """

1=A 4/4

1. Jemaat memuji Tuhannya mengingatkan karunia
dengan syukur dan suka hati.
Anug'rah Tuhan memberkati jemaat yang didirikan-Nya.

2. Benua bumi segenap mencari rahasia gelap
di alam maut dan sangka salah.
Tetapi oleh kasih Allah, t'rang bintang siang gemerlap.

3. Ternyata kesungguhan-Nya di dalam Anak yang telah
hendak menjadi Jurus'lamat
dan Roh memimpin dengan hikmat, jemaat-Nya di dunia.

4. Yang lari jauh dipulangkan, dan musuh diperdamaikan.
Tak ada kaum yang dilupakan.
Di sini pun dikaruniakan sejaht'ra dan kehidupan.

5. Dibangunkan di dunia, beralaskan anugerah
berdirilah, Gereja Tuhan.
Dan kasih dengan kesungguhan mengisi pekerjaannya.

6. Jemaat itu tentara, yang suka ikut Rajanya,
Setia dalam percobaan.
Memuliakan nama Tuhan, serta melawan musuh-Nya

7. Syukur dan puji bagi-Mu, yang perjanjian-Mu teguh!
B'ri kami yang terpelihara
memb'ri kepada kaum saudara, berkat dan s'lamat firman-mu.
  """.trimIndent(),

    "120. Betapa Indah Bumi Ini"

    to """

    1=D 4/4

    1. Betapa indah bumi ini, yang Kaujadikan, Tuhanku.
    Terhamburhamburlah disini sekalian mujizat-Mu.
    Sejauh 'ku turun atau naik kulihat tangan-Mu yang baik.

    2. Manusia, mengapa kamu melalaikan anugerah
    yang diserahkan kepadamu, tetap 'kau merusakkannya?
    Tempat seelok tak dib'ri, 'kan jadi medan p'rang benci.

    3. B'ri kami, anak-Mu, ya Tuhan, menjadi t'rang di dunia,
    mewujudkan persekutuan yang menyiarkan sinarnya.
    Supaya dunia penuh selamat-Mu dan kasih-Mu
    """.trimIndent(),

        "121. Selamat Tanah, yang dilindung Tuhan Hu"

    to """

    1=G 4/4

    1. Selamat tanah, yang dilindung Tuhan Hu,
    meski ditimpa p'rang; sokongan-Nya tentu.
    Baik musuh t'lah menggah 'kan kemenangannya
    seg'ra, seg'ra, seg'ra, k'lak datang jatuhnya.

    2. Gembala Israel tak tidur, tak lelah.
    Syukur, Immanuel, Hu serta umat-Nya.
    Yang mau merusakkan hak dan keadilan,
    Tentu, tentu, tentu, kelak dihapuskan.

    3. Syukur, ya Tuhan Hu, yang dalam t'rang baka.
    Kuasa tangan-mu memb'ri sejahtera.
    T'lah dari purba, Hu, ajaib mujizat-mu.
    Kekal, kekal, kekal, perintah-Mu teguh.
    """.trimIndent(),

"122. Tuhan yang Rumah-Mu Sorga Terang"

to """

1=G 3/4

1. Tuhan yang rumah-Mu sorga terang.
yang pada tangan-Mu damai dan p'rang.
Mahkluk semua dibumi Kau jadikan.
Lautan gelora pun dapat Kau teduhkan.
Kepada-Mu, ya Tuhan hu, sembahyang kami naik,
berikanlah selamanya tolongan-Mu yang baik.

2. Meski sekarang pun jalan-mu gaib,
dan perbuatan-mu sangat ajaib,
b'ri orang saleh-mu tahan dan percaya
dalam sengsara dan siksa dan bahaya.
Ya Tuhan Hu, b'ri cah'ya-Mu mengoyak awan g'lap.
Dirikanlah di dunia sejahtera tetap.
  """.trimIndent(),

    "123. Hai, Bertepuk Tangan dan Tari"

    to """

    1=C 4/4

    1. Hai, bertepuk tangan dan tari,
    bunyikan suling dan gendang!
    Nyanyi syukur, rayakan hari,
    kamu bersuka dan senang!
    Pujilah Hu, Penolongmu,
    yang t'lah melalukan
    tindisan dan beban.

    2. Di Israel Itu biasa;
    turutlah juga bertelut
    di 'dapan-Nya yang berkuasa,
    bawalah hormat bersujud.
    Nyanyikan gah kepada-Nya
    yang firman-Nya benar
    dan kasih-Nya besar!

    3. Dulu telah Tuhan lepaskan
    kaum-Nya yang dalam susah p'rang.
    Mega mendung dan kegelapan
    diganti-Nya cuaca t'rang.
    pula di sini Tuhan b'ri
    selamat-Mu besar,
    sentosa dan gemar!
    """.trimIndent(),

"124. Ya Allah Abad dan Zaman"

to """

1=C 4/4

1. Ya Allah abad dan zaman,
baik dalam t'rang dan g'lap,
'Kau bagi kami s'kalian
perlindungan tetap.

2. Di dalam naung arasy-Mu
tempat keamanan.
Dan barangsiapa mengeluh
mendapat tolongan.

3. Seb'lum menjadi dunia,
dipanggil firman-Mu,
Engkau, ya Allah, adalah
kekal kuasa-Mu.

4. Kau pandang abad yang lenyap
dan zaman yang lepas,
sebagai bayang awan yang
ditiup angin d'ras.

5. Manusia dihanyutkan
di arus dunia,
dan segera dilupakan
sebagai mimpinya.

6. Ya Allah abad dan zaman,
b'ri t'rang-Mu dalam g'lap.
B'ri kami pun sekalian,
perlindungan tetap.
  """.trimIndent(),

    "125. Makin Tambah Murka Laut"

    to """

    1=Es 4/4

    1. Makin tambah murka laut, langit g'lap gulita.
    Angin sakal, darat jauh. Siapa tolong kita?
    Satulah yang mendengar: Tuhan kita yang jabar.
    Sayangilah, ya Tuhan, dalatanglah.

    2. Bintang-bintang hilanglah, jadi g'lap belaka.
    Pertolongan manakah, kalau p'rahu celaka?
    Harap jangan gemetar, satulah yang mendengar.
    Sayangilah, ya Tuhan, datanglah.

    3. Pasang layar, majulah dengan sukacita.
    Tuhan ada, kuasa-Nya melepaskan kita.
    Pujilah yang mendenganr, puji Tuhan yang jabar.
    Angin reda, menurut firman-Nya.
    """.trimIndent(),

"126. Hatiku, Teduhkan Diri"

to """

1=F 4/4

1. Hatiku, teduhkan diri,
Tuhan tahu maksud-Nya;
Ia Raja seg'nap alam,
Pemerintah dunia.

2. Atas firman-Nya berubah
isi bumi yang fana
tapi Tuhanmu sendiri
tiada perubahan-Nya

3. Orang ingin hal yang baru,
lalu pula menyesal,
merindukan perubahan,
tak tercapai yang kekal.

4. Hatiku teduhkan diri!
Kasih Tuhanmu teguh;
sabda-Nya: Anugerah-ku
cukup juga bagimu.
  """.trimIndent(),

    "127. Benar dan Baik Semuanya"

    to """

    1=F 2/2

    1. Benar dan baik semuanya yang diperbuat Allah.
    Dibimbing oleh tangan-Nya 'ku tak berjalan salah.
    Di sisi-Nya selamanya 'ku aman dan selamat,
    dipimpin dengan hikmat.

    2. Kut'rimalah semuanya yang diperbuat Allah.
    Di jalan kebenaran-Nya kuikutlah Gembala.
    Kekuatan, pertolongan, dib'ri-Nya senantiasa;
    lengan-Nya berkuasa.

    3. Pengasihan semuanya yang diperbuat Allah.
    Di jalan kebenaran-Nya kuikutlah Gembala.
    Kekuatan, pertolongan, dib'ri-Nya senantiasa;
    lengan-Nya berkuasa.

    4. Pengasihan semuanya yang diperbuat Allah.
    Didengar-Nya keluh-kesah, setia sedekala.
    Kuatirku di hatiku tak tersembunyi jua,
    ditilik-Nya semua.

    5. Benar kekal semuanya yang diperbuat Allah.
    Selalu baik akibatnya, pun yang kutimbang salah.
    Kudengarlah panggila-Nya dan dengan tak bersungut
    kehenda-Nya kuturut.
    """.trimIndent(),

"128. Biarkan Tuhan Menyenggara"

to """

1=Bes 3/4

1. Biarkan Tuhan menyenggara dan melindungi hidupmu,
ketika tiba garagara, bahaya hendak menempuh.
Ajaiblah pertolongan-Nya yang diberi-Nya segera.

2. Percaya Tuhan dengan hormat dan dengan hati berserah.
Di jalan-Nya engkau selamat, kudus dan baik kehendak-nya.
Hendak diangkat-Nya beban, segala kekuatiran.

3. Ke muka dengan suka hati dan tanggunglah kewajiban!
Akhirnya engkau diberkati melewat yang kau doakan.
Tentulah Bapamu baka, tak meninggalkan anak-Nya.
  """.trimIndent(),

    "129. Karunia Baik Semua"

    to """

    1=Es 2/2

    1. Karunia baik semua dan seg'nap hidupku
    pemb'rian Tuhan jua dan berkat tangan-Mu.
    Setia-Mu, ya Bapa, menjagai langkahku.
    Tak tersebut berapa besar anug'rah-Mu.

    2. Beri di dalam hamba terpasang kasih-Mu.
    sedang bertambah-tambah setia hatiku.
    Kiranya kugemari segala harta-Mu
    dan janganlah kucari kekayaan semu.

    3. Murah-Mu kuhormati seumur hidupku
    dan kuserahkan hati tetap kepada-Mu.
    'Ku takkan kekurangan di jalan Bapaku.
    Sempurna kesenangan di kerajaan-Mu.
    """.trimIndent(),

"130. Kepada Tuhan jua"

to """

1=Es 2/2

1. Kepada Tuhan jua serahkan jalanmu,
kuatirmu semua dan pokok mengeluh.
Pengurus jalan zaman dan arah dunia
b'ri juga jalan aman kepada anak-Nya.

2. Bersandar pada Tuhan, berdoa beriman;
tiada pengeluhan memb'ri pertolongan.
Tentu pernah kaulihat ajaib mujizat-Nya,
yang menyatakan hikmat dengan anugerah.

3. Nasibku, Allah Bapa, dipimpin kasih-Mu.
'Ku tidak tahu apa yang jadi untungku.
Dan maksud yang sedia tentu Kausampaikan;
tak mungkin sia-sia yang t'lah Kaurancangkan.

4. Meski kuasa jahat semua menempuh,
neraka tidak kuat melawan maksud-Mu.
Kemuliaan Tuhan sekali nanti t'rang;
tentulah kesungguhan dan kasih-Mu menang.

5. Kepada-Ny serahkan beban pengurusan.
oleh-Nya dikerjakan, engkau keheranan.
Yang kini menyebabkan 'ngkau mengeluh-ngesah,
kelak diselesaikan oleh kuasa-Nya.

6. Buangkanlah gelisah, cemasmu dan keluh;
tentulah 'ngkau tak bisa mengurus jalanmu.
Engkaukah dipertuan dan tahu semuanya?
Yang Mahakuasa Tuhan, yang hikmat-Nya baka.

7. Tentulah kadang-kadang tak tampak tangan-Nya
dan rupanya teradang terang anugerah,
seolah-olah Tuhan melupakan engkau,
tak mendengar seruan dan kasihan-Nya jauh.

8. Imanmu harus tahan di tengah malam pun
dan sampai kesudahan 'ngkau harus bertekun.
Dib'ri-Nya 'ngkau melihat: tak usah 'ngkau cemas,
beban berat diangkat dan engkau terlepas.

9. Jikalau 'ngkau setia dengan iman teguh,
pahalamu sedia di tangan Tuhanmu.
Sesudah perjuangan dikaruniakan-Nya
mahkota kemenangan di rumah-Nya baka.

10. Dengarkanlah seruan dan b'ri kekuatan,
sertai kami, Tuhan, di saat kematian,
sehingga maut menjadi keuntungan baka,
gapura t'rang abadi terbuka pintunya.
  """.trimIndent(),

    "131. Pimpin Aku, Tuhan Hua"

    to """

    1=As 4/4

    1. Pimpin aku, Tuhan Hua, dalam gurun dunia
    Engkau kuat dan setia, bimbing aku yang lemah.
    Roti sorga, Roti sorga,
    jadilah makananku, jadilah makananku.

    2. Buka sumber air hidup, penyembuhan jiwaku,
    dan berjalanlah di muka dengan tiang awan-Mu.
    Ya Penganjur, ya Penganjur,
    jadilah perisaiku, jadilah perisaiku.

    3. Dan di dalam air yordan, angkatlah ketakutan.
    B'rilah aku dengan s'lamat masuk tanah Kanaan.
    Selamanya, selamanya,
    hormat-Mu kunyanyikan, hormat-Mu kunyanyikan.
    """.trimIndent(),

"132. Ya Tuhan, Murah-Mu Baka"

to """

1=F 3/4

1. Ya Tuhan, murah-Mu baka.
Di sorga dan di dunia
berlimpahlah anugerah
yang Kauberi.

2. Ya Tuhan, kami tidak laik.
Terimalah syukur yang naik,
kar'na karunia yang baik,
yang kauberi.

3. Kar'na segala tumbuhan,
dan berkat buah-buahan,
dan makanan dan minuman,
yang Kauberi.

4. Kar'na kesukaan kerja,
dan rumah dengan berkatnya,
bahagia sejahtera,
yang Kauberi.

5. Tidak terbalas kasihan,
yang memberi keampunan,
Anugerah kes'lamatan,
yang Kauberi.

6. Dan Anak-Mu sendirilah.
yang menebus manusia
dengan salib dan mati-Nya
yang Kauberi.

7. Terima hormat dan sembah,
terima hidup dan kerja
dengan sekalian benda,
yang Kauberi.
  """.trimIndent(),

    "133. Jiwa, Puji Raja Sorga"

    to """

    1=D 2/2

    1. Jiwa, puji Raja Sorga, bawa persembahanmu.
    Engkau ditebus-Nya juga, sampai hidupmu sembuh.
    Puji Raja! Puji Raja, Tuhan Juru s'lamatmu!

    2. Ia yang mendengar doa dari dalam tindihan.
    Di kesukaran semua diberi-Nya sokongan.
    Puji Raja! Puji Raja, yang memb'ri pertolongan.

    3. Seperti seorang bapa, yang tahu anaknya lemah,
    Ia juga tahu betapa kurang kuat anak-Nya.
    Puji Raja! Puji Raja, murah hati-Nya baka.

    4. Kami ini bunga saja, layu habis musimnya,
    tapi keadaan Raja tak berubah, tak lemah.
    Puji Raja! Puji Raja, yang kekal kuasa-Nya.

    5. Tentara malaikat, mari, turut kami menyembah!
    Bintang, bulan, matahari, makhluk-Nya semuanya
    Puji Raja! Puji Raja, kini dan selamanya!
    """.trimIndent(),

"134. Tersembunyi Ujung Jalan"

to """

1=Bes 4/4

1. Tersembunyi ujung jalan, hampir atau masih jauh,
'ku dibimbing tangan Tuhan ke ne'gri yang tak kutahu
Bapa, ajar aku ikut, apa juga maksud-Mu,
tak bersangsi atau takut, beriman tetap teguh.

2. Meski langkah-Mu semua tersembunyi bagiku,
hatiku menurut jua dan memuji kasih-Mu.
Meski kini tak 'ku tampak, nanti 'ku berba'gia,
apabila t'rang-Mu tampak dengan kemuliaannya.

3. Tuhan, janganlah biarkan kutentukan nasibku.
B'rilah hanya kudengarkan keputusan hikmat-Mu.
Aku ini pun selaku kanak-kanak yang bebal.
Bapa jua bimbing aku ke kehidupan kekal.

4. Dengan Bapa aku maju dalam malam yang kelam
ke neg'ri yang tak kutahu dengan mata terpejam.
  """.trimIndent(),

    "135. Ingat dalam Susah dan Bala"

    to """

    1=D 2/2

    1. Ingat dalam susah dan di bala:
    Jangan putus asa, Tuhan adalah!
    Jangan gentar, Allahmu besar,
    nanti, waktu siang, engkau bergemar.
    Topan sengsara nanti teduh,
    'ngkau dipelihara Pelindungmu.

    2. Tuhan ada lagi, percayalah!
    Tiap-tiap pagi nyata kasih-Nya.
    Meski sedih, hatimu pedih,
    pertolongan Tuhan yang tentu lebih!
    Apa yang jadi di dunia
    Bapaku abadi, 'Ngkau adalah!
    """.trimIndent(),

"136. Di 'Dapan Mata Yesus"

to """

1=Es 4/4

1. Di 'dapan mata Yesus kubuka kehidupanku
dan isi hati yang keruh. - Di 'dapan mata Yesus.

2. Di 'dapan mata Yesus 'ku datang, miskin dan penat,
menanggung utangku berat, - Di 'dapan mata Yesus.

3. Di 'dapan mata Yesus ternyata kesalahanku
dan hidupku peri semu. - Di 'dapan mata Yesus.

4. Di dalam mata Yesus, yang suci b'laka apinya,
kulihat cah'ya sayang-Nya. - Di dalam mata Yesus

5. Kepada mata Yesus, tengadah juga mataku
kelak, ketika matiku. - Kepada Mata Yesus.
  """.trimIndent(),

    "137. Sudah Kudapat Sayang Tuhan"

    to """

    1=F 4/4

    1. Sudah kudapat sayang Tuhan,
    meskipun banyak 'ku beraib.
    Melihat itu aku heran
    'kan kasih sayang yang ajaib.
    T'lah aku tahu karunia,
    serta memuji rahmat-Nya.

    2. Jikalau Allah hitung congkak
    dan kekerasan hatiku,
    tentu 'ku patutlah ditolak
    jauh dari Pohon Hidupku.
    Tetapi, lihat sayang -Nya:
    t'lah aku diterima-Nya!

    3. Jikalau orang lain bertanya:
    "Di mana pokok s'lamatmu?"
    Kujawab: "Sungguh, itu
    hanya belas kasihan Tuhanku."
    'Ku tunduk dengan tak menggah
    melainkan akan rahmat-Nya.

    4. Ya Tuhan, jangan ambil berkat
    karunia dari padaku,
    dan pimpin aku sampai tamat
    ke pintu rumah s'lamat-Mu.
    Di situlah suaraku,
    kekal memuji rahmat-Mu!
    """.trimIndent(),

"138. Memburu-buru, Berlelah"

to """

1=F 6/4

1. Memburuburu, berlelah kutuntut hidup suci,
tetapi kesalahannya tak dapat aku cuci.
Kucoba dengan giatku membuat kebenaran.
Wahai, segala dosaku menjadi penegahan.

2. Sesatlah aku di semu yang kupercayai jua.
'Ku harap kebajikanku; pendustaan semua!
'Ku kasih akan diriku dan tipu yang gemilang,
sehingga buta mataku. Sekarang 'ku terhilang.

3. Ya Tuhan Yesus, sayanglah, dengarkanlah seruan.
B'ri ampun dan anugerah, lepaskan aku, Tuhan!
B'ri dengan mata yang jernih kulihat kehendak-Mu,
dan pengajaran Roh memb'ri, kujalani jejak-Mu
  """.trimIndent(),

    "139. Ya Allahku, Cahaya-Mu Terang Kudus Belaka"

    to """

    1=Es 4/4

    1. Ya Allahku, cahaya-Mu terang kudus belaka,
    dan kamilah manusia berdosa bercelaka.

    2. Cahaya-Nya, terang cerah, b'ri bintang suram jua
    dan apakah manusia di had'rat Tuhan Hua?

    3. Kemanakah manusia mencari s'lamat juga?
    Kepada-Mu, kar'na Anak-Mu membuka jalan sorga.

    4. Ya amin, ya di Golgota ternyata pengasihan,
    di sanalah anugerah menjamin keampunan.

    5. Ya Penebus, b'ri Roh Kudus mengganti roh yang mati
    iman teguh dan kasihku bertambah dalam hati.
    """.trimIndent(),

"140. Sekarang Hati Tercengang"

to """

1=G 3/4

1. Sekarang hati tercengang, sebab melihat kasih-Mu,
yang dari g'lap kepada t'rang menarik kehidupanku.
'Kumulai bagaimanakah mengabarkan anugerah?

2. Dan bagaimana, Bapaku, 'ku dapat memberitakan
genap-genap kebaikan-Mu, bahagia keampunan?
Pelawan jadi anak-Mu, Roh Tuhan Masuk hatiku.

3. Saudara yang di dunia sesat dan mengembara jauh,
kembali! Lihat tangan-Nya yang hendak memeluk engkau,
supaya yang najis-cemar, menjadi anak-Nya benar.
  """.trimIndent(),

    "141. Tertumpah Darah Penebus"

    to """

    1=D 3/4

    1. Tertumpah darah Penebus, pun gagi aku inikah,
    yang menghinakan Yang Kudus dan menyebabkan susah-Nya?
    Ajaib benar, ya Tuhanku 'Ngkau mati untuk seteru.

    2. Segala tanda sayang-Mu mujizat dan rahasia,
    terlalu dalam bagiku, malaikat tak menduganya.
    Anugerah semuanya, anugerah-Mu kusembah.

    3. Rohku, berdosa dan lemah, berbaring dan terbelenggu.
    Termasuk t'rang-Mu yang cerah, bercah'yalah penjaraku.
    'Ku terlepas dan bangki t'rus; kuikut Engkau, Penebus.

    4. Besarlah rah'sia sayang-Mu, tak aku takut hukuman.
    'Ngkau, Tuhan, kebenaranku, yang memberi kehidupan,
    dan nati oleh kasih-Mu bersinarlah mahkotaku
    """.trimIndent(),

"142. Ya Yesus Tolonglah"

to """

1=D 4/4

1. Ya Yesus, tolonglah, hapuskan dosaku
dan dari nafsu dunia lepaskan hamba-Mu.

2. Ya Yesus, dengarlah seruan hatiku:
Lengkapkan aku yang lemah, sebagai laskar-Mu.

3. Ya Yesus yang menang, sertai hamba-Mu:
B'ri di sengsara dan perang, percayaku teguh.

4. Ya Yesus, pimpinlah, tetaplah 'Ngkau dekat,
di jalan ke neg'ri baka, b'ri jangan 'ku sesat.

5. Ya Yesus, lihatlah serangan seteru,
Kaulawanlah senjatanya dengan kuasa-Mu.

6. Ya Yesus Penebus, b'ri pada akhirnya,
'kudapat dineg'ri kudus, kesukaan baka.
  """.trimIndent(),

    "143. Ya Nama Yesus"

    to """

    1=Es 4/4

    1. Ya nama Yesus, manis-Mu memb'ri penghiburan
    kepada orang yang lelah dan yang kesakitan.

    2. Jikalau hatiku pecah, dib'rinya 'ku sembuh,
    bunyinya jadi makanan dan kuat hidupku.

    3. Ya nama Yesus, batuku, tempat kudirikan
    sebuah kota yang teguh, tempat perlindungan.

    4. Nabi dan raja dan imam, gembala nama-Mu,
    'Ngkau jalan dan kesungguhan dan hidup bagiku.

    5. Di sini kurang dan lemah segala kataku.
    Sempurna saja pujian k'lak di hadapan-Mu.

    6. Dan pada waktu matiku, diamkan dunia,
    dan bunyi nama-Mu merdu b'ri penghiburannya.
    """.trimIndent(),

"144. Segala Benua dan Langit Penuh"

to """

1=Es 2/2

1. Segala benua dan langit penuh
dengan bunyi nama yang sangat merdu,
penghiburan orang berhati penat,
pengharapan orang yang sudah sesat.
Nama itu, suci kudus.
Siapa belum mengenal Penebus?

2. Sesungguhnya Yesus yang layak benar,
dib'ri nama itu, kudus dan besar.
Yang oleh sengsara kematian-Nya
memb'ri keampunan dan damai baka.
Nama itu, suci kudus.
Siapa belum mengenal Penebus?

3. Sekalian bangsa sekali hendak
berlutut di hadapan Yesus kelak,
dan kita kiranya menyanyi serta
malaikat di sorga pujian sembah:
"Yesus, Yesus, Tuhan Kudus,
dipuji kekal nama-Mu, Penebus!"
  """.trimIndent(),

    "145. Sertai Kami, Tuhan"

    to """

    1=Es 2/2
    VERSI 1

    1. Sertai kami, Tuhan, dengan anug'rah-Mu
    berilah pertolongan melawan si set'ru.

    2. B'ri sabda-Mu kerjakan, ya Yesus Penebus,
    sekalian gerakan kehidupan kudus.

    3. Terangi kami, Tuhan, dengan cahaya-Mu
    di jalan kesungguhan ke kota-Mu teguh.

    4. B'ri murah-Mu yang kaya dan berkat-Mu besar
    menguatkan percaya dan kasih yang benar.

    5. Ya Raja dan Pahlawan, kiranya basmilah
    kuasa si pelawan yang jahat maksudnya.

    6. Sertai kami, Tuhan; setia-Mu tetap
    di jalan kehidupan dan dalam maut gelap.
    """.trimIndent(),

"146. Dengan Malaikan, Marilah"

to """

1=G 4/4

1. Dengan malaikat, marilah, bernyanyinyanyi
an, bernyanyinyanyian! berlaksa
saksa lidahnya dan satu pujian,
dan satu pujian, dan satu pujian.

2. "Terpuji Anak Domba, yang berlayak diberi (...2x)
sembah sebagai Yang Menang, sebab tersembelih." (...3x)

3. "Kuasa dan kekayaan dib'ri kepada-Nya (...2x)
dan hikmat, hormat, pujian, selama-lamanya!"(...3x)
  """.trimIndent(),

    "147. Kuasamu, Ya Pengasihan"

    to """

    1=C 3/4

    1. Kuasa-Mu, ya Pengasihan di dalam Yesus kusembah.
    Anugerah-Mu pemberian yang tidak ada taranya.
    'Kubuang sangsiku semua dan menyelam di laut-Mu jua.

    2. Telah Kaucari akan daku dan kurindukan kasih-Mu
    Ya Tuhan Yesus, b'rilah aku di dalam kasih-Mu teduh.
    Terpilih dari dalam dunia, aku menjadi Tuhan punya.

    3. Oleh-Mu aku disegarkan, oleh-Mu jiwaku kenyang.
    Hal lain tak boleh kugemarkan, yang hanya rupanya senang.
    Kupersembahkan kerinduan dan citaku kepada Tuhan.
    """.trimIndent(),

"148. Kehendak Tuhan Jadilah"

to """

1=D 4/4

1. Kehendak Tuhan jadilah,
kehendak Tuhan saja.
Setialah ditolong-Nya,
yang sabar dan percaya.
Meski dihukum Tuhanku
'kurasa kasihan-Nya.
Yang harapnya tetap teguh
tidak ditinggalkan-Nya.

2. Penghibur, Perlindunganku,
Penolong setiawan,
ke mana juga jalan-Mu,
'ku tak hendak melawan.
Selalu sayang-Mu besar,
kasih-Mu tak terduga
dan bahwa sabda-Mu benar
tetap terbukti juga.

3. Kuminta ini, Tuhanku:
di waktu kesusahan,
ketika musuh menyerbu,
b'ri hatiku bertahan.
Tak usah hati berdebar
jik'Engkaulah menjamin
k'lak kemenangan yang besar.
Percayal'a-ku. Amin
  """.trimIndent(),

    "149. Ke Muka, Anak-Anak"

    to """

    1=G 4/4

    1. Ke muka, anakanak, t'lah hampir malam g'lap,
    tak baik berhenti banyak di gurun yang senyap.
    Tetapkan hatimu dan angkat tongkat juga,
    berjalanlah ke sorga dengan iman teguh.

    2. Penganjurmu setia dan kasih-Nya kekal,
    di jalan turut Dia seorang tak sesal.
    Berjalanlah terus, arahkan mata saja
    menuju kota Raja, Yerusalem baka!

    3. Meskipun jalan payah dan durinya lebat
    dan jurang berbahaya, salib menindih b'rat,
    di jalan yang sesak baik turut sedekala
    jejak-jejak Gembala di rimba dan semak.

    4. Sepakatlah, saudara! Tetap tengadahlah!
    Selisih dan perkara roh jahat asalnya.
    Bersukacitalah; dengan peri rohani
    merdeka dan berani, peganglah yang baka.

    5. Sedikit lagi kita menahan beriman,
    menahan menderita kesukaran beban.
    Di negeri baka tak ada lagi dosa
    dan kita pun sentosa kelak di rumah-Nya.
    """.trimIndent(),

"150. Kendati Tersembunyi Jalanku"

to """

1=Es 4/4

1. Kendati tersembunyi jalanku,
'Ngkau tahu juga jalan yang tentu.
Kuatirku tak ada gunanya;
tetaplah hati bersejahtera.

2. 'Ngkau tahu jalanku dan waktuku,
sedia dan sempurna niat-Mu.
Di jalan-Mu tak boleh 'ku sesal.
Kupuji akan kasih-Mu kekal.

3. Engkaulah tahu ke mana angin k'ras.
K'lak atas p'rintah-Mu 'ku terlepas.
Dan sabda-Mu tak ada tipunya.
'Ngkau tahu jalan, itu cukuplah.
  """.trimIndent(),

    "151. Jikalau Kutahu Kristus Dekat"

    to """

    1=As 3/4

    1. Jikalau kutahu Kristus dekat,
    Pendengar seruan orang sesat,
    di waktu sengsara dan hati lemah,
    tentu diberi-Nya pertolongan-Nya.

    2. Kesukaan hilang, duka pedih,
    air mata berlinang, hati sedih.
    Jikalau kaucari pengasihan-Nya,
    tentu Jurus'lamat menghibur seg'ra.

    3. Mengapa bersungut kalau sesat;
    percayalah jua Tuhan dekat.
    Setialah Ia dan murah benar,
    selalu sedia anug'rah besar.
    """.trimIndent(),

"152. Dalam Malam Kedukaan"

to """

1=G 4/4

1. Dalam malam kedukaan musafir berjalan t'rus,
sambil bernyanyinyanyian berpengharapan kudus.
Di perjalanan sengsara sorga memberi terang
dan mereka bersaudara, bersehati dalam p'rang.

2. Satulah segala orang, dalam doa dan sembah:
Bagi Tuhan Yesus Kristus, Raja dan Pemimpinnya.
Satu maksud perjalanan, satu tujuan iman,
satu jua pengharapan, yang memb'ri kekuatan.

3. Satu dalam penyerbuan, satu di pertahanan,
satu doa perjuangan , satu juga pujian.
Dan mereka tahu di muka: satulah bahagia,
satu perhentian akhir dalam negeri baka.

4. Kar'na itu, hai saudara, majulah kepada t'rang.
Oleh Yesus dan salib-Nya, kamu tahan dan menang.
Hilang bayang-bayang malam, angin ribut pun teduh,
nanti kamu lihat fajar hari kebangkitanmu
  """.trimIndent(),

    "153. Ya Tuhan, Rajaku"

    to """

    1=D 4/4

    1. Ya Tuhan, Rajaku, Kaupanggil aku ini,
    menjadi hamba-Mu, bentara-Mu di sini.
    B'ri kuat dan sabar, b'ri hatiku teguh,
    dan aku bekerja menurut maksud-Mu.

    2. Kiranya Roh Kudus hendak mengajar aku:
    Yang patu kukerja betapa kehendak-Mu.
    B'ri dalam hidupku kasih-Mu nyatalah,
    dan nama-Mu besar, dimuliakanlah.
    """.trimIndent(),

"154.  Jikalau Jiwaku Berdoa"

to """

1=F 4/4

1. Jika jiwaku berdoa
kepada-Mu, Tuhanku,
ajarl'aku t'rima saja
pemberian tangan-Mu.
Dan mengaku s'perti Yesus
di depan sengsara-Nya:
"Jangan kehendakku Bapa,
kehendak-Mu jadilah."

2. Apa juga yang kautimbang
baik untuk hidupku,
b'rilah aku pun setuju
dengan maksud hikmat-Mu.
Dan mengerti dan percaya,
biar hatiku lemah:
"Jangan kehendakku, Bapa,
kehendak-Mu jadilah."

3. Aku cari penghiburan
hanya dalam kasih-Mu
Dalam susah Engkau saja
perlindungan hidupku.
'Ku mengaku, s'perti Yesus
di depan sengsara-Nya:
"Jangan kehendakku, Bapa,
kehendak-Mu jadilah."
  """.trimIndent(),

    "155. Suara Yesus Kudengar"

    to """

    1=Es 6/8

    1. Suara Yesus kudengar:
    "Hai, mari yang penat,
    kuangkat dari bahumu
    bebanmu yang berat."
    T'lah aku datang, yang lelah,
    penuh kedukaan.
    Dan kudapati pada-Nya
    tempat perhentian.

    2. Suara Yesus kudengar:
    "Kemari, minumlah,
    telah sedia air hayat;
    hai, minum, hiduplah."
    T'lah aku datang, amat haus
    kuminum air kudus,
    dan hati serta nyawaku
    sembuh, segar terus.

    3. Suara Yesus kudengar:
    "Ku ini T'rang baka.
    Tengadah! Awanmu lenyap
    dan fajar merekah."
    T'lah aku pandang, Tuhanku,
    cahaya sinar-Mu,
    dan jalanku tetap terang,
    sampai ke ajalku
    """.trimIndent(),

"156. Terang Penghibur dalam Malamku"

to """

1=As 3/2

1. Terang penghibur dalam malamku, Kau pimpinlah!
Gelaplah jalan, jauhlah rumahku; Kau pimpinlah!
Meskipun tujuannya rah'sia,
langkahku satusatu t'rang ilah!

2. Dahulu tak biasa doaku: Kau pimpinlah!
Kutolong diri, tapi kini Hu, Kau pimpinlah!
Tak b'rani lagi aku bermegah,
pelitaku sendiri padamlah.

3. Dengan kuasa dan anugerah, Kau pimpinlah!
Di jurang g'lap sehingga merkah terang baka.
'Ku tampak sobat dan kekasihku
menyambut aku dalam rumah-Mu!
  """.trimIndent(),

    "157. Batu Karang yang Teguh"

    to """

    1=Bes 6/4

    1. Batu karang yang teguh, Engkau perlindunganku.
    Engkau tidak tergerak, di gelora pun tegak.
    Tuhan Yesus, kuseru: "Tolong, tolong anak-Mu."

    2. Meski aku bekerja, tahan sampai berlelah.
    Tidak cukup kuatku, hanya oleh sayang-Mu.
    Oleh darah-Mu kudus, dapat aku ditebus.
    """.trimIndent(),

"158. Isilah, Tuhan, Hidupku"

to """

1=Es 4/4

1. Isilah, Tuhan, hidupku dengan anugerah,
agar didalam aku pun wujud-Mu nyatalah.

2. Janganlah hanya bibirku 'ngucapkan pujian.
Janganlah hanya hatiku tahu kesungguhan.

3. B'ri segenap kelakukan dan pekerjaanku,
pun yang biasa dan rendah memuji nama-Mu.

4. Curahkanlah karunia cahaya kasih-Mu,
agar diisi oleh-Nya seg'nap anggotaku.

5. Jika begitu, aku pun, anak-Mu yang lemah,
mempersembahkan pujian dengan sesungguhnya.

6. Jangan Kaubiarkan sejam aku di jalanku,
di luar lingkungan kudus persekutuan-Mu!
  """.trimIndent(),

    "159. Tuhan Yesus, Engkaulah"

    to """

    1=Es 2/2

    1. Tuhan Yesus, Engkaulah mengasihi jiwaku,
    dari topan dunia 'ku berlindung pada-Mu.
    Dari ombak laut besar, angin yang menakutkan,
    antar aku yang gentar masuk kepelabuhan.

    2. Manakah pertolongan, kalau tidak pada-Mu?
    Janganlah Kautinggalkan aku dalam takutku.
    Hanya hatiku teduh dan tetap dihiburkan.
    kalau naung tangan-Mu memberi perlindungan.

    3. Engkau satu-satunya yang perlu di hidupku;
    luka hati dibela hanya oleh sayang-Mu.
    nama-Mu kudus, benar; aku yang penuh cela,
    kesalahanku besar, tunjuklah anugerah!

    4. Kristus, sumber air hayat, sumber yang sejuk, bersih,
    b'rilah aku yang penat minum air-Mu jernih,
    agar kini hatiku dan selama-lamanya
    memperoleh kuat-Mu dan kehidupan baka.
    """.trimIndent(),

"160. Tuhan Ambil Hidupku"

to """

1=G 4/4

1. Tuhan ambil hidup-ku
Akan kurban bagi-Mu.
Jika tangan bekerja,
Kasih-Mu menggrakkannya

2. B'rilah mulutku menggah
Hanya dalam Tuhannya.
Suara bibir 'ndak penuh
B'rita kemurahan-Mu.

3. Ambil harta dan benda;
Jangan aku budaknya.
Pimpin akal budiku
Dengan Roh dan hikmat-Mu.

4. Jadikan kehendakku
Sama dengan maksud-Mu.
B'rilah jantung berdebar,
Oleh giat yang benar.

5. Kasihku pun milik-Mu,
Seantero diriku.
Kini dan selamanya:
Engkau, Tuhan, Rajanya.
  """.trimIndent(),

    "161. Ya Yesus, Kerajaan-Mu"

    to """

    1=G 4/4

    1. Ya Yesus, kerajaan-Mu di bumi tak berhingga.
    Kuasa-Mu kekal teguh, hal lain tak berharga.
    Kelak seisi dunia sujud dengan sembahyangnya
    di hadapan salib-Mu.

    2. Di atas bayi yang lembut dan orang yang dewasa:
    Suatu nama disebut, kudus dan berkuasa.
    Dan orang menanggung b'rat, berduka hati dan sesat,
    memanggil nama itu.
    """.trimIndent(),

"162. Ya Tuhanku, Kiranya Engkaulah"

to """

1=G 4/4

1. Ya Tuhanku, kiranya Engkaulah Pembimbingku.
Ke mana pun tujuan dunia, Pembimbingku.
'Ngkau kukenal, tak usah 'ku kejut, dan
tangan-Mu, setia dan lembut.

2. Ya Tuhanku, tetaplah Engkaulah Pembimbingku,
Di jalan-Mu ke negeri baka, Pembimbingku.
Di sisi-Mu perjalanan senang;
keg'lapan pun Kaujadikan terang.

3. Ya Tuhanku, 'ku ikut beriman, di jalan-Mu.
Pimpinan-Mu memb'ri kekuatan, kepadaku.
Tak 'ku sesat dan aman jiwaku
dan akhirnya 'ku masuk rumah-Mu.
  """.trimIndent(),

    "163. Hai, Janganlah Berjalan"

    to """

    1=Es 4/4

    1. Hai, janganlah berjalan seorang dirimu,
    caharilah bantuan yang kuatnya teguh.
    sebab berjalan salah 'kau meneluh ngesah.
    percayalah Gembala dan ikutlah.
    Percayalah Gembala dan ikutlah.

    2. Kaubuka pintu hati dan sambut Tuhanmu,
    tentu 'ngkau diobati dan jiwamu sembuh.
    Disapu-Nya air mata, hiburan-Nya tetap.
    Kasih-Nya jadi nyata di dalam g'lap.
    Kasih-Nya jadi nyata di dalam g'lap.

    3. Manusia semua yang sakit dan penat,
    cahari Yesus jua, beban-Nya tidak b'rat.
    Berjalan dengan Tuhan ke negeri baka,
    tujukan kerinduan kepada-Nya.
    tujukan kerinduan kepada-Nya.
    """.trimIndent(),

"164. Hai Bangun, yang Tidur, yang Mati, Sadar"

to """

1=D 3/4

1. Hai bangun, yang tidur yang mati, sadar! T'rang Kristus telah
bercahaya. Tak jauh lagi hari kiamat besar;
yang tidur diancam bahaya. Dengar suara Yesus
dan bangkit seg'ra, mengapa kau lalaikan panggilan-Nya.

2. Hai, bangunlah engkau yang tidur nyenyak, bangkitlah dalam cahaya!
Hendaklah lepas dari dosa dan syak dan hiduplah oleh percaya.
Dengar, jurus'lamat memanggil engkau!
Hai, jangan terlambat, bahaya tak jauh!

3. Bers'lamat-bahagialah yang telah berjalan di dalam cahaya.
T'rang Kristus menjadi kehidupannya dan malam pun tak berbahaya.
hai bangunlah juga dan bangkit seg'ra!
Terang yesus Kristus telah merekah!
  """.trimIndent(),

    "165. Yesus Memesan: Dalam Malam G'lap"

    to """

    1=G 4/4

    1. Yesus memesan: dalam malam g'lap
    hendak kita jadi lilin yang gerlap.
    Akan hormat Tuhan bercahayalah
    anak masing-masing di sudutnya.

    2. Yesus menegur: Aku tahu tetap,
    lilin mana t'rang dan mana yang gelap;
    kalau sudah suram atau t'rang cerah
    anak masing-masing di sudutnya.

    3. Yesus memesan: lihat g'lap benar
    bumi yang berdosa, susahnya besar,
    Jadi lilin bagus, bercahayalah
    anak masing-masing di sudutnya.
    """.trimIndent(),

"166. Sungguh Kerajaan Allah di Bumi Tak Kalah"

to """

1=G 3/4

1. Sungguh kerajaan Allah di bumi tak kalah.
Yesus yang bangkit dilantik menjadi Kepala.
Ia menang; g'lapmu menjadi terang:
lihatlah fajar menyala.

2. Sambil menyangkalkan diri tetaplah percaya.
jangan pengharapan hilang di p'rang dan bahaya.
Biar getar hatimu yang berdebar,
akhirnya kamu berjaya.

3. Akhirnya Yesus memulihkan orang terluka,
kaumnya lepas dari nista, sengsara dan duka.
Nantikanlah hari kedatangan-Nya:
langit gemilang terbuka!
  """.trimIndent(),

    "167. Di atas Satu Alas"

    to """

    1=D 4/4

    1. Di atas satu alas, yang kuat dan baka
    berdirilah Gereja di tengah dunia,
    yaitu Yesus Kristus, yang t'lah menjadikan
    jemaat dengan sabda dan air baptisan.

    2. T'lah turun Anak Allah, hendak dicari-Nya
    pengantin yang terpilih di dalam dunia,
    yaitulah Gereja, yang sudah ditebus
    dengan rega' tertinggi: Darah-Nya yang kudus.

    3. Terpilih dari bangsa seluruh dunia
    Gereja jadi satu di dalam Tuhannya.
    iman dan harap satu dan satu makanan,
    yaitu roti suci dan cawan minuman.

    4. Di tengah pencobaan dan perjuangannya
    dinantikannya siang zaman sejahtera,
    sehingga dalam mata gemilanglah terang
    khayal yang jadi sungguh: Gereja yang menang.

    5. Gereja yang berdoa di dalam dunia
    sekutu dengan Tuhan, ketiga yang Esa,
    dan dengan orang suci, jemaat yang t'lah menang.
    B'ri kami bangkit juga, ya Tuhan, dalam t'rang.
    """.trimIndent(),

"168. Teguhlah Tuhan, Kotaku"

to """

1=D 4/4

1. Teguhlah Tuhan, kotaku, pelindung dan senjata.
Ketika kita meneru, pertolongan-Nya nyata.
Set'ru sabda t'rang mengangkat perang, hendak menyerbu
beralatkan semu, kua sanya pun hebat.

2, Kuasa kita tak betah dan gampang kita kalah.
Pahlawan kita Dialah yang t'lah dipilih Allah.
Penganjur baka, yang Kristus nama-Nya
mengalahkan pendusta.

3. Meskipun dunia penuh iblis dan setan-setan,
melihat tent'ra seteru tak kita ketakutan.
Iblis menyerang dan harap menang,
tetapi telah tentu hukumannya
dan pasti ia jatuh

4. Tak boleh hapus firman-Nya yang sungguh dan setia:
Jemaat-Nya disertai-Nya dan Roh menyokong dia.
Baik harta-benda dan tubuh fana
kauambil, set'ru, tak ada untungmu.
Teguhlah kota Allah!
  """.trimIndent(),

    "169. Lindungkanlah, Luaskanlah, Ya Tuhan"

    to """

    1=Bes 2/2

    1. Lindungkanlah, luaskanlah, ya Tuhan, gereja-Mu di dunia
    supaya kesaksiannya menyinarkan di bumi: Kesungguhan
    dan kesembuhan.

    2. Anggotanya kiranya kaugerakkan, supaya sungguh doanya:
    jemaat Tuhan satulah dan pagar temboknya yang memisahkan
    'kan direbahkan.

    3. Ya Bapa kami, b'ri ketenteraman persatuan jemaat teguh
    dan sekalian anak-Mu terkumpul dalam rumah-Mu yang aman
    seumur zaman.
    """.trimIndent(),

"170. Sekali'kan Menang Karunia"

to """

1=F 4/4

1. Sekali 'kan menang karunia
kuasa setan 'kan lenyap.
Sekali habis p'rang di dunia,
sejahtera menjadi g'nap.
Dan bumi baru dan bersih
'kan muncul dalam t'rang jernih.

2. Bersuka! Bangsa sekalian
'kan satu dalam nama-Nya.
Dan langit bumi bernyayian,
bersukaria dan menggah:
"Salib sembuhkan dunia
dan yesus jadi Tuhannya!"
  """.trimIndent(),

    "171. Perang yang Akhir Inilah"

    to """

    1=F 4/4

    1. Perang yang akhir inilah, p'rang hidup atau mati.
    Meski pun roboh dunia, kau pertetapkan hati.
    Di atas kerobohannya Keristus mendirikanlah
    Kerajaan yang baru.

    2. Sedia! Damping datang-Nya, dengarkanlha nafiri!
    Keristus datang! Jagalah, bertahan dan berdiri!
    Berjuang, jangan menyerah, menang dan berbahagia,
    penjaga yang setia!
    """.trimIndent(),

"172. Tetap Merindu Kita"

to """

1=Es 4/4

1. Tetap merindu kita 'kan bintang fajar-Nya,
'kan subuh sukacita yang lambat datangnya.
K'lam kabut menudungi seluruh dunia
dan kita dilingkungi nestapa dan bala

2. Di atas penyeruan yang naik ke takhta-Nya
berbunyi suara Tuhan, begini Sabda-Nya:
"Ya, anak_Ku semua, teguhka harapmu
tetap percaya jua, tentulah datang-Ku."
  """.trimIndent(),

    "173. Keluar dari Kaum"

    to """

    1=G 4/4

    1. Keluar dari kaum
    dan rumah bapamu,
    serahkan dirimu
    kepada rahmat Hu.
    Percaya sabda-Nya.
    Berjalan dengan suka
    ke tanah air baka,
    yang tertentu di muka.

    2. Pergi dengan seg'ra
    ke lorong negeri
    dan ke simpangannya
    yang buruk dan kecil.
    B'ri rumah-Ku penuh.
    Jemput segala orang
    ke rumah s'lamat-Ku;
    tempatnya tidak kurang.

    3. Keluar! Ajarlah
    seluruh dunia.
    Hamburkan Injil-Ku
    di sawah-ladangnya!
    Mau t'rang, maupun gelap
    di rumah dan kerjamu,
    baik ingatlah tetap:
    'Ku menyertai kamu.
    """.trimIndent(),

"174. Hai, Waris Kerajaan"

to """

1=F 6/4

1. Hai, waris kerajaan bahagia baka,
seria kesukaan dengan sejahtera.
Perhimpunan kudus, beri di mana mana
dinyanyikan Hosana kepada Penebus!

2. Hai, hati yang berduka, dekatlah Rajamu.
Sekarang bunyi suka menggantikan keluh.
Sebarlah sabda-Nya yang dalam kegelapan
memasang pengharapan dengan terang cerah.

3. Tengadahlah, saudara, yang susahmu berat,
berhenti mengembara; selamatmu dekat.
Sengsara tindisan diangkut oleh Raja,
sekarang turut saja bersuka-sukaan.

4. Bersabar dan percaya setia dan teguh
Ratakan jalan raya dan sambut Rajamu.
Seluruh dunia kelak, di mana-mana
menyanyikan: "Hosana, memuji nama-Nya.
  """.trimIndent(),

    "175. T'rang Siang T'lah Dihanti Malam"

    to """

    1=G 3/4

    1. T'rang siang t'lah diganti malam,
    ya Tuhan, atas firman-Mu,
    dan kar'na berkat hari ini
    dib'ri syukur kepada-Mu.

    2. Sekarang orang seb'lah barat
    terbangun pula oleh t'rang
    serta menyanyi puji Tuhan
    melihat siang yang senang.

    3. Syukur, jemaat tetap berjaga.
    Baik dunia beredarlah,
    di mana-mana pun di bumi
    terkumpul juga anaknya!

    4. Bersama-sama dengan fajar
    beredarlah sembahyangnya
    dan tak berhenti umat Tuhan
    memuji nama Bapanya.

    5. Begitu arasy-Mu, ya Tuhan,
    berdirilah kekal, teguh,
    sehingga sekalian bangsa
    berlutut di hadapan-Mu.
    """.trimIndent(),

"176. Dunia dalam Rawa Paya"

to """

1=G 4/4

1. Dunia dalam rawa paya berjuang t'rus.
Kristen, manakah cahaya injil kudus?
B'ri di dalam g'lap gulita
bergemilang t'rang berita:
Satu saja Tuhan kita, yang penebus.

2. Bangunkan persekutuan sidang jemaat.
Serta kumpul kawan Tuhan yang tersesat.
Satu sabda berkuasa mempersatukan bahasa
sekalian kaum dan masa, jauh dan dekat.

3. Yang menunjuk ujung jalan: T'rang Al Kalam.
Yang memimpin pekerjaan: Raja Imam.
Jangan turut cita-cita dunia yang bergempita.
Satu saja Tuhan kita: Raja Salam.
  """.trimIndent(),

    "177. Walaupun Hujan Turun"

    to """

    1=Bes 4/4

    1. Walaupun hujan turun, dan topan timpa k'lak,
    tetapi Rumah Sion tiada tergerak.

    2. Manusia mengamang menghambat, menyesah,
    tetapi yang percaya tak terbinasalah.

    3. Yerusalem terlindung di pagar gunungnya;
    tak boleh musuh masuk dan mengalahkannya.

    4. Yaitu sidang Allah, jemaat-Nya yang kudus,
    kekal terpelihara di tangan Penebus.

    5. Hai, tahan di sengsara dan jangan taruh syak,
    dan tunggu Raja Yesus, yang sungguh data k'lak.
    """.trimIndent(),

"178. Kar'na Pahlawan, yang Setiawan"

to """

1=Es 2/2

1. Kar'na pahlawan, yang setiawan,
yang s'karang di tempat perhentian,
ucap syukur, jemaat sekalian.
Haleluya, haleluya!

2. Engkau, ya Tuhan, kubunya teguh;
menanglah ia oleh kuat-Mu.
Oleh iman selamatnya tentu.
Haleluya, haleluya!

3. B'ri kami ini gagah dalam p'rang,
seperti dulu laskar yang menang,
menurutkan teladan-Mu terang.
Haleluya, haleluya!

4. Alangkah suci persekutuan
mereka dengan kita s'kalian
Di dalam Tuhan satu kumpulan.
Haleluya, haleluya!

5. Meski perang bertambah hebatnya,
t'lah sayup-sayup kedengaranlah
bunyi nyanyian kemeangannya
Haleluya, haleluya!

6. Di atas awan barat, tengoklah,
t'lah kota mas membuka pintunya.
Sebentar kita masuk, tahanlah.
Haleluya, haleluya!

7. K'lak dimaklumkan jam sejahtera.
Tak tesebut kemuliaannya.
Berhimpun kita dalam t'rang baka.
Haleluya, haleluya!

8. Dan pada pesta Yesus Penebus;
segala laskar yang t'lah tahan t'rus
memuji Bapa, Anak, Roh Kudus.
Haleluya, haleluya!
  """.trimIndent(),

    "179. Ya Raja Damai, Tuhanku"

    to """

    1=A 4/4

    1. Ya Raja Damai, Tuhanku, 'Ngkau Allah yang benar,
    'Ngkau, dalam hidup dalam maut. Penolong yang besar,
    oleh-Mu kami berseru kepada Bapa kami.

    2. Beri sejaht'ra dan berkat, b'ri Roh-Mu bekerja,
    sehingga dunia yang sesat melihat jalannya.
    Ya Yesus, hanya nama-mu membuka jalan s'lamat.
    """.trimIndent(),

"180. Ya Hari Kudus, yang Dirindukan Amat"

to """

1=Es 2/2

1. Ya hari kudus, yang dirindukan amat,
ketika t'lah datang kerajaan Hu,
manusia yang kini terikat, tertambat,
dengar kata Yesus: "hai kaum milik-Ku."
Kejahatan mati dan maut sedah kalah,
telah Jurus'lamat menjadi Kepala.

2. 'Kan datang tentu subuh hari keg'napan.
'Kanpulang yang hilang, yang budak lepas.
Lembah yang rendah masih dalam keg'lapan,
di puncak bercah'yalah api dan mas.
Tak lama segala ikatan dibuka
dan tangan lembut 'kan memulihkan luga.

3. 'Kan datang tentu hari s'lamat dan suka.
Berwarna gemilang angkasa terang,
tempat pintu langit yang tinggi terbuka
dan datanglah Yesus menghabiskan p'rang.
Yang lama didoakan pasti menjadi:
Kerajaan damai, Sejaht'ra abadi.
  """.trimIndent(),

    "181. Setialah Kepada Tuhanku"

    to """

    1=Bes 4/4

    1. Setialah kepada Tuhanmu, hai kawan yang penat.
    Setialah, sokongan,-Nya tentu di dalam p'rang berat.
    Sebentar datang dengan jaya Penolong orang percaya.
    Setialah!

    2. Setialah kepada Penebus, percaya janji-Nya.
    Setialah, berjuanglah terus; t'lah fajar merekah.
    Diputuskan-Nya rantai setan: kau luput dari kesempitan.
    Setialah!

    3. Setialah, sehingga kau menang, kau bertekun tetap.
    Setialah; sebentar, habis p'rang, selamatmu genap.
    Walaupun tambah marabah'ya, t'lah gampir habis susah payah
    Setialah!

    4. Setialah kepada Yang Menang, kendati maut tentu.
    Setialah; sedia upah p'rang di tangan Tuhanmu.
    Mahkota alhayat dib'ri-Nya, kaupandanglah terang seri-Nya.
    Setialah!
    """.trimIndent(),

"182. Tuhan yang Hidup, Kami Engkau Punya"

to """

1=Es 2/2

1. Tuhan yang hidup, kami Engkau punya.
Bintang di malam, pengharapan dunia
tiliklah kaum-Mu, dengarkan keluhnya, Allah taala!

2. Lihat jemaat-Mu yang diamang ombak.
Musuhnya banyak yang melempar tombak.
Jaga supaya G'reja jangan rombak, Tuhan Penolong!

3. Tolonglah, Tuhan, kar'na oleh dosa
dari jemaat-Mu hilalah sentosa.
Kuasa Jasmani menyebabkan susah, Tuhan yang suci!

4. Sejaht'ra hati dalam pengharuan,
damai saudara dalam jemaat Tuhan
dan kesudahan zaman permusuhan,
b'rikanlah, Tuhan!

5. Bimbinglah kami dalam kebenaran.
B'rilah tenaga dalam kesukaran
dan, habis perjuangan, kegemaran, damai sempurna!
  """.trimIndent(),

    "183. Pasti Akan Digenapkan"

    to """

    1=D 2/2

    1. Pasti akan digenapkan, Tuhan Yesus, janji-Mu:
    kejahatan dilenyapkan, dilemahkan seteru.
    Meski kami masih tunggu dalam dunia gelap,
    pasti firman-Mu yang sungguh pada hari -Mu genap.
    """.trimIndent(),

"184. Satu Pintu Masuklah: Tuhan Yesus "

to """

1=G 2/4

1. Satu pintu masuklah: Tuhan Yesus!
Dan tempuhlah jalan-Nya: Jalan lurus.
Buang rantai dan beban, ikut Dia.
Angkat palangmu dengan sukaria.

2. Satu sabda bawalah: sabda Allah!
Cari kebenaran-Nya sedekala.
Kata dunia itulah tipu daya.
Roh Kudus terimalah dan percaya.

3. Hiduplah di dalam t'rang Kerajaan!
Oleh Yesus 'kau menang, asal tahan.
Ikut Tuhanmu terus dengan suka.
Lihat rumah-Nya kudus yang terbuka!
  """.trimIndent(),

    "185. Bergandengan Tanganlah"

    to """

    1=Es 3/4

    1. Bergandengan tanganlah kami pun tegak teguh,
    Tuhan, oleh kuat-Mu, dalam ribut dunia.

    2. Kuatkanlah tentara yang kena kebimbangan,
    panji-Mu dinaikkan, kami ikut arahnya.

    3. Kebenaran-Mu tetap jadilah senjata p'rang;
    hanya t'rang salib menang dalam dunia gelap.

    4. Maut menuai hasilnya; banyak orang mengeluh.
    Tuhan, tunjuk jalan-Mu ke kerajaan baka.

    5. B'rilah tentara kudus jangan takut dan cemas.
    Isi dunia lepas oleh kasih Penebus.

    6. Bergandengan tanganlah kami pun tegak teguh.
    B'rilah oleh sayang -Mu damai dalam dunia.
    """.trimIndent(),

"186. Yang T'lah Berjaya di Rumah Raja"

to """

1=G 3/4

1. Yang tlah berjaya di rumah Raja
di sorga, gabis p'rang berat
dan yang berjuang, membanting tulang,
bersamasamalah jemaat.

2. Jemaat di sorga setia juga
mendoakan saudaranya
di bumi ini dan yang di sini
merindukan sejahtera

3. Tak boleh kalah yang sedekala
percaya Tuhan yang menang.
Dialah Raja; salib-Nya saja
menjamin jawa di perang.

4. Sekali nanti perang berhenti,
segnap jemaat bergemar,
bersama-sama memuji nama
kudus, mulia dan besar.
  """.trimIndent(),

        "187. Bangunlah, Bangunlah"

    to """

    1=C 4/4

    1. Bangunlah, bangunlah! Bersedia untuk p'rang!
    Turutlah panggilan Tuhan dan berjuang dalam t'rang.
    Jangan lalaikan tanggungan. Tuhanlah Penganjur umat nya.
    Bangunlah, bangunlah!

    2. Jagalah, jagalah! Biar aku ini pun
    jadi laskar yang perkasa yang berjuang bertekun,
    dan melawan senantiasa dosa hatiku dan tipunya.
    Jagalah, jagalah!

    3. Tahanlah, tahanlah! Ikut Dia yang menang.
    Lihat sinar mata Raja memb'ri kuat dan terang.
    Pikullah salibmu saja ikut Tuhan pada jalan-Nya.
    Tahanlah, tahanlah!
    """.trimIndent(),

    "188. Laskar Kristen, Maju Masuklah Perang"

to """

1=E 4/4

1. Laskar Kristen, maju, masuklah perang,
iring palang Yesus, nanti kau menang.
Kristuslah Penganjur, jangan menyerah,
masuk peperangan, lihat panji-Nya.
Laskar Kristen maju, maju, masuklah perang,
iring palang Yesus, nanti kau menang.

2. Meski abad-abad lalu dan lenyap,
barisan jemaat bertekun tetap.
Kita pun serdadu tentara kudus.
Di jejak Penganjur jalanlah terus.

3. Kita tak terbagi, badan satulah,
berkepala satu, satu sabda-nya,
satu pengasihan, satulah iman,
satu pengharapan mempersatukan.

4. Takhta dan mahkota jatuh dan rebah,
tapi G'reja Yesus itulah baka.
Pintu alam maut pun dengan dahsyatnya.
tentu tidak dapat mengalahkannya.

5. Ikut tent'ra kami yang berbah'gia,
ikutlah menyanyi pujian dan gah.
Ikutlah, malaikan dan manusia,
muliakan Kristus, Rajamu baka.
  """.trimIndent(),

    "189. Serikat Persaudaraan"

    to """

    1=Bes 4/4

    1. Serikat persaudaraan, berdirilah teguh!
    Sempurnakan persatuan di dalam Tuhanmu.
    Bersamasama majulah, dikuatkan iman,
    Berdamai bersejahtera, dengan pengasihan.

    2. Serikatmu tetap teguh di atas alasan,
    yaitu satu Tuhanmu dan satulah iman,
    dan satu juga babtisan dan Bapa satulah,
    yang olehmu sekalian dipuji, disembah.

    3. Dan masing-masing kamu pun dib'ri anugerah,
    supaya kamu bertekun dan rajin bekerja.
    Hendaklah hatimu rendah, tahu: Tuhan memesan.
    Jemaat menurut firman-Nya berkasih-kasihan.
    """.trimIndent(),

    "190. Hai, Bangkit Bagi Yesus"

to """

1=Bes 4/4

1. Hai, bangkit bagi Yesus, pahlawan palang-Nya,
kibarkan panji Raja di atas dunia.
Perang rohani ini dipimpin Tuhanmu,
yang akan mengalahkan segala seteru.

2. Hai, bangkit bagi Yesus dan ikut tentara
ke medan perjuangan, dengar nafiri-Nya.
Meskipun tak terbilang pasukan seteru,
percaya bahwa Yesus menjadi kuatmu.

3. Hai, bangkit bagi Yesus dan harap kuat-Nya
tenagamu sendiri tentu lekas lemah.
Perlu di perjuangan senjatamu lengkap:
berdoa dan berjaga dan tahanlah tetap.

4. Hai, bangkit bagi Yesus; tak lama lagi p'rang;
perjuangan bergenti dan kamu pun menang.
Yang bertekun setia dianug'rahi-Nya
mahkota kehidupan di negeri baka.
  """.trimIndent(),

    "191. Yerusalem Mulia dan Kudus, Rinduan Hatiku"

    to """

    1=Es 4/2

    1. Yerusalem mulia dan kudus, rinduan hatiku!
    'Ku tergerak hendak terbang terus ke puncak bukitmu,
    diatas hutan rimba dan gunung dan lembah,
    supaya aku tiba di negeri baka.

    2. Sejahtera, kusambut fajarmu dengan kesukaan!
    Bahagia di rumah Tuhanku t'lah disediakan.
    Kutinggalkan di bawah segala belenggu
    dan kuserahkan nyawa ke tangan Tuhanku.

    3. Ya kota t'rang, kumohon apalah kaubuka pintumu,
    Di dunia, alangkah lamanya, t'lah rindu hatiku
    meninggalkan semua kesia-siaan,
    agar kudapat jua terang kesungguhan.

    4. 'Ku bertemu ribuan yang kudus, suatu tentara.
    Merekalah yang sudah ditebus dan putih jubahnya.
    Yaitulah saudara yang diselamatkan;
    digantikan sengsara dengan kesukaan.

    5. Terkumpullah nabi sekalian dan moyang terkenal
    dan Kristen pun yang mempersaksikan kerajaan kekal,
    yang dulu menderita salib dan siksanya,
    kekal bersukacita di tanah air baka.

    6. Ah Firdaus, nyanyianmu merdu dan warnamu segar,
    udaramu dan tamanmu penuh kesukaan benar.
    Kemuliaan sorga t'lah masuk hatiku
    dan 'ku menyanyi juga menurut lagumu.

    7. Dengar, dengar! Kecapi dan gendang membantu nyanyian,
    semuanya di ruangan terang bertari-tarian.
    Bunyinya riang-riang, sebagai t'lah pernah
    segala bintang sian gmemuji Tuhannya.

    8. 'Ngkau maksudku, Yerusalem kudus! Hatiku berdebar.
    'Ku tergerak hendak terbang terus ke s'lamatmu benar.
    Hai marilah, malaikat, ulurkan tanganmu,
    supaya 'ku berangkat ke tanh airku.
    """.trimIndent(),

    "192. Yang T'lah Menang K'lak Dari Buah"

to """

1=Es 3/4

1. Yang t'lah menang k'lak makan dari buah
pohon hayat di dalam firdaus-Ku.
Tak ada maut dan kesusahan jua
di pantai laut kaca teduh.
Air kebenaran dan kegemaran
t'rus berpancaran di taman-Ku,
t'rus berpancaran di taman-Ku.

2. yang t'lah menang hatinya tak terharu
kematian yang membinasakan.
kepadanya Kub'rikan nama baru
dan nama itu tak terhapuskan.
Yang Bapa punya dapat karunia
di dalam dunia yang tak fana,
di dalam dunia yang tak fana.

3. Ya Tuhan Yesus, tolong aku juga,
supaya aku tahan dan menang.
B'ri dari sini pun kulihat sorga,
sehingga jalanku tetap terang.
B'ri 'ku percaya dalam bahaya
dan tipu daya pelawan-Mu,
dan tipu daya pelawan-Mu.
  """.trimIndent(),

    "193. T'lah dari Jauh Kulihat Tahkta-Mu di Dunia"

    to """

    1=F 4/4

    1. T'lah dari jauh kulihat takhta-Mu,
    hingg'a ku suka'ngembangkan sayapku,
    jauh dari dunia yang akan mati.

    2. T'rang matahari terpadam sinarnya,
    kena cahaya terang-Mu yang cerah.
    Ah, jika hari ini juga
    'ku dekat Tuhan di dalam sorga

    3. Tetapi aku yang masih melekat
    kepada dunia dan dosa yang berat,
    tak patut menghampiri batas
    tempat yang suci dan jauh di atas.

    4. Meski berduka, dan hati menyesal,
    'ku menengadah ke t'rang-Mu yang kekal.
    Sekali nanti aku juga
    Kausambut, Bapa, di rumah sorga.
    """.trimIndent(),

    "194. Jauh dari Tahanku, Dagang di Dunia"

to """

1=Es 3/4

1. Jauh dari tanahku, dagang di dunia,
'rindukan s'lamat yang tiada semunya,
'ku berseru: Tuhan, kapan genap
hari keluhku di jurang gelap?

2. Di tepi sungai hayatlah tempatnya
kota baka yang beralaskan ratna.
Tampaklah pintu mutiara cerlang,
jalan mas tulen bercah'ya terang.

3. Rindu-dendam 'kan berhenti di sana;
sampai selamanya habis bencana.
Kota emas menerangi tetap
jalanku ini di bumi gelap.

4. Itulah kota tempat pertemuan
kita semua, dihimpunkan Tuhan
dalam t'rang Surya yang tak terbenam;
Kristus menang atas malam kelam.
  """.trimIndent(),

    "195. Betapakah 'Pabila Kita Juga"

    to """

    1=C 2/4

    1. Betapakah 'pabila kita juga,
    seselesai kembara dunia
    Disinari cahaya dari sorga,
    dan kita masuk pintu gerbangnya.
    Ketika kita dengan kesukaan
    melihat Tuhan dalam t'rang cerah.
    Serta memandang s'lamat kerajaan
    yang kini kita harap datangnya.

    2. Betapakah 'pabila kita mandi
    di t'rang baka yang tiada malamnya.
    Dan kita heran karena menjadi
    manusia yang tidak bercela.
    Dan kita tak diganggu oleh dosa
    dan tak ketakutan dan tak cemas.
    Disambut dalam negeri sentosa,
    tempat manusia yang terlepas.

    3. Siapakah telah pernah mengira
    keindahan t'rang Tuhan yang cerah.
    Kemuliaan sorga tak terkira
    dan alangkah besarnya persa-Nya.
    Ayo! dengarlah Yang Memanggil kita,
    dan jangan takut curam bukit-Nya.
    Di sana, heran dan bersukacita,
    k'lak kita masuk kota-Nya baka.
    """.trimIndent(),

    "196. Beribu-ribu Laksa, Berpakaian Cerlang"

to """

1=As 4/4

1. Beriburibu laksa, berpakaian cerlang,
sehala tentara kudus naik tingkattingkat t'rang.
T'lah tamat, sudah tamat perang di dunia,
Gapura negeri emas membuka pintunya.

2. Terdengar haleluya dan sorak-soraian,
kecapi dan rebana pun beribu-ribuan.
Sempurna kesukaan seisi dunia,
bergentilah keluh-kesah segala makhluknya.

3. Senanglah pertemuan di kanaan permai,
tempat saudara dan teman tak usah bercerai!
Tak ada lagi janda berkabung-kabungan,
tak ada anak piatu pun bertangis-tangisan.

4. Ya Anak Domba Allah, lepaskan umat-mu!
Naik, takhta pemerintahan yang s'lamatnya teguh.
Ya Pengharapan dunia kiranya muncullah
di langit tinggi tanda-Mu dan datang segera!
  """.trimIndent(),

    "197. Hai Putri Sion"

    to """

    1=A 4/4

    1. Hai Putri Sion, bangunlah, kebaskanlah lebu,
    t'lah tiba jam bahagia, tegak kepalamu!

    2. Perbarui kekuatan, berpakailah permai,
    tebitlah kemerdekaan, sengsara selesai.

    3. Bangunkan pula kota-Mu seindah-indahnya,
    beri bentara berseru: "Berpesta-pestalah!"

    4. Segala orang buangan t'lah asyik berkemas,
    hendak pergi ke Kanaan, ke negeri lepas.

    5. Di tengah nyala duni dan kebinasaan
    akhirnya umat Tuhanlah dipeliharakan.

    6. Lepas pun dari hukuman berkumpul umat-Nya
    dan masuk ke Kerajaan, berlutut menyembah.
    """.trimIndent(),

    "198. Bangunlah, Dengar Suara"

to """

1=C

1. Bangunlah, dengar suara
seruan kawal di menara:
"Yerusalem, hai bangunlah!
Jagalah! T'lah tengah malam
bernantilah seluruh alam.
Hai anak dara, jagalah!
Pengantin dampinglah!
Berdiri segera,
sambil pasang
pelitamu
'kan bertemu
dengan Pengantin, Tuhanmu!"

2. Sion mendengar nafiri.
Terbangun ia dan berdiri
bersuka-suka hatinya.
Mempelainya yang setia
t'lah datang, murah dan mulia.
T'rang hari raya merekah!
ya Yesus, Tuhanku,
di dalam rumah-Mu
sambut kami
sekalian
dan antarkan
jemaat-Mu ke perjamuan

3. Gloria kepada Tuhan
dinyanyi lidah beribuan
malaikat dan manusia.
Dari pintu mutiara
yang bergemilang tak bertara,
bersinar cah'ya arasy-Nya.
Di bumi b'lum pernah
manusia tampaklah
kesukaan
yang sepenuh.
Ya Tuhanku,
terpuji kerajaan-Mu!
  """.trimIndent(),

    "199. Nafiri Akan Menderu"

    to """

    1 = D

    1.Nafiri akan menderu dan bangkit orang mati
    ketika tampak tanda-Mu yang mendebaran tati.
    Tak gemetar yang menyeru serta memandang
    palang-Mu: seg'ralah, Tuhan, datang!
    """.trimIndent(),

"200. Tuhan Yesus, Jurus'lamat"

to """

1=A 4/4

1. Tuhan Yesus, Jurus'lamat, Yesus perlindunganku,
Yang menginjak ular jahat, Yesus t'rang dan hidupku.
Hatiku merinduamat akan Dikau, Jurus'lamat.
Aku tunggu, datanglah! Yesus, datanglah seg'ra!
  """.trimIndent()


    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lyrics)

        // Ambil data lagu dan lirik dari intent
        val songTitle = intent.getStringExtra("songTitle")
        val songImage = intent.getIntExtra("songImage", R.drawable.default_song_image)

        // Set up toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Tampilkan tombol panah kembali dengan icon
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_arrow_back) // Mengatur icon kembali

        // Tampilkan judul lagu dan liriknya di dalam TextView
        val textSongTitle: TextView = findViewById(R.id.textSongTitle)
        val textSongLyrics: TextView = findViewById(R.id.textSongLyrics)
        val layoutLyrics: RelativeLayout = findViewById(R.id.layoutLyrics)

        val lyrics = getLyricsForSong(songTitle)
        if (lyrics != null) {
            // Tampilkan lirik lagu di dalam TextView
            val textSongLyrics: TextView = findViewById(R.id.textSongLyrics)
            textSongLyrics.text = lyrics
        }else {
            textSongLyrics.text = "Lirik tidak ditemukan."
        }

        textSongTitle.text = songTitle
        layoutLyrics.setBackgroundResource(songImage) // Gunakan gambar sebagai latar belakang
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() // Aksi saat tombol panah kembali ditekan
        return true
    }

    private fun getLyricsForSong(songTitle: String?): String? {
        return lyrics[songTitle]
    }
}




//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_lyrics)
//
//        // Ambil data lagu dan lirik dari intent
//        val songTitle = intent.getStringExtra("songTitle")
//        val songLyrics = intent.getStringExtra("songLyrics")
//
//        // Tampilkan judul lagu dan liriknya di dalam TextView
//        val textSongTitle: TextView = findViewById(R.id.textSongTitle)
//        val textSongLyrics: TextView = findViewById(R.id.textSongLyrics)
//
//        textSongTitle.text = songTitle
//        textSongLyrics.text = songLyrics
//    }

