package com.service.iswift.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestIswift {

        IswiftDelegate iswiftDelegate = new IswiftDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = iswiftDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}