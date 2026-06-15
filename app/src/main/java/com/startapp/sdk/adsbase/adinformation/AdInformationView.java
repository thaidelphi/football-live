package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.j9;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdInformationView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public final AdInformationConfig f22970a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageResourceConfig f22971b;

    /* renamed from: c  reason: collision with root package name */
    public final AdInformationPositions.Position f22972c;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f22973a;

        public a(View.OnClickListener onClickListener) {
            this.f22973a = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f22973a.onClick(view);
        }
    }

    public AdInformationView(Context context, AdInformationObject.Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, View.OnClickListener onClickListener) {
        super(context);
        a aVar = new a(onClickListener);
        AdInformationConfig a10 = AdInformationMetaData.c().a();
        this.f22970a = a10;
        if (a10 == null) {
            this.f22970a = AdInformationConfig.a();
        }
        ImageResourceConfig a11 = this.f22970a.a(size.a());
        this.f22971b = a11;
        if (adInformationOverrides != null && adInformationOverrides.e()) {
            this.f22972c = adInformationOverrides.b();
        } else {
            this.f22972c = this.f22970a.a(placement);
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setContentDescription("info");
        imageView.setId(1475346433);
        imageView.setImageBitmap(a11.a(getContext()));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(d(), c());
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setPadding(0, 0, 0, 0);
        this.f22972c.addRules(layoutParams);
        relativeLayout.addView(imageView, layoutParams);
        relativeLayout.setOnClickListener(aVar);
        addView(relativeLayout, new RelativeLayout.LayoutParams(b(), a()));
    }

    public final int a() {
        return (int) (this.f22970a.e() * c());
    }

    public final int b() {
        return (int) (this.f22970a.e() * d());
    }

    public final int c() {
        return j9.a(getContext(), this.f22971b.a());
    }

    public final int d() {
        return j9.a(getContext(), this.f22971b.d());
    }
}
