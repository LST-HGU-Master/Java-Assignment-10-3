public class Hero
{
    String name = "工太";
    int hp=100;

    public void attack(Slime m) //戦う
    {
        System.out.println(this.name + "はスライム" + m.suffix + "に攻撃した！");
        System.out.println("敵に５ポイントのダメージをあたえた！");
        m.hp -= 5;
    }
}
