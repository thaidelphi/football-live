package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();

    /* renamed from: o  reason: collision with root package name */
    static final Scope[] f12484o = new Scope[0];

    /* renamed from: p  reason: collision with root package name */
    static final Feature[] f12485p = new Feature[0];
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12486a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    final int f12487b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    final int f12488c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    String f12489d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    IBinder f12490e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    Scope[] f12491f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    Bundle f12492g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    Account f12493h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    Feature[] f12494i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    Feature[] f12495j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    final boolean f12496k;
    @SafeParcelable.Field

    /* renamed from: l  reason: collision with root package name */
    final int f12497l;
    @SafeParcelable.Field

    /* renamed from: m  reason: collision with root package name */
    boolean f12498m;
    @SafeParcelable.Field

    /* renamed from: n  reason: collision with root package name */
    private final String f12499n;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param String str, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param Scope[] scopeArr, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param Account account, @SafeParcelable.Param Feature[] featureArr, @SafeParcelable.Param Feature[] featureArr2, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i13, @SafeParcelable.Param boolean z11, @SafeParcelable.Param String str2) {
        scopeArr = scopeArr == null ? f12484o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f12485p : featureArr;
        featureArr2 = featureArr2 == null ? f12485p : featureArr2;
        this.f12486a = i10;
        this.f12487b = i11;
        this.f12488c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f12489d = "com.google.android.gms";
        } else {
            this.f12489d = str;
        }
        if (i10 < 2) {
            this.f12493h = iBinder != null ? AccountAccessor.t0(IAccountAccessor.Stub.Z(iBinder)) : null;
        } else {
            this.f12490e = iBinder;
            this.f12493h = account;
        }
        this.f12491f = scopeArr;
        this.f12492g = bundle;
        this.f12494i = featureArr;
        this.f12495j = featureArr2;
        this.f12496k = z10;
        this.f12497l = i13;
        this.f12498m = z11;
        this.f12499n = str2;
    }

    public final String X() {
        return this.f12499n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzn.a(this, parcel, i10);
    }
}
