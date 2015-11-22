package com.pellegrinoprincipe;

public class ArrayTridi
{
    public static void main(String[] args)
    {
        // uno spazio tridimensionale: coordinate x, y e z
        boolean space[][][] = new boolean[100][100][20];

        // mettiamo qualche punto nello spazio. true significa che il punto
        // è presente in quella coordinata. false significa assenza del punto
        space[0][0][0] = true;
        space[0][0][2] = true;
        space[0][1][0] = true;
        space[0][1][1] = true;
        space[0][1][2] = true;
        space[0][2][1] = true;
 
        for (int x = 0; x < space.length; x++)
        {
            for (int y = 0; y < space[x].length; y++)
            {
                for (int z = 0; z < space[x][y].length; z++)
                {
                    // comunica le coordinate spaziali solo se è presente un punto
                    if (space[x][y][z])
                    {
                        System.out.println("[X =  " + x + ", Y = " + y + ", Z = " + z + "]");
                    }
                }
            }
        }
    }
}
