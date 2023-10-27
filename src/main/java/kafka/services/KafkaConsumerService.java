package kafka.services;
import org.apache.kafka.clients.consumer.*;
import java.time.Duration;
import java.util.Collections;


    public class KafkaConsumerService<T> {
        private final Consumer<String, T> consumer;

        public KafkaConsumerService(KafkaConfig config, String groupId, String topic) {
            this.consumer = new KafkaConsumer<>(config.getConsumerProperties(groupId));
            this.consumer.subscribe(Collections.singletonList(topic));
        }

        public ConsumerRecord<String, T> consume() {
            ConsumerRecords<String, T> records = consumer.poll(Duration.ofMillis(100));
            if (!records.isEmpty()) {
                return records.iterator().next();
            }
            return null;
        }

        public void close() {
            consumer.close();
        }
    }
