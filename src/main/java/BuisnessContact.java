public class BuisnessContact extends Contact{
    private String companyName;
    public BuisnessContact(String name) {
        super(name);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BuisnessContact{" +
                "companyName='" + companyName + '\'' +
                "} " + super.toString();
    }
}
