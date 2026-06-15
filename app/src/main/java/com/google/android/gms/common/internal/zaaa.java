package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    private static final int b(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return i13;
                }
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown color scheme: ");
                sb.append(i10);
                throw new IllegalStateException(sb.toString());
            }
            return i12;
        }
        return i11;
    }

    public final void a(Resources resources, int i10, int i11) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i12 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i12);
        setMinWidth(i12);
        int i13 = R.drawable.f11917b;
        int i14 = R.drawable.f11918c;
        int b10 = b(i11, i13, i14, i14);
        int i15 = R.drawable.f11919d;
        int i16 = R.drawable.f11920e;
        int b11 = b(i11, i15, i16, i16);
        if (i10 == 0 || i10 == 1) {
            b10 = b11;
        } else if (i10 != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i10);
            throw new IllegalStateException(sb.toString());
        }
        Drawable r10 = androidx.core.graphics.drawable.a.r(resources.getDrawable(b10));
        androidx.core.graphics.drawable.a.o(r10, resources.getColorStateList(R.color.f11915c));
        androidx.core.graphics.drawable.a.p(r10, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r10);
        int i17 = R.color.f11913a;
        int i18 = R.color.f11914b;
        setTextColor((ColorStateList) Preconditions.m(resources.getColorStateList(b(i11, i17, i18, i18))));
        if (i10 == 0) {
            setText(resources.getString(R.string.f11936p));
        } else if (i10 == 1) {
            setText(resources.getString(R.string.f11937q));
        } else if (i10 == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i10);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod(null);
        if (DeviceProperties.f(getContext())) {
            setGravity(19);
        }
    }
}
