# 1. Install Eclipse IDE

Install Eclipse Neon IDE for Eclipse Committers: https://www.eclipse.org/downloads/packages/eclipse-ide-eclipse-committers/neon2

# 2. Install required plugins

1. Go to Help \-> Install New Software
2. Select **Neon** software site (http://download.eclipse.org/releases/neon/)
3. Choose **EMF - Eclipse Modeling Framework SDK** plugin from **Modeling** category
4. Choose **e(fx)clipse - IDE** plugin from **General Purpose Tools** category
6. Install selected plugins
7. Add **AspectJ Development Tools** software site: http://download.eclipse.org/tools/ajdt/46/dev/update
8. Install **AspectJ Development Tools** plugin

# 3. Add sources

1. Go to File \-> Import, select Git \-> Projects from Git, click 'Next'
2. Select **Clone URI**, click 'Next'
3. Insert URI: https://github.com/xored/rcptt.extensions.ecl/, click 'Next'
4. Select **ren-commands** branch, click 'Next' three times
5. Select projects:
    * org.eclipse.rcptt.extensions.ecl.impl
    * org.eclipse.rcptt.extensions.ecl.model
    * target-platform
6. Click 'Finish'

# 4. Set up Target Platform

Open **ecl-dev-neon.target** from **target-platform** project and click 'Set as Target Platform'
