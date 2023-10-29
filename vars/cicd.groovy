def gitrepo(repo){
  git 'https://github.com/intelliqittrainings/${repo}.git'
}
def Build(){
  sh 'mvn package'
}
def Deploy(jobname,ip,conetxtpath){
  sh 'scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${conetxtpath}.war
}
def Test(jobname){
   sh 'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar'
}
  
