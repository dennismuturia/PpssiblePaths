public class Main {

    public static void main(String[] args) {
        //This sis a method that is supposed to output all of the paths
        System.out.println( paths(9,13));
    }
    public static int paths(int n, int m){
        if ((n ==1) || (m == 1)){
            return 1;
        }
        return paths(n-1, m) + paths(n, m-1);
    }
}
