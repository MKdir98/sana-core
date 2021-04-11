# sana-core
by this library you can send THE SANA or SANAMA data to DMK.ir.  
SANA and SANAMA are protocol that defines by DMK.ir and mefa.ir.  
you can see details of this protocol in these links.  
SANAMA: https://finance.alzahra.ac.ir/Dorsapax/userfiles/Sub62/sanama99.pdf  
SANA:  
------------------------------------------------------------------------------------
because of big size of messages in this protocol we chunked the object to json
 array bytes and then send these data to http://services.ecogif.ir/ESB/rest/services/desc/PushSana/4_0?wsdl.
 this is soap service WSDL that defines in BITA.  
------------------------------------------------------------------------------------
you can use this dependency in your maven project to use some useful functions to send
 data. a good example of using this dependency can this
  [link](https://github.com/MKdir98/sana-front/blob/395b4626d6146fc7a487bb1aff354fb4e9f6521e/src/main/java/ir/iais/sana/controller/AbstractDataController.java#L49)
```
<dependency>
    <groupId>ir.iais.sana</groupId>
    <artifactId>sana-core</artifactId>
    <version>2.0.0</version>
</dependency>
```
------------------------------------------------------------------------------------
you can send data by UI sana application that release in [sana-front](https://github.com/MKdir98/sana-front).  
and another way to send data is using soap service that defines in BITA with this WSDL: http://services.ecogif.ir/ESB/rest/services/desc/PushSana/4_0?wsdl.