package androidx.browser.customtabs;

import android.os.Bundle;
/* compiled from: CustomTabColorSchemeParams.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f1811a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1812b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f1813c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1814d;

    /* compiled from: CustomTabColorSchemeParams.java */
    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0023a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f1815a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f1816b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f1817c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f1818d;

        public a a() {
            return new a(this.f1815a, this.f1816b, this.f1817c, this.f1818d);
        }

        public C0023a b(int i10) {
            this.f1815a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1811a = num;
        this.f1812b = num2;
        this.f1813c = num3;
        this.f1814d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1811a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1812b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1813c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1814d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
