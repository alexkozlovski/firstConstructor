package SecondTry.Lessons_Java.pt4_Advanced.Lessons154_Javadoc;

/**
 * @author Worker
 * @version 1.1
 * @since 1.0
 * this is Class2 class , here i will write <strong>code<strong/>
 * <img src="doc-files/image.jpg" alt="sho"/>
 */
public class Main {
    /**
     *this is int field
     */
    int myField;

    /**
     *Here program start
     * @param args command line values
     */
    public static void main(String[] args) {

    }
    /**
     *This field will return i
     * @param i some int value
     * @param s some other String value
     * @throws RuntimeException if something wrong this exception will be throw
     * @return i from param
     */
    int getMyField(int i,String s)throws RuntimeException{
        return i;
    }

    /**
     * @deprecated pls use new method
     */
    void oldmethod(){

    }

    /**
     * this is some description with some link {@link OtherClass#otherMethod()}
     * @see OtherClass#otherMethod()
     * @see "chap2"
     */
    void newMethod(){

    }
}
