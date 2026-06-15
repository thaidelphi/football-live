package com.appnext.ads.fullscreen;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.R;
import com.appnext.core.AppnextAd;
import com.appnext.core.k;
import com.appnext.core.l;
import com.ironsource.ho;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d extends Fragment {
    private ArrayList<AppnextAd> ads;
    private boolean clicked = false;

    /* renamed from: x  reason: collision with root package name */
    private ImageView f10041x;

    /* renamed from: y  reason: collision with root package name */
    private TextView f10042y;

    /* renamed from: z  reason: collision with root package name */
    private h f10043z;

    private void a(RelativeLayout relativeLayout, final AppnextAd appnextAd, final boolean z10) {
        l.aa().a(getActivity(), (ImageView) relativeLayout.findViewById(R.id.icon), appnextAd.getImageURL(), null);
        ((TextView) relativeLayout.findViewById(R.id.title)).setText(appnextAd.getAdTitle());
        ((RatingBar) relativeLayout.findViewById(R.id.rating)).setRating(Float.parseFloat(appnextAd.getStoreRating()));
        relativeLayout.findViewById(R.id.click).setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.d.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
                if (z10) {
                    d.this.report("post_roll_click_main");
                } else {
                    d.this.report("post_roll_click_suggested");
                    StringBuilder sb = new StringBuilder();
                    sb.append(fullscreenAd.getAppURL());
                    sb.append("&tem_id=");
                    sb.append(d.this.f10043z.isRewarded() ? "8" : ho.f17693e);
                    sb.append("05");
                    fullscreenAd.setAppURL(sb.toString());
                }
                d.this.f10043z.installClicked(fullscreenAd);
                d.this.clicked = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void report(String str) {
        this.f10043z.report(str, "S3");
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10043z = (h) activity;
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(this.f10043z.getTemplate("S3"), viewGroup, false);
            this.ads = this.f10043z.getPostRollAds();
            ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.privacy);
            ImageView imageView2 = (ImageView) relativeLayout.findViewById(R.id.close);
            View findViewById = relativeLayout.findViewById(R.id.click);
            this.f10041x = (ImageView) relativeLayout.findViewById(R.id.media);
            this.f10042y = (TextView) relativeLayout.findViewById(R.id.install);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.d.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.this.f10043z.privacyClicked();
                }
            });
            if (k.a(this.ads.get(0), this.f10043z.getConfigManager())) {
                k.a((Context) this.f10043z, imageView);
            }
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.d.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.this.f10043z.closeClicked();
                }
            });
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.d.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.this.f10043z.installClicked((AppnextAd) d.this.ads.get(0));
                }
            });
            String ctaText = this.f10043z.getCtaText();
            int parseInt = Integer.parseInt(com.appnext.core.b.a.q(getContext()).a(this.f10043z.getLanguage(), "settings", "len"));
            if (!TextUtils.isEmpty(ctaText) && ctaText.length() > parseInt) {
                ctaText = ctaText.substring(0, parseInt);
            }
            this.f10042y.setText(ctaText);
            this.f10042y.setTextSize(2, Integer.parseInt(com.appnext.core.b.a.q(getContext()).a(this.f10043z.getLanguage(), "settings", "font_size_sp")));
            l.aa().a(getActivity(), this.f10041x, this.ads.get(0).getWideImageURL(), null);
            a(relativeLayout, this.ads.get(0), true);
            View findViewById2 = relativeLayout.findViewById(R.id.extra);
            if (findViewById2 != null) {
                if (this.ads.size() > 1) {
                    a((RelativeLayout) findViewById2.findViewById(R.id.item1), this.ads.get(1), false);
                } else {
                    findViewById2.findViewById(R.id.item1).setVisibility(4);
                }
                if (this.ads.size() > 2) {
                    a((RelativeLayout) findViewById2.findViewById(R.id.item2), this.ads.get(2), false);
                } else {
                    findViewById2.findViewById(R.id.item2).setVisibility(4);
                }
                int i10 = R.id.item3;
                if (findViewById2.findViewById(i10) != null) {
                    if (this.ads.size() > 3) {
                        a((RelativeLayout) findViewById2.findViewById(i10), this.ads.get(3), false);
                    } else {
                        findViewById2.findViewById(i10).setVisibility(4);
                    }
                }
            }
            report("post_roll_loaded");
            return relativeLayout;
        } catch (Throwable th) {
            com.appnext.base.a.a("PostRollFragment$onCreateView", th);
            this.f10043z.closeClicked();
            return null;
        }
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        report("post_roll_click_none");
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f10043z = (h) context;
    }
}
