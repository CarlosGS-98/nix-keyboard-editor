# Keyboard layout editor
*NIX Keyboard Editor is a JavaFX application made to help you create custom keyboard layouts for Unix-like OSes. 
The application works with the <code>X&nbsp;Keyboard&nbsp;Extension&nbsp;(XKB)</code> (often found on Linux, OpenSolaris, BSD, etc.). 

![Keyboard layout editor](https://raw.githubusercontent.com/CarlosGS-98/nix-keyboard-editor/master/editor.png)

## Requirements
As this is a revitalized JavaFX application, you need both Java 21 and JavaFX 21 to build and run the editor (the reason being that Java 21 is currently the latest LTS release of the language).

### Linux
You can use your package manager to obtain Java 21 JDK and JavaFX 21 like follows:

#### APT
`$  sudo apt install openjdk-21-jdk`

#### Pacman
`$  sudo pacman -S jdk21-openjdk java21-openjfx-bin`

#### Zypper
`$  sudo zypper install java-21-openjdk `

If JavaFX 21 isn't listed on your package manager's database, you can always download the former using `wget`:
`$   wget https://download2.gluonhq.com/openjfx/21.0.5/openjfx-21.0.5_linux-x64_bin-sdk.zip`

Check out ![OpenJFX's website](https://openjfx.io/openjfx-docs/) to see how to manually install JavaFX on your system if you need to.

### Other dependencies
You can also install [xkblayout-state](https://github.com/nonpop/xkblayout-state) on your system. If you don't, the editor will run just fine, but the currently selected group won't be automatically displayed by the editor (although you can still choose the desired layout group via the menu in the editor).

## Running
You can run the application simply by typing `./mvnw javafx:run` on the repo's root folder.

## Features
* Current keyboard layout is automatically imported from the X Server.
* Symbol file can be exported and used by XKB to change the keyboard mapping.
* There is a support for up to 4 characters (levels) per key.
* Up to 8 layout groups are supported allowing definition of multiple keyboard layouts among which you can switch.
* It is possible to set key types (`xkb_type`) for each key.
* Generated characters are defined using Unicode (`UXXXX` and `0x100XXXX` formats are supported), character map or using [keysym](https://www.cl.cam.ac.uk/~mgk25/ucs/keysymdef.h).
* There are a lot of characters in Unicode, and this application aims to be able to display them all correctly. Choose which font you want to use in the virtual keyboard. When a given font does not support displaying certain characters, the application tries to detect it and select an alternative.
* You can choose which keyboard model to display in the editor. Select the desired appearance of the keyboard or create and use your own. Keyboard models are described using JSON files – [see an example of a 104-key ANSI keyboard](https://github.com/CarlosGS-98/nix-keyboard-editor/blob/master/src/main/resources/model/ansi104.json).
* The editor doesn't depend on any specific GUI environment. It doesn't matter whether you use KDE, GNOME, Xfce or anything else.
* The application can be used on any platform that supports Java 21 and JavaFX 21. If you are not using XKB, you can still work with the application and generate a symbol file (although you will not be able to use the file itself to change your keyboard mapping).

## Planned Features
- Creating keyboard layouts with more than 4 levels per key if the keyboard model supports it.
- Adding dead key table files in a similar fashion to what ![KBDEdit](http://kbdedit.com) does (though with a different, unencrypted file format) so that, for example, multilingual keyboard layouts can be made faster by importing dead key pairs.
 - In addition to the above, allowing the possibility to chain dead keys in the keyboard layouts, as well as making use of the Compose key. 
- Importing KLC files into the editor (_probably hard to do_).

## Creating new XKB variants using the editor
Working with XKB variants is not supported by the editor for now. The default export configuration is <code>xkb_symbols "basic"</code>. However, you can define your variant in different group and set export settings so that you export only current group without type - this way you get only symbols definitions for the current group. You can then use the definition however you like (e.g. define your own custom XKB variant).

## License
*NIX Keyboard Editor is MIT licensed (see LICENSE file).
