package com.test;

import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface MvngwtAppFactory extends RequestFactory {
	GreetingContext greeting();
}