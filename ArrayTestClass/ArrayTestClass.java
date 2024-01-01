import java.util.Random;

class ArrayTestClass {

    public static void main(String[] args) {
        int[] myArray;
        String[] myStrings;
        int[][] MultiDimArr;
        String str;
        Integer i2 = new Integer(10);
        /*DataType Identifier = reference to object from class */
        byte b = i2.byteValue();
        String s = Integer.toHexString(i2); 
        Random rand = new Random();       
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        int z = x<y?0:1; /*Ternary Operator */

        myArray = new int[3];
        myStrings = new String[4];
        MultiDimArr = new int[2][2];

        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;

        myStrings[0] = new String("Hello");
        myStrings[1] = new String("World");
        myStrings[2] = new String("hi");
        myStrings[3] = "hi"; /*String pool */
        str = "hi"; /*String pool */

        MultiDimArr[0][0] = 5;
        MultiDimArr[0][1] = 4;
        MultiDimArr[1][0] = 7;
        MultiDimArr[1][1] = 8;

        System.out.println(myArray[0]);
        System.out.println(myStrings[0].length());
        System.out.println(myStrings.length);
        System.out.println(str == myStrings[3]);
        System.out.println(str == myStrings[2]);
        System.out.println(myStrings[2] == myStrings[3]);
        System.out.println(str.equals(myStrings[3]));
        System.out.println(myStrings[2].equals(myStrings[3]));
        System.out.println(i2);
        System.out.println(b);
        System.out.println(s);
        System.out.println(z);

        for (int j = 0; j < MultiDimArr.length; j++)
        {
            for (int i : MultiDimArr[j])
            {
                System.out.println(i);
            }
        }
    }
}