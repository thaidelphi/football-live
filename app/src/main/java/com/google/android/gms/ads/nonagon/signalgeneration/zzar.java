package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzgal;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzar implements zzgal {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzbss f11694a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f11695b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzau f11696c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzar(zzau zzauVar, zzbss zzbssVar, boolean z10) {
        this.f11694a = zzbssVar;
        this.f11695b = z10;
        this.f11696c = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        try {
            zzbss zzbssVar = this.f11694a;
            String message = th.getMessage();
            zzbssVar.zze("Internal error: " + message);
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z10;
        String str;
        Uri O0;
        zzfhp zzfhpVar;
        zzfhp zzfhpVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f11694a.zzf(arrayList);
            z10 = this.f11696c.f11713m;
            if (z10 || this.f11695b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.f11696c.F0(uri)) {
                        str = this.f11696c.f11722v;
                        O0 = zzau.O0(uri, str, "1");
                        zzfhpVar = this.f11696c.f11712l;
                        zzfhpVar.zzd(O0.toString(), null, null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhp)).booleanValue()) {
                            zzfhpVar2 = this.f11696c.f11712l;
                            zzfhpVar2.zzd(uri.toString(), null, null);
                        }
                    }
                }
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
        }
    }
}
