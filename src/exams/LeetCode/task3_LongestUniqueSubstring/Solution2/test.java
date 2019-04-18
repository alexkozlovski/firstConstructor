package exams.LeetCode.task3_LongestUniqueSubstring.Solution2;

public class test {
    public static void main(String[] args) {
        String s="asdfgh";
        boolean flag=Boolean.FALSE;
        for (int i = 0; i <s.length(); i++) {
            if(flag==false&&i==4){
                flag=Boolean.TRUE;
                i-=i-1;
            }
            System.out.println(s.charAt(i)+"    "+i);
        }
    }
}
