pipeline{
  agent any
stages{
      stage('cloning from remote repo'){
          steps{
            git 'https://github.com/Rohini4006/remote-repository.git'
          }
        }
      stage('building'){
          steps{
            dir('C:\\Users\\rohini.rautray\\Desktop\\gitTest\\src\\package1') {            
            bat 'javac demo1.java'
            bat 'java demo1'
            }
       }
            
          }
        }
}
