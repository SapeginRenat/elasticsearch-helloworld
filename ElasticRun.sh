#!/bin/sh

sudo sysctl -w vm.max_map_count=262144
sudo docker-compose -f ~/Projects/Docker/elastic-docker-compose.yml up -d
