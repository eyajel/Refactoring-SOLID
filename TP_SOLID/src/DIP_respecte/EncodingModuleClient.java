package DIP_respecte;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        Database myDatabase = new MyDatabase();
        EncodingModule encodingModule = new EncodingModule(myDatabase);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetwork();
    }
}
