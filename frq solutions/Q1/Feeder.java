public class Feeder{
  private int currentFood;

  public Feeder(int currentFood){
    this.currentFood = currentFood;
  }

  public void simulateOneDay(int numBirds){
    boolean normal = (int)(Math.random()* 100 + 1) <= 95;

    if(normal){
      int gramsEaten = (int)(Math.random()*(50-10+1)+10);
      int totalEaten = gramsEaten * numBirds;

      if(totalEaten > currentFood){
        currentFood = 0;
      }
      else{
        currentFood -= totalEaten;
      }
    }
    else {
      currentFood = 0;
    }
  }

  public int simulateManyDays(int numBirds, int numDays){
    int day = 1;
    while(currentFood > 0 && day < numDays){
      day++;
      simulateOneDay(numBirds);
      System.out.println("food left: "+getCurrentFood());
      System.out.println();
    }
    System.out.print("Days: ");
    return day;

  }

  public int getCurrentFood(){
    return currentFood;
  }

  
}
