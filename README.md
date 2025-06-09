<h1>Belajar kotlin dasar</h1>
<p>By Nugie kurniawan</p>

<div>
kotlin adalah bahasa pemograman untuk android dimana kotlin sendiri berjalan di atas jvm(java virtual machine)
</div>

<h2>Fungsi untuk mencetak sesuatu</h2>
di dalam kotlin ada sebuah fungsi untuk mencetak sesuatu yaitu dengan
  <ul>
    <li>println()</li>
    <li>print()</li>
  </ul>

<h3>Perbeadaan:</h3>
<div style="text-align:justify">

<ul>
    <li>println() = akan mengprint 1 baris sehingga jika masih ada println() atau print() selanjutnya tidak akan di cetak dalam baris yang sama </li>
    <li>sedangkan print() hanya akan mencetak isinya tetapi tidak akan membuat baris baru sehingga jika ada println() atau print() di selanjutnya hasilnya akan tercetak dalam 1 baris</li>
</ul>
</div>

<h2>tipe data number</h2>
tipe data number yaitu tipe data yang berisi angka angka
tipe data number di bagi menjadi 2 yaitu integer(bilangan bulat) dan float(bilangan desimal)

<h3>bilangan bulat(integer)</h3>
di bagi menjadi 4 yaitu :
<ul>
    <li>byte</li>
    <li>short</li>
    <li>int</li>
    <li>long</li>
</ul>

<h4>cara penggunaan nya</h4>
 <ul>
    <li>var umur: Byte = 50</li>
    <li>var cobaShort: Short = 100</li>
    <li>var cobaInt: Int = 200</li>
    <li>var cobaLong: Long = 100_000_00L</li>
</ul>
    
catatan :
    untuk long perlu di akhiri dengan L agar memberitahu ini adalah tipe data long
    
<h3>bilangan decimal(float)</h3>
bilangan decimal di bagi menjadi 2 yaitu
float dan double

<h4>cara penggunaanya :</h4>
<ul>
        <li>var angka: Float = 100.51F</li>
        <li>var cobaDouble: Double = 500.55</li>
</ul>
    
catatan : 
jika ingin menggunakan float haruslah diakhiri dengan F untuk menandai bahwa tipe data tersebut adalah float dan agar tidak error

<h2>konversi number</h2>
di dalam kotlin terdapat konversi number sama seperti java
<ul>
    <li>.toByte() = menjadi byte</li>
    <li>.toShort() = menjadi short</li>
    <li>.toInt() = menjadi integer</li>
    <li>.toLong() = menjadi long</li>
    <li>.toFloat() = menjadi float</li>
    <li>.toDouble() = menjadi double</li>
</ul>

catatan:
berhati hati dalam konversi karna tetap kotlin akan menerapkan ukuran dari masing masing tipe data

<h2>Tipe data Char(character)</h2>
tipe data char(character) adalah tipe data yang khusus untuk satu huruf saja 

<h3>Cara penggunaannya:</h3>
 <ul>
    <li>var n: Char = 'N'</li>
    <li>var g: Char = 'G'</li>
    <li>var k: Char = 'K'</li>
</ul>
    
catatan: 
tipe data char di kotlin hanya boleh menggunakan tanda petik 1 agar bisa digunakan dan tidak boleh lebih dari 1 huruf


<h2>Tipe data Boolean</h2>
tipe data boolean merupakan tipe data yang hanya menampung 2 nilai yaitu <strong>true</strong> dan <strong>false</strong> dan akan terasa jika digunakan untuk perkondisian

<h3>Cara penggunaanya : </h3>
<ul>
    <li> var benar: Boolean = true</li>
   <li> var salah: Boolean = false</li>
</ul>

catatan :
Tipe data boolean di kotlin ini lebih banyak di gunakan untuk perkondisian seperti if else ataupun ternary