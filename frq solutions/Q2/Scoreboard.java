public class Scoreboard {
  private String t1, t2;
  private int scoreT1, scoreT2;
  private int active = 1;

  public Scoreboard(String t1, String t2){
    this.t1 = t1;
    this.t2 = t2;
  }

  public void recordPlay(int n){
    if(n == 0){
      active++;
    }
    else{
      if(n % 2 == 1){
        scoreT1 += n;
      }
      else{
        scoreT2 += n;
      }
    }
  }

  public String getScore(){
    String TEAM = "";
    if(active % 2 == 1){
      TEAM = t1;
    }
    else{
      TEAM = t2;
    }
    return scoreT1+"-"+scoreT2+"-"+TEAM;
  }
}
