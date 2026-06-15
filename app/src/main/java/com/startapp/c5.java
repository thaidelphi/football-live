package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c5 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f21826f;

    /* renamed from: g  reason: collision with root package name */
    public static c5 f21827g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21828a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f21829b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f21830c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f21831d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final a f21832e;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            c5 c5Var = c5.this;
            while (true) {
                synchronized (c5Var.f21829b) {
                    size = c5Var.f21831d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    c5Var.f21831d.toArray(bVarArr);
                    c5Var.f21831d.clear();
                }
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = bVarArr[i10];
                    for (int i11 = 0; i11 < bVar.f21835b.size(); i11++) {
                        BroadcastReceiver broadcastReceiver = bVar.f21835b.get(i11).f21837b;
                        if (broadcastReceiver != null) {
                            broadcastReceiver.onReceive(c5Var.f21828a, bVar.f21834a);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f21834a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<c> f21835b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f21834a = intent;
            this.f21835b = arrayList;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f21836a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f21837b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f21838c;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f21836a = intentFilter;
            this.f21837b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f21837b);
            sb.append(" filter=");
            sb.append(this.f21836a);
            sb.append("}");
            return sb.toString();
        }
    }

    static {
        int i10 = y.f23556a;
        "startapp.".concat(c5.class.getSimpleName());
        f21826f = new Object();
    }

    public c5(Context context) {
        this.f21828a = context;
        this.f21832e = new a(context.getMainLooper());
    }

    public static c5 a(Context context) {
        c5 c5Var;
        synchronized (f21826f) {
            if (f21827g == null) {
                Context a10 = f0.a(context);
                if (a10 != null) {
                    context = a10;
                }
                f21827g = new c5(context);
            }
            c5Var = f21827g;
        }
        return c5Var;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f21829b) {
            c cVar = new c(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) this.f21829b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f21829b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f21830c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f21830c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f21829b) {
            ArrayList arrayList = (ArrayList) this.f21829b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                IntentFilter intentFilter = (IntentFilter) arrayList.get(i10);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList<c> arrayList2 = this.f21830c.get(action);
                    if (arrayList2 != null) {
                        int i12 = 0;
                        while (i12 < arrayList2.size()) {
                            if (arrayList2.get(i12).f21837b == broadcastReceiver) {
                                arrayList2.remove(i12);
                                i12--;
                            }
                            i12++;
                        }
                        if (arrayList2.size() <= 0) {
                            this.f21830c.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void a(Intent intent) {
        String str;
        String str2;
        int i10;
        ArrayList arrayList;
        Uri uri;
        boolean z10;
        synchronized (this.f21829b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f21828a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<c> arrayList2 = this.f21830c.get(intent.getAction());
            if (arrayList2 != null) {
                boolean z11 = false;
                ArrayList arrayList3 = null;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    c cVar = arrayList2.get(i11);
                    if (cVar.f21838c) {
                        i10 = i11;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        uri = data;
                        arrayList = arrayList3;
                        z10 = z11;
                    } else {
                        str = action;
                        String str3 = resolveTypeIfNeeded;
                        str2 = resolveTypeIfNeeded;
                        i10 = i11;
                        Uri uri2 = data;
                        arrayList = arrayList3;
                        uri = data;
                        z10 = z11;
                        if (cVar.f21836a.match(action, str3, scheme, uri2, categories, "LocalBroadcastManager") >= 0) {
                            arrayList3 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList3.add(cVar);
                            cVar.f21838c = true;
                            i11 = i10 + 1;
                            z11 = z10;
                            action = str;
                            resolveTypeIfNeeded = str2;
                            data = uri;
                        }
                    }
                    arrayList3 = arrayList;
                    i11 = i10 + 1;
                    z11 = z10;
                    action = str;
                    resolveTypeIfNeeded = str2;
                    data = uri;
                }
                ArrayList arrayList4 = arrayList3;
                boolean z12 = z11;
                if (arrayList4 != null) {
                    for (int i12 = z12; i12 < arrayList4.size(); i12++) {
                        ((c) arrayList4.get(i12)).f21838c = z12;
                    }
                    this.f21831d.add(new b(intent, arrayList4));
                    if (!this.f21832e.hasMessages(1)) {
                        this.f21832e.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
