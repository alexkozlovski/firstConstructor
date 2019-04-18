package exams.MyStack.ResisebleStack;

public class SystemArrayCopyInfo {
    public static int[] array;

    public static void add(int... arr) {
        if (arr.length <= array.length) {
            System.arraycopy(arr, 0, array, 0, arr.length);
        } else {
            int[] localAr = new int[array.length + arr.length];
            System.arraycopy(array, 0, localAr, 0, array.length);
            System.arraycopy(arr, 0, localAr, array.length, arr.length);
            array = localAr;
/*            array=new int[array.length+arr.length];
            System.arraycopy(localAr,0,array,0,localAr.length);
            System.arraycopy(arr,0,array,array.length,arr.length);*/
        }

    }

    private double[] concatArray(double[] a, double[] b) {
        if (a == null) return b;
        else if (b == null) return a;
            double[] r = new double[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);//откуда, с какого эл-ту(с откуда), куда, с какого эл-та(в куда),до какого эл-та копироать(откуда)
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }
}
