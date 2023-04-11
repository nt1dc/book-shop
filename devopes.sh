#name higgers
#./gradlew bootJar -p ./eureka-server
#./gradlew bootJar -p ./api-gateway
#./gradlew bootJar -p ./book-service
#./gradlew bootJar -p ./delivery-service
#./gradlew bootJar -p ./payment-service
#scp -P 2222 ./eureka-server/build/libs/eureka-server-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
#scp -P 2222 ./api-gateway/build/libs/api-gateway-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
#scp -P 2222 ./book-service/build/libs/book-service-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
#scp -P 2222 ./delivery-service/build/libs/delivery-service-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
#scp -P 2222 ./payment-service/build/libs/payment-service-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
#ssh s311295@helios.se.ifmo.ru -p 2222 "java -jar blps/eureka-server-0.0.1-SNAPSHOT.jar  &
# java -jar blps/book-service-0.0.1-SNAPSHOT.jar --&
# java -jar blps/delivery-service-0.0.1-SNAPSHOT.jar &
# java -jar blps/payment-service-0.0.1-SNAPSHOT.jar &"

#java -jar blps/eureka-server-0.0.1-SNAPSHOT.jar &
java -jar blps/api-gateway-0.0.1-SNAPSHOT.jar --server.port=9097 &
UUxfls4OWpjVgsNc
rYVE+9196
--apiGatewayAddress=http://localhost:8096
java -jar book-service-0.0.1-SNAPSHOT.jar --spring.datasource.username=s311295 --spring.datasource.password=UUxfls4OWpjVgsNc --spring.datasource.url=jdbc:postgresql://pg:5432/studs --spring.datasource.driver-class-name=org.postgresql.Driver --apiGatewayAddress=http://localhost:9097 &
#java -jar delivery-service-0.0.1-SNAPSHOT.jar --apiGatewayAddress=http://localhost:9097 &
#java -jar blps/payment-service-0.0.1-SNAPSHOT.jar --spring.datasource.username=s311295 --spring.datasource.password=admin --spring.datasource.url=jdbc:postgresql://pg:5432/book-service --spring.datasource.driver-class-name=org.postgresql.Driver --spring.datasource.username=admin &
#

#--spring.datasource.username=s311295 --spring.datasource.password=admin --spring.datasource.url=jdbc:postgresql://pg:5432/book-service --spring.datasource.driver-class-name=org.postgresql.Driver --spring.datasource.username=admin
