package com.appnext.core;

import android.content.Context;
import android.os.Build;
import com.appnext.base.Appnext;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnAdOpened;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.google.android.gms.security.ProviderInstaller;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class Ad {
    public static final String ORIENTATION_AUTO = "automatic";
    public static final String ORIENTATION_DEFAULT = "not_set";
    public static final String ORIENTATION_LANDSCAPE = "landscape";
    public static final String ORIENTATION_PORTRAIT = "portrait";
    protected static boolean fq = false;
    private WeakReference<OnAdOpened> adOpenedCallbackWR;
    private c adRequest;
    private String cat;
    private WeakReference<OnAdClosed> closeCallbackWR;
    private int cnt;
    protected Context context;
    private String mSpecificCategories;
    private int maxVideoLength;
    private int minVideoLength;
    private boolean mute;
    private WeakReference<OnAdClicked> onAdClickedWR;
    private WeakReference<OnAdError> onAdErrorWR;
    private WeakReference<OnAdLoaded> onAdLoadedWR;
    private String orientation;
    private String packageName;
    private String pbk;
    private String placementID;
    private String sessionId;
    protected boolean setMute;

    public Ad(final Context context, String str) {
        this.onAdClickedWR = null;
        this.onAdErrorWR = null;
        this.onAdLoadedWR = null;
        this.closeCallbackWR = null;
        this.adOpenedCallbackWR = null;
        this.placementID = "";
        this.cat = "";
        this.mSpecificCategories = "";
        this.pbk = "";
        this.cnt = 200;
        this.maxVideoLength = 0;
        this.minVideoLength = 0;
        this.setMute = false;
        this.mute = false;
        this.orientation = ORIENTATION_DEFAULT;
        this.sessionId = "";
        this.packageName = "";
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        if (str != null) {
            this.context = context;
            setPlacementID(str);
            p.ac().a(new Runnable() { // from class: com.appnext.core.Ad.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (Build.VERSION.SDK_INT <= 19) {
                            ProviderInstaller.a(context.getApplicationContext());
                        }
                    } catch (Throwable unused) {
                    }
                    Ad.this.setSessionId(i.e(context));
                }
            });
            p.ac().a(new Runnable() { // from class: com.appnext.core.Ad.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Appnext.init(context);
                    } catch (Throwable unused) {
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("placementID cannot be null");
    }

    public void destroy() {
        this.context = null;
        this.onAdClickedWR = null;
        this.onAdErrorWR = null;
        this.onAdLoadedWR = null;
        this.closeCallbackWR = null;
        this.adOpenedCallbackWR = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        try {
            if (getClass().isInstance(obj) || obj.getClass().isInstance(this)) {
                if (obj instanceof Ad) {
                    return ((Ad) obj).getPlacementID().equals(getPlacementID()) && ((Ad) obj).getCategories().equals(getCategories()) && ((Ad) obj).getSpecificCategories().equals(getSpecificCategories()) && ((Ad) obj).getPostback().equals(getPostback()) && ((Ad) obj).getMinVideoLength() == getMinVideoLength() && ((Ad) obj).getMaxVideoLength() == getMaxVideoLength() && ((Ad) obj).getCount() == getCount();
                }
                return super.equals(obj);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public abstract String getAUID();

    /* JADX INFO: Access modifiers changed from: protected */
    public c getAdRequest() {
        return this.adRequest;
    }

    public String getCategories() {
        return this.cat;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getCount() {
        return this.cnt;
    }

    public abstract void getECPM(OnECPMLoaded onECPMLoaded);

    public int getMaxVideoLength() {
        return this.maxVideoLength;
    }

    public int getMinVideoLength() {
        return this.minVideoLength;
    }

    public boolean getMute() {
        return this.mute;
    }

    public OnAdClicked getOnAdClickedCallback() {
        OnAdClicked onAdClicked;
        WeakReference<OnAdClicked> weakReference = this.onAdClickedWR;
        if (weakReference == null || (onAdClicked = weakReference.get()) == null) {
            return null;
        }
        return onAdClicked;
    }

    public OnAdClosed getOnAdClosedCallback() {
        OnAdClosed onAdClosed;
        WeakReference<OnAdClosed> weakReference = this.closeCallbackWR;
        if (weakReference == null || (onAdClosed = weakReference.get()) == null) {
            return null;
        }
        return onAdClosed;
    }

    public OnAdError getOnAdErrorCallback() {
        OnAdError onAdError;
        WeakReference<OnAdError> weakReference = this.onAdErrorWR;
        if (weakReference == null || (onAdError = weakReference.get()) == null) {
            return null;
        }
        return onAdError;
    }

    public OnAdLoaded getOnAdLoadedCallback() {
        OnAdLoaded onAdLoaded;
        WeakReference<OnAdLoaded> weakReference = this.onAdLoadedWR;
        if (weakReference == null || (onAdLoaded = weakReference.get()) == null) {
            return null;
        }
        return onAdLoaded;
    }

    public OnAdOpened getOnAdOpenedCallback() {
        OnAdOpened onAdOpened;
        WeakReference<OnAdOpened> weakReference = this.adOpenedCallbackWR;
        if (weakReference == null || (onAdOpened = weakReference.get()) == null) {
            return null;
        }
        return onAdOpened;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPlacementID() {
        return this.placementID;
    }

    public String getPostback() {
        return this.pbk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getSessionId() {
        return this.sessionId;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    public abstract String getTID();

    public abstract String getVID();

    public int hashCode() {
        try {
            return (((((((((((getPlacementID().hashCode() * 31) + getCategories().hashCode()) * 31) + getSpecificCategories().hashCode()) * 31) + getPostback().hashCode()) * 31) + getCount()) * 31) + getMinVideoLength()) * 31) + getMaxVideoLength();
        } catch (Throwable unused) {
            return 31;
        }
    }

    public abstract boolean isAdLoaded();

    public abstract void loadAd();

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAdRequest(c cVar) {
        this.adRequest = cVar;
    }

    public void setCategories(String str) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, "UTF-8"))) {
                str = URLEncoder.encode(str, "UTF-8");
            }
            str2 = str;
        } catch (Throwable unused) {
        }
        this.cat = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setCount(int i10) {
        this.cnt = i10;
    }

    public void setMaxVideoLength(int i10) {
        if (i10 >= 0) {
            if (i10 > 0 && getMinVideoLength() > 0 && i10 < getMinVideoLength()) {
                throw new IllegalArgumentException("Max Length cannot be lower than min length");
            }
            this.maxVideoLength = i10;
            return;
        }
        throw new IllegalArgumentException("Max Length must be higher than 0");
    }

    public void setMinVideoLength(int i10) {
        if (i10 >= 0) {
            if (i10 > 0 && getMaxVideoLength() > 0 && i10 > getMaxVideoLength()) {
                throw new IllegalArgumentException("Min Length cannot be higher than max length");
            }
            this.minVideoLength = i10;
            return;
        }
        throw new IllegalArgumentException("Min Length must be higher than 0");
    }

    public void setMute(boolean z10) {
        this.setMute = true;
        this.mute = z10;
    }

    public void setOnAdClickedCallback(OnAdClicked onAdClicked) {
        if (onAdClicked != null) {
            this.onAdClickedWR = new WeakReference<>(onAdClicked);
        }
    }

    public void setOnAdClosedCallback(OnAdClosed onAdClosed) {
        if (onAdClosed != null) {
            this.closeCallbackWR = new WeakReference<>(onAdClosed);
        }
    }

    public void setOnAdErrorCallback(OnAdError onAdError) {
        if (onAdError != null) {
            this.onAdErrorWR = new WeakReference<>(onAdError);
        }
    }

    public void setOnAdLoadedCallback(OnAdLoaded onAdLoaded) {
        if (onAdLoaded != null) {
            this.onAdLoadedWR = new WeakReference<>(onAdLoaded);
        }
    }

    public void setOnAdOpenedCallback(OnAdOpened onAdOpened) {
        if (onAdOpened != null) {
            this.adOpenedCallbackWR = new WeakReference<>(onAdOpened);
        }
    }

    public void setOrientation(String str) {
        if (str != null) {
            if (!str.equals(ORIENTATION_AUTO) && !str.equals(ORIENTATION_DEFAULT) && !str.equals("landscape") && !str.equals("portrait")) {
                throw new IllegalArgumentException("Wrong orientation type");
            }
            this.orientation = str;
            return;
        }
        throw new IllegalArgumentException("orientation type");
    }

    public void setPackageName(String str) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, "UTF-8"))) {
                str = URLEncoder.encode(str, "UTF-8");
            }
            str2 = str;
        } catch (Throwable unused) {
        }
        this.packageName = str2;
    }

    protected void setPlacementID(String str) {
        this.placementID = str;
    }

    public void setPostback(String str) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, "UTF-8"))) {
                str = URLEncoder.encode(str, "UTF-8");
            }
            str2 = str;
        } catch (Throwable unused) {
        }
        this.pbk = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSpecificCategories(String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, "UTF-8"))) {
                this.mSpecificCategories = URLEncoder.encode(str, "UTF-8");
            }
        } catch (Throwable unused) {
            this.mSpecificCategories = "";
        }
        this.mSpecificCategories = str;
    }

    public abstract void showAd();

    /* JADX INFO: Access modifiers changed from: protected */
    public Ad(Ad ad) {
        this.onAdClickedWR = null;
        this.onAdErrorWR = null;
        this.onAdLoadedWR = null;
        this.closeCallbackWR = null;
        this.adOpenedCallbackWR = null;
        this.placementID = "";
        this.cat = "";
        this.mSpecificCategories = "";
        this.pbk = "";
        this.cnt = 200;
        this.maxVideoLength = 0;
        this.minVideoLength = 0;
        this.setMute = false;
        this.mute = false;
        this.orientation = ORIENTATION_DEFAULT;
        this.sessionId = "";
        this.packageName = "";
        try {
            this.context = ad.context;
            setPlacementID(ad.getPlacementID());
            setCategories(ad.cat);
            setSpecificCategories(ad.mSpecificCategories);
            setPostback(ad.getPostback());
            setCount(ad.getCount());
            setMinVideoLength(ad.getMinVideoLength());
            setMaxVideoLength(ad.getMaxVideoLength());
            setSessionId(ad.getSessionId());
            this.onAdClickedWR = ad.onAdClickedWR;
            this.onAdErrorWR = ad.onAdErrorWR;
            this.onAdLoadedWR = ad.onAdLoadedWR;
            this.closeCallbackWR = ad.closeCallbackWR;
            this.adOpenedCallbackWR = ad.adOpenedCallbackWR;
        } catch (Throwable th) {
            com.appnext.base.a.a("Ad$Ad", th);
        }
    }
}
