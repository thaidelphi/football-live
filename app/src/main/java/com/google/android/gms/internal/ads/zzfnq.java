package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfnq {
    final zzfnt zza;
    final boolean zzb;

    private zzfnq(zzfnt zzfntVar) {
        this.zza = zzfntVar;
        this.zzb = zzfntVar != null;
    }

    public static zzfnq zzb(Context context, String str, String str2) {
        zzfnt zzfnrVar;
        try {
            try {
                try {
                    IBinder d10 = DynamiteModule.e(context, DynamiteModule.f12795b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d10 == null) {
                        zzfnrVar = null;
                    } else {
                        IInterface queryLocalInterface = d10.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfnrVar = queryLocalInterface instanceof zzfnt ? (zzfnt) queryLocalInterface : new zzfnr(d10);
                    }
                    zzfnrVar.zze(ObjectWrapper.u0(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfnq(zzfnrVar);
                } catch (Exception e8) {
                    throw new zzfms(e8);
                }
            } catch (Exception e10) {
                throw new zzfms(e10);
            }
        } catch (RemoteException | zzfms | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfnq(new zzfnu());
        }
    }

    public static zzfnq zzc() {
        zzfnu zzfnuVar = new zzfnu();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfnq(zzfnuVar);
    }

    public final zzfno zza(byte[] bArr) {
        return new zzfno(this, bArr, null);
    }
}
