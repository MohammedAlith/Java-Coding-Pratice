// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String args[])
    {
//i for rows and j for columns
//row denotes the number of rows you want to print
        int i, j, row = 5,num=1, maxNum=18;
//Outer loop work for rows
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=2*(row-i); j>=0; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                if(num!=maxNum) {
                    System.out.print(num+" ");
                    num += 1;
                }
            }

//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}