package eapli.base.net;

import java.io.*;


/**
 *
 * @author Pedro Santos (1190967@isep.ipp.pt)
 */

public class SDP2021 {
    
    private static final String VERSION="SDP2021/1.0";

    static private String readHeaderLine(DataInputStream in, int length) throws IOException {
        String ret="";
        int val;
        for(int i = 0; i < length; i++) {
            val=in.read();
            ret=ret+(char)val;
        }
        return ret;
    }
    
    static private void writeHeaderLine(DataOutputStream out, String line, int code) throws IOException {
        out.write(VERSION.getBytes()); out.write(code); out.write(line.length());
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
            data = readHeaderLine(in, num_bytes);
        }

    }
    
    public SDP2021() {
        version=null;
        code=null;
        num_bytes=null;
        }
    
    
	public void setCode(int intCode) {
		this.code = intCode;
    }
    
    
	public boolean send(DataOutputStream out, String strData) throws IOException {
        writeHeaderLine(out, strData, code);
        return true;
    }
    
    
    public int getVersion() { return version; }
    public int getCode() { return code; }


} // CLASS END

