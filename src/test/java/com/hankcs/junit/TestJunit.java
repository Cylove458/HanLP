package com.hankcs.junit;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;

/**
 * <p></p>
 *
 * @author : Conan
 * @date : 2019-11-07 16:35
 **/
public class TestJunit extends TestCase {
    public void testFile( ) {
        System.out.println(new File("data/dictionary/CoreNatureDictionary.tr.txt").isFile());
    }
}
