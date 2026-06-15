package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.startapp.d2;
import com.startapp.d8;
import com.startapp.h0;
import com.startapp.j9;
import com.startapp.k0;
import com.startapp.l0;
import com.startapp.l3;
import com.startapp.n0;
import com.startapp.o0;
import com.startapp.s7;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Banner3D extends BannerBase implements AdEventListener, BannerInterface {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public AdInformationOverrides L;
    public ArrayList M;
    public int N;
    public BannerListener O;
    public final Runnable P;

    /* renamed from: q  reason: collision with root package name */
    public BannerOptions f22549q;

    /* renamed from: r  reason: collision with root package name */
    public Banner3DAd f22550r;

    /* renamed from: s  reason: collision with root package name */
    public List<AdDetails> f22551s;

    /* renamed from: t  reason: collision with root package name */
    public Camera f22552t;

    /* renamed from: u  reason: collision with root package name */
    public Matrix f22553u;

    /* renamed from: v  reason: collision with root package name */
    public Paint f22554v;

    /* renamed from: w  reason: collision with root package name */
    public float f22555w;

    /* renamed from: x  reason: collision with root package name */
    public float f22556x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f22557y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f22558z;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.startapp.sdk.ads.banner.banner3d.Banner3D.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        };
        public AdRulesResult adRulesResult;
        public boolean bDefaultLoad;
        public boolean bIsVisible;
        private int currentImage;
        private AdDetails[] details;
        public h0[] faces;
        private int firstRotation;
        private int firstRotationFinished;
        public boolean loaded;
        public boolean loading;
        public BannerOptions options;
        public AdInformationOverrides overrides;
        private float rotation;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getCurrentImage() {
            return this.currentImage;
        }

        public List<AdDetails> getDetails() {
            return Arrays.asList(this.details);
        }

        public float getRotation() {
            return this.rotation;
        }

        public boolean isFirstRotation() {
            return this.firstRotation == 1;
        }

        public boolean isFirstRotationFinished() {
            return this.firstRotationFinished == 1;
        }

        public void setCurrentImage(int i10) {
            this.currentImage = i10;
        }

        public void setDetails(List<AdDetails> list) {
            this.details = new AdDetails[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                this.details[i10] = list.get(i10);
            }
        }

        public void setFirstRotation(boolean z10) {
            this.firstRotation = z10 ? 1 : 0;
        }

        public void setFirstRotationFinished(boolean z10) {
            this.firstRotationFinished = z10 ? 1 : 0;
        }

        public void setRotation(float f10) {
            this.rotation = f10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            if (!this.bIsVisible) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(this.currentImage);
            parcel.writeFloat(this.rotation);
            parcel.writeInt(this.firstRotation);
            parcel.writeInt(this.firstRotationFinished);
            parcel.writeParcelableArray(this.details, i10);
            parcel.writeInt(this.loaded ? 1 : 0);
            parcel.writeInt(this.loading ? 1 : 0);
            parcel.writeInt(this.bDefaultLoad ? 1 : 0);
            h0[] h0VarArr = this.faces;
            if (h0VarArr == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(h0VarArr.length);
                for (h0 h0Var : this.faces) {
                    parcel.writeParcelable(h0Var, i10);
                }
            }
            parcel.writeSerializable(this.overrides);
            parcel.writeSerializable(this.options);
            parcel.writeSerializable(this.adRulesResult);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            if (parcel.readInt() == 1) {
                this.bIsVisible = true;
                this.currentImage = parcel.readInt();
                this.rotation = parcel.readFloat();
                this.firstRotation = parcel.readInt();
                this.firstRotationFinished = parcel.readInt();
                Parcelable[] readParcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
                if (readParcelableArray != null) {
                    AdDetails[] adDetailsArr = new AdDetails[readParcelableArray.length];
                    this.details = adDetailsArr;
                    System.arraycopy(readParcelableArray, 0, adDetailsArr, 0, readParcelableArray.length);
                }
                int readInt = parcel.readInt();
                this.loaded = false;
                if (readInt == 1) {
                    this.loaded = true;
                }
                int readInt2 = parcel.readInt();
                this.loading = false;
                if (readInt2 == 1) {
                    this.loading = true;
                }
                int readInt3 = parcel.readInt();
                this.bDefaultLoad = false;
                if (readInt3 == 1) {
                    this.bDefaultLoad = true;
                }
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    this.faces = new h0[readInt4];
                    for (int i10 = 0; i10 < readInt4; i10++) {
                        this.faces[i10] = (h0) parcel.readParcelable(h0.class.getClassLoader());
                    }
                }
                this.overrides = (AdInformationOverrides) parcel.readSerializable();
                this.options = (BannerOptions) parcel.readSerializable();
                this.adRulesResult = (AdRulesResult) parcel.readSerializable();
                return;
            }
            this.bIsVisible = false;
        }
    }

    public Banner3D(Activity activity) {
        this((Context) activity);
    }

    public final void a(List<AdDetails> list, boolean z10) {
        Banner3DAd banner3DAd;
        this.f22551s = list;
        if (list != null) {
            o0 o0Var = new o0();
            StringBuilder sb = new StringBuilder();
            for (AdDetails adDetails : list) {
                sb.append(a.a(adDetails.h(), (String) null));
                sb.append(",");
            }
            if (Banner3DSize.a(getContext(), getParent(), this.f22549q, this, o0Var)) {
                setMinimumWidth(j9.a(getContext(), this.f22549q.o()));
                setMinimumHeight(j9.a(getContext(), this.f22549q.d()));
                if (getLayoutParams() != null && getLayoutParams().width == -1) {
                    setMinimumWidth(j9.a(getContext(), o0Var.f22339a.x));
                }
                if (getLayoutParams() != null && getLayoutParams().height == -1) {
                    setMinimumHeight(j9.a(getContext(), o0Var.f22339a.y));
                }
                if (getLayoutParams() != null) {
                    if (getLayoutParams().width > 0) {
                        setMinimumWidth(getLayoutParams().width);
                    }
                    if (getLayoutParams().height > 0) {
                        setMinimumHeight(getLayoutParams().height);
                    }
                    if (getLayoutParams().width > 0 && getLayoutParams().height > 0 && (banner3DAd = this.f22550r) != null) {
                        banner3DAd.j();
                    }
                }
                ArrayList arrayList = this.M;
                if (arrayList == null || arrayList.size() == 0) {
                    l();
                    removeAllViews();
                    this.M = new ArrayList();
                    for (AdDetails adDetails2 : list) {
                        this.M.add(new h0(getContext(), this, adDetails2, this.f22549q, new TrackingParams(getAdPreferences().getAdTag())));
                    }
                    this.N = 0;
                } else {
                    Iterator it = this.M.iterator();
                    while (it.hasNext()) {
                        ((h0) it.next()).a(getContext(), this.f22549q, this);
                    }
                }
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (this.f22549q.p() * j9.a(getContext(), this.f22549q.o())), (int) (this.f22549q.e() * j9.a(getContext(), this.f22549q.d())));
                layoutParams.addRule(13);
                int width = (getWidth() - ((int) (this.f22549q.p() * j9.a(getContext(), this.f22549q.o())))) / 2;
                layoutParams.rightMargin = width;
                layoutParams.leftMargin = width;
                int height = (getHeight() - ((int) (this.f22549q.e() * j9.a(getContext(), this.f22549q.d())))) / 2;
                layoutParams.topMargin = height;
                layoutParams.bottomMargin = height;
                addView(relativeLayout, layoutParams);
                Context context = getContext();
                AdInformationObject.Size size = AdInformationObject.Size.SMALL;
                AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                AdInformationOverrides adInformationOverrides = this.L;
                Banner3DAd banner3DAd2 = this.f22550r;
                String requestUrl = banner3DAd2 != null ? banner3DAd2.getRequestUrl() : null;
                Banner3DAd banner3DAd3 = this.f22550r;
                new AdInformationObject(context, size, placement, adInformationOverrides, null, requestUrl, banner3DAd3 != null ? banner3DAd3.getDParam() : null).a(relativeLayout);
                if (this.f22554v == null) {
                    Paint paint = new Paint();
                    this.f22554v = paint;
                    paint.setAntiAlias(true);
                    this.f22554v.setFilterBitmap(true);
                }
                if (!this.E) {
                    this.E = true;
                    if (this.J && this.f22528g) {
                        removeCallbacks(this.P);
                        post(this.P);
                    }
                }
                if (this.F) {
                    setVisibility(0);
                    if (this.f22550r != null) {
                        d8 a10 = com.startapp.sdk.components.a.a(getContext()).f23235k.a();
                        String adId = this.f22550r.getAdId();
                        if (adId != null) {
                            a10.f21892a.put(new d8.a(placement, -1), adId);
                        }
                    }
                }
                if (z10) {
                    Context context2 = getContext();
                    BannerListener bannerListener = this.O;
                    d2.a("onLoad", sb.toString(), null, bannerListener != null);
                    a.a(bannerListener != null ? new k0(bannerListener, this, context2) : null);
                    return;
                }
                return;
            }
            setErrorMessage("Error in banner screen size");
            setVisibility(8);
            if (z10) {
                l0.a(getContext(), this.O, this, sb.toString());
                return;
            }
            return;
        }
        setErrorMessage("No ads to load");
        if (z10) {
            l0.a(getContext(), this.O, this, null);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final int c() {
        return this.f22529h;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final String d() {
        return "StartApp Banner3D";
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final int e() {
        return BannerMetaData.f22541b.a().j();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public String getBidToken() {
        Banner3DAd banner3DAd = this.f22550r;
        if (banner3DAd != null) {
            return banner3DAd.getBidToken();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final int getHeightInDp() {
        return 50;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final int getWidthInDp() {
        return 300;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final void h() {
        if (this.I) {
            return;
        }
        this.f22549q = BannerMetaData.f22541b.b();
        this.f22551s = new ArrayList();
        this.L = AdInformationOverrides.a();
        l();
        this.M = new ArrayList();
        this.I = true;
        setBackgroundColor(0);
        if (getId() == -1) {
            setId(this.f22529h);
        }
        if (this.G) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.startapp.sdk.ads.banner.banner3d.Banner3D.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    y.a(Banner3D.this.getViewTreeObserver(), this);
                    Banner3D banner3D = Banner3D.this;
                    if (banner3D.H) {
                        return;
                    }
                    synchronized (banner3D.f22537p) {
                        if (!banner3D.f22536o.hasMessages(1)) {
                            banner3D.f22536o.sendEmptyMessage(1);
                        }
                    }
                }
            });
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, com.startapp.sdk.ads.banner.BannerInterface
    public void hideBanner() {
        this.F = false;
        setVisibility(8);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final void j() {
        this.H = false;
        this.I = true;
        this.E = false;
        this.f22557y = true;
        this.A = true;
        this.B = false;
        this.C = false;
        this.f22528g = false;
        this.f22524c = null;
        l();
        this.M = new ArrayList();
        Context context = getContext();
        Banner3DAd banner3DAd = this.f22550r;
        Banner3DAd banner3DAd2 = new Banner3DAd(context, banner3DAd != null ? banner3DAd.h() : 0);
        this.f22550r = banner3DAd2;
        AdPreferences adPreferences = getAdPreferences();
        if (adPreferences.getPlacementId() == null) {
            adPreferences.setPlacementId(a.a(this));
        }
        adPreferences.setHardwareAccelerated(y.a(this, this.f22522a));
        banner3DAd2.load(adPreferences, this);
    }

    public final void l() {
        ArrayList arrayList = this.M;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (h0Var != null) {
                Bitmap bitmap = h0Var.f22003c;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                Bitmap bitmap2 = h0Var.f22004d;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                h0Var.f22003c = null;
                h0Var.f22004d = null;
                s7 s7Var = h0Var.f22007g;
                if (s7Var != null) {
                    s7Var.a("AD_CLOSED_TOO_QUICKLY", null);
                }
                Banner3DView banner3DView = h0Var.f22008h;
                if (banner3DView != null) {
                    banner3DView.removeAllViews();
                    h0Var.f22008h = null;
                }
            }
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        BannerOptions bannerOptions = this.f22549q;
        if (bannerOptions == null || !bannerOptions.v()) {
            this.A = false;
            this.B = true;
        }
        if (this.J && this.f22528g) {
            removeCallbacks(this.P);
            post(this.P);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.P);
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s7 s7Var = ((h0) it.next()).f22007g;
                if (s7Var != null) {
                    s7Var.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onDraw(canvas);
        if (!this.f22528g && !this.I) {
            this.f22528g = true;
            if (this.J) {
                removeCallbacks(this.P);
                post(this.P);
            }
        }
        if (isInEditMode() || !this.F) {
            return;
        }
        ArrayList arrayList = this.M;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        try {
            int p10 = (int) (this.f22549q.p() * j9.a(getContext(), this.f22549q.o()));
            int e8 = (int) (this.f22549q.e() * j9.a(getContext(), this.f22549q.d()));
            int width = (getWidth() - ((int) (this.f22549q.p() * j9.a(getContext(), this.f22549q.o())))) / 2;
            int height = (getHeight() - ((int) (this.f22549q.e() * j9.a(getContext(), this.f22549q.d())))) / 2;
            float g10 = !this.B ? this.f22549q.g() : ((1.0f - this.f22549q.g()) * ((float) Math.pow(Math.abs(this.f22555w - 45.0f) / 45.0f, this.f22549q.l()))) + this.f22549q.g();
            Bitmap bitmap3 = ((h0) this.M.get((this.M.size() + (this.N - 1)) % this.M.size())).f22004d;
            Bitmap bitmap4 = ((h0) this.M.get(this.N)).f22004d;
            if (bitmap4 == null || bitmap3 == null) {
                return;
            }
            float f10 = this.f22555w;
            if (f10 < 45.0f) {
                if (f10 > 3.0f) {
                    bitmap2 = bitmap3;
                    a(canvas, bitmap4, height, width, p10 / 2, e8 / 2, g10, (f10 - 90.0f) * this.f22549q.c().getRotationMultiplier());
                } else {
                    bitmap2 = bitmap3;
                }
                a(canvas, bitmap2, height, width, p10 / 2, e8 / 2, g10, this.f22555w * this.f22549q.c().getRotationMultiplier());
                return;
            }
            if (f10 < 87.0f) {
                bitmap = bitmap4;
                a(canvas, bitmap3, height, width, p10 / 2, e8 / 2, g10, f10 * this.f22549q.c().getRotationMultiplier());
            } else {
                bitmap = bitmap4;
            }
            a(canvas, bitmap, height, width, p10 / 2, e8 / 2, g10, (this.f22555w - 90.0f) * this.f22549q.c().getRotationMultiplier());
            if (this.A) {
                return;
            }
            this.B = true;
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onFailedToReceiveAd(Ad ad) {
        if (ad != null) {
            setErrorMessage(ad.getErrorMessage());
        }
        l0.a(getContext(), this.O, this, null);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onReceiveAd(Ad ad) {
        this.H = true;
        this.I = false;
        this.L = this.f22550r.getAdInfoOverride();
        List<AdDetails> g10 = ((JsonAd) ad).g();
        this.f22551s = g10;
        a(g10, this.K);
        this.K = false;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        boolean z10 = savedState.bIsVisible;
        this.F = z10;
        if (z10) {
            this.f22551s = savedState.getDetails();
            this.f22555w = savedState.getRotation();
            this.A = savedState.isFirstRotation();
            this.B = savedState.isFirstRotationFinished();
            this.N = savedState.getCurrentImage();
            h0[] h0VarArr = savedState.faces;
            l();
            this.M = new ArrayList();
            if (h0VarArr != null) {
                for (h0 h0Var : h0VarArr) {
                    this.M.add(h0Var);
                }
            }
            this.H = savedState.loaded;
            this.I = savedState.loading;
            this.G = savedState.bDefaultLoad;
            this.L = savedState.overrides;
            this.f22549q = savedState.options;
            if (this.f22551s.size() == 0) {
                this.G = true;
                g();
                return;
            }
            post(new Runnable() { // from class: com.startapp.sdk.ads.banner.banner3d.Banner3D.4
                @Override // java.lang.Runnable
                public void run() {
                    Banner3D banner3D = Banner3D.this;
                    banner3D.a(banner3D.f22551s, false);
                }
            });
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.bIsVisible = this.F;
        savedState.setDetails(this.f22551s);
        savedState.setRotation(this.f22555w);
        savedState.setFirstRotation(this.A);
        savedState.setFirstRotationFinished(this.B);
        savedState.setCurrentImage(this.N);
        savedState.options = this.f22549q;
        savedState.faces = new h0[this.M.size()];
        savedState.loaded = this.H;
        savedState.loading = this.I;
        savedState.overrides = this.L;
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            savedState.faces[i10] = (h0) this.M.get(i10);
        }
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        int p10 = (int) (this.f22549q.p() * j9.a(getContext(), this.f22549q.o()));
        int e8 = (int) (this.f22549q.e() * j9.a(getContext(), this.f22549q.d()));
        int width = (getWidth() - ((int) (this.f22549q.p() * j9.a(getContext(), this.f22549q.o())))) / 2;
        int height = (getHeight() - ((int) (this.f22549q.e() * j9.a(getContext(), this.f22549q.d())))) / 2;
        if (!(motionEvent.getX() >= ((float) width) && motionEvent.getY() >= ((float) height) && motionEvent.getX() <= ((float) (width + p10)) && motionEvent.getY() <= ((float) (height + e8))) || (arrayList = this.M) == null || arrayList.size() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.D = true;
            this.f22556x = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2 && this.f22556x - motionEvent.getY() >= 10.0f) {
                this.D = false;
                this.f22556x = motionEvent.getY();
            }
        } else if (this.D) {
            if (this.f22555w < 45.0f) {
                this.N = (this.M.size() + (this.N - 1)) % this.M.size();
            }
            this.D = false;
            this.f22557y = false;
            setClicked(true);
            postDelayed(new Runnable() { // from class: com.startapp.sdk.ads.banner.banner3d.Banner3D.3
                @Override // java.lang.Runnable
                public void run() {
                    Banner3D.this.f22557y = true;
                }
            }, AdsCommonMetaData.f22889h.z());
            h0 h0Var = (h0) this.M.get(this.N);
            Context context = getContext();
            String n10 = h0Var.f22001a.n();
            boolean a10 = a.a(context, AdPreferences.Placement.INAPP_BANNER);
            s7 s7Var = h0Var.f22007g;
            if (s7Var != null) {
                s7Var.a(null, null);
            }
            if (n10 != null && !"null".equals(n10) && !TextUtils.isEmpty(n10)) {
                a.a(n10, h0Var.f22001a.m(), h0Var.f22001a.h(), context, h0Var.f22006f);
            } else if (h0Var.f22001a.B() && !a10) {
                a.a(context, h0Var.f22001a.h(), h0Var.f22001a.w(), h0Var.f22001a.q(), h0Var.f22006f, AdsCommonMetaData.f22889h.z(), AdsCommonMetaData.f22889h.y(), h0Var.f22001a.C(), h0Var.f22001a.D(), false, null);
            } else {
                a.a(context, h0Var.f22001a.h(), h0Var.f22001a.w(), h0Var.f22006f, h0Var.f22001a.C() && !a10, false);
            }
            String a11 = this.N < this.f22551s.size() ? a.a(this.f22551s.get(this.N).h(), (String) null) : null;
            Context context2 = getContext();
            BannerListener bannerListener = this.O;
            d2.a("onClicked", a11, null, bannerListener != null);
            a.a(bannerListener != null ? new n0(bannerListener, this, context2) : null);
        }
        return true;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.J = true;
            BannerOptions bannerOptions = this.f22549q;
            if (bannerOptions == null || !bannerOptions.v()) {
                this.A = false;
                this.B = true;
            }
            if (this.J && this.f22528g) {
                removeCallbacks(this.P);
                post(this.P);
                return;
            }
            return;
        }
        this.J = false;
        if (this.f22558z) {
            return;
        }
        removeCallbacks(this.P);
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void setBannerListener(BannerListener bannerListener) {
        this.O = bannerListener;
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void showBanner() {
        this.F = true;
        setVisibility(0);
        if (this.f22550r != null) {
            d8 a10 = com.startapp.sdk.components.a.a(getContext()).f23235k.a();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
            String adId = this.f22550r.getAdId();
            if (adId != null) {
                a10.f21892a.put(new d8.a(placement, -1), adId);
            }
        }
    }

    public Banner3D(Activity activity, AdPreferences adPreferences) {
        this((Context) activity, adPreferences);
    }

    public Banner3D(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    public Banner3D(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        this((Context) activity, adPreferences, bannerListener);
    }

    public Banner3D(Activity activity, boolean z10) {
        this((Context) activity, z10);
    }

    public Banner3D(Activity activity, boolean z10, AdPreferences adPreferences) {
        this((Context) activity, z10, adPreferences);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet, int i10) {
        this((Context) activity, attributeSet, i10);
    }

    @Deprecated
    public Banner3D(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    @Deprecated
    public Banner3D(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, boolean z10) {
        this(context, z10, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, boolean z10, AdPreferences adPreferences) {
        super(context);
        this.f22552t = null;
        this.f22553u = null;
        this.f22554v = null;
        this.f22555w = 45.0f;
        this.f22556x = 0.0f;
        this.f22557y = true;
        this.f22558z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = true;
        this.M = new ArrayList();
        this.N = 0;
        this.P = new Runnable() { // from class: com.startapp.sdk.ads.banner.banner3d.Banner3D.1
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 416
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.banner3d.Banner3D.AnonymousClass1.run():void");
            }
        };
        try {
            this.G = z10;
            setAdPreferences(adPreferences);
            g();
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22552t = null;
        this.f22553u = null;
        this.f22554v = null;
        this.f22555w = 45.0f;
        this.f22556x = 0.0f;
        this.f22557y = true;
        this.f22558z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = true;
        this.M = new ArrayList();
        this.N = 0;
        this.P = new Runnable() { // from class: com.startapp.sdk.ads.banner.banner3d.Banner3D.1
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 416
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.banner3d.Banner3D.AnonymousClass1.run():void");
            }
        };
        try {
            g();
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    public final void a(Canvas canvas, Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (this.f22552t == null) {
            this.f22552t = new Camera();
        }
        this.f22552t.save();
        this.f22552t.translate(0.0f, 0.0f, i13);
        this.f22552t.rotateX(f11);
        float f12 = -i13;
        this.f22552t.translate(0.0f, 0.0f, f12);
        if (this.f22553u == null) {
            this.f22553u = new Matrix();
        }
        this.f22552t.getMatrix(this.f22553u);
        this.f22552t.restore();
        this.f22553u.preTranslate(-i12, f12);
        this.f22553u.postScale(f10, f10);
        this.f22553u.postTranslate(i11 + i12, i10 + i13);
        canvas.drawBitmap(bitmap, this.f22553u, this.f22554v);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final void a(int i10) {
        this.f22529h = i10;
    }
}
