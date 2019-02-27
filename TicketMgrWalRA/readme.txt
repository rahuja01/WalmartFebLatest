Below is the details:-

1. Seat will be held for 50 seconds.
2. Booking will done for the seats that are held.

Inorder to verify, first run the application as a spring boot application.

Checkout the project in Intellij or Eclipse.

Click on Run - > TicketMgrWalRaApplication

This will Run the application in the embedded tomcat.
Then it will ask you below ->
 -----> Enter the Total number of seats for the TicketMgt System
 Enter Value

 Then it will prompt ->
 Enter 1 to view total available seats OR 2 to hold seats OR 3 to allocate seats OR 4 to Quit

 Press 1 to view total Seats.

 Please Note this is running on your local tomcat container per JVM, so restarting the app, will not give you the expected results.

 Then Proceed with Option 2 ->

 Its will prompt for email address ->

 ###### Please provide your email address for holding the tickets #######

 Please provide as per format. Validation is in place.

 Then provide the seats to Hold.

 After holding press 1 to verify. Wait till 20 seconds to see if the seats go back to total number of seats.



 _____________  %%%%%%%%%%%%%%%%%%%% __________

 Please refer below application logs for reference ->

 /Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/bin/java -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=58551 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=127.0.0.1 -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=58552:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/tools.jar:/Users/rahuja/DEV_ENV/git_repo/TicketMgrWalRA/target/classes:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot-starter-actuator/2.1.3.RELEASE/spring-boot-starter-actuator-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot-starter/2.1.3.RELEASE/spring-boot-starter-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot/2.1.3.RELEASE/spring-boot-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.1.3.RELEASE/spring-boot-autoconfigure-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.1.3.RELEASE/spring-boot-starter-logging-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/rahuja/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/rahuja/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.11.2/log4j-to-slf4j-2.11.2.jar:/Users/rahuja/.m2/repository/org/apache/logging/log4j/log4j-api/2.11.2/log4j-api-2.11.2.jar:/Users/rahuja/.m2/repository/org/slf4j/jul-to-slf4j/1.7.25/jul-to-slf4j-1.7.25.jar:/Users/rahuja/.m2/repository/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar:/Users/rahuja/.m2/repository/org/yaml/snakeyaml/1.23/snakeyaml-1.23.jar:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/2.1.3.RELEASE/spring-boot-actuator-autoconfigure-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot-actuator/2.1.3.RELEASE/spring-boot-actuator-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.8/jackson-databind-2.9.8.jar:/Users/rahuja/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/Users/rahuja/.m2/repository/org/springframework/spring-context/5.1.5.RELEASE/spring-context-5.1.5.RELEASE.jar:/Users/rahuja/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.9.8/jackson-datatype-jsr310-2.9.8.jar:/Users/rahuja/.m2/repository/io/micrometer/micrometer-core/1.1.3/micrometer-core-1.1.3.jar:/Users/rahuja/.m2/repository/org/hdrhistogram/HdrHistogram/2.1.9/HdrHistogram-2.1.9.jar:/Users/rahuja/.m2/repository/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.1.3.RELEASE/spring-boot-starter-web-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.1.3.RELEASE/spring-boot-starter-json-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.9.8/jackson-datatype-jdk8-2.9.8.jar:/Users/rahuja/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.9.8/jackson-module-parameter-names-2.9.8.jar:/Users/rahuja/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.1.3.RELEASE/spring-boot-starter-tomcat-2.1.3.RELEASE.jar:/Users/rahuja/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.16/tomcat-embed-core-9.0.16.jar:/Users/rahuja/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/9.0.16/tomcat-embed-el-9.0.16.jar:/Users/rahuja/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.16/tomcat-embed-websocket-9.0.16.jar:/Users/rahuja/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.14.Final/hibernate-validator-6.0.14.Final.jar:/Users/rahuja/.m2/repository/javax/validation/validation-api/2.0.1.Final/validation-api-2.0.1.Final.jar:/Users/rahuja/.m2/repository/org/jboss/logging/jboss-logging/3.3.2.Final/jboss-logging-3.3.2.Final.jar:/Users/rahuja/.m2/repository/com/fasterxml/classmate/1.4.0/classmate-1.4.0.jar:/Users/rahuja/.m2/repository/org/springframework/spring-web/5.1.5.RELEASE/spring-web-5.1.5.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/spring-beans/5.1.5.RELEASE/spring-beans-5.1.5.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/spring-webmvc/5.1.5.RELEASE/spring-webmvc-5.1.5.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/spring-aop/5.1.5.RELEASE/spring-aop-5.1.5.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/spring-expression/5.1.5.RELEASE/spring-expression-5.1.5.RELEASE.jar:/Users/rahuja/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/Users/rahuja/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/rahuja/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/rahuja/.m2/repository/org/springframework/spring-core/5.1.5.RELEASE/spring-core-5.1.5.RELEASE.jar:/Users/rahuja/.m2/repository/org/springframework/spring-jcl/5.1.5.RELEASE/spring-jcl-5.1.5.RELEASE.jar:/Users/rahuja/.m2/repository/com/google/api/client/google-api-client/1.4.0-alpha/google-api-client-1.4.0-alpha.jar:/Users/rahuja/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar:/Users/rahuja/.m2/repository/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar:/Users/rahuja/.m2/repository/com/google/guava/guava/r09/guava-r09.jar:/Users/rahuja/.m2/repository/org/apache/httpcomponents/httpclient/4.5.7/httpclient-4.5.7.jar:/Users/rahuja/.m2/repository/org/apache/httpcomponents/httpcore/4.4.11/httpcore-4.4.11.jar:/Users/rahuja/.m2/repository/commons-codec/commons-codec/1.11/commons-codec-1.11.jar:/Users/rahuja/.m2/repository/org/codehaus/jackson/jackson-core-asl/1.6.7/jackson-core-asl-1.6.7.jar:/Users/rahuja/.m2/repository/xpp3/xpp3/1.1.4c/xpp3-1.1.4c.jar:/Users/rahuja/.m2/repository/com/google/http-client/google-http-client/1.16.0-rc/google-http-client-1.16.0-rc.jar:/Users/rahuja/.m2/repository/com/google/apis/google-api-services-analytics/v3-rev159-1.25.0/google-api-services-analytics-v3-rev159-1.25.0.jar:/Users/rahuja/.m2/repository/com/google/oauth-client/google-oauth-client-jetty/1.11.0-beta/google-oauth-client-jetty-1.11.0-beta.jar:/Users/rahuja/.m2/repository/com/google/oauth-client/google-oauth-client-java6/1.11.0-beta/google-oauth-client-java6-1.11.0-beta.jar:/Users/rahuja/.m2/repository/org/mortbay/jetty/jetty/6.1.26/jetty-6.1.26.jar:/Users/rahuja/.m2/repository/org/mortbay/jetty/jetty-util/6.1.26/jetty-util-6.1.26.jar:/Users/rahuja/.m2/repository/org/mortbay/jetty/servlet-api/2.5-20081211/servlet-api-2.5-20081211.jar:/Users/rahuja/.m2/repository/com/google/api-client/google-api-client/1.20.0/google-api-client-1.20.0.jar:/Users/rahuja/.m2/repository/com/google/oauth-client/google-oauth-client/1.20.0/google-oauth-client-1.20.0.jar:/Users/rahuja/.m2/repository/com/google/http-client/google-http-client-jackson2/1.20.0/google-http-client-jackson2-1.20.0.jar:/Users/rahuja/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.8/jackson-core-2.9.8.jar:/Users/rahuja/.m2/repository/com/google/guava/guava-jdk5/13.0/guava-jdk5-13.0.jar com.ticketmgr.rohit.TicketMgrWalRA.TicketMgrWalRaApplication
 Enter the Total number of seats for the TicketMgt System 20
 Enter 1 to view total available seats OR 2 to hold seats OR 3 to allocate seats OR 4 to Quit
 1

 Available seats: 20

 Enter 1 to view total available seats OR 2 to hold seats OR 3 to allocate seats OR 4 to Quit
 2
 ###### Please provide your email address for holding the tickets #######
 rahuja@xpressdocs.com
 ### Thanks your email address is validated ###
 ### Enter the number of seats to hold ### 5

  Seat hold id is 1 with email rahuja@xpressdocs.com

 Enter 1 to view total available seats OR 2 to hold seats OR 3 to allocate seats OR 4 to Quit
 1

 Available seats: 15

 Enter 1 to view total available seats OR 2 to hold seats OR 3 to allocate seats OR 4 to Quit
 3
 ###### Please provide your email address for holding the tickets #######
 rahuja@xpressdocs.com
 ### Thanks your email address is validated ###
 Enter seat hold id: 1
 #### Your booking id is fff79d

 Enter 1 to view total available seats OR 2 to hold seats OR 3 to allocate seats OR 4 to Quit