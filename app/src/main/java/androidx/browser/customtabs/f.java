package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
/* compiled from: CustomTabsSession.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1871a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final b.b f1872b;

    /* renamed from: c  reason: collision with root package name */
    private final b.a f1873c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentName f1874d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f1875e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(b.b bVar, b.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1872b = bVar;
        this.f1873c = aVar;
        this.f1874d = componentName;
        this.f1875e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f1875e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f1875e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder d() {
        return this.f1873c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName e() {
        return this.f1874d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent f() {
        return this.f1875e;
    }

    public boolean g(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f1872b.S(this.f1873c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int h(String str, Bundle bundle) {
        int b10;
        Bundle b11 = b(bundle);
        synchronized (this.f1871a) {
            try {
                try {
                    b10 = this.f1872b.b(this.f1873c, str, b11);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b10;
    }

    public boolean i(Uri uri) {
        return j(uri, null, new Bundle());
    }

    public boolean j(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle c10 = c(uri2);
            if (c10 != null) {
                bundle.putAll(c10);
                return this.f1872b.a(this.f1873c, uri, bundle);
            }
            return this.f1872b.f0(this.f1873c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean k(int i10, Uri uri, Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f1872b.j0(this.f1873c, i10, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
