package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.jvm.internal.h;
/* compiled from: AndroidTcfDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidTcfDataSource implements TcfDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String TCF_TCSTRING_KEY = "IABTCF_TCString";

    /* compiled from: AndroidTcfDataSource.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.TcfDataSource
    public String getTcfString() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + "_settings", TCF_TCSTRING_KEY);
    }
}
