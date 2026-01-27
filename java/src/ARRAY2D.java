class ARRAY2D
{
    public static void main(String[]args)
    {
        int [][]a={
                {1,3,5},
                {2,4,6},
                {7,8,9}
        };
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}