package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
/* compiled from: ActivityOptionsCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* compiled from: ActivityOptionsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final ActivityOptions f2444a;

        a(ActivityOptions activityOptions) {
            this.f2444a = activityOptions;
        }

        @Override // androidx.core.app.c
        public Bundle b() {
            return this.f2444a.toBundle();
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b {
        static ActivityOptions a(Context context, int i10, int i11) {
            return ActivityOptions.makeCustomAnimation(context, i10, i11);
        }

        static ActivityOptions b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13);
        }

        static ActivityOptions c(View view, Bitmap bitmap, int i10, int i11) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11);
        }
    }

    protected c() {
    }

    public static c a(Context context, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new a(b.a(context, i10, i11));
        }
        return new c();
    }

    public Bundle b() {
        return null;
    }
}
