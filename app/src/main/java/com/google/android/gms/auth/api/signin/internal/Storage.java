package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Storage {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f11908c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static Storage f11909d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f11910a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f11911b;

    @VisibleForTesting
    Storage(Context context) {
        this.f11911b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    public static Storage a(Context context) {
        Preconditions.m(context);
        Lock lock = f11908c;
        lock.lock();
        try {
            if (f11909d == null) {
                f11909d = new Storage(context.getApplicationContext());
            }
            Storage storage = f11909d;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            f11908c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @KeepForSdk
    public GoogleSignInAccount b() {
        String c10;
        String c11 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c11) || (c10 = c(d("googleSignInAccount", c11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.J0(c10);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected final String c(String str) {
        this.f11910a.lock();
        try {
            return this.f11911b.getString(str, null);
        } finally {
            this.f11910a.unlock();
        }
    }
}
