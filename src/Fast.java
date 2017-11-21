/**
 * Created by wangshy on 17/11/20.
 */
public class Fast implements Isort {
    @Override
    public int[] sort(int[] a) {
        return new int[0];
    }


    private static int getMiddle(int[] list, int low, int high) {
        int tmp = list[low];    //数组的第一个作为中轴
        while (low < high) {
            while (low < high && list[high] >= tmp) {
                high--;
            }


            list[low] = list[high];   //比中轴小的记录移到低端
            while (low < high && list[low] <= tmp) {
                low++;
            }


            list[high] = list[low];   //比中轴大的记录移到高端
        }
        list[low] = tmp;              //中轴记录到尾
        return low;                  //返回中轴的位置
    }


    private static void _quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);  //将list数组进行一分为二
            _quickSort(list, low, middle - 1);      //对低字表进行递归排序
            _quickSort(list, middle + 1, high);      //对高字表进行递归排序
        }
    }
}
