package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zap();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12701a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    final String f12702b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<zam> f12703c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zal(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param ArrayList<zam> arrayList) {
        this.f12701a = i10;
        this.f12702b = str;
        this.f12703c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12701a);
        SafeParcelWriter.r(parcel, 2, this.f12702b, false);
        SafeParcelWriter.v(parcel, 3, this.f12703c, false);
        SafeParcelWriter.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f12701a = 1;
        this.f12702b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, map.get(str2)));
            }
        }
        this.f12703c = arrayList;
    }
}
