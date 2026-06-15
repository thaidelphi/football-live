package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CustomTabsClient.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b.b f1819a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f1820b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1821c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomTabsClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends a.AbstractBinderC0089a {

        /* renamed from: a  reason: collision with root package name */
        private Handler f1822a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f1823b;

        /* compiled from: CustomTabsClient.java */
        /* renamed from: androidx.browser.customtabs.c$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0024a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f1825a;

            RunnableC0024a(Bundle bundle) {
                this.f1825a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.onUnminimized(this.f1825a);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1827a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1828b;

            b(int i10, Bundle bundle) {
                this.f1827a = i10;
                this.f1828b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.onNavigationEvent(this.f1827a, this.f1828b);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: androidx.browser.customtabs.c$a$c  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0025c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1830a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1831b;

            RunnableC0025c(String str, Bundle bundle) {
                this.f1830a = str;
                this.f1831b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.extraCallback(this.f1830a, this.f1831b);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f1833a;

            d(Bundle bundle) {
                this.f1833a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.onMessageChannelReady(this.f1833a);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1835a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1836b;

            e(String str, Bundle bundle) {
                this.f1835a = str;
                this.f1836b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.onPostMessage(this.f1835a, this.f1836b);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1838a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Uri f1839b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f1840c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Bundle f1841d;

            f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f1838a = i10;
                this.f1839b = uri;
                this.f1840c = z10;
                this.f1841d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.onRelationshipValidationResult(this.f1838a, this.f1839b, this.f1840c, this.f1841d);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1843a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1844b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Bundle f1845c;

            g(int i10, int i11, Bundle bundle) {
                this.f1843a = i10;
                this.f1844b = i11;
                this.f1845c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.onActivityResized(this.f1843a, this.f1844b, this.f1845c);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class h implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f1847a;

            h(Bundle bundle) {
                this.f1847a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.onWarmupCompleted(this.f1847a);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class i implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1849a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1850b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f1851c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f1852d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f1853e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bundle f1854f;

            i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f1849a = i10;
                this.f1850b = i11;
                this.f1851c = i12;
                this.f1852d = i13;
                this.f1853e = i14;
                this.f1854f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.onActivityLayout(this.f1849a, this.f1850b, this.f1851c, this.f1852d, this.f1853e, this.f1854f);
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class j implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f1856a;

            j(Bundle bundle) {
                this.f1856a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1823b.onMinimized(this.f1856a);
            }
        }

        a(androidx.browser.customtabs.b bVar) {
            this.f1823b = bVar;
        }

        @Override // b.a
        public void Y(Bundle bundle) throws RemoteException {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new j(bundle));
        }

        @Override // b.a
        public void b0(Bundle bundle) throws RemoteException {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new RunnableC0024a(bundle));
        }

        @Override // b.a
        public void e(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // b.a
        public Bundle h(String str, Bundle bundle) throws RemoteException {
            androidx.browser.customtabs.b bVar = this.f1823b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // b.a
        public void h0(int i10, int i11, Bundle bundle) throws RemoteException {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new g(i10, i11, bundle));
        }

        @Override // b.a
        public void k0(int i10, Bundle bundle) {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new b(i10, bundle));
        }

        @Override // b.a
        public void n(String str, Bundle bundle) throws RemoteException {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new RunnableC0025c(str, bundle));
        }

        @Override // b.a
        public void n0(String str, Bundle bundle) throws RemoteException {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new e(str, bundle));
        }

        @Override // b.a
        public void p0(Bundle bundle) throws RemoteException {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new d(bundle));
        }

        @Override // b.a
        public void q0(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new f(i10, uri, z10, bundle));
        }

        @Override // b.a
        public void r(Bundle bundle) throws RemoteException {
            if (this.f1823b == null) {
                return;
            }
            this.f1822a.post(new h(bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b.b bVar, ComponentName componentName, Context context) {
        this.f1819a = bVar;
        this.f1820b = componentName;
        this.f1821c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private a.AbstractBinderC0089a b(b bVar) {
        return new a(bVar);
    }

    public static String c(Context context, List<String> list) {
        return d(context, list, false);
    }

    public static String d(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean a02;
        a.AbstractBinderC0089a b10 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                a02 = this.f1819a.q(b10, bundle);
            } else {
                a02 = this.f1819a.a0(b10);
            }
            if (a02) {
                return new f(this.f1819a, b10, this.f1820b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j10) {
        try {
            return this.f1819a.W(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
