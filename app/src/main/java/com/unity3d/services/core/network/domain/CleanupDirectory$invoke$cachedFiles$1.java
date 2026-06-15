package com.unity3d.services.core.network.domain;

import java.io.File;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
/* compiled from: CleanupDirectory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
/* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends l implements t8.l<File, Boolean> {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // t8.l
    public final Boolean invoke(File p02) {
        n.f(p02, "p0");
        return Boolean.valueOf(p02.isFile());
    }
}
