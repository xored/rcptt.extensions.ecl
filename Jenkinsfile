pipeline {
  agent {
    kubernetes {
      label 'rcptt-extention-ecl-build-agent'
      yaml """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: ubuntu
    image: dudaevar/ubuntu-rcptt
    tty: true
    resources:
      limits:
        memory: "2Gi"
        cpu: "1"
      requests:
        memory: "2Gi"
        cpu: "1"
    volumeMounts:
    - name: settings-xml
      mountPath: /home/jenkins/.m2/settings.xml
      subPath: settings.xml
      readOnly: true
    - name: toolchains-xml
      mountPath: /home/jenkins/.m2/toolchains.xml
      subPath: toolchains.xml
      readOnly: true
    - name: m2-repo
      mountPath: /home/jenkins/.m2/repository
  volumes:
  - name: settings-xml
    configMap: 
      name: m2-dir
      items:
      - key: settings.xml
        path: settings.xml
  - name: toolchains-xml
    configMap:
      name: m2-dir
      items:
      - key: toolchains.xml
        path: toolchains.xml
  - name: m2-repo
    emptyDir: {}
"""
    }
  }
  stages {
    stage('Checkout'){
      steps {
        checkout scm
      }
    }
    stage('Build'){
      steps {
        container('ubuntu') {
          sh 'mvn clean verify -X -Dmaven.repo.local=$WORKSPACE/m2 -e'
        }       
      }
    }
    stage('Archive'){
      steps {
        archiveArtifacts allowEmptyArchive: true, artifacts: 'runtime/repository/org.eclipse.rcptt.extensions.runtime.site/target/repository/**/*'
      }
    }
  }
}