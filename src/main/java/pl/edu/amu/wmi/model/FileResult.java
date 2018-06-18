package pl.edu.amu.wmi.model;

public class FileResult {
    private String fileName;
    private byte[] bytes;

    public FileResult() {
    }

    public FileResult(String fileName, byte[] bytes) {

        this.fileName = fileName;
        this.bytes = bytes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
