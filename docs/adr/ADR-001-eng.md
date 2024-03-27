## Implementation of an application for easy document sharing

## Context and Problem Statement

It is necessary to implement an application with the help of which it is possible to conveniently
share documents between
users.

## Decision Drivers

* The application should be simple
* The application should be easily scalable

## Decision Outcome

In summary, it was decided to use clean architecture and extract the necessary aggregates from the
subject area.
aggregates necessary for the project.

Currently Tech stack:

* Java 21 main language
* Spring framework(reactive data,security, webflux, security)
* Postgres for data storage
* Redis for cache storage
* Minio for file storage

The structure of the application is a modular-monolith