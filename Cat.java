package hw;

class Cat extends Animal {

    protected boolean sweem;
    int jump;

    public Cat(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem + " /Jump: " +jump+ " meters/");
    }
}
