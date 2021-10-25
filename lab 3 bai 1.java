gói  com.kiet2008110164.tuan03.Lab3 ;

nhập  java.util.Scanner ;

 lớp  công cộng Lab3Bai1 {
    public  static  void  main ( String [] args ) {
        Máy quét sc =  Máy quét mới  ( Hệ thống . In);
        Hệ thống . ra ngoài . println ( " Nhập 1 số: " );
        int n = sc . nextInt ();
        boolean ok =  true ;
        for ( int i =  2 ; i < n -  1 ; i ++ ) {
            nếu (n % i ==  0 ) {
                ok =  sai ;
                phá vỡ ;
            }
        }
        nếu (ok ==  true )
            Hệ thống . ra ngoài . println (n +  " là số nguyên tố! " );
        khác  Hệ thống . ra ngoài . println (n +  " is not a integer! " );    
        sc . gần();
    }
    
}