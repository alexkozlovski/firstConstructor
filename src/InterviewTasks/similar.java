package InterviewTasks;


import java.util.*;

public class similar {
    static Map<Integer, Integer> ints=new HashMap<>();
    public static void main(String[] args) {
        int[] ints=new int[15];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=Math.abs(new Random().nextInt(7))+1;
        }
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            if(!similar.ints.containsKey(ints[i]))similar.ints.put(ints[i],1);
            else {
                similar.ints.put(ints[i],similar.ints.get(ints[i])+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:similar.ints.entrySet()){
            if(entry.getValue()>1) System.out.printf("[Number: %d count: %d]\n",entry.getKey(),entry.getValue());
        }
        System.out.println(similar.ints);
    }
}
