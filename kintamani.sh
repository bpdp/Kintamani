#!/usr/bin/env bash

STATUS=$1

if [ -z $STATUS ]
then
	echo "Sintaksis: $0 [start|stop|clean_tmp]"
elif [ $STATUS == "start" ]
then
	nginx -p `pwd`/ -c conf/nginx.conf
elif [ $STATUS == "stop" ]
then
	nginx -p `pwd`/ -s stop
elif [ $STATUS == "clean" ]
then
	rm -rf client_body_temp
	rm -rf fastcgi_temp
	rm -rf proxy_temp
	rm -rf scgi_temp
	rm -rf uwsgi_temp
	rm -rf logs/*
else
	echo "Sintaksis: $0 [start|stop|clean]"
fi
