// Use below cmd for windows
// .\bin\windows\zookeeper-server-start.sh config/zookeeper.properties

// .\bin\windows\kafka-server-start.sh config/server.properties


//1. create a topic
 //  to create a topic
  // .\bin\windows\kafka-topics.bat --create --topic daily-news-events --bootstrap-server localhost:9092

//  2. write event to a topic
// .\bin\windows\kafka-topics.bat --describe --topic daily-news-events --bootstrap-server localhost:9092

//to read from topic :

//.\bin\windows\kafka-console-consumer.bat  --topic news --from-beginning --bootstrap-server localhost:9092

//to write to topic :

//.\bin\windows\kafka-console-producer.bat  --topic abc-news-events --bootstrap-server localhost:9092

//serializer.class=org.apache.kafka.common.serialization.StringSerializer
//deserializer.class=org.apache.kafka.common.serialization.StringDeserializer
