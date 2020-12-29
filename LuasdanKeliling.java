class LuasdanKeliling {
  //method luas
  static double luas(double p,double l){
    double luaspersegi = p * l;
    return luaspersegi;
  }
  //method keliling
  static double keliling(double p,double l){
    double kelilingpersegipanjang = 2*(p+l);
    return kelilingpersegipanjang;
  }
  //memanggil method
  public static void main(String[] args) {
      System.out.println(luas(3,5));
      System.out.println(keliling(3,5));
  }
}