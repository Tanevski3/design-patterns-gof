package com.mtanevski.designpatterns.gof.decorator.v1;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        String compressedData = "[" + data + "]";
        System.out.println("Compression: Writing " + compressedData);
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String compressedData = super.readData();
        System.out.println("Compression: Reading " + compressedData);
        return compressedData.replace("[", "").replace("]", "");
    }
}

