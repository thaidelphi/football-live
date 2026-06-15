package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;
/* compiled from: CustomTabsIntent.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1858a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f1859b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CustomTabsIntent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CustomTabsIntent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CustomTabsIntent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {
        static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f1858a = intent;
        this.f1859b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1858a.setData(uri);
        androidx.core.content.a.j(context, this.f1858a, this.f1859b);
    }

    /* compiled from: CustomTabsIntent.java */
    /* renamed from: androidx.browser.customtabs.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0026d {

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<Bundle> f1862c;

        /* renamed from: d  reason: collision with root package name */
        private ActivityOptions f1863d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f1864e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<Bundle> f1865f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f1866g;

        /* renamed from: j  reason: collision with root package name */
        private boolean f1869j;

        /* renamed from: a  reason: collision with root package name */
        private final Intent f1860a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0023a f1861b = new a.C0023a();

        /* renamed from: h  reason: collision with root package name */
        private int f1867h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1868i = true;

        public C0026d() {
        }

        private void c() {
            String a10 = b.a();
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            Bundle bundleExtra = this.f1860a.hasExtra("com.android.browser.headers") ? this.f1860a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a10);
            this.f1860a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void h(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1860a.putExtras(bundle);
        }

        private void i() {
            if (this.f1863d == null) {
                this.f1863d = a.a();
            }
            c.a(this.f1863d, this.f1869j);
        }

        public d a() {
            if (!this.f1860a.hasExtra("android.support.customtabs.extra.SESSION")) {
                h(null, null);
            }
            ArrayList<Bundle> arrayList = this.f1862c;
            if (arrayList != null) {
                this.f1860a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1864e;
            if (arrayList2 != null) {
                this.f1860a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1860a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1868i);
            this.f1860a.putExtras(this.f1861b.a().a());
            Bundle bundle = this.f1866g;
            if (bundle != null) {
                this.f1860a.putExtras(bundle);
            }
            if (this.f1865f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1865f);
                this.f1860a.putExtras(bundle2);
            }
            this.f1860a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1867h);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                c();
            }
            if (i10 >= 34) {
                i();
            }
            ActivityOptions activityOptions = this.f1863d;
            return new d(this.f1860a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public C0026d b(int i10, androidx.browser.customtabs.a aVar) {
            if (i10 >= 0 && i10 <= 2 && i10 != 0) {
                if (this.f1865f == null) {
                    this.f1865f = new SparseArray<>();
                }
                this.f1865f.put(i10, aVar.a());
                return this;
            }
            throw new IllegalArgumentException("Invalid colorScheme: " + i10);
        }

        public C0026d d(androidx.browser.customtabs.a aVar) {
            this.f1866g = aVar.a();
            return this;
        }

        public C0026d e(Context context, int i10, int i11) {
            this.f1860a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.c.a(context, i10, i11).b());
            return this;
        }

        public C0026d f(boolean z10) {
            this.f1868i = z10;
            return this;
        }

        public C0026d g(f fVar) {
            this.f1860a.setPackage(fVar.e().getPackageName());
            h(fVar.d(), fVar.f());
            return this;
        }

        public C0026d j(int i10) {
            if (i10 >= 0 && i10 <= 2) {
                this.f1867h = i10;
                if (i10 == 1) {
                    this.f1860a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                } else if (i10 == 2) {
                    this.f1860a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                } else {
                    this.f1860a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
                }
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }

        public C0026d k(boolean z10) {
            this.f1860a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public C0026d l(Context context, int i10, int i11) {
            this.f1863d = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        public C0026d m(boolean z10) {
            this.f1860a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }

        public C0026d(f fVar) {
            if (fVar != null) {
                g(fVar);
            }
        }
    }
}
