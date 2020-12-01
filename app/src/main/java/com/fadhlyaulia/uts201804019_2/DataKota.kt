package com.fadhlyaulia.uts201804019_2


object DataKota {
    private val namaKota = arrayOf(
        "Bandung",
        "Bandung Barat",
        "Bekasi",
        "Bogor",
        "Ciamis",
        "Kab.Cirebon",
        "Cimahi",
        "Depok",
        "Garut",
        "Indramayu",
        "Karawang",
        "Kuningan",
        "Majalengka",
        "Pangandaran",
        "Purwakarta",
        "Subang",
        "Sumedang",
        "Kab.Sukabumi",
        "Tasikmalaya",
        "Kab.Tasikmalaya"

    )

    private val tahunkota = arrayOf(
        "25 September 1810",
        "2 Januari 2007",
        "10 Maret 1997",
        "3 Juni 1482",
        "12 Juni 1642",
        "2 April 1482",
        "21 Juni 2001",
        "27 April 1999",
        "16 Februari 1813",
        "7 Oktober 1527",
        "14 September 1633",
        "1 September 1498",
        "1 Januari 1819",
        "25 Oktober 2012",
        "20 Juli 1834",
        "5 April 1948",
        "25 April 1921",
        "1 April 1914",
        "22 April 1578",
        "17 Oktober 2001",
        "21 Agustus 1925"


    )

    private val logokota = intArrayOf(
        R.drawable.bandung,
        R.drawable.bandungbarat,
        R.drawable.bekasi,
        R.drawable.bogor,
        R.drawable.ciamis,
        R.drawable.kabcirebon,
        R.drawable.cimahi,
        R.drawable.depok,
        R.drawable.garut,
        R.drawable.indramayu,
        R.drawable.karawang,
        R.drawable.kuningan,
        R.drawable.majalengka,
        R.drawable.pangandaran,
        R.drawable.purwakarta,
        R.drawable.subang,
        R.drawable.sumedang,
        R.drawable.kabsukabumi,
        R.drawable.tasik,
        R.drawable.kabtasik


    )

    val listData: ArrayList<Sekolah>
    get(){
        val listSekolah = arrayListOf<Sekolah>()
        for (position in namaKota.indices){
            val sekolah = Sekolah()
            sekolah.nama = namaKota[position]
            sekolah.tahun = tahunkota[position]
            sekolah.logo = logokota[position]
            listSekolah.add(sekolah)
        }
        return listSekolah
    }
}