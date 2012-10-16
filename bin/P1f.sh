#!/bin/bash
# Script: P1e.sh (Linux / Mac OS X)
java -classpath "." p1.P1e 7
error=$?
if [ $error -ne 0 ]
then
echo Codigo de error: $error
else
echo ok
fi