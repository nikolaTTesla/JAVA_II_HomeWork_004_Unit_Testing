public class myMath {
    boolean isTriangleShape(int side_1, int side_2, int side_3)
    {
        int a = 0,b = 0,c = 0;

//Finding two smallest sizes
        if(side_1<=side_2 && side_1<=side_3)
        {
            //side_1 is smallest
            a=side_1;
            if(side_2<=side_3)
            {
                //side_2 is middle
                b=side_2;
                //side_3 is highest
                c=side_3;
            }
            else{
                //side_3 is middle
                b=side_3;
                //side_2 is highest
                c=side_2;
            }
        }
        if(side_2<=side_1 && side_2<=side_3)
        {
            //side_2 is smallest
            a=side_2;
            if(side_1<=side_3)
            {
                //side_1 is middle
                b=side_1;
                //side_3 is highest
                c=side_3;
            }
            else {
                //side_3 is middle
                b=side_3;
                //side_1 is highest
                c=side_1;
            }
        }
        if(side_3<=side_1 && side_3<=side_2)
        {
            //side_3 is smallest
            a=side_3;
            if(side_1<=side_2)
            {
                //side_1 is middle
                b=side_1;
                //side_2 is highest
                c=side_2;
            }
            else {
                //side_2 is middle
                b=side_2;
                //side_1 is highest
                c=side_1;
            }
        }
//Making sure if two smallest sizes summarized are still smaller than third, we get false as a return, and if they are bigger then true
        if(a+b<=c)
        {
            return false;
        }
        else {
            return true;
        }
    }
    int triangleNumber(int n)
    {
        int sumForReturn = 0;
        for(int i = 1; i <n+1; i++)
        {
            sumForReturn = sumForReturn+i;
        }
        return sumForReturn;
    }

    int squareNumber(int n)
    {
        return n*n;
    }

    boolean isSquareNumber(int n)
    {
        //finding a square root, and removing remainder if there is any by casting
        int squareRootNoRemainder = (int)Math.sqrt(n);
        //Looking if we have prefect square
        if((squareRootNoRemainder * squareRootNoRemainder) == n)
        {
            return true;
        }
        else{
            return false;
        }
    }

    boolean isTriangleNumber(int n)
    {
        //If negative number is tested we have automatically false return
        if(n < 0)
        {
            return false;
        }
        int i = 0;

        while(n>0)
        {
            i++;
            n=n-i;
        }
        if(n == 0)
        {
            return true;
        }
        return false;
    }




}
