package com.longnx;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

public class CustomStorageProviderFactory implements UserStorageProviderFactory<CustomStorageProvider> {

    public static final String PROVIDER_NAME = "hashmap-user-store";
    CustomUserStore userStore = new CustomUserStore();

    @Override
    public CustomStorageProvider create(KeycloakSession session, ComponentModel model) {
        return new CustomStorageProvider(session, model, userStore);
    }

    @Override
    public String getId() {
        return PROVIDER_NAME;
    }
}