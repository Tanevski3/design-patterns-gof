package com.mtanevski.designpatterns.gof.decorator.v1;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        int encryptedData = data.hashCode();
        System.out.println("Encryption: Writing " + encryptedData);
        super.writeData(data);
    }

    @Override
    public String readData() {
        String encryptedData = super.readData();
        System.out.println("Encryption: Reading " + encryptedData);
        return encryptedData;
    }
}
