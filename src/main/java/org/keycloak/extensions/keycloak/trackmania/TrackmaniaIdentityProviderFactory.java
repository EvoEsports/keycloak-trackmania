package org.keycloak.extensions.keycloak.trackmania;

import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;

public class TrackmaniaIdentityProviderFactory extends AbstractIdentityProviderFactory<TrackmaniaIdentityProvider>
        implements SocialIdentityProviderFactory<TrackmaniaIdentityProvider> {

    public static final String PROVIDER_ID = "trackmania";

    @Override
    public String getName() {
        return "Trackmania";
    }

    @Override
    public TrackmaniaIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new TrackmaniaIdentityProvider(session, new TrackmaniaIdentityProviderConfig(model));
    }

    @Override
    public TrackmaniaIdentityProviderConfig createConfig() {
        return new TrackmaniaIdentityProviderConfig();
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }
}
