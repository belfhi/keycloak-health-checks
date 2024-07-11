package com.github.thomasdarimont.keycloak.healthchecker.support;

import org.keycloak.utils.KeycloakSessionUtil;

public class KeycloakUtil {

    public static boolean isRunningOnKeycloak() {
        return Holder.RUNNING_ON_KEYCLOAK;
    }

    public static boolean isRunningOnKeycloakX() {
        return !isRunningOnKeycloak();
    }

    private static class Holder {

        private static final boolean RUNNING_ON_KEYCLOAK;

        static {

            final String PROVIDER_NAME;
            RUNNING_ON_KEYCLOAK = KeycloakSessionUtil.getKeycloakSession().getClass().getSimpleName()
                    .equals("Resteasy3Provider");
            PROVIDER_NAME = KeycloakSessionUtil.getKeycloakSession().getClass().getSimpleName();
            System.out.println(PROVIDER_NAME);
        }
    }
}
