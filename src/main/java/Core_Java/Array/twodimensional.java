package core_java.Array;

public class twodimensional
{
    public static void main(String[] args)
    {
//                              0           1       2
        int [] [] matrix ={{23,45,67},{56,87,67},{12,34,67} };
//                          0  1   2    0  1 2    0   1  2

        for(int row=0;row<=2;row++)
        {
            for(int column=0 ;column<3 ;column++)
            {
                System.out.print(matrix[row][column]+"  ");
            }
            System.out.println();
        }
    }
}
