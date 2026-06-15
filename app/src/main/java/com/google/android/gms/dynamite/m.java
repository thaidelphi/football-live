package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m implements DynamiteModule.VersionPolicy.IVersions {

    /* renamed from: a  reason: collision with root package name */
    private final int f12817a;

    public m(int i10, int i11) {
        this.f12817a = i10;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int a(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int b(Context context, String str) {
        return this.f12817a;
    }
}
