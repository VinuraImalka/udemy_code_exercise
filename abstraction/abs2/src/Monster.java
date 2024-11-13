import java.util.List;

public class Monster implements Saveable{
    String name;
    int hp;
    int strength;

    public Monster(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }



    @Override
    public String toString() {
        return "name=%s,hp=%d,strength=%d".formatted(this.name,this.hp,this.strength);
    }

    @Override
    public List<String> write() {
        List<String> list = List.of(this.name, String.valueOf(this.hp), String.valueOf(this.strength));
        return list;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && !savedValues.isEmpty()) {
            this.name = savedValues.get(0);
            this.hp = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
}
