package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface WebMessageBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    @Deprecated
    String getData();

    InvocationHandler getMessagePayload();

    InvocationHandler[] getPorts();
}
