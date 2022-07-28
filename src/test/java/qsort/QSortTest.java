package qsort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import quicksort.QiuckSortRecurs;

import java.util.Random;

public class QSortTest {

    private static int[] arr;
    private static int[] arrClone;

//    @Before
//    public void initArr(){
//        Random rand = new Random();
//        arr = new int[rand.nextInt(10)];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rand.nextInt(10);
//        }
//    }

    @Before
    public void initArr() {
        arr = new int[]{5, 7, 1, 4, 3, 0};
        arrClone = arr;
    }

    @Test
    public void qSortShouldSortNum(){
        QiuckSortRecurs qSort = new QiuckSortRecurs();
        qSort.qSortArr(arrClone, 0 , arrClone.length-1);
        Assert.assertArrayEquals(new int[]{0, 1, 3, 4, 5, 7}, arr);
    }
}
