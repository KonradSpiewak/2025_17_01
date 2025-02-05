public class Gryffin {

    private String version;
    private double continousPower;
    private int maximumSpeed;
    private int startingTractiveEffort;
    private int serviceWeight;
    private int maximumAxleLoad;


    public Gryffin (String version, double continousPower, int maximumSpeed, int startingTractiveEffort, int serviceWeight, int maximumAxleLoad) {
        this.version = version;
        this.continousPower = continousPower;
        this.maximumSpeed = maximumSpeed;
        this.startingTractiveEffort = startingTractiveEffort;
        this.serviceWeight = serviceWeight;
        this.maximumAxleLoad = maximumAxleLoad;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Gryffin)) return false;

Gryffin comparedOjbect = (Gryffin) obj;
return version.equals(comparedOjbect.version)
        && continousPower == comparedOjbect.continousPower
        && maximumSpeed ==  comparedOjbect.maximumSpeed
        && startingTractiveEffort == comparedOjbect.startingTractiveEffort
        && serviceWeight == comparedOjbect.serviceWeight
        && maximumAxleLoad == comparedOjbect.maximumAxleLoad;

    }
}
