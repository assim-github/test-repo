package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DemoApplicationTests {

	@Test
	void helloWorldEndpointReturnsMessage() {
		DemoApplication application = new DemoApplication();
		assertThat(application.hello()).isEqualTo("Hello World");
	}

}
