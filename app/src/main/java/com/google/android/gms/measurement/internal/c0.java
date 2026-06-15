package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class c0 implements zzo {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f12889a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzfp f12890b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(zzfp zzfpVar, String str) {
        this.f12890b = zzfpVar;
        this.f12889a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.f12890b.f13531d;
        Map map2 = (Map) map.get(this.f12889a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
