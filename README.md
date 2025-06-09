<h1>Belajar kotlin dasar</h1>
<p>By Nugie kurniawan</p>

<div>
kotlin adalah bahasa pemograman untuk android dimana kotlin sendiri berjalan di atas jvm(java virtual machine)
</div>

<h2>Fungsi untuk mencetak sesuatu</h2>
di dalam kotlin ada sebuah fungsi untuk mencetak sesuatu yaitu dengan
println() dan print()

<h3>Perbeadaan:</h3>
jika println() akan mengprint 1 baris sehingga jika masih ada println() atau print() selanjutnya tidak akan di cetak dalam baris yang sama 
sedangkan print() hanya akan mencetak isinya tetapi tidak akan membuat baris baru sehingga jika ada println() atau print() di selanjutnya hasilnya akan tercetak dalam 1 baris

<h2>tipe data number</h2>
tipe data number yaitu tipe data yang berisi angka angka
tipe data number di bagi menjadi 2 yaitu integer(bilangan bulat) dan float(bilangan desimal)

<h3>bilangan bulat(integer)</h3>
di bagi menjadi 4
-byte
-short
-int
-long

<h4>cara penggunaan nya</h4>
    var umur: Byte = 50
    var cobaShort: Short = 100
    var cobaInt: Int = 200
    var cobaLong: Long = 100_000_00L
    
catatan :
    untuk long perlu di akhiri dengan L agar memberitahu ini adalah tipe data long
    
<h3>bilangan decimal(float)</h3>
bilangan decimal di bagi menjadi 2 yaitu
float dan double

<h4>cara penggunaanya :</h4>
    var angka: Float = 100.51F
    var cobaDouble: Double = 500.55
    
catatan : 
jika ingin menggunakan float haruslah diakhiri dengan F untuk menandai bahwa tipe data tersebut adalah float dan agar tidak error

<h2>konversi number</h2>
di dalam kotlin terdapat konversi number sama seperti java
.toByte() = menjadi byte
.toShort() = menjadi short
.toInt() = menjadi integer
.toLong() = menjadi long
.toFloat() = menjadi float
.toDouble() = menjadi double

catatan:
berhati hati dalam konversi karna tetap kotlin akan menerapkan ukuran dari masing masing tipe data

<h2>Tipe data Char(character)</h2>
tipe data char(character) adalah tipe data yang khusus untuk satu huruf saja 

<h3>penggunaannya:</h3>
    var n: Char = 'N'
    var g: Char = 'G'
    var k: Char = 'K'
    
catatan: 
tipe data char di kotlin hanya boleh menggunakan tanda petik 1 agar bisa digunakan dan tidak boleh lebih dari 1 huruf


