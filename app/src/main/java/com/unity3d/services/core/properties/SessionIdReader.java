package com.unity3d.services.core.properties;

import java.util.UUID;
import kotlin.jvm.internal.n;
/* compiled from: SessionIdReader.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class SessionIdReader {
    public static final SessionIdReader INSTANCE = new SessionIdReader();
    private static final String sessionId;

    static {
        String uuid = UUID.randomUUID().toString();
        n.e(uuid, "randomUUID().toString()");
        sessionId = uuid;
    }

    private SessionIdReader() {
    }

    public final String getSessionId() {
        return sessionId;
    }
}
