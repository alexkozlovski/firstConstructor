package SecondTry.obrazovanie_online.Lessons6;

public class Lessons6 {
    public static void main(String[] args) {
        int[][] mas=new int[5][5];
        int k=0;
        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas.length ; j++) {
                mas[i][j]=k++;
                System.out.printf("%3d",mas[i][j]);
            }
            System.out.println();
        }
/*        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas.length ; j++) {
                System.out.printf("%3d",mas[i][j]);
            }
            System.out.println();
        }*/
int sumglavdiag=0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if(i==j)sumglavdiag+=mas[i][j];

            }
        }
        System.out.println(sumglavdiag);

        System.out.println("asdasdasd");
        sumglavdiag=0;
        for (int i = 0; i < mas.length; i++) {
            sumglavdiag+=mas[i][i];

        }
        System.out.println(sumglavdiag+"\n"+"asdasd\n");
        int sumpobo4diagonal=0;
        int dopvar=mas.length-1;
        for (int i = 0; i <mas.length ; i++) {
            sumpobo4diagonal+=mas[i][dopvar--];

        }
        System.out.println(sumpobo4diagonal);

        int sumpobo4diag=0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if(i+j==mas.length)sumpobo4diag+=mas[i][j];

            }
        }
        System.out.println(sumpobo4diag);

        System.out.println("asdasdasdasd");
/*        var sumpodpovo4=0;
        for (int i = mas.length-1; i >0 ; i--) {
            for (int j = 0; j < mas.length-1; j++) {


            }

        }*/





        }
    }

