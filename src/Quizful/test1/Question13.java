package Quizful.test1;

public class Question13 {
    public static void main(String[] args) {
        new Sente().go();
        new Goban().go();
        new Stone().go();
    }
}class Sente implements Go{
    @Override
    public void go() {
        System.out.println("go in Sente");
    }
}
class Goban extends Sente{
    @Override
    public void go() {
        System.out.println("go in Goban");
    }
}
class Stone extends Goban implements Go{
    @Override
    public void go() {
        super.go();
    }
}
interface Go{
    void go();
}
