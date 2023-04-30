public class Exercise2 {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        ArrayOutput.print(a);
        ArrayOutput.print(b);

        int[] c = ArrayHandler.merge(a,b);
        ArrayOutput.print(c);

        ArrayHandler.sort(c);
        ArrayOutput.print(c);

        ArrayOutput.write(c, "output.txt");
    }
}
