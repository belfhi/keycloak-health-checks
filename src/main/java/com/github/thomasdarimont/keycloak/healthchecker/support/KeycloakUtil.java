package com.github.thomasdarimont.keycloak.healthchecker.support;

import org.keycloak.utils.KeycloakSessionUtil;
import org.jboss.logging.Logger;

public class KeycloakUtil {

    private final static Logger logger = Logger.getLogger(KeycloakUtil.class);

    public static boolean isRunningOnKeycloak() {
        logger.info(Holder.PROVIDER_NAME);
        return Holder.RUNNING_ON_KEYCLOAK;
    }

    public static boolean isRunningOnKeycloakX() {
        return !isRunningOnKeycloak();
    }

    private static class Holder {

        private static final boolean RUNNING_ON_KEYCLOAK;
        private static final String PROVIDER_NAME;

        static {

            PROVIDER_NAME = KeycloakSessionUtil.getKeycloakSession().getClass().getSimpleName();
            RUNNING_ON_KEYCLOAK = PROVIDER_NAME.equals("Resteasy3Provider");
        }

    }
}
