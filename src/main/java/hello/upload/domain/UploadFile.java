package hello.upload.domain;

public class UploadFile {

    private final String uploadFileName;
    private final String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
