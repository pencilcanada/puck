# puck
Pencil Canada Spring cloud config server

**How to use**

This config server will load property files from Pencil Canada Naix Git repository (https://github.com/pencilcanada/naix/).

Use this config server in a Spring boot client:
1. Add Maven dependencies for sping cloud config
    
    `<dependency>
		<groupId>org.springframework.cloud</groupId>
		<artifactId>spring-cloud-config-client</artifactId>
	</dependency>` 
2. Add following config in bootstrap.yml

   `spring:    
        application:
            name: APP_NAME
        cloud:
            config:
            uri: http://PUCK_SERVER_ADDRESS:8900`
3. Create a new folder in Naix repository named "APP_NAME" and add Spring boot config files into it.

**Encrypt/Decrypt**

1. Install JCE (http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html)
2. Add encrypt key:

    Add " encrypt: key:***** " in bootstrap.yml 
    
    or 
    
    Add environment variable " ENCRYPT_KEY=***** "(Recommended)   
3.  Encrypt a new value: 'curl PUCK_SERVER_ADDRESS:8900/encrypt -d value_to_encrypt'. 
    Then, Add encrypted value to your property file in Naix: 
    
    `attribute:'{cipher}encrypted_value'`
4.  Decrypt value: set up the same encrypt key on client side.

**References**
1. http://cloud.spring.io/spring-cloud-config/1.1.x/
2. https://patrickgrimard.io/2016/03/04/encrypting-and-decrypting-configuration-property-values-in-spring-cloud/
