# keycloak-trackmania
Extension for keycloak to support authentication through Trackmania API

### Install
Download the JAR file from releases in GitHub, add the JAR file to `$KEYCLOAK_HOME/standalone/deployments`.
At the next startup, Trackmania will be added as a Identity Provider.

### Create JAR file manually
Run `mvn package`

### Release the maven package to GitHub
From the terminal, run `mvn release:prepare release:perform`.

### License
This project is underlaid the Apache-2.0 License

### Support
Got any questions related to the use of this extension for Keycloak? Ask us on our [Discord](https://discord.gg/evotm).
