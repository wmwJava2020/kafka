
# Run below cmd on OS windows to start zookeeper
# .\bin\windows\zookeeper-server-start.sh config/zookeeper.properties

# Use below cmd on OS windows to start zookeeper
# .\bin\windows\kafka-server-start.sh config/server.properties


# Run below cmd for windows to create a topic
# .\bin\windows\kafka-topics.bat --create --topic daily-news-events --bootstrap-server localhost:9092

# Run below cmd on OS windows write event to a topic
# .\bin\windows\kafka-topics.bat --describe --topic daily-news-events --bootstrap-server localhost:9092

# Run below cmd on OS windows to read from a topic :

# .\bin\windows\kafka-console-consumer.bat  --topic news --from-beginning --bootstrap-server localhost:9092

# Run below cmd on OS windows to write to a topic :

# .\bin\windows\kafka-console-producer.bat  --topic abc-news-events --bootstrap-server localhost:9092

# below application.properties used in a kafka configuration
# spring.kafka.consumer.group-id: groupA
# spring.kafka.consumer.auto-offset-reset: earliest
# spring.kafka.consumer.key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
# spring.kafka.consumer.value-deserializer: org.apache.kafka.common.serialization.StringDeserializer