public class Main {

    public static void main(String[] args) {
        int a[] = {34, 56, 23, 67, 90, 77, 44, 223, 55, 3, 66, 573, 135, 890, 32, 22, 11, 22, 56, 78, 22, 11, 0, 98, 79};
        Isort m = new Bubble();
//        m.bubbleSort(a);
//        m.Bubble(a);
        m.sort(a);
        m.print(a);

    }
}
