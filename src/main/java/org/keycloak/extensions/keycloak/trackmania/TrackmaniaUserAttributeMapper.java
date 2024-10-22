package org.keycloak.extensions.keycloak.trackmania;

import org.keycloak.broker.oidc.mappers.AbstractJsonUserAttributeMapper;

public class TrackmaniaUserAttributeMapper extends AbstractJsonUserAttributeMapper {

    private static final String[] cp = new String[] { TrackmaniaIdentityProviderFactory.PROVIDER_ID };

    @Override
    public String[] getCompatibleProviders() {
        return cp;
    }

    @Override
    public String getId() {
        return "trackmania-user-attribute-mapper";
    }

}
