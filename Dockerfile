FROM openjdk:11

RUN mkdir -p /root/app

WORKDIR /root/app

COPY build/libs/* /root/app

ENTRYPOINT ["java","-jar","tickets-1.0.jar"]