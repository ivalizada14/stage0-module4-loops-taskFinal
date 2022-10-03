package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int x = 1; x <= cathetusLength; x++)
        {
            int numberToPrint = x;
            for(int y = 1; y<cathetusLength * 2; y++)
            {
                if(y>=cathetusLength-x+1&&y<=cathetusLength+x-1)
                {
                    System.out.print(numberToPrint);
                    if(y<cathetusLength)
                        numberToPrint--;
                    else
                        numberToPrint++;
                }

                else{
                    System.out.print(' ');

                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
