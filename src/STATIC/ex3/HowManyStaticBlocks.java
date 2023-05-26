package STATIC.ex3;

public class HowManyStaticBlocks {
    static int HowManyStaticBlocks;
    static {
        System.out.println("This is Static Block under number "+ HowManyStaticBlocks);
    }
    static {
        HowManyStaticBlocks++;
        System.out.println("This is Static Block under number "+ HowManyStaticBlocks);
    }
    static {
        HowManyStaticBlocks++;
        System.out.println("This is Static Block under number "+ HowManyStaticBlocks);
    }
    static {
        HowManyStaticBlocks++;
        System.out.println("This is Static Block under number "+ HowManyStaticBlocks);
    }
    static {
        HowManyStaticBlocks++;
        System.out.println("This is Static Block under number "+ HowManyStaticBlocks);
    }
    static {
        HowManyStaticBlocks++;
        System.out.println("This is Static Block under number "+ HowManyStaticBlocks);
    }
}
