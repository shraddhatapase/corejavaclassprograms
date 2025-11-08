package ConstructorTest;

public class SetterInjection {
    public static void main(String[] args) {
        
        Game g = new Game();

        // Injecting dependency using setter
        g.setGamename("Cricket");
       
        System.out.println(g.getGamename());
    }
}

class Game {
    String name;

    // Setter method (injection)
    public void setGamename(String nam) {
        this.name = nam;
    }

    // Getter method (to access value)
    public String getGamename() {
        return name;
    }
}
