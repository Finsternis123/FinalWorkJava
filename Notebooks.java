package JavaWork.JavaHomeWork.FinalWorkJava;

public class Notebooks {
    String brand;
    String color;
    String OC;
    String Volume_Memory;
    String Volume_RAM;

    public Notebooks (String brand, String color, String OC, String Volume_Memory, String Volume_RAM){
        this.brand = brand;
        this.color = color;
        this.OC = OC;
        this.Volume_Memory = Volume_Memory;
        this.Volume_RAM = Volume_RAM;
    }
        public String getBrand() {
            return brand;
        }

        public String getColor() {
            return color;
        }

        public String getOC() {
            return OC;
        }
    
        public String getMemory() {
            return Volume_Memory;
        }

        public String getRAM() {
            return Volume_RAM;
        }

        @Override
        public String toString() {
            return "brand: " + brand + ", Volume_Memory: " + Volume_Memory + ", color: " + color + ", Volume_RAM: " + Volume_RAM + ", OC: " + OC;
        }
}