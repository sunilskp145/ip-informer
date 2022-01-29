# IP Informer

Provides location details using IP


### environment 
java - 17


## endpoints 
1. `/ip` Returns your ip <br/>
**Note** : Locally it returns localhost ip
2. `/ip_details/{ip}` provides details about ip 
```
Example Request
http://localhost:8080/ip_details/49.37.160.15
{"status":"success","country":"India","countryCode":"IN","region":"KA","regionName":"Karnataka","city":"Bengaluru","zip":"560002","lat":12.9634,"lon":77.5855,"timezone":"Asia/Kolkata","isp":"Reliance Jio Infocomm Limited","org":"Reliance Jio Infocomm Limited","as":"AS55836 Reliance Jio Infocomm Limited","query":"49.37.160.15"}
```

#### Acknowledgement
Thanks to ip-api.com for providing open geolocation api