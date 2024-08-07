package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private final String uploadFilename;
    private final String storeFilename;

    public UploadFile(String uploadFilename, String storeFilename) {
        this.uploadFilename = uploadFilename;
        this.storeFilename = storeFilename;
    }
}
