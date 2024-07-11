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
            RUNNING_ON_KEYCLOAK = KeycloakSessionUtil.getKeycloakSession().getProvider().getClass().getSimpleName().equals("Restesy3Provider");
        }
    }
}
