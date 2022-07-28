package sum;

public class Sum {
    public int sumRec(int[] arr){
        if (arr.length == 1){
            return arr[0];
        }else {
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 1, newArr, 0, newArr.length);
            return arr[0] + sumRec(newArr);
        }
    }
}
