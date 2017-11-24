// Tell Jenkins how to build projects from this repository
pipeline {
	agent any

    // Keep only the last 15 builds
	options {
		buildDiscarder(logRotator(numToKeepStr: '20'))
	}
	
	tools { 
        maven 'Maven 3.3.9' 
        jdk 'Oracle JDK 8' 
    }
	 
    stages { 
        stage('Build') { 
            steps {
                configFileProvider([configFile(fileId: 'org.jenkinsci.plugins.configfiles.maven.MavenSettingsConfig1377688925713', variable: 'MAVEN_SETTINGS')]) {
                    sh 'mvn clean install -B -s $MAVEN_SETTINGS -f releng/hu.bme.mit.massif.parent/pom.xml'
                }
            	sh './releng/massif.commandevaluation.server-package/prepareMatlabServerPackage.sh'
            }
		}
    }
    
    post {
    	always {
    		archiveArtifacts 'releng/hu.bme.mit.massif.site/target/repository/**'
    		archiveArtifacts 'releng/massif.commandevaluation.server-package/massif.commandevaluation.server.zip'
    	}
        success {
            slackSend channel: "viatra-notifications", 
    			color: "good",
				message: "Build Successful - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)",
    			teamDomain: "incquerylabs",
    			tokenCredentialId: "6ff98023-8c20-4d9c-821a-b769b0ea0fad" 
        }
		unstable {
	   		slackSend channel: "viatra-notifications", 
    			color: "warning",
    			message: "Build Unstable - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)",
    			teamDomain: "incquerylabs",
    			tokenCredentialId: "6ff98023-8c20-4d9c-821a-b769b0ea0fad"
    	}
		failure {
    		slackSend channel: "viatra-notifications", 
    			color: "danger",
    			message: "Build Failed - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)",
    			teamDomain: "incquerylabs",
    			tokenCredentialId: "6ff98023-8c20-4d9c-821a-b769b0ea0fad"
		}
	}
}