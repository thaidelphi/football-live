package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawh extends zzaws {
    public zzawh(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "ZQuMSqLu1gdm/gMzUvHWBkU0Sn7gMow0arYusmUfoGeG+b5t8M6fSL0HewVMmbAc", "fXma+90wsiayVNPFngiOIHN3H33XPFacSJs09CpdE6Q=", zzarfVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzarf zzarfVar = this.zzd;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzarfVar.zzac(i10);
        } catch (InvocationTargetException unused) {
            this.zzd.zzac(3);
        }
    }
}
