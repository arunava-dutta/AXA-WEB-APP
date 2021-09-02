FROM tomcat:latest

ENV CATALINA_HOME /usr/local/tomcat
RUN mkdir -p /app
ENV JAVA_OPTS= "-DdevConfig=/app/devConfig.properties"
COPY /myapp/target/*.war $CATALINA_HOME/webapps
EXPOSE 8080
ENTRYPOINT ["/usr/local/tomcat/bin/catalina.sh","run"]
