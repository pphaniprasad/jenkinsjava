public class Reverse
  {
    public static void main(String args[])
     {
      int n=Integer.parseInt(args[0]);
        int rev=0;
      while (n>0)
        {
          rev=rev*10+(n%10);
          n/=10;
        }
      System.out.println("Given Number="+n);
      System.out.println("Reversed Number="+rev);
    }
  }
