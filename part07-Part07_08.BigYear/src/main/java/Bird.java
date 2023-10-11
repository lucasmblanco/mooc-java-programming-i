public class Bird {
    private String commonName;
    private String latinName;

    private int observation;

    public Bird(String commonName, String latinName){
        this.commonName = commonName;
        this.latinName = latinName;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void addObservation(){
        this.observation++;
    }

    public int getObservation() {
        return observation;
    }

    public String toString(){
        return this.commonName + " (" + this.latinName + "): " + this.observation + " observations";
    }
}
