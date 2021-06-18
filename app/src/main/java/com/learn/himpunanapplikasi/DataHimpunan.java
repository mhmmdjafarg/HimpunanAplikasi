package com.learn.himpunanapplikasi;

import java.util.ArrayList;

public class DataHimpunan {
    private static String[] himpunanNames = {
            "Ikatan Mahasiswa Telekomunikasi",
            "Himpunan Mahasiswa Elektroteknik",
            "Himpunan Mahasiswa Informatika",
            "Himpunan Mahasiswa Farmasi",
            "Himpunan Mahasiswa Teknik Geofisika",
            "Himpunan Mahasiswa Tambang",
            "Himpunan Mahasiswa Teknik Perminyakan",
            "Himpunan Mahasiswa Sumber Daya Air",
            "Himpunan Mahasiswa Sipil",
            "Himpunan Mahasiswa Teknik Lingkungan",
            "Keluarga Mahasiswa Teknik Kelautan",
            "Himpunan Mahasiswa Mesin",
            "Keluarga Mahasiswa Teknik Penerbangan",
            "Himpunan Mahasiswa Teknik Material"
    };

    private static String[] himpunanSingkatans = {
            "IMT",
            "HME",
            "HMIF",
            "HMF",
            "HIMATG",
            "HMT",
            "HMTM",
            "HIMASDA",
            "HMS",
            "HMTL",
            "KMKL",
            "HMM",
            "KMPN",
            "MTM"
    };

    private static String[] himpunanDeskripsis = {
            "Ikatan Mahasiswa Telekomunikasi (IMT) “Signum” ITB merupakan salah satu Himpunan Mahasiswa Jurusan Teknik Telekomunikasi yang berada di bawah naungan STEI ITB.\n IMT “Signum” ITB berdiri pada tanggal 14 Februari 2016 atas dasar kebutuhan dan keinginan kuat mahasiswa Teknik Telekomunikasi ITB akan keilmuan Teknik Telekomunikasi. \n Kata “Signum” pada nama IMT “Signum” ITB berarti “Sinyal” dalam Bahasa Latin.",
            "HME ITB adalah Himpunan Mahasiswa Elektroteknik ITB, yaitu himpunan yang membawahi tiga jurusan: Teknik Elektro, Teknik Tenaga Listrik dan Teknik Biomedis",
            "Himpunan Mahasiswa Informatika atau HMIF ITB merupakan sebuah lembaga yang mewadahi dua program studi yaitu Teknik Informatika serta Sistem dan Teknologi Informasi. Kedua program studi ini bernaung pada HMIF ITB didasarkan pada rumpun keilmuan yang dimilikinya yaitu Keilmuan Informatika atau Keinformatikaan.",
            "Himpunan Mahasiswa Farmasi (HMF) ‘Ars Praeparandi’ ITB merupakan or\u00ADganisasi keprofesian dari mahasiswa-mahasiswa farmasi di Institut Teknologi Bandung yang berbasis kesehatan. HMF AP ITB didirikan pada tanggal 17 Desember 1954 di Bandung dan diberi nama Himpunan ‘Ars Praeparandi’ oleh Prof. Goei The dimana ‘Ars Praeparandi ’ berarti seni meracik.",
            "Mahasiswa Teknik Geofisika Institut Teknologi Bandung dilandasi dengan rasa tanggung jawab dan pengabdiannya kepada Tuhan, bangsa, dan almamater serta didasarkan kepada nilai-nilai kebenaran yang hakiki, menghimpun diri dalam suatu wadah yang bernama Himpunan Mahasiswa Teknik Geofisika ”TERRA” ITB.",
            "Himpunan Mahasiswa Tambang Institut Teknologi Bandung (HMT-ITB) lahir pada tanggal 15 Mei 1955 dan diresmikan pada tanggal 16 Maret 1967. Menciptakan, memelihara ikatan kekeluargaan yang erat di antara para mahasiswa Jurusan Teknik Pertambangan Institut Teknologi Bandung serta melangsungkan ikatan yang kekal setelah tamat belajar",
            "HMTM “PATRA” ITB yang didirikan pada tanggal 24 Desember 1963 ini merupakan himpunan mahasiswa jurusan yang berdasar atas kesamaan keprofesian teknik perminyakan dan bergerak di bidang energi, baik minyak dan gas, ataupun panas bumi. Di dalam HMTM “PATRA” ITB terdapat 3 badan yakni Badan Pengurus, Badan Perwakilan Angkatan, dan Badan Kesenatoran.",
            "Himpunan Mahasuswa Sumber Daya Air ITB (Himasda ITB) merupakan himpunan mahasiswa jurusan Teknik dan Pengelolaan Sumber Daya Air. Himasda berdiri sejak tanggan 23 Maret 2015 dan baru melaksanakan arak-arakan pada tahun 2017 dikarenakan wisudawan pertamanya lulus di tahun tersebut. Jaket himpunan dari Himasda ITB memiliki sebutan khusus yaitu “Armor” yang melambangkan perlindungan bagi anggotanya.",
            "Himpunan Mahasiswa Sipil ITB (HMS ITB) merupakan organisasi kemahasiswaan yang berada pada tingkat jurusan atau program studi teknik sipil ITB. HMS ITB selalu berkomitmen untuk memenuhi kebutuhan anggotanya melalui wadah-wadah yang dirancang dari, oleh, dan untuk anggota HMS ITB itu sendiri",
            "Himpunan Mahasiswa Teknik Lingkungan ITB merupakan wadah organisasi kemahasiswaan berbasis keilmuan Teknik Lingkungan yang merupakan perwujudan hasrat bersama untuk berkarya, berjuang, membina, dan menampung segenap potensi Mahasiswa Teknik Lingkungan ITB",
            "Keluarga Mahasiswa Teknik Kelautan ITB (KMKL-ITB) adalah himpunan mahasiswa yang menaungi mahasiswa program studi Teknik Kelautan ITB dan berlokasi di gedung MRK ITB. Kegiatan kami berfokus pada kebutuhan anggota dan mengutamakan budaya apresiasi dalam berbagai kegiatan kami.",
            "Himpunan Mahasiswa Mesin ITB (HMM ITB) adalah organisasi kemahasiswaan non-profit yang bergerak berdasarkan asas kekeluargaan. Organisasi ini pada awalnya berdiri pada Desember 1946 sebagai bentuk pergerakan kemahasiswaan dengan nama Himpunan Mahasiswa Bangunan Mesin dan Listrik (HMBL). Pada tahun 1956, organisasi kemahasiswaan ini kemudian berganti nama menjadi Himpunan Mahasiswa Mesin ITB, dengan Robert Sufsidi sebagai ketua umum HMM ITB kepengurusan pertama.",
            "Keluarga Mahasiswa Teknik Penerbangan (KMPN) adalah sebuah organisasi kemahasiswaan yang menaungi seluruh Mahasiswa Program Sarjana Teknik Dirgantara Institut Teknologi Bandung. KMPN ITB berdiri pada tanggal 6 Agustus 1997. Lima sifat KMPN adalah kebersamaan dalam kekeluargaan, demokratis, kemahasiswaan yang profesional, progresif, dan saling menghormati dengan pihak lain di luar KMPN.",
            "MTM ITB adalah Himpunan Mahasiswa Teknik Material ITB yang memiliki asas kebenaran ilmiah dan Tridharma perguruan Tinggi berdasarkan keTuhanan yang Maha esa yang bersifat keprofesian dan kekeluargaan."
    };

