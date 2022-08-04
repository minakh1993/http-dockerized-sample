# http-dockerized-sample
in this sample we have created sample rest controller and two simple services. 

## running project
in order to run project create project image with following command:

> docker build -t sample .

then you can run it with following command:

>docker run -p 8089:8080 sample

you can define your default port on creating image wiht following command:

>docker build -t sample --build-arg ENV_PORT=8097 .

then you have to bind your container port(8097 in example) to host port as below:

>docker run -p 8097:8097 sample

following logs show that your application is starting on port 8097:

>2022-08-04T14:25:54.452 [INFO]  requestId:[] clientIP:[               ] thread:[main                     ] userIP:[] c.t.m.h.config.ServerPortCustomizer.customize@20:
    starting program on port: 8097

your also can specify environment variable on running container and change application port:

>docker run -p 8099:8099 --env SAMPLE_APP_PORT=8099 sample

below logs show that your environment variable is overriden and application is starter on port 8099

>2022-08-04T14:27:03.304 [INFO]  requestId:[] clientIP:[               ] thread:[main                     ] userIP:[] c.t.m.h.config.ServerPortCustomizer.customize@20:
     starting program on port: 8099