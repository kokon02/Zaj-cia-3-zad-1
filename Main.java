class Main {
  public static void main(String[] args) {
    int wysokosc = 4; //wysokosc prosokąta
    int dlugosc = 6; //dlgosc prosokąta

    for(int i = 0; i<wysokosc; i++){
      for (int j = 0; j<dlugosc; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}