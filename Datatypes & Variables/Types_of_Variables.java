public class Types_of_Variables {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = ((f*b) + (i%c) - (d*s));

        System.out.println(result);
        System.out.println(((Object) result).getClass().getSimpleName());// getSimpleName() just give name of datatype
        System.out.println(((Object) result).getClass().getName());// getName() give whole package name
    }
}
