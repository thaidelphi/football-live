package com.appnext.ads.fullscreen;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
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
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e extends Fragment {
    private i D;
    private TextView E;
    private ArrayList<AppnextAd> G;
    private Handler handler;
    private int F = 0;
    Runnable tick = new Runnable() { // from class: com.appnext.ads.fullscreen.e.3
        @Override // java.lang.Runnable
        public final void run() {
            try {
                e.this.handler.removeCallbacks(this);
                e eVar = e.this;
                int i10 = eVar.F - 1;
                eVar.F = i10;
                if (i10 == 0) {
                    e.this.D.videoSelected((AppnextAd) e.this.G.get(0));
                    e.this.report("pre_roll_noclick");
                    return;
                }
                if (e.this.E != null) {
                    e.this.E.setText(e.this.F + " sec");
                }
                e.this.handler.postDelayed(e.this.tick, 1000L);
            } catch (Throwable th) {
                com.appnext.base.a.a("PreRollFragment$onDestroyView", th);
            }
        }
    };

    private void a(ViewGroup viewGroup, final AppnextAd appnextAd, final int i10) {
        try {
            TextView textView = (TextView) viewGroup.findViewById(R.id.title);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.icon);
            ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.background_image);
            RatingBar ratingBar = (RatingBar) viewGroup.findViewById(R.id.ratingBar);
            int i11 = R.id.playGameTextView;
            if (viewGroup.findViewById(i11) != null) {
                ((TextView) viewGroup.findViewById(i11)).setText(this.D.getConfigManager().t("pre_cta_string"));
            }
            textView.setText(appnextAd.getAdTitle());
            ratingBar.setRating(Float.parseFloat(appnextAd.getStoreRating()));
            viewGroup.findViewById(R.id.click).setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.e.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.this.D.videoSelected(appnextAd);
                    int i12 = i10;
                    if (i12 == 0) {
                        e.this.report("pre_roll_left_click");
                    } else if (i12 == 1) {
                        e.this.report("pre_roll_right_click");
                    }
                }
            });
            if (imageView2 != null) {
                l.aa().a(getActivity(), imageView2, appnextAd.getWideImageURL(), null);
                l.aa().a(getActivity(), imageView, appnextAd.getImageURL(), null);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("PreRollFragment$initItem", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void report(String str) {
        try {
            this.D.report(str, "S1");
        } catch (Throwable th) {
            com.appnext.base.a.a("PreRollFragment$report", th);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.D = (i) activity;
        this.handler = new Handler();
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null && getArguments().containsKey("time")) {
            this.F = getArguments().getInt("time");
        }
        if (bundle != null) {
            this.F = bundle.getInt("time");
        }
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(this.D.getTemplate("S1"), viewGroup, false);
            View findViewById = relativeLayout.findViewById(R.id.item1);
            View findViewById2 = relativeLayout.findViewById(R.id.item2);
            ((TextView) relativeLayout.findViewById(R.id.title)).setText(this.D.getConfigManager().t("pre_title_string1"));
            ((TextView) relativeLayout.findViewById(R.id.secondTile)).setText(this.D.getConfigManager().t("pre_title_string2"));
            this.E = (TextView) relativeLayout.findViewById(R.id.timer);
            ArrayList<AppnextAd> preRollAds = this.D.getPreRollAds();
            this.G = preRollAds;
            if (preRollAds.size() < 2) {
                this.D.videoSelected(this.G.get(0));
                return null;
            }
            a((ViewGroup) findViewById, this.G.get(0), 0);
            a((ViewGroup) findViewById2, this.G.get(1), 1);
            int i10 = R.id.privacy;
            relativeLayout.findViewById(i10).setOnClickListener(new View.OnClickListener() { // from class: com.appnext.ads.fullscreen.e.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.this.D.privacyClicked();
                }
            });
            if (k.a(this.G.get(0), this.D.getConfigManager())) {
                k.a((Context) this.D, (ImageView) relativeLayout.findViewById(i10));
            }
            TextView textView = this.E;
            textView.setText(this.F + " sec");
            report("pre_roll_loaded");
            return relativeLayout;
        } catch (Throwable th) {
            com.appnext.base.a.a("PreRollFragment$onCreateView", th);
            this.D.closeClicked();
            return null;
        }
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.tick);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            this.handler.postDelayed(this.tick, 1000L);
        } catch (Throwable th) {
            com.appnext.base.a.a("PreRollFragment$onResume", th);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("time", this.F);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.D = (i) context;
        this.handler = new Handler();
    }
}
