package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();
    @SafeParcelable.Field
    public String afmaVersion;
    @SafeParcelable.Field
    public int buddyApkVersion;
    @SafeParcelable.Field
    public int clientJarVersion;
    @SafeParcelable.Field
    public boolean isClientJar;
    @SafeParcelable.Field
    public boolean isLiteSdk;

    public VersionInfoParcel(int i10, int i11, boolean z10) {
        this(i10, i11, z10, false, false);
    }

    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(GooglePlayServicesUtilLight.f12026a, GooglePlayServicesUtilLight.f12026a, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, this.afmaVersion, false);
        SafeParcelWriter.k(parcel, 3, this.buddyApkVersion);
        SafeParcelWriter.k(parcel, 4, this.clientJarVersion);
        SafeParcelWriter.c(parcel, 5, this.isClientJar);
        SafeParcelWriter.c(parcel, 6, this.isLiteSdk);
        SafeParcelWriter.b(parcel, a10);
    }

    public VersionInfoParcel(int i10, int i11, boolean z10, boolean z11) {
        this(i10, i11, z10, false, z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VersionInfoParcel(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L5
            java.lang.String r12 = "0"
            goto Lc
        L5:
            if (r12 == 0) goto La
            java.lang.String r12 = "2"
            goto Lc
        La:
            java.lang.String r12 = "1"
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "afma-sdk-a-v"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r10)
            r0.append(r1)
            r0.append(r12)
            java.lang.String r3 = r0.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.VersionInfoParcel.<init>(int, int, boolean, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public VersionInfoParcel(@SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11) {
        this.afmaVersion = str;
        this.buddyApkVersion = i10;
        this.clientJarVersion = i11;
        this.isClientJar = z10;
        this.isLiteSdk = z11;
    }
}
