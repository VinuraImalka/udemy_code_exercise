public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(canPack(0,6,5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 | goal < 0)
            return false;

        if (bigCount * 5 + smallCount < goal)
            return false;

        int count = 0;
        while (count <= smallCount) {
            if ((goal - count) % 5 == 0) {
                return true;
            }
            count++;
        }
        return false;
    }
}