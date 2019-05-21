#!将应用停止
#!stop.sh
#!/bin/bash
cd /jenkins/shell/
echo "Stopping SpringBoot Application for JenkinsDemo"
ls
pid=`ps -ef | grep JenkinsDemo.jar | grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]
then
#!kill -9 强制终止
   echo "kill -9 的pid:" $pid
   kill -9 $pid
fi