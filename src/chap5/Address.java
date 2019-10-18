
package chap5;

public class Address {
    private String registerAddress;
    private String currentAddress;

    public Address(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }
    
}
