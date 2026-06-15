package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2621a = aVar.p(iconCompat.f2621a, 1);
        iconCompat.f2623c = aVar.j(iconCompat.f2623c, 2);
        iconCompat.f2624d = aVar.r(iconCompat.f2624d, 3);
        iconCompat.f2625e = aVar.p(iconCompat.f2625e, 4);
        iconCompat.f2626f = aVar.p(iconCompat.f2626f, 5);
        iconCompat.f2627g = (ColorStateList) aVar.r(iconCompat.f2627g, 6);
        iconCompat.f2629i = aVar.t(iconCompat.f2629i, 7);
        iconCompat.f2630j = aVar.t(iconCompat.f2630j, 8);
        iconCompat.o();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.p(aVar.f());
        int i10 = iconCompat.f2621a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f2623c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2624d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f2625e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f2626f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2627g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f2629i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f2630j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
