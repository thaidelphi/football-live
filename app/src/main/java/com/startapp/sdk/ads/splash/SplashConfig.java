package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.common.parser.TypeInfo;
import com.startapp.l3;
import com.startapp.o9;
import com.startapp.sdk.ads.splash.g;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SplashConfig implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Theme f22692c = Theme.OCEAN;

    /* renamed from: d  reason: collision with root package name */
    public static final MinSplashTime f22693d = MinSplashTime.REGULAR;

    /* renamed from: e  reason: collision with root package name */
    public static final long f22694e = 7500;

    /* renamed from: f  reason: collision with root package name */
    public static final MaxAdDisplayTime f22695f = MaxAdDisplayTime.FOR_EVER;

    /* renamed from: g  reason: collision with root package name */
    public static final Orientation f22696g = Orientation.AUTO;
    private static final long serialVersionUID = -7278580071843456805L;
    private boolean showFromCacheOnly;
    private boolean forceNative = false;
    private int customScreen = -1;
    private String appName = "";

    /* renamed from: a  reason: collision with root package name */
    public transient Drawable f22697a = null;
    private byte[] logoByteArray = null;
    private int logoRes = -1;
    @TypeInfo(type = Theme.class)
    private Theme defaultTheme = f22692c;
    @TypeInfo(type = MinSplashTime.class)
    private MinSplashTime defaultMinSplashTime = f22693d;
    private Long defaultMaxLoadTime = Long.valueOf(f22694e);
    @TypeInfo(type = MaxAdDisplayTime.class)
    private MaxAdDisplayTime defaultMaxAdDisplayTime = f22695f;
    @TypeInfo(type = Orientation.class)
    private Orientation defaultOrientation = f22696g;
    @TypeInfo(type = Animation.class)
    private Animation animation = Animation.ALL;
    private boolean htmlSplash = true;
    private String splashBgColor = "#066CAA";
    private String splashFontColor = "ffffff";
    private String splashLoadingType = "LoadingDots";

    /* renamed from: b  reason: collision with root package name */
    public transient String f22698b = "";

    /* compiled from: Sta */
    /* renamed from: com.startapp.sdk.ads.splash.SplashConfig$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme;

        static {
            int[] iArr = new int[Theme.values().length];
            $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme = iArr;
            try {
                iArr[Theme.DEEP_BLUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[Theme.SKY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[Theme.ASHEN_SKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[Theme.BLAZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[Theme.GLOOMY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[Theme.OCEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[Theme.USER_DEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Animation {
        ALL,
        AVAILABLE_AD_ONLY,
        DISABLE
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum MaxAdDisplayTime {
        SHORT(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT),
        LONG(10000),
        FOR_EVER(86400000);
        
        private long index;

        MaxAdDisplayTime(long j10) {
            this.index = j10;
        }

        public static MaxAdDisplayTime getByIndex(long j10) {
            MaxAdDisplayTime maxAdDisplayTime = SHORT;
            MaxAdDisplayTime[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].getIndex() == j10) {
                    maxAdDisplayTime = values[i10];
                }
            }
            return maxAdDisplayTime;
        }

        public static MaxAdDisplayTime getByName(String str) {
            MaxAdDisplayTime maxAdDisplayTime = FOR_EVER;
            MaxAdDisplayTime[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    maxAdDisplayTime = values[i10];
                }
            }
            return maxAdDisplayTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum MinSplashTime {
        REGULAR(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED),
        SHORT(2000),
        LONG(5000);
        
        private long index;

        MinSplashTime(int i10) {
            this.index = i10;
        }

        public static MinSplashTime getByIndex(long j10) {
            MinSplashTime minSplashTime = SHORT;
            MinSplashTime[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].getIndex() == j10) {
                    minSplashTime = values[i10];
                }
            }
            return minSplashTime;
        }

        public static MinSplashTime getByName(String str) {
            MinSplashTime minSplashTime = LONG;
            MinSplashTime[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    minSplashTime = values[i10];
                }
            }
            return minSplashTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Orientation {
        PORTRAIT(1),
        LANDSCAPE(2),
        AUTO(3);
        
        private int index;

        Orientation(int i10) {
            this.index = i10;
        }

        public static Orientation getByIndex(int i10) {
            Orientation orientation = PORTRAIT;
            Orientation[] values = values();
            for (int i11 = 0; i11 < values.length; i11++) {
                if (values[i11].getIndex() == i10) {
                    orientation = values[i11];
                }
            }
            return orientation;
        }

        public static Orientation getByName(String str) {
            Orientation orientation = AUTO;
            Orientation[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    orientation = values[i10];
                }
            }
            return orientation;
        }

        public int getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Theme {
        DEEP_BLUE(1),
        SKY(2),
        ASHEN_SKY(3),
        BLAZE(4),
        GLOOMY(5),
        OCEAN(6),
        USER_DEFINED(0);
        
        private int index;

        Theme(int i10) {
            this.index = i10;
        }

        public static Theme getByIndex(int i10) {
            Theme theme = DEEP_BLUE;
            Theme[] values = values();
            for (int i11 = 0; i11 < values.length; i11++) {
                if (values[i11].getIndex() == i10) {
                    theme = values[i11];
                }
            }
            return theme;
        }

        public static Theme getByName(String str) {
            Theme theme = DEEP_BLUE;
            Theme[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    theme = values[i10];
                }
            }
            return theme;
        }

        public int getIndex() {
            return this.index;
        }
    }

    public final Long a() {
        return this.defaultMaxLoadTime;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final SplashHtml b(Activity activity) {
        String str = "#333333";
        String str2 = "#066CAA";
        switch (AnonymousClass1.$SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[this.defaultTheme.ordinal()]) {
            case 1:
                str = "#FFFFFF";
                break;
            case 2:
                str2 = "#a3d4e5";
                break;
            case 3:
                str2 = "#E3E3E3";
                break;
            case 4:
                str2 = "#FF6600";
                str = "#FFFFFF";
                break;
            case 5:
                str = "#33B5E5";
                str2 = "#2F353F";
                break;
            case 6:
                str = "#063D51";
                str2 = "#237C9A";
                break;
            default:
                str = "ffffff";
                break;
        }
        this.splashBgColor = str2;
        this.splashFontColor = str;
        SplashHtml splashHtml = new SplashHtml(activity);
        splashHtml.a(this);
        splashHtml.d();
        return splashHtml;
    }

    public final void c(Activity activity) {
        if (getLogo() == null && getLogoRes() == -1 && getLogoByteArray() != null) {
            byte[] logoByteArray = getLogoByteArray();
            this.f22697a = new BitmapDrawable(activity.getResources(), BitmapFactory.decodeByteArray(logoByteArray, 0, logoByteArray.length));
        }
    }

    public final boolean d(Activity activity) {
        if (AnonymousClass1.$SwitchMap$com$startapp$sdk$ads$splash$SplashConfig$Theme[this.defaultTheme.ordinal()] != 7) {
            if (getAppName().equals("")) {
                setAppName(com.startapp.sdk.adsbase.a.a(activity));
            }
            if (getLogo() == null && getLogoByteArray() == null) {
                try {
                    if (getLogoRes() == -1) {
                        WeakHashMap weakHashMap = o9.f22359a;
                        PackageManager packageManager = activity.getPackageManager();
                        this.f22697a = packageManager == null ? null : packageManager.getApplicationInfo(activity.getPackageName(), 128).loadIcon(packageManager);
                    } else {
                        this.f22697a = activity.getResources().getDrawable(getLogoRes());
                    }
                } catch (Throwable th) {
                    l3.a(th);
                }
            }
        } else if (getCustomScreen() == -1) {
            this.f22698b = "StartApp: Exception getting custom screen resource id, make sure it is set";
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SplashConfig splashConfig = (SplashConfig) obj;
        return this.forceNative == splashConfig.forceNative && this.showFromCacheOnly == splashConfig.showFromCacheOnly && this.animation == splashConfig.animation && this.customScreen == splashConfig.customScreen && this.logoRes == splashConfig.logoRes && this.htmlSplash == splashConfig.htmlSplash && o9.a(this.appName, splashConfig.appName) && Arrays.equals(this.logoByteArray, splashConfig.logoByteArray) && this.defaultTheme == splashConfig.defaultTheme && this.defaultMinSplashTime == splashConfig.defaultMinSplashTime && o9.a(this.defaultMaxLoadTime, splashConfig.defaultMaxLoadTime) && this.defaultMaxAdDisplayTime == splashConfig.defaultMaxAdDisplayTime && this.defaultOrientation == splashConfig.defaultOrientation && o9.a(this.splashBgColor, splashConfig.splashBgColor) && o9.a(this.splashFontColor, splashConfig.splashFontColor) && o9.a(this.splashLoadingType, splashConfig.splashLoadingType);
    }

    public Animation getAnimationMode() {
        Animation animation = this.animation;
        return animation == null ? Animation.ALL : animation;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getBgColor() {
        return this.splashBgColor;
    }

    public int getCustomScreen() {
        return this.customScreen;
    }

    public String getErrorMessage() {
        return this.f22698b;
    }

    public String getFontColor() {
        return this.splashFontColor;
    }

    public String getLoadingType() {
        return this.splashLoadingType;
    }

    public Drawable getLogo() {
        return this.f22697a;
    }

    public byte[] getLogoByteArray() {
        return this.logoByteArray;
    }

    public int getLogoRes() {
        return this.logoRes;
    }

    public MaxAdDisplayTime getMaxAdDisplayTime() {
        return this.defaultMaxAdDisplayTime;
    }

    public MinSplashTime getMinSplashTime() {
        return this.defaultMinSplashTime;
    }

    public Orientation getOrientation() {
        return this.defaultOrientation;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.forceNative), Integer.valueOf(this.customScreen), this.appName, Integer.valueOf(this.logoRes), this.defaultTheme, this.defaultMinSplashTime, this.defaultMaxLoadTime, this.defaultMaxAdDisplayTime, this.defaultOrientation, Boolean.valueOf(this.htmlSplash), this.splashBgColor, this.splashFontColor, this.splashLoadingType, Boolean.valueOf(this.showFromCacheOnly), this.logoByteArray, this.animation};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public boolean isHtmlSplash() {
        if (this.forceNative) {
            return false;
        }
        return this.htmlSplash;
    }

    public boolean isLogoResAvailable() {
        return this.logoRes != -1;
    }

    public boolean isShowFromCacheOnly() {
        return this.showFromCacheOnly;
    }

    public SplashConfig setAppName(String str) {
        this.appName = str;
        return this;
    }

    public SplashConfig setCustomScreen(int i10) {
        this.customScreen = i10;
        return this;
    }

    public SplashConfig setLoadingType(String str) {
        this.splashLoadingType = str;
        return this;
    }

    public SplashConfig setLogo(int i10) {
        this.logoRes = i10;
        return this;
    }

    public SplashConfig setMaxAdDisplayTime(MaxAdDisplayTime maxAdDisplayTime) {
        this.defaultMaxAdDisplayTime = maxAdDisplayTime;
        return this;
    }

    public SplashConfig setMinSplashTime(MinSplashTime minSplashTime) {
        this.defaultMinSplashTime = minSplashTime;
        return this;
    }

    public SplashConfig setOrientation(Orientation orientation) {
        this.defaultOrientation = orientation;
        return this;
    }

    public SplashConfig setTheme(Theme theme) {
        this.defaultTheme = theme;
        return this;
    }

    public final View a(Activity activity) {
        Theme theme = this.defaultTheme;
        if (theme == Theme.USER_DEFINED) {
            try {
                return ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(getCustomScreen(), (ViewGroup) null);
            } catch (Resources.NotFoundException e8) {
                Log.w("StartAppSDK", e8);
                return null;
            } catch (InflateException e10) {
                Log.w("StartAppSDK", e10);
                return null;
            } catch (Throwable th) {
                l3.a(th);
                return null;
            }
        }
        switch (g.a.f22748a[theme.ordinal()]) {
            case 1:
                RelativeLayout a10 = g.a(activity, this);
                a10.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16356182, -15029533, -16356182}));
                ((TextView) a10.findViewById(100)).setTextColor(Color.rgb(255, 255, 255));
                ((TextView) a10.findViewById(105)).setTextColor(Color.rgb(208, 210, 210));
                return a10;
            case 2:
                RelativeLayout a11 = g.a(activity, this);
                int i10 = activity.getResources().getDisplayMetrics().widthPixels;
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-921103, -6040347});
                gradientDrawable.setGradientType(1);
                gradientDrawable.setGradientRadius(i10 / 2);
                a11.setBackgroundDrawable(gradientDrawable);
                ((TextView) a11.findViewById(100)).setTextColor(Color.rgb(51, 51, 51));
                ((TextView) a11.findViewById(105)).setTextColor(Color.rgb(162, 172, 175));
                return a11;
            case 3:
                RelativeLayout a12 = g.a(activity, this);
                a12.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3881788, -1}));
                ((TextView) a12.findViewById(100)).setTextColor(Color.rgb(51, 51, 51));
                ((TextView) a12.findViewById(105)).setTextColor(Color.rgb(153, 153, 153));
                return a12;
            case 4:
                RelativeLayout a13 = g.a(activity, this);
                int i11 = activity.getResources().getDisplayMetrics().widthPixels;
                GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-92376, -40960});
                gradientDrawable2.setGradientType(1);
                gradientDrawable2.setGradientRadius(i11 / 2);
                a13.setBackgroundDrawable(gradientDrawable2);
                ((TextView) a13.findViewById(100)).setTextColor(Color.rgb(255, 255, 255));
                ((TextView) a13.findViewById(105)).setTextColor(Color.rgb(255, 198, 151));
                return a13;
            case 5:
                RelativeLayout a14 = g.a(activity, this);
                a14.setBackgroundColor(Color.rgb(47, 53, 63));
                ((TextView) a14.findViewById(100)).setTextColor(Color.rgb(51, 181, 229));
                ((TextView) a14.findViewById(105)).setTextColor(Color.rgb(122, 130, 139));
                return a14;
            case 6:
                RelativeLayout a15 = g.a(activity, this);
                a15.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-14451558, -7876130}));
                ((TextView) a15.findViewById(100)).setTextColor(Color.rgb(6, 61, 82));
                ((TextView) a15.findViewById(105)).setTextColor(Color.rgb(6, 61, 82));
                return a15;
            default:
                return null;
        }
    }

    public SplashConfig setLogo(byte[] bArr) {
        this.logoByteArray = bArr;
        return this;
    }

    public final boolean b() {
        return this.defaultTheme == Theme.USER_DEFINED || getCustomScreen() != -1;
    }
}
