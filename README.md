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
