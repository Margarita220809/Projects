
public class Main {
    static void findmax(int[] array){
        int max = array[0];
        for(int x:array)
        {
            if(x > max)
                max = x;
        }
        System.out.println("Max = " + max);
    }
    public static void main(String[] args) {
      /*  Scanner in = new Scanner(System.in);
        System.out.println("Insert 2 numbers");
        int first = in.nextInt();
        int second = in.nextInt();
        int[][] firstarray = new int[first][second];
        for(int[] ints:firstarray)
        {
            for(int i = 0; i < ints.length; i++)
            {
                ints[i] = ((int) (Math.random() + 1001));
            }

        }*/

/*for(int[] ints:firstarray)
{
	for(int number:ints)
	{
System.out.println(number + “ ”);
}
System.out.println(“”);
}*/

        int [] array = {35634433, 5, 544, 8, 9, 64};
        Main.findmax(array);
    }

}