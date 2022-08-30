package com.example;

import com.example.model.Greeting;
import com.example.model.User;
import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;


import java.util.Optional;

public class EauctionHandler extends FunctionInvoker<User, Greeting> {

    @FunctionName("products")
    public HttpResponseMessage execute(
            @HttpTrigger(name = "request", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<User>> request,
            ExecutionContext context) {
        User user = request.getBody()
                .filter((u -> u.getName() != null))
                .orElseGet(() -> new User(23, 10L, "fruit", "this is a good fruit", "very nice fruit and delicious", "fruit", 200, "12-12-2022"));
        context.getLogger().info("Greeting user name: " + user.getName());
        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(handleRequest(user, context))
                .header("Content-Type", "application/json")
                .build();
    }

   /*@FunctionName("/e-auction/api/v1/seller/products")
    public HttpResponseMessage getProduct(
            @HttpTrigger(name = "request", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<Product>> request,
            ExecutionContext context) {
           Product user = request.getBody()
                .filter((u -> u.getProductName() != null))
                .orElseGet(() -> new Product(
                        request.getQueryParameters()
                                .getOrDefault("productName", "T-Shirt")));
        context.getLogger().info("Getting all product details: " + user.getProductName());
        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(handleRequest(user, context))
                .header("Content-Type", "application/json")
                .build();
    }*/
}
