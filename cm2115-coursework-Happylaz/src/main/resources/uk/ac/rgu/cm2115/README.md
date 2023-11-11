# Resources Directory

This is where your FXML files go. Any file placed in the root of this directory will be openable by passing
its name to the `MainApp.setScene()` method. 

## Sub-directories

If you want to place views in sub-directories, you will need to provide the sub-directory when changing scenes. For example,
a scene called `myscene.fxml` in a directory `scenes`:

    MainApp.setScene("scenes/myscene", null);

## Controller packages

By default, controller classes must be placed in the `uk.ac.rgu.cm2115` package (i.e., beside the provided `MainApp` and `Controller` classes). If you wish to put them in a different package, you will need to edit the file `module-info.java` to export that package.

For example, if you place a controller class in the package `uk.ac.rgu.cm2115.controllers`, you will need to add the following line to `module-info.java` (before the closing '`}`'):

    exports uk.ac.rgu.cm2115.controllers;


If in doubt, stick to the default structure: FXML files in `src/main/resources/uk/ac/rgu/cm2115` and controller classes in `uk.ac.rgu.cm2115`. Marks will not be deducted for using this structure. 