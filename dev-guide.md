## Step 1: Configure an existing Eclipse instance

### 1. Install required plugins to Eclipse IDE

1. Go to Help \-> Install New Software
2. Select software site for current Eclipse version (for Neon it is http://download.eclipse.org/releases/neon/)
3. Check if following plugins are installed (and install them if they are not):
    * **EMF - Eclipse Modeling Framework SDK** plugin from **Modeling** category
    * **e(fx)clipse - IDE** plugin from **General Purpose Tools** category
4. Add **AspectJ Development Tools** software site: http://download.eclipse.org/tools/ajdt/46/dev/update
5. Install **AspectJ Development Tools** plugin

### 2. Set up Target Platform

1. Go to Window \-> Preferences, select Plug-in Development \-> Target Platform
2. Choose active Target Platform, click 'Edit...'
3. Check if following plugins are added (and add them if they are not):
    * **EMF - Eclipse Modeling Framework SDK**, **e(fx)clipse - IDE** from software site for current Eclipse version (for Neon it is http://download.eclipse.org/releases/neon/)
    * **AspectJ Development Tools** from http://download.eclipse.org/tools/ajdt/46/dev/update software site
4. Add plugins:
    * **RCPTT ECL Core**, **RCPTT ECL Platform**, **RCPTT ECL Server**, **RCPTT ECL Runtime core** (Core plugins shared between RCPTT IDE and Runtime), **RCPTT Runtime ECL Support** (Core ECL commands for capture/replay), **RCPTT Runtime Eclipse 4.x** from http://download.eclipse.org/rcptt/nightly/2.2.0/latest/runtime4x/

> All added plugins are showing in 'Locations' tab.
> To add plugin:
>
> 1. Click 'Add...' button
> 2. Select 'Software Site', click 'Next'
> 3. Add software site
> 4. Select the plugin
> 5. Click 'Finish'

### 3. Add sources

1. Go to File \-> Import, select Git \-> Projects from Git, click 'Next'
2. Select **Clone URI**, click 'Next'
3. Insert URI: https://github.com/xored/rcptt.extensions.ecl/, click 'Next'
4. Select **master** branch, click 'Next' three times
5. Select projects:
    * org.eclipse.rcptt.extensions.ecl.impl
    * org.eclipse.rcptt.extensions.ecl.model
6. Click 'Finish'


## Step 2: Run AUT from sources

### 1. Install RCPTT to Eclipse IDE

1. Go to Help \-> Install New Software
2. Add **RCPTT** software site: http://download.eclipse.org/rcptt/nightly/2.2.0/latest/repository/
3. Install **RCPTT IDE** plugin from **RCP Testing Tool** category

### 2. Connect to AUT from sources

1. Go to Run \-> Run configurations
2. Create a new 'Eclipse Application under Test' launch configuration
3. Select existing Eclipse Application launch configuration on the property page
4. Switch to 'RCPTT' perspective
5. You should be able to see the AUT in the 'Applications' view and launch it

If AUT launching fails with error message 'No org.eclipse.equinox.weaving.hook plugin', see: https://www.eclipse.org/rcptt/documentation/faq/install-as-plugin/
