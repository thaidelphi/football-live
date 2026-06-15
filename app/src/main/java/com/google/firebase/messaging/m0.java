package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RequestDeduplicator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f15012a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Task<String>> f15013b = new androidx.collection.a();

    /* compiled from: RequestDeduplicator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    interface a {
        Task<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(Executor executor) {
        this.f15012a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task c(String str, Task task) throws Exception {
        synchronized (this) {
            this.f15013b.remove(str);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.f15013b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = aVar.start().continueWithTask(this.f15012a, new Continuation() { // from class: com.google.firebase.messaging.l0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task c10;
                c10 = m0.this.c(str, task2);
                return c10;
            }
        });
        this.f15013b.put(str, continueWithTask);
        return continueWithTask;
    }
}
