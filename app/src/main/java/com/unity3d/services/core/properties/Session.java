package com.unity3d.services.core.properties;
/* compiled from: Session.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface Session {
    public static final Default Default = Default.$$INSTANCE;

    /* compiled from: Session.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();
        private static final String id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        public String getId() {
            return id;
        }
    }

    String getId();
}
