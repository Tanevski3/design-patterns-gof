package com.mtanevski.designpatterns.gof.decorator.v1;

public class FileDataSource implements DataSource {

    private final String fileLocation;
    private String data;

    public FileDataSource(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Override
    public void writeData(String data) {
        this.data = data;
        System.out.println("Writing " + this.data + " to " + fileLocation);
    }

    @Override
    public String readData() {
        System.out.println("Reading " + data + " from " + fileLocation);
        return data;
    }
}
