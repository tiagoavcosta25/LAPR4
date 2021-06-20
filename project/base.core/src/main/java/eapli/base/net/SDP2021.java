package eapli.base.net;

import javafx.util.Pair;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Pedro Santos (1190967@isep.ipp.pt)
 * @author Tiago Costa 1191460@isep.ipp.pt
 */

public class SDP2021 {

    private static final int VERSION = 3;

    static private String read(DataInputStream in, int length) throws IOException {
        StringBuilder ret= new StringBuilder();
        int val;
        for(int i = 0; i < length; i++) {
            val=in.read();
            ret.append((char) val);
        }
        return ret.toString();
    }

    static private void write(DataOutputStream out, String line, int code) throws IOException {
        out.write(VERSION); out.write(code); out.write(line.length());
        out.write(line.getBytes(), 0, line.length());
    }


    //// NON-STATIC (INSTANCE) ELEMENTS

    private Integer version;
    private Integer code;
    private Integer num_bytes;
    private String data;

    /**
     * Creates a new SDP2021 by receiving it from an DataInputStream
     * @param in DataInputStream variable
     * @throws IOException exception
     */
    public SDP2021(DataInputStream in) throws IOException {
        num_bytes = 0;
        StringBuilder tempData = new StringBuilder();
        int bytesToRead;
        do {
            int tmpVersion = in.read();
            if(tmpVersion != VERSION) {
                return;
            }
            code = in.read();
            bytesToRead = in.read();
            num_bytes += bytesToRead;
            if (bytesToRead == 0) {
                data = null;
            } else {
                tempData.append(read(in, bytesToRead));
            }
        } while(code == SDP2021Code.SEGMENT.getCode());
        data = tempData.toString();
        version = VERSION;
    }

    public SDP2021(int intCode) {
        version = VERSION;
        code = intCode;
        num_bytes = null;
        data = null;
    }


    public void setCode(int intCode) {
        this.code = intCode;
    }


    public boolean send(DataOutputStream out, String strData) throws IOException {
        this.data = strData;
        this.num_bytes = strData.length();
        if(num_bytes > 255) {
            List<Pair<Integer, String>> separatedData = separateData(this.data);
            for(Pair<Integer, String> p : separatedData) {
                if(p.getKey() == 255) write(out, p.getValue(), SDP2021Code.SEGMENT.getCode());
                else write(out, p.getValue(), code);
            }
            return true;
        }
        write(out, strData, code);
        return true;
    }

    private List<Pair<Integer, String>> separateData(String data) {
        List<Pair<Integer, String>> sepData = new ArrayList<>();
        String str;
        int endcut;
        for(int i = 0; i < data.length(); i += 255) {
            endcut = Math.min(i + 255, data.length());
            str = data.substring(i, endcut);
            sepData.add(new Pair<>(str.length(), str));
        }
        return sepData;
    }


    public int getVersion() { return version; }
    public int getCode() { return code; }
    public String getData() { return data; }


} // CLASS END

