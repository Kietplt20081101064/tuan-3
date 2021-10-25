gói  com.kiet2008110164.tuan03.Lab3 ;

nhập  java.util.Arrays ;
nhập  java.util.Scanner ;

 lớp  công cộng Lab3Bai3 {
    public  static  void  main ( String [] args ) {
        Máy quét sc =  Máy quét mới  ( Hệ thống . In);
        Hệ thống . ra ngoài . println ( " Import number of array: " );
        int n = sc . nextInt ();
        int a [] =  new  int [n];
        for ( int i =  0 ; i < n; i ++ ) {
            Hệ thống . ra ngoài . printf ( " A [% d] = " , i);
            a [i] = sc . nextInt ();
        }
        Mảng . sắp xếp (a);
        for ( int i =  0 ; i < n; i ++ ) {
            Hệ thống . ra ngoài . println ();
            Hệ thống . ra ngoài . printf ( " A [% d] =% d " , i, a [i]);    
        }
        int  Min  = a [ 0 ];
        for ( int x : a) {
            Toán học . min ( Min , x);
        }
        Hệ thống . ra ngoài . println ( " \ n \ n Phần tử nhỏ nhất trong mảng là: "  +  Min );
        int tong =  0 ;
        int dem =  0 ;
        for ( int x : a) {
            nếu (x %  3  ==  0 ) {
                tong + = x;
                dem ++ ;
            }      
        }
        Hệ thống . ra ngoài . printf ( " \ n Trung bình cộng số chia hết cho 3 =% d " , tong / dem);
        sc . gần();  
    }  
    
}