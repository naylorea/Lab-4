import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(50) + 1;
    int store = randomNum;
    System.out.println("The Random number is: " + randomNum);

    if (randomNum >= 0) {
      while (randomNum >= 0) {
        System.out.println(randomNum);
        randomNum--;
      }
    }

    if (store <= 5) {
      System.out.println("Ahoy Mateys!");
    }

    else if (store > 25 & store < 42) {
      System.out.println("Cannonball!");
    } 

    else {
      System.out.println("Blast off!");
    }

  }
}