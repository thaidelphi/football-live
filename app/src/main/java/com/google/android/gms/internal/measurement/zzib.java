package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.a;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzib implements zzhj {
    private static final Map zza = new a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzib zza(Context context, String str, Runnable runnable) {
        zzib zzibVar;
        if (!zzha.zzb()) {
            synchronized (zzib.class) {
                zzibVar = (zzib) zza.get(null);
                if (zzibVar == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return zzibVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzc() {
        synchronized (zzib.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((zzib) it.next()).zzb;
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    public final Object zzb(String str) {
        throw null;
    }
}
