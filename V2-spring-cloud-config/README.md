Springboot based microservices.
Swagger link: http://localhost:8080/swagger-ui/index.html
http://localhost:8090/swagger-ui/index.html

Note: keep running configserver Application to get the response from configserver in your individual application.
that's how configserver works

For Webhook use this Link : https://console.hookdeck.com/
Configuration: 
Step1: Start powershell as normal user
Step2: run the below command
Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
irm get.scoop.sh | iex
scoop --version
scoop bucket add hookdeck https://github.com/hookdeck/scoop-hookdeck-cli.git
scoop install hookdeck
hookdeck login --cli-key 29y6m2e21ws5y4zz2y7m93i66bjgmqfjb1gpf6kzuahbb4pbv4
then ctrl+c
hookdeck listen 8071 Source
or
hookdeck listen 8071 source --cli-path /monitor
----------this will give you one source URL 

Use this command to start rabbit mq on gitbash :    winpty docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management

To build docker image using google jib: mvn compile jib:dockerBuild
To push the image : docker image push docker.io/ankit092/configserver:s6
To start all the service at a time : docker compose up -d
To start webhook : https://console.hookdeck.com/
