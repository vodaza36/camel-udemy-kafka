package at.hochbichler.camel.routes.kafka;

import org.apache.camel.builder.RouteBuilder;

public class KafkaConsumerRoute extends RouteBuilder {
    public void configure() throws Exception {
        from("kafka:127.0.0.1:9092?topic=my-topic&groupId=group1&consumersCount=1&autoOffsetReset=latest")
                .log("${body}")
                .to("direct:readFromKafka");
    }
}
