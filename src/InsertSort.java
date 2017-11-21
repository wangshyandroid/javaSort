/**
 * Created by wangshy on 17/11/21.
 */
public class InsertSort {
    /**
     * 直接插入排序
     *
     * @param array
     * @return
     */
    public int[] inserSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i + 1];
            int j = i;
            for (; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }
}
