package com.hawolt.virtual.leagueclient.refresh;

import com.hawolt.generic.token.impl.StringTokenSupplier;
import com.hawolt.version.IVersionSupplier;
import com.hawolt.virtual.leagueclient.authentication.IAuthentication;
import com.hawolt.virtual.riotclient.VirtualRiotClientInstance;

import java.io.IOException;

/**
 * Created: 22/05/2023 11:50
 * Author: Twitter @hawolt
 **/

public class Refreshable {
    private final IRefreshStatus status;
    private final IAuthentication authentication;
    private final IVersionSupplier versionSupplier;
    private final StringTokenSupplier tokenSupplier;

    public Refreshable(IRefreshStatus status, IAuthentication authentication, IVersionSupplier versionSupplier, StringTokenSupplier tokenSupplier) {
        this.versionSupplier = versionSupplier;
        this.authentication = authentication;
        this.tokenSupplier = tokenSupplier;
        this.status = status;
    }

    public IRefreshStatus getStatus() {
        return status;
    }

    public IAuthentication getAuthentication() {
        return authentication;
    }

    public IVersionSupplier getVersionSupplier() {
        return versionSupplier;
    }

    public StringTokenSupplier getTokenSupplier() {
        return tokenSupplier;
    }

    public String refresh(VirtualRiotClientInstance instance) throws IOException {
        return authentication.refresh(instance.getGateway(), versionSupplier, tokenSupplier);
    }
}
