package InterviewTasks;

import java.util.*;

public class BinarySearch {
    static int binarySearch(List<Integer> numbers,int value){
        int size=numbers.size();
        int low=0;
        int high=size;
        int iteration=0;
        while (low<=high){
            iteration++;
            int mid=(low+high)/2;
            if(value==numbers.get(mid)){
                System.out.printf("%d is located at index of %d%n on iteration:%d",value,mid,iteration);
                return 0;
            }
            else if(value>numbers.get(mid))low=mid+1;
            else high=mid-1;
        }
        return 1;
    }
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        for (int i = 0; i <4_000_000 ; i++) {
            numbers.add(i);
        }
        binarySearch(numbers,235120);
    }
}
