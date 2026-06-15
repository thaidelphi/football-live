package com.ironsource.adapters.admob.banner;

import com.ironsource.adapters.admob.R;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.l;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum NB_TMP_BASIC uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: AdMobNativeBannerViewHandler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class NativeTemplateType {
    private static final /* synthetic */ NativeTemplateType[] $VALUES;
    private static final String NATIVE_TEMPLATE_NAME = "nativeBannerTemplateName";
    public static final NativeTemplateType NB_TMP_BASIC;
    public static final NativeTemplateType NB_TMP_BASIC_LARGE;
    public static final NativeTemplateType NB_TMP_ICON_TEXT;
    public static final NativeTemplateType NB_TMP_RECT;
    public static final NativeTemplateType NB_TMP_TEXT_CTA;
    private final int mAdChoicesPlacement;
    private final boolean mHideCallToAction;
    private final boolean mHideVideoContent;
    private final int mLayoutId;
    private final int mMediaAspectRatio;

    static {
        int i10 = R.layout.ad_mob_native_banner_template_basic_layout;
        NativeTemplateType nativeTemplateType = new NativeTemplateType("NB_TMP_BASIC", 0, i10, true, true, 1, 1);
        NB_TMP_BASIC = nativeTemplateType;
        NativeTemplateType nativeTemplateType2 = new NativeTemplateType("NB_TMP_BASIC_LARGE", 1, i10, false, true, 1, 1);
        NB_TMP_BASIC_LARGE = nativeTemplateType2;
        NativeTemplateType nativeTemplateType3 = new NativeTemplateType("NB_TMP_ICON_TEXT", 2, R.layout.ad_mob_native_banner_template_icon_text_layout, true, true, 1, 1);
        NB_TMP_ICON_TEXT = nativeTemplateType3;
        NativeTemplateType nativeTemplateType4 = new NativeTemplateType("NB_TMP_TEXT_CTA", 3, R.layout.ad_mob_native_banner_template_text_cta_layout, false, true, 3, 1);
        NB_TMP_TEXT_CTA = nativeTemplateType4;
        NativeTemplateType nativeTemplateType5 = new NativeTemplateType("NB_TMP_RECT", 4, R.layout.ad_mob_native_banner_template_rect_layout, false, false, 1, 1);
        NB_TMP_RECT = nativeTemplateType5;
        $VALUES = new NativeTemplateType[]{nativeTemplateType, nativeTemplateType2, nativeTemplateType3, nativeTemplateType4, nativeTemplateType5};
    }

    private NativeTemplateType(String str, int i10, int i11, boolean z10, boolean z11, int i12, int i13) {
        this.mLayoutId = i11;
        this.mHideCallToAction = z10;
        this.mHideVideoContent = z11;
        this.mAdChoicesPlacement = i12;
        this.mMediaAspectRatio = i13;
    }

    public static NativeTemplateType createTemplateType(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        String description = iSBannerSize.getDescription();
        description.hashCode();
        char c10 = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals(l.f18872c)) {
                    c10 = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals(l.f18871b)) {
                    c10 = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals(l.f18874e)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return NB_TMP_RECT;
            case 1:
                return NB_TMP_BASIC_LARGE;
            case 2:
            case 3:
                try {
                    return valueOf(jSONObject.optString(NATIVE_TEMPLATE_NAME, NB_TMP_ICON_TEXT.toString()));
                } catch (IllegalArgumentException unused) {
                    return NB_TMP_ICON_TEXT;
                }
            default:
                return NB_TMP_BASIC;
        }
    }

    public static NativeTemplateType valueOf(String str) {
        return (NativeTemplateType) Enum.valueOf(NativeTemplateType.class, str);
    }

    public static NativeTemplateType[] values() {
        return (NativeTemplateType[]) $VALUES.clone();
    }

    public int getAdChoicesPlacement() {
        return this.mAdChoicesPlacement;
    }

    public int getLayoutId() {
        return this.mLayoutId;
    }

    public int getMediaAspectRatio() {
        return this.mMediaAspectRatio;
    }

    public boolean shouldHideCallToAction() {
        return this.mHideCallToAction;
    }

    public boolean shouldHideVideoContent() {
        return this.mHideVideoContent;
    }
}
