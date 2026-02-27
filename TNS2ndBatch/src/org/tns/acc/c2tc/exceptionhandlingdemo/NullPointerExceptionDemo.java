package org.tns.acc.c2tc.exceptionhandlingdemo;

public class NullPointerExceptionDemo {

	

	    public static void main(String[] args) {

	        String str = null;

	        try {
	            if (str != null) {
	                System.out.println(str.length());
	            } else {
	                System.out.println("String is null");
	            }
	        } catch (NullPointerException e) {
	            System.out.println(e);
	        } finally {
	            System.out.println("No matter what this block we get executed");
	        }
	    }
	}

