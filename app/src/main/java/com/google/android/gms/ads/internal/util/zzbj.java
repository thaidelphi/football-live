package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzanx;
import com.google.android.gms.internal.ads.zzaot;
import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapu;
import java.util.Collections;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbj extends zzapu {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f11439a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f11440b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl f11441c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, int i10, String str, zzaou zzaouVar, zzaot zzaotVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i10, str, zzaouVar, zzaotVar);
        this.f11439a = bArr;
        this.f11440b = map;
        this.f11441c = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    public final Map zzl() throws zzanx {
        Map map = this.f11440b;
        return map == null ? Collections.emptyMap() : map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzapu, com.google.android.gms.internal.ads.zzaop
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    public final byte[] zzx() throws zzanx {
        byte[] bArr = this.f11439a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzapu
    public final void zzz(String str) {
        this.f11441c.zzg(str);
        super.zzo(str);
    }
}
