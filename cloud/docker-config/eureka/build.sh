if [ $# == 0 ]; then
    echo -e "usage: ./build.sh version\neg:./build.sh 4.4.0 "
    exit 1
fi
version=$1
docker build -t nexus.elanking.com:5001/cloud/eureka-server:$version .
docker login nexus.elanking.com:5001 -u jing.jiang -p Elanking123!
docker push nexus.elanking.com:5001/cloud/eureka-server:$version
