import java.util.List;

public class Smartphone implements Radio,GPS {
    String model;
    String brand;
    List<Contact> contacts;
    public Smartphone(String model, String brand, List<Contact> contacts) {
        this.model= model;
        this.brand = brand;
        this.contacts = contacts;
    }
    @Override
    public String getPosition() {
        return "Minga";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started.");
        return true;
    }
    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped.");
        return false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
