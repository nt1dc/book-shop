#name higgers
./gradlew bootJar -p ./eureka-server
./gradlew bootJar -p ./api-gateway
./gradlew bootJar -p ./book-service
./gradlew bootJar -p ./delivery-service
./gradlew bootJar -p ./payment-service
scp -P 2222 ./eureka-server/build/libs/eureka-server-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
scp -P 2222 ./api-gateway/build/libs/api-gateway-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
scp -P 2222 ./book-service/build/libs/book-service-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
scp -P 2222 ./delivery-service/build/libs/delivery-service-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
scp -P 2222 ./payment-service/build/libs/payment-service-0.0.1-SNAPSHOT.jar s311295@helios.se.ifmo.ru:/home/studs/s311295/blps/
ssh s311295@helios.se.ifmo.ru -p 2222 "java -jar blps/eureka-server-0.0.1-SNAPSHOT.jar &
 java -jar blps/book-service-0.0.1-SNAPSHOT.jar &
 java -jar blps/delivery-service-0.0.1-SNAPSHOT.jar &
 java -jar blps/payment-service-0.0.1-SNAPSHOT.jar &"
