package com.paulnc.jenkinsdemo;

public class JenkinsHello {
    public static void main(String[] args) {
		System.out.println(helloJenkins());
		System.out.println(helloJenkinsAgain());
	}
	
	public static String helloJenkins() {
		return "Hello Jenkins!";
	}
	
	public static String helloJenkinsAgain() {
		return "Hello Jenkins again!!!";
	}
}
