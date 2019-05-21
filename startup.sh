echo "授予当前用户权限"
chmod 777 /jenkins/JenkinsDemo.jar
echo "执行....."
cd /jenkins
java -jar JenkinsDemo.jar
echo "**********************cmp on  jenkins started*************************"