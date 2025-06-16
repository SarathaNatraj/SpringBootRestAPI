  stage('Push Docker Image') {
            steps {
                script {
                    // Login to Docker Hub or your private registry
                    
                    // Tag and push the Docker image
                    bat "docker tag ${DOCKER_IMAGE} ${DOCKER_IMAGE}:latest"
                   bat "docker login -u ${DOCKER_USER} -p ${DOCKER_PASSWORD}"
                   
                    bat "docker push ${DOCKER_IMAGE}:latest"
                  //  bat "docker push ${DOCKER_IMAGE}"
                }
            }
        }
      
