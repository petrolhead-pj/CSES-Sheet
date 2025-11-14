public class WeirdAlgo{

public static void main (String args[]){

  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  while(true)
    {
      System.out.println(n);

    if(n == 1)
    break;

    else if(n % 2 == 0)
    {
      n=n/2;
    }

    else
    {
      n=3*n+1;
    }
    }
}
}
