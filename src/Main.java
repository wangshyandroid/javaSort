import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //冒泡排序
        Isort m = new Bubble();
//        print(m.sort(Utils.getOutOfOrder());
        //插入排序
        InsertSort sort = new InsertSort();
        print(sort.inserSort(Utils.getOutOfOrder()));
    }

    private static void print(int[] a) {
        System.out.println("排序后的结果为:" + Arrays.toString(a));
    }

}
