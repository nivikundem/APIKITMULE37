# APIKITMULE37
Using Mule37 features APIKIT, dataweave, REST webservice
Mule Demo for using - 3.7 Creating RAML Using Mule API designer,  Creating API KIt and REST operations - Get {all} / Get by id/ Delete/ Post{insert}
--------------
Demo for 3.7 Creating RAML Using Mule API designer,  Creating API KIt and REST operations - Get {all} / Get by id/ Delete/ Post{insert}


This project 
---------
1.	Using rest webservice{APIKIT router} calls invokes corresponding rest methods GET/POST as shown example below

- http://127.0.0.1:8081/api/GetAll
- http://127.0.0.1:8081/api/vb/100/vbrDetails
- http://127.0.0.1:8081/api/vb/102/Delete
- http://127.0.0.1:8081/api/postOperation?VBR=700&VRN=A700&Amount=5000.00


Mule components
---------
1.	Dataweave
2.  APIKIT router
3.	Context property place folders
4.	Message Properties transformer
5.	Enricher
6.	VM Inbound/Outbound
7.	Object-to-string-transformer
8.	jaxb-xml-to-object-transformer
9.	REST client
10.  Exception Strategies



To Run
-------
Run as mule server or deploy into the mule sever as Mule Deployable Archive war,  by copy into the mule-standalone/apps


Technologies
---------
- J2E
- MySQL
- MULE ESB 3.7
- Mule Anypointstudio with APIKIT plugins installed
