package com.google.android.gms.ads;

import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class VersionInfo {

    /* renamed from: a  reason: collision with root package name */
    protected final int f11101a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f11102b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f11103c;

    public VersionInfo(int i10, int i11, int i12) {
        this.f11101a = i10;
        this.f11102b = i11;
        this.f11103c = i12;
    }

    public int getMajorVersion() {
        return this.f11101a;
    }

    public int getMicroVersion() {
        return this.f11103c;
    }

    public int getMinorVersion() {
        return this.f11102b;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.f11101a), Integer.valueOf(this.f11102b), Integer.valueOf(this.f11103c));
    }
}
