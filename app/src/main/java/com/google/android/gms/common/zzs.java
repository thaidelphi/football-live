package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final String f12786a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final g f12787b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12788c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12789d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param String str, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11) {
        this.f12786a = str;
        h hVar = null;
        if (iBinder != null) {
            try {
                IObjectWrapper zzd = zzz.Z(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) ObjectWrapper.t0(zzd);
                if (bArr != null) {
                    hVar = new h(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e8) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e8);
            }
        }
        this.f12787b = hVar;
        this.f12788c = z10;
        this.f12789d = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(String str, g gVar, boolean z10, boolean z11) {
        this.f12786a = str;
        this.f12787b = gVar;
        this.f12788c = z10;
        this.f12789d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f12786a;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, str, false);
        g gVar = this.f12787b;
        if (gVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            gVar = null;
        }
        SafeParcelWriter.j(parcel, 2, gVar, false);
        SafeParcelWriter.c(parcel, 3, this.f12788c);
        SafeParcelWriter.c(parcel, 4, this.f12789d);
        SafeParcelWriter.b(parcel, a10);
    }
}
