package SecondTry.obrazovanie_online.Lessons7;

public class someclass {

    public static String go(){



//быстро
        String[] fields = new String[] {"a","b","c","d","e","f","g"};
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            s.append(fields[i]);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(go());
    }

}
