package com.example.myapplication15

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import android.widget.SearchView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var searchView: SearchView
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView
    private lateinit var listViewSongs: ListView
    private lateinit var adapter: SongAdapter

    private val songs = arrayOf(
        "1. Hormat Bagi Bapa Serta Anak dan Rohul’Kudus",
        "2. Ya Tuhan, Kami Puji Nama-Mu Besar",
        "3. Hormat Bagi Allah Bapa, Hormat Bagi Anak-Nya",
        "4. Kudus, Kudus, Kuduslah, Tuhan Mahakuasa",
        "5. Hai Makhluk Allah-hu Besar",
        "6. Dengarlah, Allahmu Esa",
        "7. Nyanyianku Memuji Allah Jua",
        "8. Haleluya, Hai Pujilah",
        "9. Hai Kaum Tuhan Hu, Allahmu Benar",
        "10. Pujilah Tuhanmu, Raja yang mahamulia",
        "11. Kami Puji Engkau, Hu",
        "12. B'ri Hormatmu dan Pujian",
        "13. Haleluya, Hormat dan Pujian",
        "14. Kesukaan yang Ceria Hanya Ada Pada-Mu",
        "15. Hormat dan Puji Kepada Tuhan",
        "16. Hormat dan Puji Kepada Tuhan",
        "17. Ya Bapa Kami Mahabaik",
        "18. Anugerah Tuhan kami Yesus Kristus",
        "19. Berkati dan Lindung Kami, Hu",
        "20. Terpujilah Allah Israel",
        "21. Kunantikan Betapa, Ya Tuhan, Datang-Mu",
        "22. Kunantikan Betapa, Ya Tuhan, Datang-Mu",
        "23. Ya, Datanglah, Immanuel! Merindu Kaum-Mu Israel",
        "24. Allah 'Ngaruniakan",
        "25. T'rang Bintang Siang Gemerlap",
        "26. T'rus dari Sorga Datang-Ku",
        "27. Ku Memegahkan Hu, Juruselamatku",
        "28. Terbitlah dari Awan-awan",
        "29. Muliakanlah, Muliakanlah Tuhan Allah",
        "30. S'lamat, S'lamat Datang, Yesus Tuhanku",
        "31. Malam Kudus, Sunyi Senyap",
        "32. Terbit Sepucuk Taruk",
        "33. Yang Tuhan di Sorga Menjadi Rendah",
        "34. Anak Maryam, Bimbinglah",
        "35. Ya Anak Kecil, Ya Anak Lembut",
        "36. Di Betlehem T'lah Jadi",
        "37. Adalah di Kota Daud",
        "38. Dari Pulau dan Benua",
        "39. Hai Mari, Berhimpun dan Bersukaria",
        "40. Hai Gembala Efrata",
        "41. Hai, Puji Hu, Bersukacita",
        "42. Hai Langit, Bumi, Nyanyilah",
        "43. Mari, Puji Jurs'lamat",
        "44. Putri Sion, bergemar",
        "45. Tuhanku Yesus",
        "46. Tetap Kuharap denga Suka",
        "47. Sekarang Biarlah",
        "48. Hosiana! Raja-Mu",
        "49. Kepala yang Berdarah",
        "50. Lihat, Ibu Tuhan Kita",
        "51. B'ri Salib Tudungi Aku",
        "52. Hai Dunia, Lihat Tuhan",
        "53. Ya Yesus, 'Ngkau Bersalah Bagaimana",
        "54. Memandang Palang Rajaku",
        "55. Hatiku Beriman",
        "56. Penebusku Disalib",
        "57. S'lamat Datang, Hari Terutama",
        "58. Bernyanyi dan Bersukalah",
        "59. Yesus, T'rang dan Kehidupan",
        "60. Suara Sorak Terdengar",
        "61. Pengawal Mau Menjaga",
        "62. Hari Ini yang Kudus, Haleluya",
        "63. Maseh Menang",
        "64. Sesungguhnya Kukatakan",
        "65. Yesus Hidup! Sungguhlah",
        "66. Hai, Puji Kuasa Nama-Nya",
        "67. Terbuka Pintu Gerbang Emas",
        "68. Yesus Kristus Memerintah",
        "69. Muhkhalisku yang T'lah Menang",
        "70. Jemaat-Mu Ini Bertelut",
        "71. Yesus Kristus yang Menang",
        "72. Roh Kudus, Roh Kebenaran",
        "73. Ya Roh Penyuci, Turunlah",
        "74. Hai kristen, Nyanyilah",
        "75. Hai, Nyanyi dan Bersuka Hati",
        "76. Tuhanku, Berkat-Mu Limpah",
        "77. Ku Percaya Allah Bapa",
        "78. Di dalam Satu Tuhan Jua",
        "79. Tuhanlah kekal Raja Hati Kami",
        "80. Yesus, Pimpinlah",
        "81. Beri, Ya Pokok Anggur Sungguh",
        "82. Asal Yesus Jua Tuhan Hidupku",
        "83. Kukasih Yesus, T'rang dan Kuatku",
        "84. Tak Kita Menyerahkan",
        "85. Ya Tuhan, Bimbing Aku di Jalanku",
        "86. Tahanlah dan Berjuang T'rus",
        "87. Ya Bapa, Tilik dalam Rahmat-Mu",
        "88. Yesus, Roti Kehidupan, B'ri Anug'rah Perjamuan",
        "89. Yesus Roti Kehidupan, Turun dari Sorga-Nya",
        "90. Yesusku yang Dikurbankan",
        "91. Mau Apa pun Kubuat",
        "92. Sejaht'ra Hari Tuhan",
        "93. Yesus, Lihatlah Jemaat",
        "94. Berhimpun Semua, Menghadap Tuhan",
        "95. Firman Hu, Berp'rintahlah",
        "96. Hari Damai yang Teduh",
        "97. Tuhan Allah Hadir",
        "98. Berkatilah, Ya Tuhan, Nikah Ini",
        "99. Bapa Kami, Allah Kekekalan",
        "100. Senja Disambut Dengan Suka",
        "101. Luruh Bunga, Layu Daun",
        "102. Hai Sobat Sekalian",
        "103. Syukurlah, Tuhan Hu Setia",
        "104. Berb'hagia Kekal",
        "105. Sinar Fajar yang Baka",
        "106. Terang Matahari",
        "107. Kepada-Mu, ya Tuhan Hua",
        "108. Ya Yesus Kristus, T'rang Baka",
        "109. Tetap 'Ku Harap Pada-Mu",
        "110. Ya Tuhan, Pada-Mu Tak Ada Malam G'lap",
        "111. Tinggal Sertaku, Kawanku Kudus",
        "112. Tempat Berhenti",
        "113. Dari Tempat Perhentianmu",
        "114. Besarlah Khalik Dunia",
        "115. Ya Khalik Dunia",
        "116. Setia Hu, Tak Gagal Niat-Nya",
        "117. Di Gunung dan di Lembah",
        "118. Selalu Hu, Gembalaku",
        "119. Jemaat Memuji Tuhannya",
        "120. Betapa Indah Bumi Ini",
        "121. Selamat Tanah, yang dilindung Tuhan Hu",
        "122. Tuhan yang Rumah-Mu Sorga Terang",
        "123. Hai, Bertepuk Tangan dan Tari",
        "124. Ya Allah Abad dan Zaman",
        "125. Makin Tambah Murka Laut",
        "126. Hatiku, Teduhkan Diri",
        "127. Benar dan Baik Semuanya",
        "128. Biarkan Tuhan Menyenggara",
        "129. Karunia Baik Semua",
        "130. Kepada Tuhan jua",
        "131. Pimpin Aku, Tuhan Hua",
        "132. Ya Tuhan, Murah-Mu Baka",
        "133. Jiwa, Puji Raja Sorga",
        "134. Tersembunyi Ujung Jalan",
        "135. Ingat dalam Susah dan Bala",
        "136. Di 'Dapan Mata Yesus",
        "137. Sudah Kudapat Sayang Tuhan",
        "138. Memburu-buru, Berlelah",
        "139. Ya Allahku, Cahaya-Mu Terang Kudus Belaka",
        "140. Sekarang Hati Tercengang",
        "141. Tertumpah Darah Penebus",
        "142. Ya Yesus Tolonglah",
        "143. Ya Nama Yesus",
        "144. Segala Benua dan Langit Penuh",
        "145. Sertai Kami, Tuhan",
        "146. Dengan Malaikan, Marilah",
        "147. Kuasamu, Ya Pengasihan",
        "148. Kehendak Tuhan Jadilah",
        "149. Ke Muka, Anak-Anak",
        "150. Kendati Tersembunyi Jalanku",
        "151. Jikalau Kutahu Kristus Dekat",
        "152. Dalam Malam Kedukaan",
        "153. Ya Tuhan, Rajaku",
        "154. Jikalau Jiwaku Berdoa",
        "155. Suara Yesus Kudengar",
        "156. Terang Penghibur dalam Malamku",
        "157. Batu Karang yang Teguh",
        "158. Isilah, Tuhan, Hidupku",
        "159. Tuhan Yesus, Engkaulah",
        "160. Tuhan Ambil Hidupku",
        "161. Tuhan Ambil Hidupku",
        "162. Ya Tuhanku, Kiranya Engkaulah",
        "163. Hai, Janganlah Berjalan",
        "164. Hai Bangun, yang Tidur, yang Mati, Sadar",
        "165. Yesus Memesan: Dalam Malam G'lap",
        "166. Sungguh Kerajaan Allah di Bumi Tak Kalah",
        "167. Di atas Satu Alas",
        "168. Teguhlah Tuhan, Kotaku",
        "169. Lindungkanlah, Luaskanlah, Ya Tuhan",
        "170. Sekali'kan Menang Karunia",
        "171. Perang yang Akhir Inilah",
        "172. Tetap Merindu Kita",
        "173. Keluar dari Kaum",
        "174. Keluar dari Kaum",
        "175. T'rang Siang T'lah Dihanti Malam",
        "176. Dunia dalam Rawa Paya",
        "177. Walaupun Hujan Turun",
        "178. Kar'na Pahlawan, yang Setiawan",
        "179. Ya Raja Damai, Tuhanku",
        "180. Ya Hari Kudus, yang Dirindukan Amat",
        "181. Setialah Kepada Tuhanku",
        "182. Tuhan yang Hidup, Kami Engkau Punya",
        "183. Pasti Akan Digenapkan",
        "184. Satu Pintu Masuklah: Tuhan Yesus",
        "185. Bergandengan Tanganlah",
        "186. Yang T'lah Berjaya di Rumah Raja",
        "187. Bangunlah, Bangunlah",
        "188. Laskar Kristen, Maju Masuklah Perang",
        "189. Serikat Persaudaraan",
        "190. Hai, Bangkit Bagi Yesus",
        "191. Yerusalem Mulia dan Kudus, Rinduan Hatiku",
        "192. Yang T'lah Menang K'lak Dari Buah",
        "193. T'lah dari Jauh Kulihat Tahkta-Mu di Dunia",
        "194. Jauh dari Tahanku, Dagang di Dunia",
        "195. Betapakah 'Pabila Kita Juga",
        "196. Beribu-ribu Laksa, Berpakaian Cerlang",
        "197. Hai Putri Sion",
        "198. Bangunlah, Dengar Suara",
        "199. Bangunlah, Dengar Suara",
        "200. Tuhan Yesus, Jurus'lamat"
    )
    private val songImages = arrayOf(
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
        R.drawable.icon_song_1,
        R.drawable.icon_song_2,
        R.drawable.icon_song_3,
        R.drawable.icon_song_4,
        R.drawable.icon_song_5,
        R.drawable.icon_song_6,
        R.drawable.icon_song_7,
        R.drawable.icon_song_8,
        R.drawable.icon_song_9,
        R.drawable.icon_song_10,
    )

    private val lyrics = mapOf(
        "Hormat Bagi Bapa Serta Anak dan Rohul’Kudus" to "1. Hormat bagi Bapa serta Anak dan Rohu'lkudus,\n" +
                "seperti pada permulaan, s'karang ini\n" +
                "dan selama-lamanya. Amin.\n",
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)
        listViewSongs = findViewById(R.id.listViewSongs)
        searchView = findViewById(R.id.searchView)


        // Mengatur warna teks pada SearchView
        searchView.setOnSearchClickListener {
            val editText = searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
            editText.setTextColor(resources.getColor(android.R.color.white)) // Atur warna teks menjadi putih
        }

        // Setup toggle button for drawer
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Setup navigation item click listener
        navView.setNavigationItemSelectedListener { menuItem ->
            // Handle navigation view item clicks here
            when (menuItem.itemId) {
                R.id.menu_about -> {
                    // Handle "Tentang" menu item click
                    navigateToAbout()
                    true
                }
                else -> false
            }
        }

        // Inisialisasi adapter untuk ListView
        val adapter = SongAdapter(this, songs, songImages)
        listViewSongs.adapter = adapter

        // Atur listener untuk menangani klik item di ListView

        listViewSongs.setOnItemClickListener { parent, view, position, id ->
            val selectedSong = songs[position]
            val selectedLyrics = lyrics[selectedSong]
            val selectedImage = songImages[position]

            // Buat intent untuk menampilkan lirik lagu
            val intent = Intent(this, LyricsActivity::class.java).apply {
                putExtra("songTitle", selectedSong)
                putExtra("songLyrics", selectedLyrics)
                putExtra("songImage", selectedImage)
            }
            startActivity(intent)
        }
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                adapter.filter.filter(newText)
//                return false
//            }
//        })

        //Memberi aksi pada pencarian
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            private var job: Job? = null

            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                job?.cancel()
                job = CoroutineScope(Dispatchers.Main).launch {
                    delay(100) // Delay 300ms to wait for user input
                    newText?.let {
                        adapter.filter.filter(it)
                    }
                }
                return false
            }
        })
