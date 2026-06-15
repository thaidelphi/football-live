package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.n;
/* compiled from: CommonCreateFile.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(File parent, String child) {
        n.f(parent, "parent");
        n.f(child, "child");
        return new File(parent, child);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(String pathname) {
        n.f(pathname, "pathname");
        return new File(pathname);
    }
}
