gói  com.kiet2008110164.tuan03.Lab3 ;

 lớp  công cộng Lab3Bai2 {
    public  static  void  main ( String [] args ) {
        Hệ thống . ra ngoài . println ( " CHƯƠNG TRÌNH BẢNG " );
        for ( int i =  1 ; i <=  10 ; i ++ ) {
            for ( int j =  1 ; j <=  9 ; j ++ ) {
                Hệ thống . ra ngoài . printf ( " |% 2d x% d =% 2d   " , i, j, i * j);
                Hệ thống . ra ngoài . println ();
            }
            Hệ thống . ra ngoài . println ();
        }
    }
}