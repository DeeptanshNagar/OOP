class Player {
    String name;
    int age;
    String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
    public void play() {
        System.out.println(name + " is playing as a " + position);
    }
    public void train() {
        System.out.println(name + " is training hard!");
    }
}

// SC-1: Cricket Player
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }
}
// SC-2: Football Player
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }
}
// SC-3: Hockey Player
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }
}
public class Sports {
    public static void main(String[] args) {
        Cricket_Player cricketer = new Cricket_Player("Gill", 35, "Batsman");
        Football_Player footballer = new Football_Player("Ronaldino", 36, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Martinez", 30, "Goalkeeper");
        cricketer.play();
        cricketer.train();
        footballer.play();
        footballer.train();
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}