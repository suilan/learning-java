# Spring Boot Tutorial  

For this repository I used the AmigosCode - [Spring Boot Tutorial | Full Course [2021][NEW]](https://www.youtube.com/watch?v=9SGDpanrc8U) available on youtube.

This course needs IntelliJ IDE, Java and Postgres database. Although the course sugested the download and installation of POSTGRES, I use an postgres image in container to run the database. The container used was this one: https://hub.docker.com/_/postgres .

## Postgres
To config the postgres container, run the script below:

```
docker run --name postgres -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres
```
## Java
The java version used: 11.0.10