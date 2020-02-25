package accesSpecifiers;

// we can access methods and variables within the class , outside the class of within package
 // packages are of two types
// 1)User defined (These are the packages that are defined by the user )  
// 2)In biult packages {java.lang(Default), java.util, java.awt,java.io, java.sql etc}

	public class PackageDemo {
	int a;
	int b;

	PackageDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {

		PackageDemo obj = new PackageDemo(10, 20);
		System.out.println(obj.a + " " + obj.b);
	}
}
