# Specmatic Sample Client Application

![HTML client talks to client API which talks to backend api](specmatic-sample-architecture.svg)

BFF = Backend For Frontend, the API invoked by the HTTP calls in the client HTML page (Website UI).

This project contains the product API, which is used by a small [ecommerce client application]((https://github.com/znsio/specmatic-order-ui).

Here is the [contract](https://github.com/znsio/specmatic-order-contracts/blob/main/in/specmatic/examples/store/api_order_v1.yaml) governing the interaction of the client with the product API.

The architecture diagram was created using the amazing free online SVG editor at [Vectr](https://vectr.com).

### How to run the application?

1. Build the project using : `./mvnw clean install`
2. For unix platform, run the application using : `./mvnw spring-boot:run`
3. For windows platform, run the application using : `mvnw.cmd spring-boot:run`