package constant;

public class Test {

    public enum Demo {
        First(1,"one",new String[]{"111"}),
        Second(2,"two",new String[]{"222"}),
        Third(3,"three",new String[]{"333"});
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
        de = Demo.valueOf("Third");
        System.out.println(de.args[0]);
        //output 333
    }
}
