package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.d;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.v1;
import java.lang.ref.WeakReference;
import java.util.Set;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdInformationObject implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f22956a;

    /* renamed from: b  reason: collision with root package name */
    public final AdInformationView f22957b;

    /* renamed from: c  reason: collision with root package name */
    public final AdPreferences.Placement f22958c;

    /* renamed from: d  reason: collision with root package name */
    public final ConsentData f22959d;

    /* renamed from: e  reason: collision with root package name */
    public final String f22960e;

    /* renamed from: f  reason: collision with root package name */
    public final String f22961f;

    /* renamed from: g  reason: collision with root package name */
    public final AdInformationOverrides f22962g;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Size {
        SMALL(AdInformationConfig.ImageResourceType.INFO_S, AdInformationConfig.ImageResourceType.INFO_EX_S),
        LARGE(AdInformationConfig.ImageResourceType.INFO_L, AdInformationConfig.ImageResourceType.INFO_EX_L);
        
        private final AdInformationConfig.ImageResourceType infoExtendedType;
        private final AdInformationConfig.ImageResourceType infoType;

        Size(AdInformationConfig.ImageResourceType imageResourceType, AdInformationConfig.ImageResourceType imageResourceType2) {
            this.infoType = imageResourceType;
            this.infoExtendedType = imageResourceType2;
        }

        public final AdInformationConfig.ImageResourceType a() {
            return this.infoType;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f22966a;

        public a(d dVar) {
            this.f22966a = dVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = this.f22966a;
            AdInformationObject adInformationObject = AdInformationObject.this;
            dVar.a(adInformationObject.f22960e, adInformationObject.f22961f);
        }
    }

    public AdInformationObject(Context context, Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData, String str, String str2) {
        this.f22956a = new WeakReference<>(context);
        this.f22958c = placement;
        this.f22962g = adInformationOverrides;
        this.f22959d = consentData;
        this.f22960e = str;
        this.f22961f = str2;
        this.f22957b = new AdInformationView(context, size, placement, adInformationOverrides, this);
    }

    public final void a(RelativeLayout relativeLayout) {
        boolean b10;
        Set<String> a10;
        Context context = relativeLayout.getContext();
        AdInformationConfig a11 = AdInformationMetaData.f22954a.a();
        AdInformationOverrides adInformationOverrides = this.f22962g;
        if (adInformationOverrides != null && adInformationOverrides.d()) {
            b10 = this.f22962g.c();
        } else {
            b10 = a11.b(context);
        }
        if (b10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.f22962g;
            if (adInformationOverrides2 != null && adInformationOverrides2.e()) {
                this.f22962g.b().addRules(layoutParams);
            } else {
                a11.a(this.f22958c).addRules(layoutParams);
            }
            relativeLayout.addView(this.f22957b, layoutParams);
        }
        d a12 = com.startapp.sdk.components.a.a(context).M.a();
        AdDebuggerMetadata call = a12.f21862c.call();
        if ((call == null || (a10 = call.a()) == null) ? false : a10.contains(a12.f21861b.a().a().f22479a)) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("D");
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextSize(0, (this.f22957b.c() * 2) / 3.0f);
            textView.setTextColor(-1);
            textView.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setOnClickListener(new a(a12));
            AdInformationPositions.Position position = this.f22957b.f22972c;
            if (position == null) {
                position = AdInformationPositions.Position.BOTTOM_LEFT;
            }
            AdInformationPositions.Position flipHorizontal = position.flipHorizontal();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f22957b.d(), this.f22957b.c());
            layoutParams2.setMargins(0, 0, 0, 0);
            flipHorizontal.addRules(layoutParams2);
            relativeLayout2.addView(textView, layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f22957b.b(), this.f22957b.a());
            flipHorizontal.addRules(layoutParams3);
            relativeLayout.addView(relativeLayout2, layoutParams3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.f22956a.get();
        if (context == null) {
            return;
        }
        v1 a10 = com.startapp.sdk.components.a.a(context).f23233i.a();
        ConsentData consentData = this.f22959d;
        String c10 = consentData != null ? consentData.c() : null;
        ConsentData consentData2 = this.f22959d;
        String d10 = consentData2 != null ? consentData2.d() : null;
        ConsentData consentData3 = this.f22959d;
        a10.a(c10, d10, consentData3 != null ? consentData3.b() : null, true);
    }
}
