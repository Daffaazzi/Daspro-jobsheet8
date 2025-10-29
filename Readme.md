>===Pertanyaan Percobaan 1===

1. jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
2. Jika pada perulangan for, kondisi i<=N diubah menjadi i>N, apa akibatnya? Mengapa bisa demikian?
3. Jika pada perulangan for,kondisi step i++ diubah menjadi i-- apa akibatnya? mengapa demikian?

>=Jawaban=
1. Perulangan akan berjalan lebih banyak satu kali dibanding sebelumnya (jika batas kondisi sama),perulangan dimulai dari i = 1 agar proses berjalan dari 1 sampai N. Jika diubah menjadi i = 0, maka iterasi dimulai dari 0, sehingga total pengulangan menjadi N+1 kali (karena 0 juga dihitung).

2. Perulangan tidak akan berjalan sama sekali, Karena saat pertama kali dicek, nilai awal i (misalnya 1) tidak lebih besar dari N, maka kondisi i > N langsung bernilai false, sehingga blok perulangan tidak dijalankan sama sekali.

3. Jika i++ diubah menjadi i--, perulangan bisa menjadi tak terbatas karena nilai i terus berkurang dan tidak pernah mencapai batas kondisi berhenti.



>===Pertanyaan Percobaan 2===

1. jika pada sintkas for,inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
2. Kembalikan program semula dimana inisialisasi i Outer=1. Kemudian perhatikan perulangan dalam, jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akiabtnya? Mengapa bisa dimikian?
3. jadi, apakah perbedaan kegunaan antara perulanga luar dengan perulangan yang berada di dalamnya?
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
5. Silahkan commit dan push ke repository anda.

>=Jawban=
1. Jika iOuter = 1 diubah menjadi iOuter = 0, perulangan bertambah satu baris karena dimulai dari 0.

2. Jika i = 1 diubah menjadi i = 0, setiap baris mendapat satu karakter tambahan karena perulangan dalam dimulai dari 0.

3. Perulangan luar mengatur jumlah baris, sedangkan perulangan dalam mengatur isi tiap baris.

4. System.out.println(); berfungsi membuat baris baru; tanpa itu, hasil tercetak dalam satu baris.

5. Sudah. 


>==Pertanyaan Percobaan 3==

1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan tampilan berikut?
2. Jika tidak sesuai, bagian mana saja yang harus di perbaiki/ditambahakan? Jelaskan setiap bagian yang perlu di perbaiki/ ditambahkan.
3. Silahkan commit dan push ke repository anda.

>=Jawaban=
1. tidak sesuai, karena program belum menampilkan baris baru dan batas loop belum tepat. Tetapi setelah di modifikasi akan sesuai karena program bisa menampilkan baris baru.

2. kita bisa menambahakan System.out.println(); di outer nya

3. sudah.