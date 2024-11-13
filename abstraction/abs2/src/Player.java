import java.util.List;

public class Player implements Saveable{
    private String name;
    private String weapon;
    private int hp;
    private int strength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Player(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> list = List.of(this.name, String.valueOf(this.hp), String.valueOf(this.strength), this.weapon);
        return list;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && !savedValues.isEmpty()) {
            this.name = savedValues.get(0);
            this.hp = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name=%s, hp=%d, strength=%d, weapon=%s}".formatted(this.name,this.hp,this.strength,this.weapon);
    }
}
