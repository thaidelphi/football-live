package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l7 {

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f22237k = {"getSupportFragmentManager", "getFragmentManager"};

    /* renamed from: a  reason: collision with root package name */
    public final Context f22238a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<Executor> f22239b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<Executor> f22240c;

    /* renamed from: d  reason: collision with root package name */
    public final j2<RcdMetadata> f22241d;

    /* renamed from: e  reason: collision with root package name */
    public final n7 f22242e;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f22245h;

    /* renamed from: i  reason: collision with root package name */
    public String f22246i;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f22243f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f22244g = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final a f22247j = new a();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                l7.this.b();
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f22249a;

        public b(Activity activity) {
            this.f22249a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                l7.this.b(this.f22249a);
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f22251a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f22252b;

        public c(Activity activity, View view) {
            this.f22251a = activity;
            this.f22252b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                l7 l7Var = l7.this;
                Activity activity = this.f22251a;
                View view = this.f22252b;
                RcdMetadata call = l7Var.f22241d.call();
                if (call == null || !call.c()) {
                    call = null;
                }
                RcdTargets b10 = call != null ? call.b() : null;
                if (b10 == null) {
                    return;
                }
                Collection<String> a10 = b10.a(8);
                String name = activity.getClass().getName();
                if (a10.contains(name)) {
                    l7Var.a(name, 8);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                l7Var.a(b10, view);
                l7Var.f22240c.a().execute(l7Var.f22247j);
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StackTraceElement[] f22254a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f22255b;

        public d(StackTraceElement[] stackTraceElementArr, int i10) {
            this.f22254a = stackTraceElementArr;
            this.f22255b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                l7 l7Var = l7.this;
                StackTraceElement[] stackTraceElementArr = this.f22254a;
                int i10 = this.f22255b;
                RcdMetadata call = l7Var.f22241d.call();
                if (call == null || !call.c()) {
                    call = null;
                }
                RcdTargets b10 = call != null ? call.b() : null;
                if (b10 == null) {
                    return;
                }
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    l7Var.a(b10, stackTraceElement.getClassName(), i10);
                }
                l7Var.f22240c.a().execute(l7Var.f22247j);
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    public l7(Context context, t4 t4Var, com.startapp.sdk.components.u uVar) {
        this.f22238a = context;
        this.f22239b = t4Var;
        this.f22240c = new t4<>(new m7(t4Var));
        this.f22241d = uVar;
        if (Build.VERSION.SDK_INT >= 14) {
            this.f22242e = new n7(this);
        } else {
            this.f22242e = null;
        }
    }

    public final void a() {
        RcdMetadata call = this.f22241d.call();
        call = (call == null || !call.c()) ? null : null;
        RcdTargets b10 = call != null ? call.b() : null;
        if (b10 == null) {
            return;
        }
        for (String str : b10.a(1)) {
            try {
                Class.forName(str, false, l7.class.getClassLoader());
                a(str, 1);
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                l3.a(th);
            }
        }
        try {
            String packageName = this.f22238a.getPackageName();
            PackageInfo packageInfo = this.f22238a.getPackageManager().getPackageInfo(packageName, 15);
            if (packageInfo != null) {
                a(b10, packageName, packageInfo.activities);
                a(b10, packageName, packageInfo.receivers);
                a(b10, packageName, packageInfo.services);
                a(b10, packageName, packageInfo.providers);
            }
        } catch (Throwable th2) {
            l3.a(th2);
        }
        this.f22240c.a().execute(this.f22247j);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x009c A[EDGE_INSN: B:102:0x009c->B:44:0x009c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[Catch: all -> 0x0098, TryCatch #3 {all -> 0x0098, blocks: (B:23:0x004b, B:25:0x0051, B:27:0x005b, B:33:0x0067, B:35:0x006f, B:40:0x0093), top: B:94:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc A[Catch: all -> 0x0139, NoSuchMethodException -> 0x013d, TryCatch #7 {NoSuchMethodException -> 0x013d, all -> 0x0139, blocks: (B:47:0x00a4, B:49:0x00b6, B:51:0x00cc, B:52:0x00d2, B:54:0x00d8, B:56:0x00de, B:58:0x00e6, B:60:0x00f0, B:66:0x00fc, B:68:0x0104, B:79:0x0131), top: B:100:0x00a4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.app.Activity r19) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.l7.b(android.app.Activity):void");
    }

    public final void a(Activity activity) {
        Window window;
        View decorView;
        Boolean bool = this.f22245h;
        boolean z10 = false;
        if (bool == null) {
            RcdMetadata call = this.f22241d.call();
            call = (call == null || !call.c()) ? null : null;
            bool = Boolean.valueOf(call == null || Math.random() >= call.a());
            this.f22245h = bool;
        }
        if (bool.booleanValue()) {
            return;
        }
        String name = activity.getClass().getName();
        WeakHashMap weakHashMap = o9.f22359a;
        if (name.startsWith("com.startapp.")) {
            return;
        }
        List list = (List) this.f22244g.get(name);
        if (list == null) {
            list = new ArrayList(2);
            this.f22244g.put(name, list);
            this.f22239b.a().execute(new b(activity));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                it.remove();
            } else if (weakReference.get() == activity) {
                z10 = true;
            }
        }
        if (z10 || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        list.add(new WeakReference(activity));
        this.f22239b.a().execute(new c(activity, decorView));
    }

    public final void a(int i10) {
        boolean z10;
        try {
            Boolean bool = this.f22245h;
            if (bool == null) {
                RcdMetadata call = this.f22241d.call();
                if (call == null || !call.c()) {
                    call = null;
                }
                if (call != null && Math.random() < call.a()) {
                    z10 = false;
                    bool = Boolean.valueOf(z10);
                    this.f22245h = bool;
                }
                z10 = true;
                bool = Boolean.valueOf(z10);
                this.f22245h = bool;
            }
            if (bool.booleanValue()) {
                return;
            }
            this.f22239b.a().execute(new d(Thread.currentThread().getStackTrace(), i10));
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    public final void b() {
        HashMap hashMap;
        RcdMetadata call = this.f22241d.call();
        if (call == null || !call.c()) {
            call = null;
        }
        RcdTargets b10 = call != null ? call.b() : null;
        if (b10 == null) {
            return;
        }
        synchronized (this.f22243f) {
            hashMap = new HashMap(this.f22243f);
        }
        String a10 = b10.a(hashMap);
        if (a10.equals(this.f22246i)) {
            return;
        }
        this.f22246i = a10;
        l3 l3Var = new l3(m3.f22274d);
        l3Var.f22228d = "RCD.results";
        l3Var.f22229e = a10;
        l3Var.a();
    }

    public final <T extends ComponentInfo> void a(RcdTargets rcdTargets, String str, T[] tArr) {
        if (tArr == null) {
            return;
        }
        for (T t10 : tArr) {
            if (t10 != null) {
                String str2 = ((ComponentInfo) t10).name;
                if (str2.startsWith(".")) {
                    a(rcdTargets, str + str2, 2);
                } else {
                    a(rcdTargets, str2, 2);
                }
            }
        }
    }

    public final void a(RcdTargets rcdTargets, View view) {
        if (view == null) {
            return;
        }
        a(rcdTargets, view.getClass().getName(), 4);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                a(rcdTargets, viewGroup.getChildAt(i10));
            }
        }
    }

    public final void a(String str, int i10) {
        synchronized (this.f22243f) {
            Integer num = (Integer) this.f22243f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f22243f.put(str, Integer.valueOf(i10 | num.intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.startapp.sdk.adsbase.remoteconfig.RcdTargets r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "android"
            boolean r0 = r7.startsWith(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L15
            java.lang.String r0 = "java."
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 == 0) goto L19
            return
        L19:
            java.util.WeakHashMap r0 = com.startapp.o9.f22359a
            java.lang.String r0 = "com.startapp."
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L24
            return
        L24:
            java.util.Collection r6 = r6.a(r8)
            java.util.Iterator r6 = r6.iterator()
        L2c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r0.length()
            if (r3 <= 0) goto L74
            boolean r3 = r7.startsWith(r0)
            if (r3 == 0) goto L74
            int r3 = r0.length()
            int r3 = r3 - r2
            char r3 = r0.charAt(r3)
            r4 = 46
            if (r3 != r4) goto L55
            r5.a(r0, r8)
            goto L74
        L55:
            int r3 = r7.length()
            int r4 = r0.length()
            if (r3 <= r4) goto L6f
            int r3 = r0.length()
            char r3 = r7.charAt(r3)
            r4 = 36
            if (r3 != r4) goto L74
            r5.a(r0, r8)
            goto L74
        L6f:
            r5.a(r0, r8)
            r0 = r2
            goto L75
        L74:
            r0 = r1
        L75:
            if (r0 == 0) goto L2c
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.l7.a(com.startapp.sdk.adsbase.remoteconfig.RcdTargets, java.lang.String, int):void");
    }
}
