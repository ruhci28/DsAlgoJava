class Test {
    public static void main(String []ar) {
        int x = 5;
        do {
            x++;
            System.out.println(x);
            if (++x < 10)
                continue;
            x++;
            System.out.println(x);
        } while (true);
    }}