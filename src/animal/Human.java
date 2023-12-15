package animal;

public class Human extends Animal implements Thinkable {

    private String tastes;

    public String getTastes() {
        return tastes;
    }

    public void setTastes(String tastes) {
        this.tastes = tastes;
    }

    public Human() {
    }

    public Human(String name, int age, String tastes) {
        super(name, age);
        this.tastes = tastes;
    }

    @Override
    public void say() {
        System.out.println(super.getName() + "です。" + super.getAge() + "歳です。");
    }

    @Override
    public void think() {
        System.out.println("私は" + tastes + "について考えています。");
    }

}
