package ru.sbt;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StreamsTest {
    @Test
    public void test() throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Map m = Streams.of(list)
                .filter((e)->e>2)
                .transform(e -> new Integer(e+10))
                .toMap(e -> e, e -> e*2 );
        System.out.println("m = " + m);
        assertEquals(3, m.size());
        assertEquals(26, m.get(13));
        assertEquals(28, m.get(14));
        assertEquals(30, m.get(15));
    }

}