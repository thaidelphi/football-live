package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.h;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhg {
    private final h zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhg(h hVar) {
        this.zza = hVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            h hVar = (h) this.zza.get(uri.toString());
            if (hVar == null) {
                return null;
            }
            return (String) hVar.get("".concat(String.valueOf(str3)));
        }
        return null;
    }
}
