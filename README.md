# Template-PaperWeight

This repository is a customized template fork based on the PaperMC Paperweight system and their example plugin for multi-version support. It has been enhanced to simplify plugin development for all PaperMC-supported Minecraft versions, including:

- 1.17.1
- 1.18(1.18.1, 1.18.2)
- 1.19(1.19.1, 1.19.2, 1.19.3, 1.19.4)
- 1.20(1.20.1, 1.20.2, 1.20.3, 1.20.4)
- 1.21(1.21.1, 1.21.2, 1.21.3, 1.21.4)

## Features

- **Multi-Version Support**: The template is pre-configured to work seamlessly with all the major PaperMC family versions listed above.
- **Built on Paperweight**: Leverages the powerful Paperweight build system, enabling easy dependency management and streamlined workflows.
- **Example Plugin Code**: Includes a basic plugin example to demonstrate compatibility across versions and jumpstart your development.

## Why Use This Template?

This template is ideal for developers looking to:

- Create Minecraft plugins that are compatible with multiple versions of the game.
- Use modern build tools and frameworks like Gradle and Paperweight.
- Get started quickly with a clean, pre-configured project structure.

## Getting Started

1. **Clone this repository**:
   ```bash
   git clone https://github.com/yeetaaron1/Template-PaperWeight.git
   ```

2. **Configure your plugin**:
  - Update the `settings.gradle.kts` and `build.gradle.kts` files with your plugin's name and metadata.
  - Modify the `plugin.yml` file in the `resources` folder as needed.

3. **Build your plugin**:
   ```bash
   ./gradlew build
   ```

4. **Test with your target Minecraft version**:
  - Copy the generated JAR file from the `build/libs` directory to your server's `plugins` folder.
  - Start your server to see the plugin in action.

## Resources Used

- **Paperweight Documentation**: [https://github.com/PaperMC/paperweight/tree/main](https://github.com/PaperMC/paperweight/tree/main)
- **Example Plugin**: [https://github.com/PaperMC/paperweight-test-plugin](https://github.com/PaperMC/paperweight-test-plugin)

## Contributing

Contributions are welcome! Feel free to submit issues or pull requests to improve this template.

---

Thank you for using Template-PaperWeight. Happy coding and enjoy building amazing plugins for Minecraft!

