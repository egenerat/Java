# webapp-jsp
mvn jetty:run

# In WildFly
Start WildFly
```
D:\wildfly-10.0.0.Final\bin\standalone.bat
```

Copy war in deployment folder
```
cp target/webapp-jsp.war D:\wildfly-10.0.0.Final\standalone\deployments\
```

http://localhost:8080/webapp-jsp/index.jsp
