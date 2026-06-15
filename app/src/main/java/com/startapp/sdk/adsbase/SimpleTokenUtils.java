package com.startapp.sdk.adsbase;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.RemoteException;
import com.startapp.f0;
import com.startapp.f8;
import com.startapp.g8;
import com.startapp.l3;
import com.startapp.o9;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SimpleTokenUtils {

    /* renamed from: a  reason: collision with root package name */
    public static List<PackageInfo> f22891a = null;

    /* renamed from: b  reason: collision with root package name */
    public static List<PackageInfo> f22892b = null;

    /* renamed from: c  reason: collision with root package name */
    public static long f22893c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Pair<TokenType, String> f22894d = null;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Pair<TokenType, String> f22895e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f22896f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f22897g = false;

    /* renamed from: h  reason: collision with root package name */
    public static TokenType f22898h = TokenType.UNDEFINED;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum TokenType {
        T1("token"),
        T2("token2"),
        UNDEFINED("");
        
        private final String text;

        TokenType(String str) {
            this.text = str;
        }

        public static TokenType a(String str) {
            TokenType tokenType = T1;
            if (tokenType.text.equals(str)) {
                return tokenType;
            }
            TokenType tokenType2 = T2;
            return tokenType2.text.equals(str) ? tokenType2 : UNDEFINED;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.text;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            SimpleTokenUtils.f22894d = null;
            SimpleTokenUtils.f22895e = null;
            SimpleTokenUtils.d(context);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22904a;

        public c(Context context) {
            this.f22904a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SimpleTokenUtils.c(this.f22904a);
        }
    }

    public static void a(Context context) {
        Context a10 = f0.a(context);
        if (a10 != null) {
            context = a10;
        }
        d(context);
        f22896f = true;
        f22897g = false;
        f22898h = TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new a(), intentFilter);
        MetaData.f23158k.a(new b(context));
    }

    public static Pair<String, String> b() {
        if (f22895e != null) {
            return new Pair<>(f22895e.first.toString(), f22895e.second);
        }
        return new Pair<>(TokenType.T2.toString(), "");
    }

    public static long c() {
        return f22893c;
    }

    public static void d(Context context) {
        Context a10 = f0.a(context);
        if (a10 != null) {
            context = a10;
        }
        try {
            if ((f22894d == null || f22895e == null) && MetaData.f23158k.M().a(context)) {
                com.startapp.sdk.components.a.a(context).B.a().execute(new c(context));
            }
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    public static void c(Context context) {
        boolean a10 = MetaData.f23158k.M().a(context);
        synchronized (SimpleTokenUtils.class) {
            if ((f22894d == null || f22895e == null) && a10) {
                b(context);
                TokenType tokenType = TokenType.T1;
                List<PackageInfo> list = f22891a;
                ArrayList arrayList = new ArrayList();
                for (PackageInfo packageInfo : list) {
                    arrayList.add(packageInfo.packageName);
                }
                f22894d = new Pair<>(tokenType, f8.a(arrayList));
                TokenType tokenType2 = TokenType.T2;
                List<PackageInfo> list2 = f22892b;
                ArrayList arrayList2 = new ArrayList();
                for (PackageInfo packageInfo2 : list2) {
                    arrayList2.add(packageInfo2.packageName);
                }
                f22895e = new Pair<>(tokenType2, f8.a(arrayList2));
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static void b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set<String> v10 = MetaData.f23158k.v();
        Set<String> F = MetaData.f23158k.F();
        f22891a = new CopyOnWriteArrayList();
        f22892b = new CopyOnWriteArrayList();
        try {
            List<PackageInfo> a10 = y.a(packageManager);
            f22893c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            Iterator<PackageInfo> it = a10.iterator();
            while (true) {
                boolean z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                PackageInfo next = it.next();
                int i10 = y.f23556a;
                int i11 = next.applicationInfo.flags;
                if (!(((i11 & 1) == 0 && (i11 & 128) == 0) ? true : true)) {
                    if (Build.VERSION.SDK_INT >= 9) {
                        long j10 = next.firstInstallTime;
                        if (j10 < f22893c && j10 >= 1291593600000L) {
                            f22893c = j10;
                        }
                    }
                    f22891a.add(next);
                    try {
                        String b10 = o9.b(context);
                        if (v10 != null && v10.contains(b10)) {
                            f22892b.add(next);
                        }
                    } catch (Throwable th) {
                        l3.a(th);
                    }
                } else if (F.contains(next.packageName)) {
                    f22891a.add(next);
                } else if (next.packageName.equals(Constants.f23213a)) {
                    packageInfo = next;
                }
            }
            List<PackageInfo> list = f22891a;
            if (list.size() > 100) {
                ArrayList arrayList = new ArrayList(list);
                if (Build.VERSION.SDK_INT >= 9) {
                    Collections.sort(arrayList, new g8());
                }
                list = arrayList.subList(0, 100);
            }
            f22891a = list;
            List<PackageInfo> list2 = f22892b;
            if (list2.size() > 100) {
                ArrayList arrayList2 = new ArrayList(list2);
                if (Build.VERSION.SDK_INT >= 9) {
                    Collections.sort(arrayList2, new g8());
                }
                list2 = arrayList2.subList(0, 100);
            }
            f22892b = list2;
            if (packageInfo != null) {
                f22891a.add(0, packageInfo);
            }
        } catch (Throwable th2) {
            if (o9.a(th2, (Class<? extends Throwable>) RemoteException.class)) {
                return;
            }
            l3.a(th2);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements com.startapp.sdk.adsbase.remoteconfig.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22903a;

        public b(Context context) {
            this.f22903a = context;
        }

        @Override // com.startapp.sdk.adsbase.remoteconfig.c
        public final void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
            if (z10) {
                SimpleTokenUtils.f22894d = null;
                SimpleTokenUtils.f22895e = null;
                SimpleTokenUtils.d(this.f22903a);
            }
            MetaData.f23158k.a(this);
        }

        @Override // com.startapp.sdk.adsbase.remoteconfig.c
        public final void a() {
            MetaData.f23158k.a(this);
        }
    }

    public static Pair<String, String> a() {
        if (f22894d != null) {
            return new Pair<>(f22894d.first.toString(), f22894d.second);
        }
        return new Pair<>(TokenType.T1.toString(), "");
    }
}
