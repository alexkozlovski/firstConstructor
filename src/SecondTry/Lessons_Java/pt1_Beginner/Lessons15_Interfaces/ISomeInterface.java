package SecondTry.Lessons_Java.pt1_Beginner.Lessons15_Interfaces;

interface ISomeInterface {
    int SOME_VAR = 22;

    void SumTwoDigit(int a, int b);
}

interface IOtherIterface {
    void someMethode();
}

interface Bancable {
    void bounce();
}

class Example implements ISomeInterface, Bancable {
    @Override
    public void SumTwoDigit(int a, int b) {
    }


    public void someMethode() {

    }

    @Override
    public void bounce() {

    }

}