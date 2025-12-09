public class array {
    static  void myArray(){
        String[] cars={"volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }   
        System.out.println("Array has been printed.\n");
       
    }
    public static void main(String[] args) {
        myArray();
    }
}
