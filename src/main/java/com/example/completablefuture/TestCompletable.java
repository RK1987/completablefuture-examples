package com.example.completablefuture;

import java.util.concurrent.CompletableFuture;

public class TestCompletable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompletableFuture<String> future1  
		  = CompletableFuture.supplyAsync(() -> "Hello");
		CompletableFuture<String> future2  
		  = CompletableFuture.supplyAsync(() -> "Beautiful");
		CompletableFuture<String> future3  
		  = CompletableFuture.supplyAsync(() -> "World");
		 
		CompletableFuture<Void> combinedFuture 
		  = CompletableFuture.allOf(future1, future2, future3);
		
		System.out.println(CompletableFuture.allOf(future1, future2, future3).toCompletableFuture().join());
	}

}
