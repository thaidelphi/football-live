package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final int f12073a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String f12074b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f12075c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final ConnectionResult f12076d;
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: e  reason: collision with root package name */
    public static final Status f12065e = new Status(-1);
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: f  reason: collision with root package name */
    public static final Status f12066f = new Status(0);
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: g  reason: collision with root package name */
    public static final Status f12067g = new Status(14);
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: h  reason: collision with root package name */
    public static final Status f12068h = new Status(8);
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: i  reason: collision with root package name */
    public static final Status f12069i = new Status(15);
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: j  reason: collision with root package name */
    public static final Status f12070j = new Status(16);
    @ShowFirstParty

    /* renamed from: l  reason: collision with root package name */
    public static final Status f12072l = new Status(17);
    @KeepForSdk

    /* renamed from: k  reason: collision with root package name */
    public static final Status f12071k = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new zzb();

    public Status(int i10) {
        this(i10, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public Status(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param ConnectionResult connectionResult) {
        this.f12073a = i10;
        this.f12074b = str;
        this.f12075c = pendingIntent;
        this.f12076d = connectionResult;
    }

    public void C0(Activity activity, int i10) throws IntentSender.SendIntentException {
        if (y0()) {
            PendingIntent pendingIntent = this.f12075c;
            Preconditions.m(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    public final String D0() {
        String str = this.f12074b;
        return str != null ? str : CommonStatusCodes.a(this.f12073a);
    }

    public ConnectionResult X() {
        return this.f12076d;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status a() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f12073a == status.f12073a && Objects.a(this.f12074b, status.f12074b) && Objects.a(this.f12075c, status.f12075c) && Objects.a(this.f12076d, status.f12076d);
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f12073a), this.f12074b, this.f12075c, this.f12076d);
    }

    @ResultIgnorabilityUnspecified
    public int n0() {
        return this.f12073a;
    }

    public String o0() {
        return this.f12074b;
    }

    public String toString() {
        Objects.ToStringHelper c10 = Objects.c(this);
        c10.a("statusCode", D0());
        c10.a("resolution", this.f12075c);
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, n0());
        SafeParcelWriter.r(parcel, 2, o0(), false);
        SafeParcelWriter.q(parcel, 3, this.f12075c, i10, false);
        SafeParcelWriter.q(parcel, 4, X(), i10, false);
        SafeParcelWriter.b(parcel, a10);
    }

    public boolean y0() {
        return this.f12075c != null;
    }

    public boolean z0() {
        return this.f12073a <= 0;
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    @KeepForSdk
    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i10) {
        this(i10, str, connectionResult.o0(), connectionResult);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
