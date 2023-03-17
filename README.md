# nttChallenge


### Backend 

##### Getting started

```
https://github.com/GAGUDE4/nttChallenge.git
```

Open in IDE preference
```
mvn dependency:resolve
```

And Run Project

Execution in

`localhost:8090`

Database in memory H2

Api REST End Points

> http://localhost:8090/ntt/getInfo/C/23445322

> Curl

curl --location 'http://localhost:8090/ntt/getInfo/C/23445322' \
--header 'Authorization: Basic QWRtaW46YWRtaW4='


_________________________________________
A layered architecture with a microservices pattern is proposed.

A security layer with authentication is configured (User: Admin pass: admin).

Unit tests have been implemented.

The data was stored in a BD in memory.
