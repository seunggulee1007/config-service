# bin/bash
docker stop config-service || true
docker rm config-service || true
docker rmi leesg107/config-service || true
./gradlew clean bootBuildImage --imageName=leesg107/config-service
