# Homework 6 — My First Compose App

## Task 3: Colour and Spacing
Colour used: Gray
Padding kept: 8 dp dan 48 dp
What changed / what stayed the same: Oke jadi yang sama diantara 8 dp dan 48 dp adalah warna yang kugunakan yaitu Gray, teks juga gak berubah, gambar juga sama. Berdasarkan pengamatan saya yang berubah hanyalah jarak kosong antara bagian pinggir layar, di 8 dp isinya hampir nempel ke pinggir layar sedangkan pas 48 dp jadi masuk ke tengah layar isinya.


## Task 4: Build Error
First error message:
'M' is not a valid file-based resource name character: File-based resource names must contain only lowercase a-z, 0-9, or underscore

Cause: Menurut pemahaman saya nama file resource cuma bisa make huruf kecil a-z, angka 0-9, dan underscore. Jadi kalo kita make `My-Picture.png` itu melanggar aturan tadi karena memakai huruf besar dan (-) yang ngebuat gagal.

Why other errors appear: Soalnya pas resourcenya gagal dikompilasi, ID `R.drawable.my_picture` otomatis nggak bakal dibikin sama class R. Karena itu, kode Kotlin yang manggil `R.drawable.my_picture` bakalan nemu error `unresolved reference`.

Fix: Tinggal kembaliin nama file jadi `my_picture.png` lagi, habistu build ulang make ctrl + f9.

## Task 5: Explore the Project
(a) MainActivity: path `app/src/main/java/com/example/myfirstcomposeapp/MainActivity.kt` jadi file ini isinya class MainActivity yang jadi titik awal buat kita jalanin aplikasi, fungsinya buat panggil `setContent` biar nampilin UI Compose.
(b) Gradle file: path `app/build.gradle.kts` terus file ini dipake buat ngatur konfigurasi modul app, mulai dari namespace, applicationId, versi SDK, aktifin fitur Compose, sampe ngatur daftar dependency.
(c) Launcher image line: `painter = painterResource(id = R.drawable.ic_launcher_foreground)` setau saya fungsi `MyFirstScreen` 

( @Composable
fun MyFirstScreen() {
Column(
modifier = Modifier
.fillMaxSize()
.padding(24.dp)
) {
Text(text = "Halo Ges! Aku Riza.")
Text(text = "Ide punyaku dan tim: buat aplikasi yang bisa tracking bansos pemerintah.")
Image(
painter = painterResource(id = R.drawable.ic_launcher_foreground),
contentDescription = "App launcher icon"
)
}
} 

di file `MainActivity.kt`) kode ini dipake buat nampilin gambar launcher bawaan Android dari folder `res/drawable`.

## Task 6: Preview vs Run
Soalnya pas kita cuma ngerefresh preview device, Android Studio cuma kayak ngerender tampilan composable di dalamnya aja tanpa inul aplikasi ke emulator. Jadi tampilan di emulator itu masih pake versi build lama jadi gak ikut berubah. Terus biar perubahannya keliatan di aplikasinya kita harus build ulang terus pasang lagi dengan cara pencet tombol run.

## Task 7: Views vs Compose
1. Bedanya kalo di views, kita bikin layoutnya terpisah di XML dulu, terus di Kotlin kita harus nyari viewnya satu-satu pake `findViewById` baru ubah manual buat ngubah tampilannya. Nah kalo di compose, kita cuma tinggal nulis tampilannya gimana. Contohnya di `MyFirstScreen` , itu tinggal kupanggil `Column` yang isinya dua `Text` sama satu `Image`. Nanti kalo teksnya berubah, si Compose sendiri yang otomatis ngerender ulang tampilannya tanpa perlu diubah tampilannya secara manual sama aku.

2.
| Composable | Package | Library layer |
|---|---|---|
| Column | androidx.compose.foundation.layout | Foundation |
| Text | androidx.compose.material3 | Material |
| Image | androidx.compose.foundation | Foundation |