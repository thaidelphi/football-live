package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: AndroidMediationDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidMediationDataSource implements MediationDataSource {
    public static final Companion Companion = new Companion(null);
    private static final String MEDIATION_NAME = "name";
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";
    private static final String MEDIATION_STORAGE_NAME = "mediation";
    private static final String MEDIATION_VALUE = "value";
    private static final String MEDIATION_VERSION = "version";
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";
    private final JsonStorage publicStorage;

    /* compiled from: AndroidMediationDataSource.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public AndroidMediationDataSource(JsonStorage publicStorage) {
        n.f(publicStorage, "publicStorage");
        this.publicStorage = publicStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getName() {
        return (String) this.publicStorage.get(MEDIATION_NAME_KEY);
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getVersion() {
        return (String) this.publicStorage.get(MEDIATION_VERSION_KEY);
    }
}
