package org.keycloak.extensions.keycloak.trackmania;

import org.keycloak.broker.oidc.OAuth2IdentityProviderConfig;
import org.keycloak.models.IdentityProviderModel;

public class TrackmaniaIdentityProviderConfig extends OAuth2IdentityProviderConfig {
    public TrackmaniaIdentityProviderConfig(IdentityProviderModel model) {
        super(model);
    }

    public TrackmaniaIdentityProviderConfig() {
    }

}
