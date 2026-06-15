package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbsv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsv> CREATOR = new zzbsw();
    @SafeParcelable.Field
    public final View zza;
    @SafeParcelable.Field
    public final Map zzb;

    @SafeParcelable.Constructor
    public zzbsv(@SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2) {
        this.zza = (View) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder));
        this.zzb = (Map) ObjectWrapper.t0(IObjectWrapper.Stub.Z(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        View view = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.j(parcel, 1, ObjectWrapper.u0(view).asBinder(), false);
        SafeParcelWriter.j(parcel, 2, ObjectWrapper.u0(this.zzb).asBinder(), false);
        SafeParcelWriter.b(parcel, a10);
    }
}
