package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12003a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f12004b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f12005c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f12006d;
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: e  reason: collision with root package name */
    public static final ConnectionResult f12002e = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();

    public ConnectionResult(int i10) {
        this(i10, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ConnectionResult(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param String str) {
        this.f12003a = i10;
        this.f12004b = i11;
        this.f12005c = pendingIntent;
        this.f12006d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String C0(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public int X() {
        return this.f12004b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionResult) {
            ConnectionResult connectionResult = (ConnectionResult) obj;
            return this.f12004b == connectionResult.f12004b && Objects.a(this.f12005c, connectionResult.f12005c) && Objects.a(this.f12006d, connectionResult.f12006d);
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f12004b), this.f12005c, this.f12006d);
    }

    public String n0() {
        return this.f12006d;
    }

    public PendingIntent o0() {
        return this.f12005c;
    }

    public String toString() {
        Objects.ToStringHelper c10 = Objects.c(this);
        c10.a("statusCode", C0(this.f12004b));
        c10.a("resolution", this.f12005c);
        c10.a("message", this.f12006d);
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f12003a;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.k(parcel, 2, X());
        SafeParcelWriter.q(parcel, 3, o0(), i10, false);
        SafeParcelWriter.r(parcel, 4, n0(), false);
        SafeParcelWriter.b(parcel, a10);
    }

    public boolean y0() {
        return (this.f12004b == 0 || this.f12005c == null) ? false : true;
    }

    public boolean z0() {
        return this.f12004b == 0;
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
