public class Main {

  public static void main(String[] args) {
    
    int count = 0;

    for(int i=1; i<=100; i++) {
      if(i%2 != 0) {
        System.out.print(i + " "); 
        count++;
      }
    }

    System.out.println();
    System.out.println("Total odd numbers between 1 to 100: " + count);

  }

}