AUT_PATH='http://archive.eclipse.org/eclipse/downloads/drops4/R-4.7-201706120950/eclipse-SDK-4.7-linux-gtk-x86_64.tar.gz'

mvn clean verify -f ./tests/rcptt.extensions.ecl.get-devices-tests/pom.xml -Daut-path=$AUT_PATH || true
mvn clean verify -f ./tests/rcptt.extensions.ecl.jfx-tests/pom.xml -Daut-path=$AUT_PATH || true
mvn clean verify -f ./tests/rcptt.extensions.ecl.tests/pom.xml -Daut-path=$AUT_PATH || true
