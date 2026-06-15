package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedPreferencesQueue.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f15028a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15029b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15030c;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f15032e;

    /* renamed from: d  reason: collision with root package name */
    final ArrayDeque<String> f15031d = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f15033f = false;

    private q0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f15028a = sharedPreferences;
        this.f15029b = str;
        this.f15030c = str2;
        this.f15032e = executor;
    }

    private boolean c(boolean z10) {
        if (z10 && !this.f15033f) {
            j();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        q0 q0Var = new q0(sharedPreferences, str, str2, executor);
        q0Var.e();
        return q0Var;
    }

    private void e() {
        synchronized (this.f15031d) {
            this.f15031d.clear();
            String string = this.f15028a.getString(this.f15029b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f15030c)) {
                String[] split = string.split(this.f15030c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f15031d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f15031d) {
            this.f15028a.edit().putString(this.f15029b, h()).commit();
        }
    }

    private void j() {
        this.f15032e.execute(new Runnable() { // from class: com.google.firebase.messaging.p0
            @Override // java.lang.Runnable
            public final void run() {
                q0.this.i();
            }
        });
    }

    public boolean b(String str) {
        boolean c10;
        if (TextUtils.isEmpty(str) || str.contains(this.f15030c)) {
            return false;
        }
        synchronized (this.f15031d) {
            c10 = c(this.f15031d.add(str));
        }
        return c10;
    }

    public String f() {
        String peek;
        synchronized (this.f15031d) {
            peek = this.f15031d.peek();
        }
        return peek;
    }

    public boolean g(Object obj) {
        boolean c10;
        synchronized (this.f15031d) {
            c10 = c(this.f15031d.remove(obj));
        }
        return c10;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f15031d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f15030c);
        }
        return sb.toString();
    }
}
