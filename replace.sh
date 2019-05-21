jar_name=JenkinsDemo.jar
#!编译好的jar包存放地址
file_path=~/.jenkins/workspace/AutoSpringboot/target
#!将现有的jar备份后，将新的jar包替换
file="/jenkins/JenkinsDemo.jar"
if [ -f "$file" ]
then
mv /jenkins/JenkinsDemo.jar /jenkins/list/JenkinsDemo.jar.`date +%Y%m%d%H%M%S`
fi
cp ~/.jenkins/workspace/AutoSpringboot/target/JenkinsDemo.jar /jenkins