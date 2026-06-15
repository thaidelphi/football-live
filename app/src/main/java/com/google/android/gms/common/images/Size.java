package com.google.android.gms.common.images;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Size {

    /* renamed from: a  reason: collision with root package name */
    private final int f12447a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12448b;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f12447a == size.f12447a && this.f12448b == size.f12448b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f12448b;
        int i11 = this.f12447a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        int i10 = this.f12447a;
        int i11 = this.f12448b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i10);
        sb.append("x");
        sb.append(i11);
        return sb.toString();
    }
}
