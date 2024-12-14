#!/bin/sh

xhost +local:docker

docker rm -f xql && docker rmi xql

docker compose up -d