    private static int[] himpunanPhotos = {
            R.drawable.imt,
            R.drawable.hme,
            R.drawable.hmif,
            R.drawable.hmf,
            R.drawable.himatg,
            R.drawable.hmt,
            R.drawable.hmtm,
            R.drawable.himasda,
            R.drawable.hms,
            R.drawable.hmtl,
            R.drawable.kmkl,
            R.drawable.hmm,
            R.drawable.kmpn,
            R.drawable.mtm
    };

    private static String[] himpunanLinks = {
            "https://www.instagram.com/imtsignumitb/?hl=en",
            "https://www.instagram.com/hmeitb/?hl=en",
            "https://www.instagram.com/hmif_itb/?hl=en",
            "https://www.instagram.com/arspraeparandi/",
            "https://www.instagram.com/terra.itb/?hl=en",
            "https://www.instagram.com/yudhabumi/?hl=en",
            "https://www.instagram.com/hmtmpatraitb/?hl=en",
            "https://www.instagram.com/himasda_itb/?hl=en",
            "https://www.instagram.com/hms.itb/?hl=en",
            "https://www.instagram.com/hmtl_itb/?hl=en",
            "https://www.instagram.com/kmkl_itb/?hl=en",
            "https://www.instagram.com/hmm_itb/?hl=en",
            "https://www.instagram.com/kmpn_itb/?hl=en",
            "https://www.instagram.com/mtmitb/?hl=en"
    };

    static ArrayList<Himpunan> getListData() {
        ArrayList<Himpunan> list = new ArrayList<>();
        for (int i = 0; i < himpunanNames.length; i++){
            Himpunan himpunan = new Himpunan();
            himpunan.setNamaHimpunan(himpunanNames[i]);
            himpunan.setSingkatanHimpunan(himpunanSingkatans[i]);
            himpunan.setDeskripsi(himpunanDeskripsis[i]);
            himpunan.setPhoto(himpunanPhotos[i]);
            himpunan.setLinkInstagram(himpunanLinks[i]);
            list.add(himpunan);
        }
        return list;
    }
}
