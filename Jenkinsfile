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
            dir('C:\\Program Files (x86)\\Jenkins\\workspace\\test_Pipeline_git_Jenkinsfile\\src\\package1') {
            bat 'javac -d . demo1.java'
            bat 'java package1.demo1'
            }
       }
            
          }
        }
}
