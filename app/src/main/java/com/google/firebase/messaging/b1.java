package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.e1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WithinAppServiceBinder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b1 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final a f14960a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WithinAppServiceBinder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        Task<Void> a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(a aVar) {
        this.f14960a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final e1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f14960a.a(aVar.f14983a).addOnCompleteListener(androidx.privacysandbox.ads.adservices.topics.i.f3728a, new OnCompleteListener() { // from class: com.google.firebase.messaging.a1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    e1.a.this.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
