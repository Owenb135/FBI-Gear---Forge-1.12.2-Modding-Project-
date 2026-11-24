# FBI Gear

FBI Gear is a Minecraft Forge mod for Minecraft 1.12.2. It adds titanium
materials and tools, dyed iron, and night-vision glasses.

## Requirements

- Minecraft 1.12.2
- Minecraft Forge 14.23.5.2864
- Java 8 to run the game and build the mod

## Build

Run the Gradle wrapper from the project directory:

```sh
./gradlew build
```

The reobfuscated mod JAR is created in `build/libs/`. Install it by copying the
JAR into the `mods` directory of a Minecraft 1.12.2 Forge installation.

## Development

Import the project as a Gradle project in IntelliJ IDEA, use the included Gradle
wrapper, and select a Java 8 JDK for Gradle and the Minecraft run configuration.
Launch the development client with:

```sh
./gradlew runClient
```

The mod currently has no required third-party mod dependencies.
