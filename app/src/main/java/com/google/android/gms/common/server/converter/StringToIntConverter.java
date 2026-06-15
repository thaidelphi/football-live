package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12655a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Integer> f12656b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<String> f12657c;

    @KeepForSdk
    public StringToIntConverter() {
        this.f12655a = 1;
        this.f12656b = new HashMap<>();
        this.f12657c = new SparseArray<>();
    }

    @KeepForSdk
    public StringToIntConverter X(String str, int i10) {
        this.f12656b.put(str, Integer.valueOf(i10));
        this.f12657c.put(i10, str);
        return this;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* bridge */ /* synthetic */ String b(Integer num) {
        String str = this.f12657c.get(num.intValue());
        return (str == null && this.f12656b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12655a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f12656b.keySet()) {
            arrayList.add(new zac(str, this.f12656b.get(str).intValue()));
        }
        SafeParcelWriter.v(parcel, 2, arrayList, false);
        SafeParcelWriter.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param int i10, @SafeParcelable.Param ArrayList<zac> arrayList) {
        this.f12655a = i10;
        this.f12656b = new HashMap<>();
        this.f12657c = new SparseArray<>();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zacVar = arrayList.get(i11);
            X(zacVar.f12661b, zacVar.f12662c);
        }
    }
}
