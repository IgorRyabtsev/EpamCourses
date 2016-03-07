package com.javaseig.mod2.task67;

@ClassInformation(
        name = "Igor Ryabtsev",
        date= "03/8/16",
        comments = "No."
)

public class NuclearBoat {
    //экипаж
    private int crew;
    private boolean swimming;
    private double immensionDepth;
    private Engine en= new Engine();
    private String name;
    private double speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public NuclearBoat(int crew, boolean swimming, double immensionDepth, String name, double speed) {

        this.crew = crew;
        this.swimming = swimming;
        this.immensionDepth = immensionDepth;
        this.name = name;
        this.speed = speed;
        en.start();
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public boolean isSwimming() {
        return swimming;
    }

    public void setSwimming(boolean swimming) {
        this.swimming = swimming;
    }

    public double getImmensionDepth() {
        return immensionDepth;
    }

    public void setImmensionDepth(double immensionDepth) {
        this.immensionDepth = immensionDepth;
    }

    public Engine getEn() {
        return en;
    }

    public void setEn(Engine en) {
        this.en = en;
    }

    class Engine{
        private boolean isworking;

        public void start() {
            isworking=true;
        }
        public void stop() {
            isworking=false;
        }

        public boolean isWorking() {
            return isworking;
        }
    }

    @Override
    public String toString() {
        return "NuclearBoat{" +
                "crew=" + crew +
                ", swimming=" + swimming +
                ", immensionDepth=" + immensionDepth +
                ", en=" + en +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

}
