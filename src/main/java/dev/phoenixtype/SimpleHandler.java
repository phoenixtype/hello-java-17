package dev.phoenixtype;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SimpleHandler implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        LambdaLogger lambdaLogger = context.getLogger();
        lambdaLogger.log("JDK version: " + System.getProperty("java.version"));
        return input.toUpperCase();
    }
}
