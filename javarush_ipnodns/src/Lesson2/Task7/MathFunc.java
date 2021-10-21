package javarush.ipnodns.Lesson2.Task7;

public class MathFunc {
    public static int min(int a, int b){
    return a < b ? a : b;
}

    public static int max(int a, int b){
        return a > b ? a : b;
    }

    public static int min(int a, int b, int c){
        int d = min(a,b);
        return d < c ? d : c;
    }

    public static int min(int a, int b, int c, int d){
        int f = min(a,b);
        int g = min(c,d);
        return f < g ? f : g;
    }
}
