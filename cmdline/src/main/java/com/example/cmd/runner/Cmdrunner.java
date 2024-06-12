package com.example.cmd.runner;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;

public class Cmdrunner implements CommandLineRunner {
	public void run(String...args) throws Exception {
		System.out.println("this is cmd runner");
		System.out.println(Arrays.asList(args));
	}

}
