# Dev Setup

## local Mongo DB
```bash 
docker run --name mongodb -p 27017:27017 -d mongodb/mongodb-community-server:latest
```

## remote DB
Setup in https://cloud.mongodb.com/ MongoDB Atlas service.  
Shared M0 Sandbox is a free instance.  

Can also be used for dev when setting up an appliation-local.properties.  