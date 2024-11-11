package sukkiri.practice.test;

public class Animal {
    private String name;
    private String kind;
    private int age;

    public Animal(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public void show() {
        System.out.println("================");
        System.out.println("名前：" +getName());
        System.out.println("種類：" +getKind());
        System.out.println("年齢："+getAge());
        System.out.println("================");
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
