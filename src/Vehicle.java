public class Vehicle {
    private String engineType;
    private String transmission ;
    private String color;
    private boolean hasSunroof;
    private int numberOfDoors;
    private Vehicle(Builder builder){
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.numberOfDoors = builder.numberOfDoors;
    }
    public static class Builder{
        private String engineType;
        private String transmission ;
        private String color;
        private boolean hasSunroof = false;
        private int numberOfDoors = 4;
        public Builder withengineType(String engineType){
            this.engineType = engineType;
            return this;
        }
        public Builder withtransmission(String transmission){
            this.transmission = transmission;
            return this;
        }
        public Builder withcolor(String color){
            this.color = color;
            return this;
        }
        public Builder withhasSunroof(boolean hasSunroof){
            this.hasSunroof = hasSunroof;
            return this;
        }
        public Builder withnumberOfDoors(int numberOfDoors){
            this.numberOfDoors = numberOfDoors;
            return this;
        }
        public Vehicle build(){
            return new Vehicle(this);
        }
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public String toString(){
        return "engineType=" + engineType + ", transmission=" + transmission +
                ", color=" + color + ", hasSunroof=" + hasSunroof +
                ", numberOfDoors=" + numberOfDoors;
    }

}
