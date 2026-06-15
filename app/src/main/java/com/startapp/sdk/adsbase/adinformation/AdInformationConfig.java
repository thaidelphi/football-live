package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import com.startapp.b1;
import com.startapp.common.parser.TypeInfo;
import com.startapp.i3;
import com.startapp.o9;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdInformationConfig implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final String f22952b = "https://funnel-assets.startappservice.com/consent/index.html";
    private static final long serialVersionUID = 8911501868319500986L;
    private Integer consentTypeInfo;
    private boolean enabled = true;
    private float fatFingersFactor = 200.0f;
    private String dialogUrlSecured = f22952b;
    private String eulaUrlSecured = "https://www.startapp.com/policy/privacy-policy/";
    @TypeInfo(key = AdPreferences.Placement.class, type = HashMap.class, value = AdInformationPositions.Position.class)
    protected HashMap<AdPreferences.Placement, AdInformationPositions.Position> Positions = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public transient EnumMap<ImageResourceType, ImageResourceConfig> f22953a = new EnumMap<>(ImageResourceType.class);
    @TypeInfo(type = ArrayList.class, value = ImageResourceConfig.class)
    private List<ImageResourceConfig> ImageResources = new ArrayList();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum ImageResourceType {
        INFO_S(17, 14),
        INFO_EX_S(88, 14),
        INFO_L(25, 21),
        INFO_EX_L(130, 21);
        
        private final int height;
        private final int width;

        ImageResourceType(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static ImageResourceType getByName(String str) {
            ImageResourceType[] values;
            ImageResourceType imageResourceType = INFO_S;
            for (ImageResourceType imageResourceType2 : values()) {
                if (imageResourceType2.name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    imageResourceType = imageResourceType2;
                }
            }
            return imageResourceType;
        }

        public int getDefaultHeight() {
            return this.height;
        }

        public int getDefaultWidth() {
            return this.width;
        }
    }

    private AdInformationConfig() {
    }

    public static AdInformationConfig a() {
        AdInformationConfig adInformationConfig = new AdInformationConfig();
        a(adInformationConfig);
        return adInformationConfig;
    }

    public final Integer b() {
        return this.consentTypeInfo;
    }

    public final String c() {
        String str = this.dialogUrlSecured;
        return str != null ? str : f22952b;
    }

    public final String d() {
        String str = this.eulaUrlSecured;
        return (str == null || str.equals("")) ? "https://www.startapp.com/policy/privacy-policy/" : this.eulaUrlSecured;
    }

    public final float e() {
        return this.fatFingersFactor / 100.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationConfig adInformationConfig = (AdInformationConfig) obj;
        return this.enabled == adInformationConfig.enabled && Float.compare(adInformationConfig.fatFingersFactor, this.fatFingersFactor) == 0 && o9.a(this.consentTypeInfo, adInformationConfig.consentTypeInfo) && o9.a(this.dialogUrlSecured, adInformationConfig.dialogUrlSecured) && o9.a(this.eulaUrlSecured, adInformationConfig.eulaUrlSecured) && o9.a(this.Positions, adInformationConfig.Positions) && o9.a(this.ImageResources, adInformationConfig.ImageResources);
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.consentTypeInfo, Float.valueOf(this.fatFingersFactor), this.dialogUrlSecured, this.eulaUrlSecured, this.Positions, this.ImageResources};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final boolean b(Context context) {
        return !a.a(context).E.a().getBoolean("userDisabledAdInformation", false) && this.enabled;
    }

    public static void a(AdInformationConfig adInformationConfig) {
        ImageResourceType[] values;
        ImageResourceType[] values2;
        boolean z10;
        adInformationConfig.getClass();
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            ImageResourceConfig imageResourceConfig = adInformationConfig.f22953a.get(imageResourceType);
            if (imageResourceConfig == null) {
                imageResourceConfig = ImageResourceConfig.a(imageResourceType.name());
                Iterator<ImageResourceConfig> it = adInformationConfig.ImageResources.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ImageResourceType.getByName(it.next().c()).equals(imageResourceType)) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                adInformationConfig.f22953a.put((EnumMap<ImageResourceType, ImageResourceConfig>) imageResourceType, (ImageResourceType) imageResourceConfig);
                if (z10) {
                    adInformationConfig.ImageResources.add(imageResourceConfig);
                }
            }
            imageResourceConfig.b(imageResourceType.getDefaultWidth());
            imageResourceConfig.a(imageResourceType.getDefaultHeight());
            imageResourceConfig.b(imageResourceType.name().toLowerCase() + ".png");
        }
        for (ImageResourceType imageResourceType2 : ImageResourceType.values()) {
            if (adInformationConfig.f22953a.get(imageResourceType2) == null) {
                throw new IllegalArgumentException(String.valueOf(imageResourceType2));
            }
        }
    }

    public final AdInformationPositions.Position a(AdPreferences.Placement placement) {
        AdInformationPositions.Position position = this.Positions.get(placement);
        if (position == null) {
            AdInformationPositions.Position position2 = AdInformationPositions.Position.BOTTOM_LEFT;
            this.Positions.put(placement, position2);
            return position2;
        }
        return position;
    }

    public final void a(Context context) {
        for (ImageResourceConfig imageResourceConfig : this.ImageResources) {
            this.f22953a.put((EnumMap<ImageResourceType, ImageResourceConfig>) ImageResourceType.getByName(imageResourceConfig.c()), (ImageResourceType) imageResourceConfig);
            imageResourceConfig.f22974a = null;
            new b1(context, imageResourceConfig.b(), new i3(imageResourceConfig), 0).a();
        }
    }

    public final ImageResourceConfig a(ImageResourceType imageResourceType) {
        return this.f22953a.get(imageResourceType);
    }
}
