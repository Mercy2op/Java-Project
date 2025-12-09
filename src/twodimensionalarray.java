public class twodimensionalarray {
    static void myTwoDimensionalarray(){
        String[][] cars={
            {"Volvo","BMW","Ford"},
            {"Mazda","Toyota","Honda"},
            {"Chevrolet","Nissan","Hyundai"}
        };
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Two-dimensional array has been printed.\n");
    }
    public static void main(String[] args) {
        myTwoDimensionalarray();
    }
}               