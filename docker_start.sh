# bin/bash

docker run --network tgather-network -m 5g --env JAVA_OPTS='-Dspring.profiles.active=dev -Dfile.encoding=UTF-8 -Xmx2048m -XX:MaxMetaspaceSize=1024m' -p8888:8888 -d --name config-service leesg107/config-service || true

