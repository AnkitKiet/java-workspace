package basics;

import static org.junit.Assert.*;

import org.junit.Test;

import io.reactivex.Observable;

public class TestReactive {

	String result = "";

	// Simple subscription to a fix value
	@Test
	public void returnAValue() {
		result = "";
		Observable<String> observer = Observable.just("Hello"); // provides data

		observer.subscribe(s -> result = s); // Callable as subscriber
		assertTrue(result.equals("Hello"));
	}

	
	
}
