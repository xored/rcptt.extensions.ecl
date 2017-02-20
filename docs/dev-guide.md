## Configure an existing Eclipse instance

### 1. Install required plugins to Eclipse IDE

1. Go to Help \-> Install New Software
2. Select software site for current Eclipse version (for Oxygen it is http://download.eclipse.org/releases/oxygen)
3. Check if following features are installed (and install them if they are not):
    * **EMF - Eclipse Modeling Framework SDK**, **Graphical Modeling Framework (GMF) Tooling SDK** feature from **Modeling** category
    * **Git integration for Eclipse** feature from **Collaboration** category
    * **e(fx)clipse - IDE** feature from **General Purpose Tools** category
![alt text](https://github.com/xored/rcptt.extensions.ecl/raw/master/docs/images/oxygen-features.png)
4. Add **Orbit** software site: http://download.eclipse.org/tools/orbit/downloads/drops/R20160520211859/repository/
5. Check if following features from **Orbit Bundles By Name: javax.*** category are installed (and install them if they are not):
    * **Apache Geronimo Activation Plug-in**
    * **Java XML Streaming API**
    * **JAXP XML**
    * **XML Binding for Java**
6. Add **AspectJ Development Tools** software site: http://download.eclipse.org/tools/ajdt/46/dev/update
7. Install **AspectJ Development Tools** plugin
![alt text](https://github.com/xored/rcptt.extensions.ecl/raw/master/docs/images/aspectj-feature.png)

### 2. Set up Target Platform

1. Go to Window \-> Preferences, select Plug-in Development \-> Target Platform
2. Choose active Target Platform, click 'Edit...'
![alt text](https://github.com/xored/rcptt.extensions.ecl/raw/master/docs/images/target-platform.png)
3. Click 'Add...' button
4. Select 'Software Site', click 'Next'
5. Add **RCPTT Runtime** software site: http://download.eclipse.org/rcptt/nightly/2.2.0/latest/runtime4x/
6. Select all features and check 'Include All Environment' option
![alt text](https://github.com/xored/rcptt.extensions.ecl/raw/master/docs/images/rcptt-runtime.png)
7. Click 'Finish'

### 3. Add sources

1. Go to File \-> Import, select Git \-> Projects from Git, click 'Next'
2. Select **Clone URI**, click 'Next'
3. Insert URI: https://github.com/xored/rcptt.extensions.ecl/, click 'Next'
4. Select **master** branch, click 'Next' three times
5. Select projects:
    * org.eclipse.rcptt.extensions.ecl.impl
    * org.eclipse.rcptt.extensions.ecl.model
6. Click 'Finish'

### 4. Launch AUT with custom ECL commands

See Launch AUT Guide in the [launch-aut.md](https://github.com/xored/rcptt.extensions.ecl/blob/master/docs/launch-aut.md) file
