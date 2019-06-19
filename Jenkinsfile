pipeline{
  agent any
  stages{
      stage('cloning from remote repo'){
          steps{
            git 'https://github.com/Rohini4006/remote-repository.git'
          }
        }
      stage('cloning from remote repo'){
          steps{
            bat 'javac test.java'
            bat 'java test'
          }
        }
     }
}