//
    }

    private fun navigateToAbout() {
        // Tambahkan kode untuk membuka layar untuk menampilkan informasi tentang aplikasi
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here
        return when (item.itemId) {
            else -> super.onOptionsItemSelected(item)
        }
    }
}




// Adapter kustom untuk menangani tata letak item ListView yang kompleks
class SongAdapter(private val context: Context, private val songs: Array<String>, private val songImages: Array<Int>) :
    ArrayAdapter<String>(context, R.layout.list_item_song, songs) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView = inflater.inflate(R.layout.list_item_song, parent, false)

        // Referensi ke komponen dalam tata letak item
        val textViewSong = rowView.findViewById<TextView>(R.id.textViewSong)
        val imageViewSong = rowView.findViewById<ImageView>(R.id.imageViewSong)

        // Atur teks lagu dan gambar ikon
        textViewSong.text = songs[position]
        imageViewSong.setImageResource(songImages[position])

        // Ubah ImageView menjadi gambar bulat
        imageViewSong.setRoundedImage(songImages[position])

        return rowView
    }
}

// Fungsi ekstensi untuk mengubah ImageView menjadi gambar bulat
private fun ImageView.setRoundedImage(resourceId: Int) {
    val bitmap = (context.resources.getDrawable(resourceId) as BitmapDrawable).bitmap
    val circularBitmap = getCircularBitmap(bitmap)
    setImageBitmap(circularBitmap)
}

// Fungsi untuk membuat gambar menjadi lingkaran
private fun getCircularBitmap(bitmap: Bitmap): Bitmap {
    val output = Bitmap.createBitmap(bitmap.width, bitmap.height, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(output)
    val paint = Paint()
    val rect = android.graphics.Rect(0, 0, bitmap.width, bitmap.height)

    paint.isAntiAlias = true
    canvas.drawARGB(5, 5, 5, 5)
    paint.style = Paint.Style.FILL
    canvas.drawCircle((bitmap.width / 2).toFloat(), (bitmap.height / 2).toFloat(), (bitmap.width / 2).toFloat(), paint)
    paint.xfermode = android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN)
    canvas.drawBitmap(bitmap, rect, rect, paint)

    return output
}
