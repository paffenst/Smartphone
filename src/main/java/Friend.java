public class Friend extends Contact{
    int telNr;

    public Friend(String name,int telNr) {
        super(name);
        this.telNr = telNr;
    }
    @Override
    public String toString() {
        return "Friend{" +
                "telNr=" + telNr +
                ", name='" + super.getName() + '\'' +
                "} " ;
    }
}
