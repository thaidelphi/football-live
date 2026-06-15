package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.fe;
import com.ironsource.xn;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import o6.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GmsRpc.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private final c6.e f15087a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f15088b;

    /* renamed from: c  reason: collision with root package name */
    private final Rpc f15089c;

    /* renamed from: d  reason: collision with root package name */
    private final q6.b<z6.i> f15090d;

    /* renamed from: e  reason: collision with root package name */
    private final q6.b<o6.j> f15091e;

    /* renamed from: f  reason: collision with root package name */
    private final r6.e f15092f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(c6.e eVar, e0 e0Var, q6.b<z6.i> bVar, q6.b<o6.j> bVar2, r6.e eVar2) {
        this(eVar, e0Var, new Rpc(eVar.j()), bVar, bVar2, eVar2);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> c(Task<Bundle> task) {
        return task.continueWith(androidx.privacysandbox.ads.adservices.topics.i.f3728a, new Continuation() { // from class: com.google.firebase.messaging.y
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                String h10;
                h10 = z.this.h(task2);
                return h10;
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(this.f15087a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(xn.a.f21422g);
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String h(Task task) throws Exception {
        return f((Bundle) task.getResult(IOException.class));
    }

    private void i(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        j.a b10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f15087a.m().c());
        bundle.putString("gmsv", Integer.toString(this.f15088b.d()));
        bundle.putString(fe.F, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f15088b.a());
        bundle.putString("app_ver_name", this.f15088b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b11 = ((com.google.firebase.installations.g) Tasks.await(this.f15092f.a(false))).b();
            if (!TextUtils.isEmpty(b11)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e8);
        }
        bundle.putString("appid", (String) Tasks.await(this.f15092f.getId()));
        bundle.putString("cliv", "fcm-23.2.0");
        o6.j jVar = this.f15091e.get();
        z6.i iVar = this.f15090d.get();
        if (jVar == null || iVar == null || (b10 = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.a()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private Task<Bundle> j(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.f15089c.a(bundle);
        } catch (InterruptedException | ExecutionException e8) {
            return Tasks.forException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<String> e() {
        return c(j(e0.c(this.f15087a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<?> k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(j(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(j(str, "/topics/" + str2, bundle));
    }

    z(c6.e eVar, e0 e0Var, Rpc rpc, q6.b<z6.i> bVar, q6.b<o6.j> bVar2, r6.e eVar2) {
        this.f15087a = eVar;
        this.f15088b = e0Var;
        this.f15089c = rpc;
        this.f15090d = bVar;
        this.f15091e = bVar2;
        this.f15092f = eVar2;
    }
}
