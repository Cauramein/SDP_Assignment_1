# Assignment 1: Builder Pattern - VR Headset

Course: ShP-2216 Software Design Patterns
Language: Java (JDK 17)

## 1. The Product
The complex object is a Virtual Reality (VR) Headset. VR headsets require step-by-step configuration of modular components like straps, facial interfaces, controller types, and PC link cables. Using a standard constructor would require passing multiple null or default values, so the Builder pattern is used to assemble it cleanly.

## 2. Representations
There are two concrete builders that create different configurations:
- StandaloneBuilder: Configures a wireless headset for media and light gaming. It warns the user if they try to attach a PC link cable.
- PcVrBuilder: Configures a heavy gaming headset for PC use. It throws an error if the user forgets to include the required PC link cable.

The project also includes a VrDirector class with three presets: a media viewer, a Steam VR gaming rig, and a developer test rig.

## 3. Project Structure
- src/VrHeadset.java
- src/VrHeadsetBuilder.java
- src/StandaloneBuilder.java
- src/PcVrBuilder.java
- src/VrDirector.java
- src/Main.java

## 4. How to Run
Open a terminal in the project folder and compile the Java files:

```bash
javac src/*.java
#and
java -cp src Main
```
Upon running, the console will present a menu. You can choose Mode 1 to build a custom rig step-by-step using the Scanner inputs, or Mode 2 to use the VrDirector to auto-buy a pre-configured bundle.
