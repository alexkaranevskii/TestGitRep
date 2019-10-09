package Lesson1.HomeWork1;

public class Competition {

    private final String competitionTitle;

    private Obstacle[]obstacles;
    private Participant[]participants;

    private List<Participant> lastWinners = new LinkedList<>();


    public Competition(String competitionTitle){
        this.competitionTitle = competitionTitle;
    }

    public void setObstacles(Obstacle... obstacles){
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participant) {
        this.participants = participants;
    }

    public void startCompetition() {
        lastWinners.clear();

        for (Participant participant : participants) {
            boolean succes = passAllObstacles(participant);
            if (!succes) {
                System.out.println("Участник  " + participant + " покинул испытания");
            } else {
                lastWinners.add(participant);
            }
        }
    }

    public Iterable<Participant> getLastWinners() {
        return lastWinners;
    }

    private boolean passAllObstacles(Participant participant) {
     for (Obstacle obstacle : obstacles){
         if (!obstacle.passObstacleBy(participant)) {
             return  false;
      }
    }
     return  true;
  }
}