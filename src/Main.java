// 34 Lines -> 11 Lines
public class Main {
    static double[] tempsList = {0.0,9.3,-2.4,8.3,7.7,16.8,14.1,26.3};
    public static void main(String[] args) {
        for (int i = 0; i < tempsList.length; i += 2) {
            System.out.println("The low will be " + (9.0/5*(tempsList[i])+32) + " and the high will be " + (9.0/5*(tempsList[i+1])+32) + ".");
        }
    }
}