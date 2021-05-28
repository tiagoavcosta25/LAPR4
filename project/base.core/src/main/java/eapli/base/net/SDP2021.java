package eapli.base.net;

import java.io.*;


/**
 * @author Pedro Santos (1190967@isep.ipp.pt)
 */

public class SDP2021 {
    
    private static final int VERSION = 2;

    static private String read(DataInputStream in, int length) throws IOException {
        String ret="";
        int val;
        for(int i = 0; i < length; i++) {
            val=in.read();
            ret=ret+(char)val;
        }
        return ret;
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
     * @param in 
     * @throws IOException
     */
    public SDP2021(DataInputStream in) throws IOException {
        version = in.read();
        code = in.read();
        num_bytes = in.read();

        if (num_bytes == 0) {
            data = null;
        } else {
            data = read(in, num_bytes);
        }

    }
    
    public SDP2021() {
        version=VERSION;
        code=null;
        num_bytes=null;
        data=null;
        }
    
    
	public void setCode(int intCode) {
		this.code = intCode;
    }
    
    
	public boolean send(DataOutputStream out, String strData) throws IOException {
        write(out, strData, code);
        return true;
    }
    
    
    public int getVersion() { return version; }
    public int getCode() { return code; }
    public String getData() { return data; }


} // CLASS END

