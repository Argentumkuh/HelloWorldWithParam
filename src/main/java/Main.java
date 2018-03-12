public class Main {

    public static String paramName;

    public static void main(String[] args) {
        try{
            paramName = args[0];
        } catch (Exception e) {
            paramName = "no params";
        }

        System.out.println(paramName);
    }
}
