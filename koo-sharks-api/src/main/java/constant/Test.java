package constant;

public class Test {

    public enum Demo {
        FIRST(1,"one",new String[]{"111"}),
        SECOND(2,"two",new String[]{"222"}),
        THIRD(3,"three",new String[]{"333"});
        int code;
        String describe;
        String[] args;

        Demo(int code, String describe, String[] args) {
            this.code = code;
            this.describe = describe;
            this.args = args;
        }
    }

    public static void main(String[] args) {
        Demo de = null;
        de = Demo.valueOf("Third".toUpperCase());
        System.out.println(de.args[0]);
        //output 333
    }
}
