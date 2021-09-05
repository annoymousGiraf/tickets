#!/usr/bin/env bash

docker-compose run build

docker-compose build release

docker run -it tickets:latest