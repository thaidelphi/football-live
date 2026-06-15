package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12707a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f12708b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f12709c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param int i10, @SafeParcelable.Param ArrayList<zal> arrayList, @SafeParcelable.Param String str) {
        this.f12707a = i10;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zal zalVar = arrayList.get(i11);
            String str2 = zalVar.f12702b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.m(zalVar.f12703c)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                zam zamVar = zalVar.f12703c.get(i12);
                hashMap2.put(zamVar.f12705b, zamVar.f12706c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f12708b = hashMap;
        this.f12709c = (String) Preconditions.m(str);
        o0();
    }

    public final String X() {
        return this.f12709c;
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> n0(String str) {
        return this.f12708b.get(str);
    }

    public final void o0() {
        for (String str : this.f12708b.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f12708b.get(str);
            for (String str2 : map.keySet()) {
                map.get(str2).D0(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f12708b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f12708b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12707a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f12708b.keySet()) {
            arrayList.add(new zal(str, this.f12708b.get(str)));
        }
        SafeParcelWriter.v(parcel, 2, arrayList, false);
        SafeParcelWriter.r(parcel, 3, this.f12709c, false);
        SafeParcelWriter.b(parcel, a10);
    }
}
