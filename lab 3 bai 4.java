gói  com.kiet2008110164.tuan03.Lab3 ;

nhập  java.util.Arrays ;
nhập  java.util.Comparator ;
nhập  java.util.List ;
nhập  java.util.Scanner ;

 lớp  công cộng Lab3Bai5 {
    public  static  void  main ( String [] args ) {
        Máy quét sc =  Máy quét mới  ( Hệ thống . In);
        Hệ thống . ra ngoài . print ( " Nhập số sinh viên: " );
        int soSinhVien = sc . nextInt ();
       SinhVien sinhVien [] =  new  SinhVien [soSinhVien];
        for ( int i =  0 ; i < soSinhVien; i ++ ) {
            sinhVien [i] =  new  SinhVien ();
            Hệ thống . ra ngoài . printf ( " >> Nhập thông tin sinh viên thứ% d: " , i + 1 );           
            sinhVien [i] . nhapThongTin ();
        }
        //   for (int i = 0; i <sinhVien.length; i ++) {
        //      System.out.println ("\ n >> Thông tin sinh viên" + (i + 1));
        //      sinhVien [i] .xuatThongTin ();
        // }
        List < SinhVien > list =  Mảng . asList (sinhVien);
        Bộ so sánh  < SinhVien > comp =  new Bộ  so sánh < SinhVien > () {

            @Ghi đè
            public  int  so sánh ( SinhVien  o1 , SinhVien  o2 ) {               
                trả về  số nguyên . so sánh (o1 . tuoi, o2 . tuoi);
            }   
        };
        danh sách . sắp xếp (comp);
         for ( int i =  0 ; i < sinhVien . length; i ++ ) {
            Hệ thống . ra ngoài . println ( " \ n >> Thông tin sinh viên " + (i + 1 ));
            sinhVien [i] . xuatThongTin ();
        } 
        sc . gần();
    }
}