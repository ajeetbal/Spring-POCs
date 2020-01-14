package com.example.retry;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

public interface Service {

	@Retryable(value = { RemoteServiceNotAvailableException.class }, maxAttempts = 3, backoff = @Backoff(delay = 1000))
	String getBackendResponse(boolean simulateretry, boolean simulateretryfallback) ;

	@Recover
	public String getBackendResponseFallback(RuntimeException e);
}
