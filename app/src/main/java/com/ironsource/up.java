package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class up {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21068a = new a(null);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        private static final GradientDrawable a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#000000"));
            return gradientDrawable;
        }

        private final View a(Context context) {
            TextView textView = new TextView(context);
            textView.setText("i");
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }

        public final View a(Context context, String str, ii imageLoader) {
            kotlin.jvm.internal.n.f(context, "context");
            kotlin.jvm.internal.n.f(imageLoader, "imageLoader");
            if (str == null) {
                return a(context);
            }
            Object a10 = imageLoader.a(str);
            if (i8.o.f(a10)) {
                a10 = null;
            }
            Drawable drawable = (Drawable) a10;
            if (drawable != null) {
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(drawable);
                return imageView;
            }
            return a(context);
        }
    }
}
