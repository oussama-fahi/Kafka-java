package kafka.services;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaProducerService<T> {
    private final Producer<String, T> producer;
    private final String topic;

    public KafkaProducerService(KafkaConfig config, String topic) {
        this.producer = new KafkaProducer<>(config.getProducerProperties());
        this.topic = topic;
    }

    public void produce(String key, T value) {
        ProducerRecord<String, T> record = new ProducerRecord<>(topic, key, value);
        producer.send(record);
    }

    public void close() {
        producer.close();
    }
}