package com.startapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.json.RatingBar;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z4 {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f23663a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f23664b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23665c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23666d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23667e;

    /* renamed from: f  reason: collision with root package name */
    public final RatingBar f23668f;

    /* renamed from: g  reason: collision with root package name */
    public MetaDataStyle f23669g = null;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends ShapeDrawable {
        public a(RoundRectShape roundRectShape) {
            super(roundRectShape);
        }

        @Override // android.graphics.drawable.ShapeDrawable
        public final void onDraw(Shape shape, Canvas canvas, Paint paint) {
            paint.setColor(-11363070);
            paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
            super.onDraw(shape, canvas, paint);
        }
    }

    public z4(Context context) {
        context.setTheme(16973829);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f23663a = relativeLayout;
        relativeLayout.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        relativeLayout.setLayoutParams(layoutParams);
        int a10 = j9.a(context, 3);
        int a11 = j9.a(context, 4);
        int a12 = j9.a(context, 5);
        int a13 = j9.a(context, 6);
        int a14 = j9.a(context, 10);
        int a15 = j9.a(context, 84);
        relativeLayout.setPadding(a14, a10, a14, a10);
        relativeLayout.setTag(this);
        ImageView imageView = new ImageView(context);
        this.f23664b = imageView;
        imageView.setId(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a15, a15);
        layoutParams2.addRule(15);
        imageView.setLayoutParams(layoutParams2);
        imageView.setPadding(0, 0, a13, 0);
        TextView textView = new TextView(context);
        this.f23665c = textView;
        textView.setId(2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(y.a(17), 1);
        layoutParams3.addRule(6, 1);
        textView.setLayoutParams(layoutParams3);
        textView.setPadding(0, 0, 0, a12);
        textView.setTextColor(AdsCommonMetaData.k().q().intValue());
        textView.setTextSize(AdsCommonMetaData.k().s().intValue());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        j9.a(textView, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.f23666d = textView2;
        textView2.setId(3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(y.a(17), 1);
        layoutParams4.addRule(3, 2);
        layoutParams4.setMargins(0, 0, 0, a12);
        textView2.setLayoutParams(layoutParams4);
        textView2.setTextColor(AdsCommonMetaData.k().l().intValue());
        textView2.setTextSize(AdsCommonMetaData.k().n().intValue());
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        j9.a(textView2, AdsCommonMetaData.k().m());
        RatingBar ratingBar = new RatingBar(context);
        this.f23668f = ratingBar;
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(y.a(17), 1);
        layoutParams5.addRule(8, 1);
        layoutParams5.setMargins(0, 0, 0, -a12);
        ratingBar.setLayoutParams(layoutParams5);
        ratingBar.setPadding(0, 0, 0, a11);
        ratingBar.setId(5);
        TextView textView3 = new TextView(context);
        this.f23667e = textView3;
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(y.a(21));
        layoutParams6.addRule(8, 1);
        textView3.setLayoutParams(layoutParams6);
        a(false);
        textView3.setTextColor(-1);
        textView3.setTextSize(12.0f);
        textView3.setTypeface(null, 1);
        textView3.setPadding(a14, a13, a14, a13);
        textView3.setId(4);
        textView3.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        textView3.setBackgroundDrawable(new a(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        relativeLayout.addView(imageView);
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        relativeLayout.addView(ratingBar);
        relativeLayout.addView(textView3);
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f23667e.setText("Open");
        } else {
            this.f23667e.setText("Download");
        }
    }
}
