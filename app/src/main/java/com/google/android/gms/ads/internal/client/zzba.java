package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbdv;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzba {

    /* renamed from: a  reason: collision with root package name */
    private static final zzco f11200a;

    static {
        zzco zzcoVar = null;
        try {
            Object newInstance = zzaz.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcoVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(iBinder);
                }
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate ClientApi class.");
        }
        f11200a = zzcoVar;
    }

    private final Object a() {
        zzco zzcoVar = f11200a;
        if (zzcoVar != null) {
            try {
                return zzb(zzcoVar);
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke local loader using ClientApi class.", e8);
                return null;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("ClientApi class cannot be loaded.");
        return null;
    }

    private final Object b() {
        try {
            return zzc();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke remote loader.", e8);
            return null;
        }
    }

    protected abstract Object zza();

    protected abstract Object zzb(zzco zzcoVar) throws RemoteException;

    protected abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z10) {
        boolean z11;
        Object a10;
        if (!z10) {
            zzbb.zzb();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzt(context, GooglePlayServicesUtilLight.f12026a)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        zzbbm.zza(context);
        if (((Boolean) zzbdh.zza.zze()).booleanValue()) {
            z11 = false;
        } else if (((Boolean) zzbdh.zzb.zze()).booleanValue()) {
            z11 = true;
            z12 = true;
        } else {
            z12 = z10 | z13;
            z11 = false;
        }
        if (z12) {
            a10 = a();
            if (a10 == null && !z11) {
                a10 = b();
            }
        } else {
            Object b10 = b();
            if (b10 == null) {
                if (zzbb.zze().nextInt(((Long) zzbdv.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzbb.zzb().zzo(context, zzbb.zzc().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            a10 = b10 == null ? a() : b10;
        }
        return a10 == null ? zza() : a10;
    }
}
