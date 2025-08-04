package com.cpd.hotel_system.hotel_management_service_api.utill;

import org.hibernate.boot.BootLogging;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;

@Service
public class ByteCodeHandeller {

    public Blob stringToBlob(String data) throws SQLException {
        byte[] bytes = data.getBytes();
        return new SerialBlob(bytes);
    }

    public String blobToString(Blob data) throws SQLException {
        int blobLength = (int) data.length();
        byte[] bytes = data.getBytes(1, blobLength);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
