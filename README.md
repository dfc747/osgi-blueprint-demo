# Apache Karaf Blueprint Example

## Artifacts

* `blueprint-example-common` provides the `BookingService` interface and `Booking` POJO.
* `blueprint-example-provider` implements and exposes a `BookingService` using a Blueprint XML file.
* `blueprint-example-client` uses `OSGI-INF/blueprint/client.xml` Blueprint XML to get a service and start a thread.
* `blueprint-example-features` contains a Karaf features repository used for the deployment.

## Build

Use:

```
mvn clean install
```

## Feature and Deployment

On a running Karaf instance, you register the blueprint example features repository with:

```
karaf@root()> feature:repo-add mvn:org.example/blueprint-example-features/LATEST/xml
```

Then you can install the `blueprint-example-provider` feature:

```
karaf@root()> feature:install blueprint-example-provider
```

Now, you can install the `blueprint-example-client` feature:

```
karaf@root()> feature:install blueprint-example-client
```

When you install the client feature, you should see on the console:

```
karaf@root()> 1794197511025182174 | John Doo | AF3030
```
