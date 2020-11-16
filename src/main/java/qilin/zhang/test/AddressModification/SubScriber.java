package qilin.zhang.test.AddressModification;

public class SubScriber {
    private String address;
    private String userName;
    private String channel;
    private boolean active;
    public SubScriber(String address, String userName, String channel, boolean active) {
        this.address = address;
        this.userName = userName;
        this.channel = channel;
        this.active = active;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
