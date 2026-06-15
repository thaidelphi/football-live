package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GifViewUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final List<String> f30020a = Arrays.asList("raw", "drawable", "mipmap");

    static void a(int i10, Drawable drawable) {
        if (drawable instanceof pl.droidsonroids.gif.a) {
            ((pl.droidsonroids.gif.a) drawable).g(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(Resources resources, int i10) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.density;
        if (i11 == 0) {
            i11 = 160;
        } else if (i11 == 65535) {
            i11 = 0;
        }
        int i12 = resources.getDisplayMetrics().densityDpi;
        if (i11 <= 0 || i12 <= 0) {
            return 1.0f;
        }
        return i12 / i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet != null && !imageView.isInEditMode()) {
            a aVar = new a(imageView, attributeSet, i10, i11);
            int i12 = aVar.f30024b;
            if (i12 >= 0) {
                a(i12, imageView.getDrawable());
                a(i12, imageView.getBackground());
            }
            return aVar;
        }
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(ImageView imageView, Uri uri) {
        if (uri != null) {
            try {
                imageView.setImageDrawable(new pl.droidsonroids.gif.a(imageView.getContext().getContentResolver(), uri));
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(ImageView imageView, boolean z10, int i10) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                pl.droidsonroids.gif.a aVar = new pl.droidsonroids.gif.a(resources, i10);
                if (z10) {
                    imageView.setImageDrawable(aVar);
                    return true;
                } else if (Build.VERSION.SDK_INT >= 16) {
                    imageView.setBackground(aVar);
                    return true;
                } else {
                    imageView.setBackgroundDrawable(aVar);
                    return true;
                }
            } catch (Resources.NotFoundException | IOException unused) {
                return false;
            }
        }
        return false;
    }

    /* compiled from: GifViewUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        final int f30021c;

        /* renamed from: d  reason: collision with root package name */
        final int f30022d;

        a(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
            super(imageView, attributeSet, i10, i11);
            this.f30021c = a(imageView, attributeSet, true);
            this.f30022d = a(imageView, attributeSet, false);
        }

        private static int a(ImageView imageView, AttributeSet attributeSet, boolean z10) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z10 ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (d.f30020a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !d.e(imageView, z10, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }

        a() {
            this.f30021c = 0;
            this.f30022d = 0;
        }
    }

    /* compiled from: GifViewUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f30023a;

        /* renamed from: b  reason: collision with root package name */
        int f30024b;

        b(View view, AttributeSet attributeSet, int i10, int i11) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, aa.b.f621b, i10, i11);
            this.f30023a = obtainStyledAttributes.getBoolean(aa.b.f622c, false);
            this.f30024b = obtainStyledAttributes.getInt(aa.b.f623d, -1);
            obtainStyledAttributes.recycle();
        }

        b() {
            this.f30023a = false;
            this.f30024b = -1;
        }
    }
}
