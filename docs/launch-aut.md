## Run AUT from sources

### 1. Configure Run Configuration

1. Go to Run \-> Run configurations
2. Open an existing 'Eclipse Application' launch configuration
3. On 'Arguments' tab add following VM args:
```
-XX:PermSize=128M -XX:MaxPermSize=192M -DteslaPort=7926 -DeclPort=5378 -Dosgi.framework.extensions=org.eclipse.equinox.weaving.hook
```
![alt text](https://github.com/xored/rcptt.extensions.ecl/raw/master/docs/images/vm-args.png)
4. On 'Plug-ins' tab find 'org.eclipse.equinox.weaving.aspectj' plugin and set 'Auto-Start' to 'true' and 'Start Level' to '1' for it
![alt text](https://github.com/xored/rcptt.extensions.ecl/raw/master/docs/images/aspectj-plugin.png)
5. Add 'org.eclipse.rcptt.extensions.ecl.impl' and 'org.eclipse.rcptt.extensions.ecl.model'
![alt text](https://github.com/xored/rcptt.extensions.ecl/raw/master/docs/images/ecl-extensions.png)
6. Apply changes and run configuration

### 2. Connect to the running AUT
1. In RCPTT go to Run \-> Run configurations
2. Add new 'Remote Application Under Test'
3. Provide name and run configuration
![alt text](https://github.com/xored/rcptt.extensions.ecl/raw/master/docs/images/remote-aut.png)
4. If all is well, you should see a green triangle on the AUT item in Application View in RCPTT
![alt text](https://github.com/xored/rcptt.extensions.ecl/raw/master/docs/images/application-view.png)
