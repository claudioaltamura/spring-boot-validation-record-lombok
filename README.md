[![Build Status](https://travis-ci.com/claudioaltamura/spring-boot-validation-record-lombok.svg?branch=master)](https://travis-ci.com/claudioaltamura/spring-boot-validation-record-lombok)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# spring-boot-validation-record-lombok
Spring Boot Bean Validation example with Record and Lombok

## OpenAPI

    gradle clean generateOpenApiDocs

## App

    ./gradlew bootRun

## examples

find one

    curl http://localhost:8080/products?productNumbers=A1

    [{"id":"4070171967072","productNumber":"A1","name":"A1","description":"A A1 product"}]
