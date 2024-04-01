package lang.immutable.address;

public class MemberV2 {

    private String name;
    private ImmnutableAddress address;

    public MemberV2(String name, ImmnutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public ImmnutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmnutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
