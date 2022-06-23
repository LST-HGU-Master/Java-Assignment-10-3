# 課題 10-3: クラスと配列

### 課題の説明
以下に示すHeroクラスに、配列として受け取った全てのスライムを攻撃するattackAllメソッドを追加しなさい。また、実行例にあわせたProgA3.mainメソッドを作成しなさい。

| メソッド名     | 引数のリスト | 戻り値 | 処理内容 |
|-----------|--------------|--------|----------|
| attackAll | Slime[] slimes | なし | 全てのスライムに5のダメージを与える |

ただし、スライムの数は1から26までの数を実行時引数として与えること。

### Heroクラス (メソッドを追加する)
```java
public class Hero
{
    String name = "工太";
    int hp=100;

    public void attack(Slime m) //戦う
    {
        System.out.println(this.name + "はスライム" + m.suffix + "に攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
        m.hp -= 5;
    }
}
```

### Slimeクラス (変更・提出不要)
```java
public class Slime
{
    int hp = 18;
    char suffix;

    Slime(char suffx){
        this.suffix = suffx;
    }

    public void attack(Hero h)
    {
        int damage = 5;

        System.out.println("スライム" + this.suffix + "の攻撃！");
        h.hp -= damage;
        System.out.println( damage + "のダメージでHPが" + h.hp + "になった");
    }
}
```

### 実行例 （実行時引数を　5　とした場合）
```
工太はスライムAに攻撃した！
敵に5ポイントのダメージをあたえた！
工太はスライムBに攻撃した！
敵に5ポイントのダメージをあたえた！
工太はスライムCに攻撃した！
敵に5ポイントのダメージをあたえた！
工太はスライムDに攻撃した！
敵に5ポイントのダメージをあたえた！
工太はスライムEに攻撃した！
敵に5ポイントのダメージをあたえた！
```
