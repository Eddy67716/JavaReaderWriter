/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import static io.IOMethods.reverseEndian;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Edward Jenkins © 2021-2023
 */
public class Writer extends AbstractWriter {

    // constants
    public static final byte[] AND_VALUES = {0, 1, 3, 7, 15, 31, 63, 127};

    // instance variables
    // the data output stream
    private DataOutputStream dos;

    /**
     * The 2-args constructor used to write a file with a file name string.
     *
     * @param fileName The name of the file to write to
     * @param littleEndian Writes little-endian values if true
     * @throws IOException Thrown if file is not found
     */
    public Writer(String fileName, boolean littleEndian)
            throws IOException {
        super(fileName, littleEndian);
        dos = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(fileName)));
    }

    /**
     * The 1-args constructor used to write a file with a file name string. This
     * can only write in big-endian.
     *
     * @param fileName The name of the file to write to
     * @throws IOException Thrown if file is not found
     */
    public Writer(String fileName)
            throws IOException {
        this(fileName, false);
    }
    
    /**
     * Closes the file by writing any extra bits and byte aligning then closing
     * the stream.
     *
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
        byteAlign();
        dos.close();
    }

    @Override
    protected void writeByteToFile(byte byteToWrite) throws IOException {
        dos.writeByte(byteToWrite);
    }

    @Override
    protected void writeBytesToFile(byte[] bytesToWrite) throws IOException {
        dos.write(bytesToWrite);
    }
    
    @Override
    protected void writeBytesToFile(byte[] bytesToWrite, int start, int length) 
            throws IOException {
        dos.write(bytesToWrite, start, length);
    }
}
