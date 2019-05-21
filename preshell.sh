#!/bin/bash
cd /jenkins/shell
echo "Execute shell Start"
sh stop.sh
sh replace.sh
echo "Execute shell Finish"
chmod 777 /jenkins/shell/startup.sh
BUILD_ID=dontKillMe nohup /jenkins/shell/startup.sh &