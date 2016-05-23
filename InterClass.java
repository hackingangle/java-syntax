class InterClass {
    public static void main(String[] args) {
        Child child = new Child();
        child.say();
        child.crack();
        Person human = new Person() {
            public void say() {
                System.out.println("I am human instance");
            }
        };
        human.say();
    }
}

abstract class Person {
    abstract public void say();
}

class Child extends Person {
    public void say() {
        System.out.println("I am child instantce.");
    }

    public void crack() {
        System.out.println("By the way, I can crack any system in the world.");
    }
}
