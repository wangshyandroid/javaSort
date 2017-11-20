public class Main {

    public static void main(String[] args) {
        int a[] = {34, 56, 23, 67, 90, 77, 44, 223, 55, 3, 66, 573, 135, 890, 32, 22, 11, 22, 56, 78, 22, 11, 0, 98, 79};
        Main m = new Main();
//        m.bubbleSort(a);
//        m.Bubble(a);
        m.Bubble_2(a, a.length);
        m.show(a);
    }

    /**
     * java最常见排序 之 冒泡排序
     * 在要排序的一组数中，对当前还未排好序的范围内的全部数，
     * 自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，
     * 较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，
     * 就将它们互换。
     */
    private void bubbleSort(int a[]) {
        //第一次for循环代表 一共执行数组长度减1次的排序
        for (int i = 0; i < a.length - 1; i++) {
            //第二次for循环 代表第几次排序
            for (int j = 0; j < a.length - 1 - i; j++) {
                //如果前面的值 大于 后面的值
                if (a[j] > a[j + 1]) {
                    //则将前一个的值赋值给tmp;
                    int tmp = a[j];
                    //位置交换，将后一个的值 替换前一个的值
                    a[j] = a[j + 1];
                    //将前一个赋值的tmp替换掉后一个的值
                    a[j + 1] = tmp;
                } else {
                    System.out.println(a[j] + "<" + a[j + 1] + "所以 位置不变");
                }
            }
            System.out.print("第" + (i + 1) + "次排序的结果: \t");
            show(a);
            System.out.println();
        }
        System.out.print("最后排序的结果: \t");
        show(a);
    }

    private void show(int a[]) {
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + "\t");
        }
    }

    /**
     * 冒泡排序 算法升级
     *
     * @param r
     */
    private void Bubble(int r[]) {
        int i = r.length - 1;  //初始时,最后位置保持不变
        System.out.println("i==" + i);
        int a = 0;
        while (i > 0) {
            int pos = 0; //每趟开始时,无记录交换
            for (int j = 0; j < i; j++)
                if (r[j] > r[j + 1]) {
                    pos = j; //记录交换的位置
                    int tmp = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = tmp;
                }
            i = pos; //为下一趟排序作准备
            a++;
        }
        System.out.println("一共执行了" + a + "次排序");
    }

    /**
     * 冒泡排序升级 2
     *
     * @param r
     * @param n
     */
    private void Bubble_2(int r[], int n) {
        int low = 0;
        int high = n - 1; //设置变量的初始值
        int tmp, j;
        while (low < high) {
            for (j = low; j < high; ++j) //正向冒泡,找到最大者
                if (r[j] > r[j + 1]) {
                    tmp = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = tmp;
                }
            --high;                 //修改high值, 前移一位
            for (j = high; j > low; --j) //反向冒泡,找到最小者
                if (r[j] < r[j - 1]) {
                    tmp = r[j];
                    r[j] = r[j - 1];
                    r[j - 1] = tmp;
                }
            ++low;                  //修改low值,后移一位
        }
    }
}
