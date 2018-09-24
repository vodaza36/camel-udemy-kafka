package at.hochbichler.camel.routes.kafka;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import static org.junit.Assert.*;

public class KafkaConsumerRouteTest extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new KafkaConsumerRoute();
    }

    @Test
    public void readMessageFromKafka() {
        String expected = "123";
        String response = consumer.receiveBody("direct:readFromKafka", String.class);
        assertEquals(expected, response);

    }
}