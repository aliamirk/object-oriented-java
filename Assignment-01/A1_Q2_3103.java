package A01;

// Robot class representing a robot player
class Robot {
    private String name;
    private int hits;

    public Robot(String name) {
        this.name = name;
        this.hits = 0;
    }

    public void hitBall(Ball ball, String direction) {

        switch (direction.toLowerCase()) {
            case "up":
                ball.move(0, 1);
                break;
            case "down":
                ball.move(0, -1);
                break;
            case "left":
                ball.move(-1, 0);
                break;
            case "right":
                ball.move(1, 0);
                break;
        }
        hits++;
        System.out.println(name + " hit the ball " + direction + ". Ball position: " + ball.getPosition());
    }

    public int getHits() {
        return hits;
    }

    public String getName() {
        return name;
    }
}

// Ball class representing the football
class Ball {
    private int x, y;

    public Ball(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String getPosition() {
        return "(" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

// Goal class representing the goal position
class Goal {
    private final int goalX = 3;
    private final int goalY = 3;

    public boolean isGoalReached(int ballX, int ballY) {
        return ballX == goalX && ballY == goalY;
    }
}

// Team class representing a football team with a robot player
class Team {
    private String teamName;
    private Robot robot;

    public Team(String teamName, Robot robot) {
        this.teamName = teamName;
        this.robot = robot;
    }

    public String getTeamName() {
        return teamName;
    }

    public Robot getRobot() {
        return robot;
    }
}

// Game class
class Game {
    private Team teamOne;
    private Team teamTwo;
    private Ball ball;
    private Goal goal;

    public Game(Team teamOne, Team teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.ball = new Ball(0, 0);  // Ball starts at (0,0)
        this.goal = new Goal();
    }

    public void startGame() {
        System.out.println("Game Started!");

        play(teamOne, new String[]{"left", "up", "right", "up", "right", "up", "right", "up", "right", "down"});
        play(teamTwo, new String[]{"right", "right", "up", "up", "right", "up"});

        declareWinner();
    }

    private void play(Team team, String[] moves) {
        System.out.println("\nTeam " + team.getTeamName() + " is playing...");
        Robot robot = team.getRobot();
        ball = new Ball(0, 0); // Reset ball position for each play

        for (String move : moves) {
            if (!goal.isGoalReached(ball.getX(), ball.getY())) {
                robot.hitBall(ball, move);
            } else {
                break;
            }
        }

        System.out.println("Goal reached in " + robot.getHits() + " hits!\n");
    }

    private void declareWinner() {
        int hitsTeamOne = teamOne.getRobot().getHits();
        int hitsTeamTwo = teamTwo.getRobot().getHits();

        System.out.println("\nGame Over!");
        System.out.println(teamOne.getTeamName() + " hits: " + hitsTeamOne);
        System.out.println(teamTwo.getTeamName() + " hits: " + hitsTeamTwo);

        if (hitsTeamOne < hitsTeamTwo) {
            System.out.println("Winner: " + teamOne.getTeamName());
        } else if (hitsTeamOne > hitsTeamTwo) {
            System.out.println("Winner: " + teamTwo.getTeamName());
        } else {
            System.out.println("It's a tie!");
        }
    }
}

public class A1_Q2_3103 {
    public static void main(String[] args) {
        System.out.println("Muhammad ALi - 24K 3103\n");
        Robot robot1 = new Robot("Messi");
        Robot robot2 = new Robot("Ronaldo");

        Team teamOne = new Team("Real Vardrid", robot1);
        Team teamTwo = new Team("FC Barcelona", robot2);

        Game game = new Game(teamOne, teamTwo);
        game.startGame();
    }
}

