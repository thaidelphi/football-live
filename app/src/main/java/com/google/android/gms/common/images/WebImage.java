package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12449a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final Uri f12450b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f12451c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f12452d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param int i10, @SafeParcelable.Param Uri uri, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12) {
        this.f12449a = i10;
        this.f12450b = uri;
        this.f12451c = i11;
        this.f12452d = i12;
    }

    public int X() {
        return this.f12452d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.a(this.f12450b, webImage.f12450b) && this.f12451c == webImage.f12451c && this.f12452d == webImage.f12452d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(this.f12450b, Integer.valueOf(this.f12451c), Integer.valueOf(this.f12452d));
    }

    public Uri n0() {
        return this.f12450b;
    }

    public int o0() {
        return this.f12451c;
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f12451c), Integer.valueOf(this.f12452d), this.f12450b.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12449a);
        SafeParcelWriter.q(parcel, 2, n0(), i10, false);
        SafeParcelWriter.k(parcel, 3, o0());
        SafeParcelWriter.k(parcel, 4, X());
        SafeParcelWriter.b(parcel, a10);
    }
}
