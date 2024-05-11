package phongtaph31865.poly.lab1

fun main(){
    val sv1 = SinhVienModel("Tran Anh Phong", "PH31865", 8f)
    val sv2 = SinhVienModel("AAAAAA", "PH31865", 8f)
    sv2.daTotNghiep = false
    sv2.tuoi = 22
    val sv3 = SinhVienModel("Tran Thu Phuong", "PH12533", 8.5f, false, 22)
    val listSv = mutableListOf<SinhVienModel>();
    listSv.add(sv1)
    listSv.add(sv2)
    listSv.add(sv3)
    for (sinhvien in listSv) {
        println(sinhvien.getTT())
    }

    for (i in listSv.indices) {
        println("SV thu $i: \n ${listSv.get(i).getTT()}")
    }
    do {

    }while (true)
}