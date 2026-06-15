package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* renamed from: a  reason: collision with root package name */
    private final View f9893a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f9894b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f9895c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f9896d;

    /* renamed from: e  reason: collision with root package name */
    private final Button f9897e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f9898f;

    /* renamed from: g  reason: collision with root package name */
    private final FrameLayout f9899g;

    /* renamed from: h  reason: collision with root package name */
    private final ViewGroup f9900h;

    /* renamed from: i  reason: collision with root package name */
    private final FrameLayout f9901i;

    /* renamed from: j  reason: collision with root package name */
    private final ViewGroup f9902j;

    /* renamed from: k  reason: collision with root package name */
    private final ViewGroup f9903k;

    /* renamed from: l  reason: collision with root package name */
    private final FrameLayout f9904l;

    /* renamed from: m  reason: collision with root package name */
    private com.applovin.impl.mediation.ads.b f9905m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f9906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f9907b;

        a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f9906a = weakReference;
            this.f9907b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f9906a.get();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                j.f8884u0.I();
                if (n.a()) {
                    j.f8884u0.I().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            }
            this.f9906a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9907b.getLayoutParams();
            layoutParams.height = ((View) this.f9907b.getParent()).getWidth();
            this.f9907b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }

    public com.applovin.impl.mediation.ads.b getAdViewTracker() {
        return this.f9905m;
    }

    public TextView getAdvertiserTextView() {
        return this.f9895c;
    }

    public TextView getBodyTextView() {
        return this.f9896d;
    }

    public Button getCallToActionButton() {
        return this.f9897e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f9894b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f9895c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f9896d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f9897e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f9898f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f9899g;
    }

    public ImageView getIconImageView() {
        return this.f9898f;
    }

    public View getMainView() {
        return this.f9893a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f9904l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f9903k;
        return viewGroup != null ? viewGroup : this.f9904l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f9901i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f9900h;
        return viewGroup != null ? viewGroup : this.f9901i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f9902j;
    }

    public TextView getTitleTextView() {
        return this.f9894b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.applovin.impl.mediation.ads.b bVar = this.f9905m;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        n.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        com.applovin.impl.mediation.ads.b bVar = this.f9905m;
        if (bVar != null) {
            bVar.a();
            this.f9905m = null;
        }
        View view = this.f9893a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f9893a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f9893a);
    }

    public void render(x2 x2Var, a.InterfaceC0126a interfaceC0126a, j jVar) {
        recycle();
        if (!x2Var.w0().get() || !x2Var.u0().get()) {
            this.f9905m = new com.applovin.impl.mediation.ads.b(x2Var, this, interfaceC0126a, jVar);
        }
        final MaxNativeAd nativeAd = x2Var.getNativeAd();
        if (x2Var.x0() && nativeAd.isContainerClickable()) {
            jVar.I();
            if (n.a()) {
                jVar.I().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaxNativeAd.this.performClick();
                }
            });
        }
        if (StringUtils.isValidString(x2Var.v0())) {
            jVar.I();
            if (n.a()) {
                jVar.I().a("MaxNativeAdView", "Rendering template ad view");
            }
            a(nativeAd);
            return;
        }
        jVar.I();
        if (n.a()) {
            jVar.I().a("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        TextView textView = this.f9894b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f9896d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f9895c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f9897e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f9898f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f9898f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f9898f, icon.getUri());
                } else {
                    this.f9898f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f9903k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9903k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f9900h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9900h.addView(optionsView);
                this.f9900h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f9902j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9902j.addView(appLovinStarRatingView);
            }
        }
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid format: " + str);
        } else if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_banner_view;
            }
            if (!"media_banner_template".equals(str) && !"no_body_banner_template".equals(str)) {
                if ("vertical_media_banner_template".equals(str)) {
                    return R.layout.max_native_ad_vertical_media_banner_view;
                }
                return R.layout.max_native_ad_banner_view;
            }
            return R.layout.max_native_ad_media_banner_view;
        } else if (maxAdFormat == MaxAdFormat.LEADER) {
            if ("vertical_leader_template".equals(str)) {
                return R.layout.max_native_ad_vertical_leader_view;
            }
            return R.layout.max_native_ad_leader_view;
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd r3, java.lang.String r4, android.content.Context r5) {
        /*
            r2 = this;
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r0 = new com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder
            r1 = -1
            r0.<init>(r1)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r0.setTemplateType(r4)
            int r0 = com.applovin.sdk.R.id.applovin_native_title_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setTitleTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_advertiser_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setAdvertiserTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_body_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setBodyTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_cta_button
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setCallToActionButtonId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_icon_image_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconImageViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_icon_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconContentViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_options_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_star_rating_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setStarRatingContentViewGroupId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_media_content_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentFrameLayoutId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r4.build()
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.MaxNativeAdView.<init>(com.applovin.mediation.nativeAds.MaxNativeAd, java.lang.String, android.content.Context):void");
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        int i10;
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f9893a = view;
        } else {
            if (z10) {
                i10 = a(maxNativeAdViewBinder.templateType, format);
            } else {
                i10 = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f9893a = LayoutInflater.from(context).inflate(i10, (ViewGroup) this, false);
        }
        addView(this.f9893a);
        this.f9894b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f9895c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f9896d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f9897e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f9898f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f9899g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f9900h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f9901i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f9902j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f9903k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f9904l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    private void a(MaxNativeAd maxNativeAd) {
        if (this.f9894b == null) {
            n.j("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f9894b.setText(maxNativeAd.getTitle());
        } else {
            this.f9894b.setVisibility(8);
        }
        if (this.f9895c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f9895c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f9895c.setVisibility(8);
            }
        }
        if (this.f9896d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f9896d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.f9896d.setVisibility(4);
            } else {
                this.f9896d.setVisibility(8);
            }
        }
        if (this.f9897e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f9897e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.f9897e.setVisibility(4);
            } else {
                this.f9897e.setVisibility(8);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f9899g;
        if (frameLayout != null) {
            if (icon == null || this.f9898f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f9899g.removeAllViews();
                    this.f9899g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f9898f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && StringUtils.isValidString(icon.getUri().toString())) {
                ImageViewUtils.setAndDownscaleImageUri(this.f9898f, icon.getUri());
            } else {
                this.f9899g.setVisibility(8);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f9901i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f9901i.addView(optionsView);
            this.f9901i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f9904l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9904l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f9904l.setVisibility(8);
            }
        }
        if (this.f9902j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f9902j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9902j.addView(appLovinStarRatingView);
            } else {
                this.f9902j.setVisibility(8);
            }
        }
        b();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.b
            @Override // java.lang.Runnable
            public final void run() {
                MaxNativeAdView.this.a();
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }
}
