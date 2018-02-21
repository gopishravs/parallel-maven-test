package com.akamai.csi.paralel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.io.ByteArrayOutputStream;

public class MyIOUnitTest {

    @Test
    public void testRead() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead1() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite2() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead3() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite4() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead5() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite6() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead7() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite8() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead9() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite10() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead11() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite12() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead13() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite14() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead15() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite16() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead17() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite18() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead19() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite20() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead21() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite22() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead23() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite24() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead25() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite26() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead27() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite28() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead29() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite30() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead31() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite32() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead33() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite34() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

    @Test
    public void testRead35() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        byte[] data = "123,456,789,123,456,789".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        unit.read(input);

        assertEquals("123", unit.tokens.get(0));

    }

    @Test
    public void testWrite36() throws IOException {
        MyIOUnit unit = new MyIOUnit();

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        unit.tokens.add("one");
        unit.tokens.add("two");
        unit.tokens.add("three");

        unit.write(output);

        String string = new String(output.toByteArray());
        assertEquals("one,two,three", string);
    }

}